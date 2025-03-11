package com.h1ggsk.eflyplusplus;

import meteordevelopment.meteorclient.mixininterface.IChatHud;
import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

/**
 * @author OLEPOSSU
 * @author h1ggsk
 */

public class H1ggskModule extends Module {
    private final String prefix = Formatting.WHITE + "[" + Formatting.DARK_PURPLE + "H1ggsK_ Addons" + Formatting.WHITE + "]";
    public final int priority;

    public H1ggskModule(Category category, String name, String description) {
        super(category, name, description);
        this.priority = 100;
    }

    //  Messages
    public void sendToggledMsg() {
        if (Config.get().chatFeedback.get() && chatFeedback && mc.world != null) {
            ChatUtils.forceNextPrefixClass(getClass());
            String msg = prefix + " " + Formatting.WHITE + name + (isActive() ? Formatting.GREEN + " ON" : Formatting.RED + " OFF");
            sendMessage(Text.of(msg), hashCode());
        }
    }

    public void sendMessage(Text text, int id) {
        ((IChatHud) mc.inGameHud.getChatHud()).meteor$add(text, id);
    }

}
