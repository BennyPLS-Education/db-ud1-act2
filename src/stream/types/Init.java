package stream.types;

import java.io.Serializable;

public record Init(String alphanumeric, int numeric) implements Serializable {}
