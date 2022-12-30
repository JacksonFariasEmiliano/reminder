package com.jkn.reminder.controller;

import com.jkn.reminder.service.ReminderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.UUID;


@RequiredArgsConstructor
@RequestMapping(value = "/reminders")
public class ReminderController {

    private final ReminderService service;

    public ResponseEntity<Object> findAll(){
        return ResponseEntity.ok().body("Find all reminder");
    }

    public ResponseEntity<Page<Object>> findAllPage(Pageable pageable){
        return ResponseEntity.ok().body();
    }

    public ResponseEntity<Object> findById(@PathVariable("id") UUID id){
        return ResponseEntity.status(service.findById(id)).body("Reminder find by id");
    }

    public ResponseEntity<Object> findByStatus(@PathVariable("status")String status){
        return ResponseEntity.status(service.findByStatus(status)).body("Reminder by status");
    }

    public ResponseEntity<Object> findByDescription(@PathVariable("description")String description){
        return ResponseEntity.status(service.findByDescription()).body("Reminder description");
    }

    public ResponseEntity<Object> findByDate(@PathVariable("date") Date date){
        return ResponseEntity.status(service.findByDate()).body("Reminder date");
    }

    public ResponseEntity<Object> delete(@PathVariable("id")UUID id){
        return ResponseEntity.status(service.delete()).body("Reminder remove");
    }
}
