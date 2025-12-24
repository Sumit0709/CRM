//package com.sumit.crm.controller;
//
//import com.sumit.crm.dto.client.ClientResponseDTO;
//import com.sumit.crm.dto.client.CreateClientDTO;
//import com.sumit.crm.service.ClientService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//

//import org.springframework.web.bind.annotation.RequestMapping;

//@RestController()
//@RequestMapping("/client")
//public class ClientController {
//
//    @Autowired
//    ClientService clientService;
//
//    @GetMapping("/")
//    public ClientResponseDTO getClient(@RequestParam Long clientId){
//        return clientService.getClientById(clientId);
//    }
//
//    @GetMapping("clients")
//    public List<ClientResponseDTO> getAllClients(){
//        return clientService.getAllClients();
//    }
//
//    @PostMapping("client")
//    public ResponseEntity<String> createClient(@RequestBody CreateClientDTO client){
//
//        String message = clientService.saveClient(client);
//
//        if(message.equals("Client Saved")) {
//            return ResponseEntity.status(HttpStatus.OK).body(message);
//        }
//        else{
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
//        }
//    }
//
//
////    @PutMapping("client")
////    public ResponseEntity<ClientResponseDTO> updateClientEmployee(@RequestBody CreateClientDTO client){
////
////    }
//
//}
