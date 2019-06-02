package com.new_buildings.command;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AddressCommand {

    private Long id;
    private String address;
    private Byte[] image;

}
