// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.3
// source: date_service.proto

package __

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// DateProviderClient is the client API for DateProvider service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type DateProviderClient interface {
	GetDate(ctx context.Context, in *RPCDateRequest, opts ...grpc.CallOption) (*RPCDateResponse, error)
}

type dateProviderClient struct {
	cc grpc.ClientConnInterface
}

func NewDateProviderClient(cc grpc.ClientConnInterface) DateProviderClient {
	return &dateProviderClient{cc}
}

func (c *dateProviderClient) GetDate(ctx context.Context, in *RPCDateRequest, opts ...grpc.CallOption) (*RPCDateResponse, error) {
	out := new(RPCDateResponse)
	err := c.cc.Invoke(ctx, "/com.jd.hello.grpc.api.DateProvider/getDate", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DateProviderServer is the server API for DateProvider service.
// All implementations must embed UnimplementedDateProviderServer
// for forward compatibility
type DateProviderServer interface {
	GetDate(context.Context, *RPCDateRequest) (*RPCDateResponse, error)
	mustEmbedUnimplementedDateProviderServer()
}

// UnimplementedDateProviderServer must be embedded to have forward compatible implementations.
type UnimplementedDateProviderServer struct {
}

func (UnimplementedDateProviderServer) GetDate(context.Context, *RPCDateRequest) (*RPCDateResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetDate not implemented")
}
func (UnimplementedDateProviderServer) mustEmbedUnimplementedDateProviderServer() {}

// UnsafeDateProviderServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to DateProviderServer will
// result in compilation errors.
type UnsafeDateProviderServer interface {
	mustEmbedUnimplementedDateProviderServer()
}

func RegisterDateProviderServer(s grpc.ServiceRegistrar, srv DateProviderServer) {
	s.RegisterService(&DateProvider_ServiceDesc, srv)
}

func _DateProvider_GetDate_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RPCDateRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DateProviderServer).GetDate(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/com.jd.hello.grpc.api.DateProvider/getDate",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DateProviderServer).GetDate(ctx, req.(*RPCDateRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// DateProvider_ServiceDesc is the grpc.ServiceDesc for DateProvider service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var DateProvider_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "com.jd.hello.grpc.api.DateProvider",
	HandlerType: (*DateProviderServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "getDate",
			Handler:    _DateProvider_GetDate_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "date_service.proto",
}
