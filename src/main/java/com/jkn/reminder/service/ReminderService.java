package com.jkn.reminder.service;

import com.jkn.reminder.repository.ReminderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReminderService {

    private final ReminderRepository repository;

    public int findById(UUID id) {
    }

    public int findByStatus(String status) {
    }

    public int findByDescription() {
    }

    public int findByDate() {
    }

    public int delete() {
    }
}
