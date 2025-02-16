// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: singer.proto

package com.example.spanner.jdbc;

public final class SingerProto {
  private SingerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code examples.spanner.music.Genre}
   */
  public enum Genre
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>POP = 0;</code>
     */
    POP(0),
    /**
     * <code>JAZZ = 1;</code>
     */
    JAZZ(1),
    /**
     * <code>FOLK = 2;</code>
     */
    FOLK(2),
    /**
     * <code>ROCK = 3;</code>
     */
    ROCK(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>POP = 0;</code>
     */
    public static final int POP_VALUE = 0;
    /**
     * <code>JAZZ = 1;</code>
     */
    public static final int JAZZ_VALUE = 1;
    /**
     * <code>FOLK = 2;</code>
     */
    public static final int FOLK_VALUE = 2;
    /**
     * <code>ROCK = 3;</code>
     */
    public static final int ROCK_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Genre valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Genre forNumber(int value) {
      switch (value) {
        case 0: return POP;
        case 1: return JAZZ;
        case 2: return FOLK;
        case 3: return ROCK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Genre>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Genre> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Genre>() {
            public Genre findValueByNumber(int number) {
              return Genre.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.example.spanner.jdbc.SingerProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Genre[] VALUES = values();

    public static Genre valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Genre(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:examples.spanner.music.Genre)
  }

  public interface SingerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:examples.spanner.music.SingerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 singer_id = 1;</code>
     * @return Whether the singerId field is set.
     */
    boolean hasSingerId();
    /**
     * <code>optional int64 singer_id = 1;</code>
     * @return The singerId.
     */
    long getSingerId();

    /**
     * <code>optional string birth_date = 2;</code>
     * @return Whether the birthDate field is set.
     */
    boolean hasBirthDate();
    /**
     * <code>optional string birth_date = 2;</code>
     * @return The birthDate.
     */
    java.lang.String getBirthDate();
    /**
     * <code>optional string birth_date = 2;</code>
     * @return The bytes for birthDate.
     */
    com.google.protobuf.ByteString
        getBirthDateBytes();

    /**
     * <code>optional string nationality = 3;</code>
     * @return Whether the nationality field is set.
     */
    boolean hasNationality();
    /**
     * <code>optional string nationality = 3;</code>
     * @return The nationality.
     */
    java.lang.String getNationality();
    /**
     * <code>optional string nationality = 3;</code>
     * @return The bytes for nationality.
     */
    com.google.protobuf.ByteString
        getNationalityBytes();

    /**
     * <code>optional .examples.spanner.music.Genre genre = 4;</code>
     * @return Whether the genre field is set.
     */
    boolean hasGenre();
    /**
     * <code>optional .examples.spanner.music.Genre genre = 4;</code>
     * @return The enum numeric value on the wire for genre.
     */
    int getGenreValue();
    /**
     * <code>optional .examples.spanner.music.Genre genre = 4;</code>
     * @return The genre.
     */
    com.example.spanner.jdbc.SingerProto.Genre getGenre();
  }
  /**
   * Protobuf type {@code examples.spanner.music.SingerInfo}
   */
  public static final class SingerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:examples.spanner.music.SingerInfo)
      SingerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SingerInfo.newBuilder() to construct.
    private SingerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SingerInfo() {
      birthDate_ = "";
      nationality_ = "";
      genre_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SingerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.spanner.jdbc.SingerProto.internal_static_examples_spanner_music_SingerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.spanner.jdbc.SingerProto.internal_static_examples_spanner_music_SingerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.spanner.jdbc.SingerProto.SingerInfo.class, com.example.spanner.jdbc.SingerProto.SingerInfo.Builder.class);
    }

    private int bitField0_;
    public static final int SINGER_ID_FIELD_NUMBER = 1;
    private long singerId_ = 0L;
    /**
     * <code>optional int64 singer_id = 1;</code>
     * @return Whether the singerId field is set.
     */
    @java.lang.Override
    public boolean hasSingerId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 singer_id = 1;</code>
     * @return The singerId.
     */
    @java.lang.Override
    public long getSingerId() {
      return singerId_;
    }

    public static final int BIRTH_DATE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object birthDate_ = "";
    /**
     * <code>optional string birth_date = 2;</code>
     * @return Whether the birthDate field is set.
     */
    @java.lang.Override
    public boolean hasBirthDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string birth_date = 2;</code>
     * @return The birthDate.
     */
    @java.lang.Override
    public java.lang.String getBirthDate() {
      java.lang.Object ref = birthDate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        birthDate_ = s;
        return s;
      }
    }
    /**
     * <code>optional string birth_date = 2;</code>
     * @return The bytes for birthDate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBirthDateBytes() {
      java.lang.Object ref = birthDate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        birthDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NATIONALITY_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object nationality_ = "";
    /**
     * <code>optional string nationality = 3;</code>
     * @return Whether the nationality field is set.
     */
    @java.lang.Override
    public boolean hasNationality() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @return The nationality.
     */
    @java.lang.Override
    public java.lang.String getNationality() {
      java.lang.Object ref = nationality_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nationality_ = s;
        return s;
      }
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @return The bytes for nationality.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNationalityBytes() {
      java.lang.Object ref = nationality_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nationality_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GENRE_FIELD_NUMBER = 4;
    private int genre_ = 0;
    /**
     * <code>optional .examples.spanner.music.Genre genre = 4;</code>
     * @return Whether the genre field is set.
     */
    @java.lang.Override public boolean hasGenre() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .examples.spanner.music.Genre genre = 4;</code>
     * @return The enum numeric value on the wire for genre.
     */
    @java.lang.Override public int getGenreValue() {
      return genre_;
    }
    /**
     * <code>optional .examples.spanner.music.Genre genre = 4;</code>
     * @return The genre.
     */
    @java.lang.Override public com.example.spanner.jdbc.SingerProto.Genre getGenre() {
      com.example.spanner.jdbc.SingerProto.Genre result = com.example.spanner.jdbc.SingerProto.Genre.forNumber(genre_);
      return result == null ? com.example.spanner.jdbc.SingerProto.Genre.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt64(1, singerId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, birthDate_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nationality_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeEnum(4, genre_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, singerId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, birthDate_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nationality_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, genre_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.example.spanner.jdbc.SingerProto.SingerInfo)) {
        return super.equals(obj);
      }
      com.example.spanner.jdbc.SingerProto.SingerInfo other = (com.example.spanner.jdbc.SingerProto.SingerInfo) obj;

      if (hasSingerId() != other.hasSingerId()) return false;
      if (hasSingerId()) {
        if (getSingerId()
            != other.getSingerId()) return false;
      }
      if (hasBirthDate() != other.hasBirthDate()) return false;
      if (hasBirthDate()) {
        if (!getBirthDate()
            .equals(other.getBirthDate())) return false;
      }
      if (hasNationality() != other.hasNationality()) return false;
      if (hasNationality()) {
        if (!getNationality()
            .equals(other.getNationality())) return false;
      }
      if (hasGenre() != other.hasGenre()) return false;
      if (hasGenre()) {
        if (genre_ != other.genre_) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSingerId()) {
        hash = (37 * hash) + SINGER_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSingerId());
      }
      if (hasBirthDate()) {
        hash = (37 * hash) + BIRTH_DATE_FIELD_NUMBER;
        hash = (53 * hash) + getBirthDate().hashCode();
      }
      if (hasNationality()) {
        hash = (37 * hash) + NATIONALITY_FIELD_NUMBER;
        hash = (53 * hash) + getNationality().hashCode();
      }
      if (hasGenre()) {
        hash = (37 * hash) + GENRE_FIELD_NUMBER;
        hash = (53 * hash) + genre_;
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.spanner.jdbc.SingerProto.SingerInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.example.spanner.jdbc.SingerProto.SingerInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code examples.spanner.music.SingerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:examples.spanner.music.SingerInfo)
        com.example.spanner.jdbc.SingerProto.SingerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.spanner.jdbc.SingerProto.internal_static_examples_spanner_music_SingerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.spanner.jdbc.SingerProto.internal_static_examples_spanner_music_SingerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.spanner.jdbc.SingerProto.SingerInfo.class, com.example.spanner.jdbc.SingerProto.SingerInfo.Builder.class);
      }

      // Construct using com.example.spanner.jdbc.SingerProto.SingerInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        singerId_ = 0L;
        birthDate_ = "";
        nationality_ = "";
        genre_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.spanner.jdbc.SingerProto.internal_static_examples_spanner_music_SingerInfo_descriptor;
      }

      @java.lang.Override
      public com.example.spanner.jdbc.SingerProto.SingerInfo getDefaultInstanceForType() {
        return com.example.spanner.jdbc.SingerProto.SingerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public com.example.spanner.jdbc.SingerProto.SingerInfo build() {
        com.example.spanner.jdbc.SingerProto.SingerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.example.spanner.jdbc.SingerProto.SingerInfo buildPartial() {
        com.example.spanner.jdbc.SingerProto.SingerInfo result = new com.example.spanner.jdbc.SingerProto.SingerInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.example.spanner.jdbc.SingerProto.SingerInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.singerId_ = singerId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.birthDate_ = birthDate_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.nationality_ = nationality_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.genre_ = genre_;
          to_bitField0_ |= 0x00000008;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.spanner.jdbc.SingerProto.SingerInfo) {
          return mergeFrom((com.example.spanner.jdbc.SingerProto.SingerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.spanner.jdbc.SingerProto.SingerInfo other) {
        if (other == com.example.spanner.jdbc.SingerProto.SingerInfo.getDefaultInstance()) return this;
        if (other.hasSingerId()) {
          setSingerId(other.getSingerId());
        }
        if (other.hasBirthDate()) {
          birthDate_ = other.birthDate_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasNationality()) {
          nationality_ = other.nationality_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.hasGenre()) {
          setGenre(other.getGenre());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                singerId_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                birthDate_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                nationality_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 32: {
                genre_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private long singerId_ ;
      /**
       * <code>optional int64 singer_id = 1;</code>
       * @return Whether the singerId field is set.
       */
      @java.lang.Override
      public boolean hasSingerId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int64 singer_id = 1;</code>
       * @return The singerId.
       */
      @java.lang.Override
      public long getSingerId() {
        return singerId_;
      }
      /**
       * <code>optional int64 singer_id = 1;</code>
       * @param value The singerId to set.
       * @return This builder for chaining.
       */
      public Builder setSingerId(long value) {
        
        singerId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 singer_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSingerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        singerId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object birthDate_ = "";
      /**
       * <code>optional string birth_date = 2;</code>
       * @return Whether the birthDate field is set.
       */
      public boolean hasBirthDate() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @return The birthDate.
       */
      public java.lang.String getBirthDate() {
        java.lang.Object ref = birthDate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          birthDate_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @return The bytes for birthDate.
       */
      public com.google.protobuf.ByteString
          getBirthDateBytes() {
        java.lang.Object ref = birthDate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          birthDate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @param value The birthDate to set.
       * @return This builder for chaining.
       */
      public Builder setBirthDate(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        birthDate_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBirthDate() {
        birthDate_ = getDefaultInstance().getBirthDate();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @param value The bytes for birthDate to set.
       * @return This builder for chaining.
       */
      public Builder setBirthDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        birthDate_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object nationality_ = "";
      /**
       * <code>optional string nationality = 3;</code>
       * @return Whether the nationality field is set.
       */
      public boolean hasNationality() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @return The nationality.
       */
      public java.lang.String getNationality() {
        java.lang.Object ref = nationality_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nationality_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @return The bytes for nationality.
       */
      public com.google.protobuf.ByteString
          getNationalityBytes() {
        java.lang.Object ref = nationality_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nationality_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @param value The nationality to set.
       * @return This builder for chaining.
       */
      public Builder setNationality(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        nationality_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNationality() {
        nationality_ = getDefaultInstance().getNationality();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @param value The bytes for nationality to set.
       * @return This builder for chaining.
       */
      public Builder setNationalityBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        nationality_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private int genre_ = 0;
      /**
       * <code>optional .examples.spanner.music.Genre genre = 4;</code>
       * @return Whether the genre field is set.
       */
      @java.lang.Override public boolean hasGenre() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional .examples.spanner.music.Genre genre = 4;</code>
       * @return The enum numeric value on the wire for genre.
       */
      @java.lang.Override public int getGenreValue() {
        return genre_;
      }
      /**
       * <code>optional .examples.spanner.music.Genre genre = 4;</code>
       * @param value The enum numeric value on the wire for genre to set.
       * @return This builder for chaining.
       */
      public Builder setGenreValue(int value) {
        genre_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional .examples.spanner.music.Genre genre = 4;</code>
       * @return The genre.
       */
      @java.lang.Override
      public com.example.spanner.jdbc.SingerProto.Genre getGenre() {
        com.example.spanner.jdbc.SingerProto.Genre result = com.example.spanner.jdbc.SingerProto.Genre.forNumber(genre_);
        return result == null ? com.example.spanner.jdbc.SingerProto.Genre.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .examples.spanner.music.Genre genre = 4;</code>
       * @param value The genre to set.
       * @return This builder for chaining.
       */
      public Builder setGenre(com.example.spanner.jdbc.SingerProto.Genre value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        genre_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .examples.spanner.music.Genre genre = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGenre() {
        bitField0_ = (bitField0_ & ~0x00000008);
        genre_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:examples.spanner.music.SingerInfo)
    }

    // @@protoc_insertion_point(class_scope:examples.spanner.music.SingerInfo)
    private static final com.example.spanner.jdbc.SingerProto.SingerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.spanner.jdbc.SingerProto.SingerInfo();
    }

    public static com.example.spanner.jdbc.SingerProto.SingerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SingerInfo>
        PARSER = new com.google.protobuf.AbstractParser<SingerInfo>() {
      @java.lang.Override
      public SingerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SingerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SingerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.example.spanner.jdbc.SingerProto.SingerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_examples_spanner_music_SingerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_examples_spanner_music_SingerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014singer.proto\022\026examples.spanner.music\"\301" +
      "\001\n\nSingerInfo\022\026\n\tsinger_id\030\001 \001(\003H\000\210\001\001\022\027\n" +
      "\nbirth_date\030\002 \001(\tH\001\210\001\001\022\030\n\013nationality\030\003 " +
      "\001(\tH\002\210\001\001\0221\n\005genre\030\004 \001(\0162\035.examples.spann" +
      "er.music.GenreH\003\210\001\001B\014\n\n_singer_idB\r\n\013_bi" +
      "rth_dateB\016\n\014_nationalityB\010\n\006_genre*.\n\005Ge" +
      "nre\022\007\n\003POP\020\000\022\010\n\004JAZZ\020\001\022\010\n\004FOLK\020\002\022\010\n\004ROCK" +
      "\020\003B)\n\030com.example.spanner.jdbcB\013SingerPr" +
      "otoP\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_examples_spanner_music_SingerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_examples_spanner_music_SingerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_examples_spanner_music_SingerInfo_descriptor,
        new java.lang.String[] { "SingerId", "BirthDate", "Nationality", "Genre", "SingerId", "BirthDate", "Nationality", "Genre", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
