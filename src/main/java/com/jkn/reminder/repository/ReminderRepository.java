package com.jkn.reminder.repository;

import com.jkn.reminder.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReminderRepository extends JpaRepository<Reminder, UUID> {
}
