// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: syscontract/system_contract.proto

package org.chainmaker.pb.syscontract;

public final class SystemContractOuterClass {
  private SystemContractOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code syscontract.SystemContract}
   */
  public enum SystemContract
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * system chain configuration contract
     * used to add, delete and change the chain configuration
     * </pre>
     *
     * <code>CHAIN_CONFIG = 0;</code>
     */
    CHAIN_CONFIG(0),
    /**
     * <pre>
     * system chain query contract
     * used to query the configuration on the chain
     * </pre>
     *
     * <code>CHAIN_QUERY = 1;</code>
     */
    CHAIN_QUERY(1),
    /**
     * <pre>
     * system certificate storage contract
     * used to manage certificates
     * </pre>
     *
     * <code>CERT_MANAGE = 2;</code>
     */
    CERT_MANAGE(2),
    /**
     * <pre>
     * governance contract
     * </pre>
     *
     * <code>GOVERNANCE = 3;</code>
     */
    GOVERNANCE(3),
    /**
     * <pre>
     * multi signature contract on chain
     * </pre>
     *
     * <code>MULTI_SIGN = 4;</code>
     */
    MULTI_SIGN(4),
    /**
     * <pre>
     * manage user contract
     * </pre>
     *
     * <code>CONTRACT_MANAGE = 5;</code>
     */
    CONTRACT_MANAGE(5),
    /**
     * <pre>
     * private compute contract
     * </pre>
     *
     * <code>PRIVATE_COMPUTE = 6;</code>
     */
    PRIVATE_COMPUTE(6),
    /**
     * <pre>
     * erc20 contract for DPoS
     * </pre>
     *
     * <code>DPOS_ERC20 = 7;</code>
     */
    DPOS_ERC20(7),
    /**
     * <pre>
     * stake contract for dpos
     * </pre>
     *
     * <code>DPOS_STAKE = 8;</code>
     */
    DPOS_STAKE(8),
    /**
     * <pre>
     *subscribe block info,tx info and contract info.
     * </pre>
     *
     * <code>SUBSCRIBE_MANAGE = 9;</code>
     */
    SUBSCRIBE_MANAGE(9),
    /**
     * <pre>
     *archive/restore block
     * </pre>
     *
     * <code>ARCHIVE_MANAGE = 10;</code>
     */
    ARCHIVE_MANAGE(10),
    /**
     * <pre>
     *cross chain transaction system contract
     * </pre>
     *
     * <code>CROSS_TRANSACTION = 11;</code>
     */
    CROSS_TRANSACTION(11),
    /**
     * <pre>
     * pubkey manage system contract
     * </pre>
     *
     * <code>PUBKEY_MANAGE = 12;</code>
     */
    PUBKEY_MANAGE(12),
    /**
     * <pre>
     * account manager system contract
     * </pre>
     *
     * <code>ACCOUNT_MANAGER = 13;</code>
     */
    ACCOUNT_MANAGER(13),
    /**
     * <pre>
     * for test or debug contract code
     * </pre>
     *
     * <code>T = 99;</code>
     */
    T(99),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * system chain configuration contract
     * used to add, delete and change the chain configuration
     * </pre>
     *
     * <code>CHAIN_CONFIG = 0;</code>
     */
    public static final int CHAIN_CONFIG_VALUE = 0;
    /**
     * <pre>
     * system chain query contract
     * used to query the configuration on the chain
     * </pre>
     *
     * <code>CHAIN_QUERY = 1;</code>
     */
    public static final int CHAIN_QUERY_VALUE = 1;
    /**
     * <pre>
     * system certificate storage contract
     * used to manage certificates
     * </pre>
     *
     * <code>CERT_MANAGE = 2;</code>
     */
    public static final int CERT_MANAGE_VALUE = 2;
    /**
     * <pre>
     * governance contract
     * </pre>
     *
     * <code>GOVERNANCE = 3;</code>
     */
    public static final int GOVERNANCE_VALUE = 3;
    /**
     * <pre>
     * multi signature contract on chain
     * </pre>
     *
     * <code>MULTI_SIGN = 4;</code>
     */
    public static final int MULTI_SIGN_VALUE = 4;
    /**
     * <pre>
     * manage user contract
     * </pre>
     *
     * <code>CONTRACT_MANAGE = 5;</code>
     */
    public static final int CONTRACT_MANAGE_VALUE = 5;
    /**
     * <pre>
     * private compute contract
     * </pre>
     *
     * <code>PRIVATE_COMPUTE = 6;</code>
     */
    public static final int PRIVATE_COMPUTE_VALUE = 6;
    /**
     * <pre>
     * erc20 contract for DPoS
     * </pre>
     *
     * <code>DPOS_ERC20 = 7;</code>
     */
    public static final int DPOS_ERC20_VALUE = 7;
    /**
     * <pre>
     * stake contract for dpos
     * </pre>
     *
     * <code>DPOS_STAKE = 8;</code>
     */
    public static final int DPOS_STAKE_VALUE = 8;
    /**
     * <pre>
     *subscribe block info,tx info and contract info.
     * </pre>
     *
     * <code>SUBSCRIBE_MANAGE = 9;</code>
     */
    public static final int SUBSCRIBE_MANAGE_VALUE = 9;
    /**
     * <pre>
     *archive/restore block
     * </pre>
     *
     * <code>ARCHIVE_MANAGE = 10;</code>
     */
    public static final int ARCHIVE_MANAGE_VALUE = 10;
    /**
     * <pre>
     *cross chain transaction system contract
     * </pre>
     *
     * <code>CROSS_TRANSACTION = 11;</code>
     */
    public static final int CROSS_TRANSACTION_VALUE = 11;
    /**
     * <pre>
     * pubkey manage system contract
     * </pre>
     *
     * <code>PUBKEY_MANAGE = 12;</code>
     */
    public static final int PUBKEY_MANAGE_VALUE = 12;
    /**
     * <pre>
     * account manager system contract
     * </pre>
     *
     * <code>ACCOUNT_MANAGER = 13;</code>
     */
    public static final int ACCOUNT_MANAGER_VALUE = 13;
    /**
     * <pre>
     * for test or debug contract code
     * </pre>
     *
     * <code>T = 99;</code>
     */
    public static final int T_VALUE = 99;


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
    public static SystemContract valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SystemContract forNumber(int value) {
      switch (value) {
        case 0: return CHAIN_CONFIG;
        case 1: return CHAIN_QUERY;
        case 2: return CERT_MANAGE;
        case 3: return GOVERNANCE;
        case 4: return MULTI_SIGN;
        case 5: return CONTRACT_MANAGE;
        case 6: return PRIVATE_COMPUTE;
        case 7: return DPOS_ERC20;
        case 8: return DPOS_STAKE;
        case 9: return SUBSCRIBE_MANAGE;
        case 10: return ARCHIVE_MANAGE;
        case 11: return CROSS_TRANSACTION;
        case 12: return PUBKEY_MANAGE;
        case 13: return ACCOUNT_MANAGER;
        case 99: return T;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SystemContract>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SystemContract> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SystemContract>() {
            public SystemContract findValueByNumber(int number) {
              return SystemContract.forNumber(number);
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
      return org.chainmaker.pb.syscontract.SystemContractOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final SystemContract[] VALUES = values();

    public static SystemContract valueOf(
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

    private SystemContract(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:syscontract.SystemContract)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!syscontract/system_contract.proto\022\013sys" +
      "contract*\236\002\n\016SystemContract\022\020\n\014CHAIN_CON" +
      "FIG\020\000\022\017\n\013CHAIN_QUERY\020\001\022\017\n\013CERT_MANAGE\020\002\022" +
      "\016\n\nGOVERNANCE\020\003\022\016\n\nMULTI_SIGN\020\004\022\023\n\017CONTR" +
      "ACT_MANAGE\020\005\022\023\n\017PRIVATE_COMPUTE\020\006\022\016\n\nDPO" +
      "S_ERC20\020\007\022\016\n\nDPOS_STAKE\020\010\022\024\n\020SUBSCRIBE_M" +
      "ANAGE\020\t\022\022\n\016ARCHIVE_MANAGE\020\n\022\025\n\021CROSS_TRA" +
      "NSACTION\020\013\022\021\n\rPUBKEY_MANAGE\020\014\022\023\n\017ACCOUNT" +
      "_MANAGER\020\r\022\005\n\001T\020cBO\n\035org.chainmaker.pb.s" +
      "yscontractZ.chainmaker.org/chainmaker/pb" +
      "-go/v2/syscontractb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
