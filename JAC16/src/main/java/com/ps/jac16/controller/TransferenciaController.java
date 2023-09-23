package com.ps.jac16.controller;
import com.ps.jac16.model.Transferencia;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Transferencia transferencia){

        return ResponseEntity.badRequest().body(null);
    }

    @GetMapping("/{numeroCuenta}")
    public ResponseEntity<?> get( @PathVariable String numeroCuenta){

        return null;
    }
    @DeleteMapping("/{numeroCuenta}")
    public ResponseEntity<?> delete(@PathVariable String numeroCuenta){

        return null;
    }



}
