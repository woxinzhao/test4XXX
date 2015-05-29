// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\addressbook.proto
package com.example.tutorial;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class AddressBook extends Message {
  private static final long serialVersionUID = 0L;

  public static final List<Person> DEFAULT_PERSON = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED, messageType = Person.class)
  public final List<Person> person;

  public AddressBook(List<Person> person) {
    this.person = immutableCopyOf(person);
  }

  private AddressBook(Builder builder) {
    this(builder.person);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AddressBook)) return false;
    return equals(person, ((AddressBook) other).person);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = person != null ? person.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<AddressBook> {

    public List<Person> person;

    public Builder() {
    }

    public Builder(AddressBook message) {
      super(message);
      if (message == null) return;
      this.person = copyOf(message.person);
    }

    public Builder person(List<Person> person) {
      this.person = checkForNulls(person);
      return this;
    }

    @Override
    public AddressBook build() {
      return new AddressBook(this);
    }
  }
}