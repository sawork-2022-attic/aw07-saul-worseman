package com.micropos.carts.mapper;

import com.micropos.carts.dto.ItemDto;
import com.micropos.carts.model.Item;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CartsMapperImpl implements CartsMapper {

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

        int quantity = 0;

        if ( Item.getQuantity() != null ) {
            quantity = Item.getQuantity().intValue();
        }

        String product = null;

        Item item = new Item( product, quantity );

        item.setProductId( Item.getProductId() );

        return item;
    }
}
