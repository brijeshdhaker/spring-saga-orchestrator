/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package sample.multimodule.dto;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class OrchestratorResponseDTO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8587416720277473134L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrchestratorResponseDTO\",\"namespace\":\"sample.multimodule.dto\",\"fields\":[{\"name\":\"orderId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"logicalType\":\"uuid\"},{\"name\":\"userId\",\"type\":\"int\"},{\"name\":\"productId\",\"type\":\"int\"},{\"name\":\"amount\",\"type\":\"double\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"OrderStatus\",\"namespace\":\"sample.multimodule.enums\",\"symbols\":[\"ORDER_CREATED\",\"ORDER_CANCELLED\",\"ORDER_COMPLETED\"]}}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrchestratorResponseDTO> ENCODER =
      new BinaryMessageEncoder<OrchestratorResponseDTO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrchestratorResponseDTO> DECODER =
      new BinaryMessageDecoder<OrchestratorResponseDTO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrchestratorResponseDTO> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrchestratorResponseDTO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrchestratorResponseDTO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrchestratorResponseDTO>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrchestratorResponseDTO to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrchestratorResponseDTO from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrchestratorResponseDTO instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrchestratorResponseDTO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String orderId;
   private int userId;
   private int productId;
   private double amount;
   private sample.multimodule.enums.OrderStatus status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrchestratorResponseDTO() {}

  /**
   * All-args constructor.
   * @param orderId The new value for orderId
   * @param userId The new value for userId
   * @param productId The new value for productId
   * @param amount The new value for amount
   * @param status The new value for status
   */
  public OrchestratorResponseDTO(java.lang.String orderId, java.lang.Integer userId, java.lang.Integer productId, java.lang.Double amount, sample.multimodule.enums.OrderStatus status) {
    this.orderId = orderId;
    this.userId = userId;
    this.productId = productId;
    this.amount = amount;
    this.status = status;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orderId;
    case 1: return userId;
    case 2: return productId;
    case 3: return amount;
    case 4: return status;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orderId = value$ != null ? value$.toString() : null; break;
    case 1: userId = (java.lang.Integer)value$; break;
    case 2: productId = (java.lang.Integer)value$; break;
    case 3: amount = (java.lang.Double)value$; break;
    case 4: status = (sample.multimodule.enums.OrderStatus)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'orderId' field.
   * @return The value of the 'orderId' field.
   */
  public java.lang.String getOrderId() {
    return orderId;
  }


  /**
   * Sets the value of the 'orderId' field.
   * @param value the value to set.
   */
  public void setOrderId(java.lang.String value) {
    this.orderId = value;
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public int getUserId() {
    return userId;
  }


  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(int value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'productId' field.
   * @return The value of the 'productId' field.
   */
  public int getProductId() {
    return productId;
  }


  /**
   * Sets the value of the 'productId' field.
   * @param value the value to set.
   */
  public void setProductId(int value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public double getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(double value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public sample.multimodule.enums.OrderStatus getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(sample.multimodule.enums.OrderStatus value) {
    this.status = value;
  }

  /**
   * Creates a new OrchestratorResponseDTO RecordBuilder.
   * @return A new OrchestratorResponseDTO RecordBuilder
   */
  public static sample.multimodule.dto.OrchestratorResponseDTO.Builder newBuilder() {
    return new sample.multimodule.dto.OrchestratorResponseDTO.Builder();
  }

  /**
   * Creates a new OrchestratorResponseDTO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrchestratorResponseDTO RecordBuilder
   */
  public static sample.multimodule.dto.OrchestratorResponseDTO.Builder newBuilder(sample.multimodule.dto.OrchestratorResponseDTO.Builder other) {
    if (other == null) {
      return new sample.multimodule.dto.OrchestratorResponseDTO.Builder();
    } else {
      return new sample.multimodule.dto.OrchestratorResponseDTO.Builder(other);
    }
  }

  /**
   * Creates a new OrchestratorResponseDTO RecordBuilder by copying an existing OrchestratorResponseDTO instance.
   * @param other The existing instance to copy.
   * @return A new OrchestratorResponseDTO RecordBuilder
   */
  public static sample.multimodule.dto.OrchestratorResponseDTO.Builder newBuilder(sample.multimodule.dto.OrchestratorResponseDTO other) {
    if (other == null) {
      return new sample.multimodule.dto.OrchestratorResponseDTO.Builder();
    } else {
      return new sample.multimodule.dto.OrchestratorResponseDTO.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrchestratorResponseDTO instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrchestratorResponseDTO>
    implements org.apache.avro.data.RecordBuilder<OrchestratorResponseDTO> {

    private java.lang.String orderId;
    private int userId;
    private int productId;
    private double amount;
    private sample.multimodule.enums.OrderStatus status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(sample.multimodule.dto.OrchestratorResponseDTO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderId)) {
        this.orderId = data().deepCopy(fields()[0].schema(), other.orderId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.productId)) {
        this.productId = data().deepCopy(fields()[2].schema(), other.productId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.amount)) {
        this.amount = data().deepCopy(fields()[3].schema(), other.amount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.status)) {
        this.status = data().deepCopy(fields()[4].schema(), other.status);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing OrchestratorResponseDTO instance
     * @param other The existing instance to copy.
     */
    private Builder(sample.multimodule.dto.OrchestratorResponseDTO other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.orderId)) {
        this.orderId = data().deepCopy(fields()[0].schema(), other.orderId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.productId)) {
        this.productId = data().deepCopy(fields()[2].schema(), other.productId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.amount)) {
        this.amount = data().deepCopy(fields()[3].schema(), other.amount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.status)) {
        this.status = data().deepCopy(fields()[4].schema(), other.status);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'orderId' field.
      * @return The value.
      */
    public java.lang.String getOrderId() {
      return orderId;
    }


    /**
      * Sets the value of the 'orderId' field.
      * @param value The value of 'orderId'.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder setOrderId(java.lang.String value) {
      validate(fields()[0], value);
      this.orderId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orderId' field has been set.
      * @return True if the 'orderId' field has been set, false otherwise.
      */
    public boolean hasOrderId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'orderId' field.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder clearOrderId() {
      orderId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public int getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder setUserId(int value) {
      validate(fields()[1], value);
      this.userId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder clearUserId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'productId' field.
      * @return The value.
      */
    public int getProductId() {
      return productId;
    }


    /**
      * Sets the value of the 'productId' field.
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder setProductId(int value) {
      validate(fields()[2], value);
      this.productId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'productId' field.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder clearProductId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public double getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder setAmount(double value) {
      validate(fields()[3], value);
      this.amount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder clearAmount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public sample.multimodule.enums.OrderStatus getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder setStatus(sample.multimodule.enums.OrderStatus value) {
      validate(fields()[4], value);
      this.status = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public sample.multimodule.dto.OrchestratorResponseDTO.Builder clearStatus() {
      status = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrchestratorResponseDTO build() {
      try {
        OrchestratorResponseDTO record = new OrchestratorResponseDTO();
        record.orderId = fieldSetFlags()[0] ? this.orderId : (java.lang.String) defaultValue(fields()[0]);
        record.userId = fieldSetFlags()[1] ? this.userId : (java.lang.Integer) defaultValue(fields()[1]);
        record.productId = fieldSetFlags()[2] ? this.productId : (java.lang.Integer) defaultValue(fields()[2]);
        record.amount = fieldSetFlags()[3] ? this.amount : (java.lang.Double) defaultValue(fields()[3]);
        record.status = fieldSetFlags()[4] ? this.status : (sample.multimodule.enums.OrderStatus) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrchestratorResponseDTO>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrchestratorResponseDTO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrchestratorResponseDTO>
    READER$ = (org.apache.avro.io.DatumReader<OrchestratorResponseDTO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.orderId);

    out.writeInt(this.userId);

    out.writeInt(this.productId);

    out.writeDouble(this.amount);

    out.writeEnum(this.status.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.orderId = in.readString();

      this.userId = in.readInt();

      this.productId = in.readInt();

      this.amount = in.readDouble();

      this.status = sample.multimodule.enums.OrderStatus.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.orderId = in.readString();
          break;

        case 1:
          this.userId = in.readInt();
          break;

        case 2:
          this.productId = in.readInt();
          break;

        case 3:
          this.amount = in.readDouble();
          break;

        case 4:
          this.status = sample.multimodule.enums.OrderStatus.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










