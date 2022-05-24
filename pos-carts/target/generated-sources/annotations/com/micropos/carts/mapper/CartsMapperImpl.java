package com.micropos.carts.mapper;

import com.micropos.carts.dto.CartDto;
import com.micropos.carts.dto.ItemDto;
import com.micropos.carts.model.Cart;
import com.micropos.carts.model.Item;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CartsMapperImpl implements CartsMapper {

    @Override
    public CartDto toCartDto(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        CartDto cartDto = new CartDto();

        cartDto.setCartId( cart.getCartId() );
        cartDto.setItems( itemListToItemDtoList( cart.getItems() ) );

        return cartDto;
    }

    @Override
    public Cart toCart(CartDto cartDto) {
        if ( cartDto == null ) {
            return null;
        }

        Cart cart = new Cart();

        cart.setCartId( cartDto.getCartId() );
        cart.setItems( itemDtoListToItemList( cartDto.getItems() ) );

        return cart;
    }

    @Override
    public Collection<ItemDto> toItemsDto(Collection<Item> items) {
        if ( items == null ) {
            return null;
        }

        Collection<ItemDto> collection = new ArrayList<ItemDto>( items.size() );
        for ( Item item : items ) {
            collection.add( toItemDto( item ) );
        }

        return collection;
    }

    @Override
    public Collection<Item> toItems(Collection<ItemDto> items) {
        if ( items == null ) {
            return null;
        }

        Collection<Item> collection = new ArrayList<Item>( items.size() );
        for ( ItemDto itemDto : items ) {
            collection.add( toItem( itemDto ) );
        }

        return collection;
    }

    @Override
    public ItemDto toItemDto(Item Item) {
        if ( Item == null ) {
            return null;
        }

        ItemDto itemDto = new ItemDto();

        itemDto.setProductId( Item.getProductId() );
        itemDto.setQuantity( BigDecimal.valueOf( Item.getQuantity() ) );

        return itemDto;
    }

    @Override
    public Item toItem(ItemDto Item) {
        if ( Item == null ) {
            return null;
        }

        Item item = new Item();

        item.setProductId( Item.getProductId() );
        if ( Item.getQuantity() != null ) {
            item.setQuantity( Item.getQuantity().intValue() );
        }

        return item;
    }

    protected List<ItemDto> itemListToItemDtoList(List<Item> list) {
        if ( list == null ) {
            return null;
        }

        List<ItemDto> list1 = new ArrayList<ItemDto>( list.size() );
        for ( Item item : list ) {
            list1.add( toItemDto( item ) );
        }

        return list1;
    }

    protected List<Item> itemDtoListToItemList(List<ItemDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Item> list1 = new ArrayList<Item>( list.size() );
        for ( ItemDto itemDto : list ) {
            list1.add( toItem( itemDto ) );
        }

        return list1;
    }
}
