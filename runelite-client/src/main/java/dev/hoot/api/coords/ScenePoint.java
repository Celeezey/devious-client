package dev.hoot.api.coords;

import dev.hoot.api.game.Game;
import lombok.Value;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

@Value
public class ScenePoint {
    int x;
    int y;
    int plane;

    // scene > world
    public WorldPoint toWorld()
    {
        Client client = Game.getClient();
        return new WorldPoint(x + client.getBaseX(), y + client.getBaseY(), plane);
    }

    // scene > world > region
    public RegionPoint toRegion()
    {
        return RegionPoint.fromWorld(toWorld());
    }

    // region > world > scene
    public static ScenePoint fromRegion(RegionPoint regionPoint)
    {
        return fromWorld(regionPoint.toWorld());
    }

    // world > scene
    public static ScenePoint fromWorld(WorldPoint worldPoint)
    {
        Client client = Game.getClient();
        return new ScenePoint(worldPoint.getX() - client.getBaseX(), worldPoint.getY() - client.getBaseY(), 0);
    }
}