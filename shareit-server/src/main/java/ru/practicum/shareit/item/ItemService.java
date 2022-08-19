package ru.practicum.shareit.item;

import ru.practicum.shareit.comment.Comment;
import ru.practicum.shareit.comment.dto.CommentDto;
import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.item.dto.ItemDtoWithBooking;
import ru.practicum.shareit.item.dto.ItemDtoWithoutComments;

import java.util.Collection;
import java.util.Optional;

public interface ItemService {
    ItemDto addNewItem(Long userId, Item item);

    Optional<ItemDto> updateItem(Long userId, Item item);

    Optional<ItemDto> patchedItem(Long userId, Long itemId, Item item);

    Optional<ItemDtoWithBooking> findItemById(Long itemId, Long userId);

    Collection<ItemDtoWithBooking> getUserItems(Long userId, Integer from, Integer size);

    Collection<ItemDtoWithBooking> getAllUserItems(Long userId);

    void deleteItem(Long userId, Long itemId);

    boolean checkOwner(Long userId, Long itemId);

    Collection<ItemDto> search(Long userId, String text, Integer from, Integer size);

    CommentDto addComment(Long userId, Long itemId, Comment comment);

    Collection<ItemDtoWithoutComments> findItemsByRequest(Long requestId);
}