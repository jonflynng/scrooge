/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.scrooge.test.gold.thriftjava;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

import com.twitter.scrooge.ThriftStructIface;
import com.twitter.scrooge.UtilValidator;
import com.twitter.scrooge.thrift_validation.BaseValidator;
import com.twitter.scrooge.thrift_validation.ThriftValidationViolation;
import com.twitter.scrooge.TFieldBlob;
import com.twitter.scrooge.internal.TProtocols;

// No additional import required for struct/union.

public class Response implements TBase<Response, Response._Fields>, java.io.Serializable, Cloneable, ThriftStructIface {
  private static final TStruct STRUCT_DESC = new TStruct("Response");

  private static final TField STATUS_CODE_FIELD_DESC = new TField("statusCode", TType.I32, (short)1);
  private static final TField RESPONSE_UNION_FIELD_DESC = new TField("responseUnion", TType.STRUCT, (short)2);


  public int statusCode;
  public ResponseUnion responseUnion;
  private Map<Short, TFieldBlob> passThroughFields;

  /** The set of fields this object contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    STATUS_CODE((short)1, "statusCode"),
    RESPONSE_UNION((short)2, "responseUnion");
  
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
  
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS_CODE
          return STATUS_CODE;
        case 2: // RESPONSE_UNION
          return RESPONSE_UNION;
        default:
          return null;
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
  
    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }
  
    private final short _thriftId;
    private final String _fieldName;
  
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
  
    public short getThriftFieldId() {
      return _thriftId;
    }
  
    public String getFieldName() {
      return _fieldName;
    }
  }


  // isset id assignments
  private static final int __STATUSCODE_ISSET_ID = 0;
  private final BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  
  /**
   * FieldValueMetaData.type returns TType.STRING for both string and binary field values.
   * This set can be used to determine if a FieldValueMetaData with type TType.STRING is actually
   * declared as binary in the idl file.
   */
  public static final Set<FieldValueMetaData> binaryFieldValueMetaDatas;
  
  private static FieldValueMetaData registerBinaryFieldValueMetaData(FieldValueMetaData f, Set<FieldValueMetaData> binaryFieldValues) {
    binaryFieldValues.add(f);
    return f;
  }
  
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    Set<FieldValueMetaData> tmpSet = new HashSet<FieldValueMetaData>();
    tmpMap.put(_Fields.STATUS_CODE, new FieldMetaData("statusCode", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.RESPONSE_UNION, new FieldMetaData("responseUnion", TFieldRequirementType.DEFAULT,
      new StructMetaData(TType.STRUCT, ResponseUnion.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    binaryFieldValueMetaDatas = Collections.unmodifiableSet(tmpSet);
    FieldMetaData.addStructMetaDataMap(Response.class, metaDataMap);
  }

  /**
   * Returns a map of the annotations and their values for this struct declaration.
   * See fieldAnnotations or valueAnnotations for the annotations attached to struct fields
   * or enum values.
   */
  public static final Map<String, String> structAnnotations;
  static {
    Map<String, String> tmpMap = new HashMap<String, String>();
    tmpMap.put("com.twitter.scrooge.scala.generateStructProxy", "true");
    structAnnotations = Collections.unmodifiableMap(tmpMap);
  }

  /**
   * Returns a map of the annotations for each of this struct's fields, keyed by the field.
   * See structAnnotations for the annotations attached to this struct's declaration.
   */
  public static final Map<_Fields, Map<String, String>> fieldAnnotations;
  static {
    fieldAnnotations = Collections.emptyMap();
  }

  /**
   * Returns the set of fields that have a configured default value.
   * The default values for these fields can be obtained by
   * instantiating this class with the default constructor.
   */
  public static final Set<_Fields> hasDefaultValue;
  static {
    Set<_Fields> tmp = EnumSet.noneOf(_Fields.class);
    hasDefaultValue = Collections.unmodifiableSet(tmp);
  }


  public Response() {
  }

  public Response(
    int statusCode,
    ResponseUnion responseUnion)
  {
    this();
    this.statusCode = statusCode;
    setStatusCodeIsSet(true);
    this.responseUnion = responseUnion;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Response(Response other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.statusCode = other.statusCode;
    if (other.isSetResponseUnion()) {
      this.responseUnion = new ResponseUnion(other.responseUnion);
    }
    this.passThroughFields = other.passThroughFields;
  }

  public static List<String> validateNewInstance(Response item) {
    final List<String> buf = new ArrayList<String>();

    if (item.isSetResponseUnion()) {
      ResponseUnion _responseUnion = item.responseUnion;
      buf.addAll(com.twitter.scrooge.test.gold.thriftjava.ResponseUnion.validateNewInstance(_responseUnion));
    }

    return buf;
  }

  public static Set<ThriftValidationViolation> validateInstanceValue(Response item) {
    final Set<ThriftValidationViolation> violations = new HashSet<ThriftValidationViolation>();
    final BaseValidator validator = new UtilValidator();

    violations.addAll(com.twitter.scrooge.test.gold.thriftjava.ResponseUnion.validateInstanceValue(item.responseUnion));

    return violations;
  }

  public Response deepCopy() {
    return new Response(this);
  }

  @java.lang.Override
  public void clear() {
    setStatusCodeIsSet(false);
    this.statusCode = 0;
    this.responseUnion = null;
    this.passThroughFields = null;
  }

  public int getStatusCode() {
    return this.statusCode;
  }

  public Response setStatusCode(int statusCode) {
    this.statusCode = statusCode;
    setStatusCodeIsSet(true);

    return this;
  }

  public void unsetStatusCode() {
  __isset_bit_vector.clear(__STATUSCODE_ISSET_ID);
  }

  /** Returns true if field statusCode is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusCode() {
    return __isset_bit_vector.get(__STATUSCODE_ISSET_ID);
  }

  public void setStatusCodeIsSet(boolean value) {
    __isset_bit_vector.set(__STATUSCODE_ISSET_ID, value);
  }

  public ResponseUnion getResponseUnion() {
    return this.responseUnion;
  }

  public Response setResponseUnion(ResponseUnion responseUnion) {
    this.responseUnion = responseUnion;
    
    return this;
  }

  public void unsetResponseUnion() {
    this.responseUnion = null;
  }

  /** Returns true if field responseUnion is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseUnion() {
    return this.responseUnion != null;
  }

  public void setResponseUnionIsSet(boolean value) {
    if (!value) {
      this.responseUnion = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS_CODE:
      if (value == null) {
        unsetStatusCode();
      } else {
        setStatusCode((Integer)value);
      }
      break;
    case RESPONSE_UNION:
      if (value == null) {
        unsetResponseUnion();
      } else {
        setResponseUnion((ResponseUnion)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS_CODE:
      return Integer.valueOf(getStatusCode());
    case RESPONSE_UNION:
      return getResponseUnion();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS_CODE:
      return isSetStatusCode();
    case RESPONSE_UNION:
      return isSetResponseUnion();
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Response)
      return this.equals((Response)that);
    return false;
  }

  public boolean equals(Response that) {
    return equalsWithoutPassthrough(that) && passthroughFieldsAreEqual(that);
  }

  private boolean equalsWithoutPassthrough(Response that) {
    if (that == null)
      return false;
    boolean this_present_statusCode = true;
    boolean that_present_statusCode = true;
    if (this_present_statusCode || that_present_statusCode) {
      if (!(this_present_statusCode && that_present_statusCode))
        return false;
      if (this.statusCode != that.statusCode)
        return false;
    }
    boolean this_present_responseUnion = true && this.isSetResponseUnion();
    boolean that_present_responseUnion = true && that.isSetResponseUnion();
    if (this_present_responseUnion || that_present_responseUnion) {
      if (!(this_present_responseUnion && that_present_responseUnion))
        return false;
      if (!this.responseUnion.equals(that.responseUnion))
        return false;
    }
    return true;
  }

  private boolean passthroughFieldsAreEqual(Response that) {
    if (that == null)
      return false;
    if (this.passThroughFields == null && that.passThroughFields != null)
      return false;
    if (this.passThroughFields == that.passThroughFields
        || this.passThroughFields.equals(that.passThroughFields))
      return true;
    return false;
  }

  @java.lang.Override
  public int hashCode() {
    int hashCode = 1;
    {
      hashCode = 31 * hashCode + ((Integer)statusCode).hashCode();
    }
    if (isSetResponseUnion()) {
      hashCode = 31 * hashCode + responseUnion.hashCode();
    }
    return hashCode;
  }

  public int compareTo(Response other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Response typedOther = (Response)other;

    lastComparison = Boolean.valueOf(isSetStatusCode()).compareTo(typedOther.isSetStatusCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusCode()) {
      lastComparison = TBaseHelper.compareTo(this.statusCode, typedOther.statusCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponseUnion()).compareTo(typedOther.isSetResponseUnion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseUnion()) {
      lastComparison = TBaseHelper.compareTo(this.responseUnion, typedOther.responseUnion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // STATUS_CODE
          TProtocols.validateFieldType(TType.I32, field.type, "statusCode");
          this.statusCode = iprot.readI32();
          setStatusCodeIsSet(true);
          break;
        case 2: // RESPONSE_UNION
          TProtocols.validateFieldType(TType.STRUCT, field.type, "responseUnion");
          this.responseUnion = new ResponseUnion();
            this.responseUnion.read(iprot);
          break;
        default:
          if (this.passThroughFields == null) {
            this.passThroughFields = new HashMap<Short, TFieldBlob>();
          }
          this.passThroughFields.put(field.id, TFieldBlob.extractBlob(field, iprot));
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(STATUS_CODE_FIELD_DESC);
    oprot.writeI32(this.statusCode);
    oprot.writeFieldEnd();
    if (this.responseUnion != null) {
      oprot.writeFieldBegin(RESPONSE_UNION_FIELD_DESC);
      this.responseUnion.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.passThroughFields != null) {
      for (TFieldBlob field : this.passThroughFields.values()) {
        field.write(oprot);
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Response(");
    boolean first = true;
    sb.append("statusCode:");
    sb.append(this.statusCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("responseUnion:");
    if (this.responseUnion == null) {
      sb.append("null");
    } else {
      sb.append(this.responseUnion);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}

