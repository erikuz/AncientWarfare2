package net.shadowmage.ancientwarfare.core.proxy;

import net.shadowmage.ancientwarfare.core.gui.GuiTest;
import net.shadowmage.ancientwarfare.core.network.NetworkHandler;
import net.shadowmage.ancientwarfare.core.network.PacketHandlerClient;

public class ClientProxy extends ClientProxyBase
{

@Override
public void registerClient()
  {
  NetworkHandler.registerClientHandler(new PacketHandlerClient());
  NetworkHandler.INSTANCE.registerGui(0, GuiTest.class);
  }

}