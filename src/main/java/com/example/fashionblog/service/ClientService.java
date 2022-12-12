package com.example.fashionblog.service;

import com.example.fashionblog.dto.*;


public interface ClientService {

    ClientResponseDto registerAClient(ClientSignUpDto clientSignUpDto);

    ClientResponseDto loginClient(ClientLoginDto clientLoginDto, ClientResponseDto clientResponseDto);

    void deleteClientById(ClientResponseDto clientResponseDto);
}
