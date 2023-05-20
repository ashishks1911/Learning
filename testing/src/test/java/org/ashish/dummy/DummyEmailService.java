package org.ashish.dummy;

public class DummyEmailService implements EmailService{
    @Override
    public void sendEmail(String message) {
        throw new AssertionError("Hello Buddy");
    }
}
