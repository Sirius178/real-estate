package com.new_buildings.converters;

import com.new_buildings.command.AddressCommand;
import com.new_buildings.entities.Address;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class AddressToAddressCommand implements Converter<Address, AddressCommand> {

    @Synchronized
    @Nullable
    @Override
    public AddressCommand convert(Address source) {
        if (source == null){
            return null;
        }

        AddressCommand addressCommand = new AddressCommand();
        addressCommand.setId(source.getId());
        addressCommand.setAddress(source.getAddress());
        addressCommand.setImage(source.getImage());

        return addressCommand;
    }
}
