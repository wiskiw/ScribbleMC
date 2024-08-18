package me.chrr.scribble.book.command;

import me.chrr.scribble.book.RichText;
import me.chrr.scribble.tool.commandmanager.Command;
import net.minecraft.client.gui.screen.ingame.BookEditScreen;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * Represents the mutable state of a {@link BookEditScreen},
 * which can be modified through the execution of BookEditScreen___Commands.
 * See {@link Command}.
 */
public record BookEditScreenMemento(
        int selectionStart,
        int selectionEnd,
        RichText currentPageRichText,
        @Nullable Formatting color,
        Set<Formatting> modifiers
) {
}
