# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# -*- coding: utf-8 -*-
# Generated by the grpc_protocol buffer compiler.  DO NOT EDIT!
# source: service.proto
# Protobuf Python Version: 5.26.1
"""Generated grpc_protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder

# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()

DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\rservice.proto\x12\x12\x61pache.rocketmq.v2\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x10\x64\x65\x66inition.proto\"r\n\x11QueryRouteRequest\x12+\n\x05topic\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x30\n\tendpoints\x18\x02 \x01(\x0b\x32\x1d.apache.rocketmq.v2.Endpoints\"z\n\x12QueryRouteResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\x12\x38\n\x0emessage_queues\x18\x02 \x03(\x0b\x32 .apache.rocketmq.v2.MessageQueue\"C\n\x12SendMessageRequest\x12-\n\x08messages\x18\x01 \x03(\x0b\x32\x1b.apache.rocketmq.v2.Message\"y\n\x0fSendResultEntry\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\x12\x12\n\nmessage_id\x18\x02 \x01(\t\x12\x16\n\x0etransaction_id\x18\x03 \x01(\t\x12\x0e\n\x06offset\x18\x04 \x01(\x03\"w\n\x13SendMessageResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\x12\x34\n\x07\x65ntries\x18\x02 \x03(\x0b\x32#.apache.rocketmq.v2.SendResultEntry\"\xa4\x01\n\x16QueryAssignmentRequest\x12+\n\x05topic\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12+\n\x05group\x18\x02 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x30\n\tendpoints\x18\x03 \x01(\x0b\x32\x1d.apache.rocketmq.v2.Endpoints\"z\n\x17QueryAssignmentResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\x12\x33\n\x0b\x61ssignments\x18\x02 \x03(\x0b\x32\x1e.apache.rocketmq.v2.Assignment\"\xb8\x03\n\x15ReceiveMessageRequest\x12+\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x37\n\rmessage_queue\x18\x02 \x01(\x0b\x32 .apache.rocketmq.v2.MessageQueue\x12?\n\x11\x66ilter_expression\x18\x03 \x01(\x0b\x32$.apache.rocketmq.v2.FilterExpression\x12\x12\n\nbatch_size\x18\x04 \x01(\x05\x12:\n\x12invisible_duration\x18\x05 \x01(\x0b\x32\x19.google.protobuf.DurationH\x00\x88\x01\x01\x12\x12\n\nauto_renew\x18\x06 \x01(\x08\x12<\n\x14long_polling_timeout\x18\x07 \x01(\x0b\x32\x19.google.protobuf.DurationH\x01\x88\x01\x01\x12\x17\n\nattempt_id\x18\x08 \x01(\tH\x02\x88\x01\x01\x42\x15\n\x13_invisible_durationB\x17\n\x15_long_polling_timeoutB\r\n\x0b_attempt_id\"\xbb\x01\n\x16ReceiveMessageResponse\x12,\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.StatusH\x00\x12.\n\x07message\x18\x02 \x01(\x0b\x32\x1b.apache.rocketmq.v2.MessageH\x00\x12\x38\n\x12\x64\x65livery_timestamp\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\t\n\x07\x63ontent\"=\n\x0f\x41\x63kMessageEntry\x12\x12\n\nmessage_id\x18\x01 \x01(\t\x12\x16\n\x0ereceipt_handle\x18\x02 \x01(\t\"\xa3\x01\n\x11\x41\x63kMessageRequest\x12+\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12+\n\x05topic\x18\x02 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x34\n\x07\x65ntries\x18\x03 \x03(\x0b\x32#.apache.rocketmq.v2.AckMessageEntry\"o\n\x15\x41\x63kMessageResultEntry\x12\x12\n\nmessage_id\x18\x01 \x01(\t\x12\x16\n\x0ereceipt_handle\x18\x02 \x01(\t\x12*\n\x06status\x18\x03 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\"|\n\x12\x41\x63kMessageResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\x12:\n\x07\x65ntries\x18\x02 \x03(\x0b\x32).apache.rocketmq.v2.AckMessageResultEntry\"\xe7\x01\n&ForwardMessageToDeadLetterQueueRequest\x12+\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12+\n\x05topic\x18\x02 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x16\n\x0ereceipt_handle\x18\x03 \x01(\t\x12\x12\n\nmessage_id\x18\x04 \x01(\t\x12\x18\n\x10\x64\x65livery_attempt\x18\x05 \x01(\x05\x12\x1d\n\x15max_delivery_attempts\x18\x06 \x01(\x05\"U\n\'ForwardMessageToDeadLetterQueueResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\"\x83\x01\n\x10HeartbeatRequest\x12\x30\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.ResourceH\x00\x88\x01\x01\x12\x33\n\x0b\x63lient_type\x18\x02 \x01(\x0e\x32\x1e.apache.rocketmq.v2.ClientTypeB\x08\n\x06_group\"?\n\x11HeartbeatResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\"\xfd\x01\n\x15\x45ndTransactionRequest\x12+\n\x05topic\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x12\n\nmessage_id\x18\x02 \x01(\t\x12\x16\n\x0etransaction_id\x18\x03 \x01(\t\x12=\n\nresolution\x18\x04 \x01(\x0e\x32).apache.rocketmq.v2.TransactionResolution\x12\x35\n\x06source\x18\x05 \x01(\x0e\x32%.apache.rocketmq.v2.TransactionSource\x12\x15\n\rtrace_context\x18\x06 \x01(\t\"D\n\x16\x45ndTransactionResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\"-\n\x1cPrintThreadStackTraceCommand\x12\r\n\x05nonce\x18\x01 \x01(\t\"Y\n\x10ThreadStackTrace\x12\r\n\x05nonce\x18\x01 \x01(\t\x12\x1f\n\x12thread_stack_trace\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x15\n\x13_thread_stack_trace\"S\n\x14VerifyMessageCommand\x12\r\n\x05nonce\x18\x01 \x01(\t\x12,\n\x07message\x18\x02 \x01(\x0b\x32\x1b.apache.rocketmq.v2.Message\"$\n\x13VerifyMessageResult\x12\r\n\x05nonce\x18\x01 \x01(\t\"i\n!RecoverOrphanedTransactionCommand\x12,\n\x07message\x18\x01 \x01(\x0b\x32\x1b.apache.rocketmq.v2.Message\x12\x16\n\x0etransaction_id\x18\x02 \x01(\t\"\xaa\x04\n\x10TelemetryCommand\x12/\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.StatusH\x01\x88\x01\x01\x12\x30\n\x08settings\x18\x02 \x01(\x0b\x32\x1c.apache.rocketmq.v2.SettingsH\x00\x12\x42\n\x12thread_stack_trace\x18\x03 \x01(\x0b\x32$.apache.rocketmq.v2.ThreadStackTraceH\x00\x12H\n\x15verify_message_result\x18\x04 \x01(\x0b\x32\'.apache.rocketmq.v2.VerifyMessageResultH\x00\x12\x65\n$recover_orphaned_transaction_command\x18\x05 \x01(\x0b\x32\x35.apache.rocketmq.v2.RecoverOrphanedTransactionCommandH\x00\x12\\\n print_thread_stack_trace_command\x18\x06 \x01(\x0b\x32\x30.apache.rocketmq.v2.PrintThreadStackTraceCommandH\x00\x12J\n\x16verify_message_command\x18\x07 \x01(\x0b\x32(.apache.rocketmq.v2.VerifyMessageCommandH\x00\x42\t\n\x07\x63ommandB\t\n\x07_status\"\\\n\x1eNotifyClientTerminationRequest\x12\x30\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.ResourceH\x00\x88\x01\x01\x42\x08\n\x06_group\"M\n\x1fNotifyClientTerminationResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\"\xdd\x01\n\x1e\x43hangeInvisibleDurationRequest\x12+\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12+\n\x05topic\x18\x02 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x16\n\x0ereceipt_handle\x18\x03 \x01(\t\x12\x35\n\x12invisible_duration\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x12\n\nmessage_id\x18\x05 \x01(\t\"e\n\x1f\x43hangeInvisibleDurationResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\x12\x16\n\x0ereceipt_handle\x18\x02 \x01(\t\"\x98\x02\n\x12PullMessageRequest\x12+\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x37\n\rmessage_queue\x18\x02 \x01(\x0b\x32 .apache.rocketmq.v2.MessageQueue\x12\x0e\n\x06offset\x18\x03 \x01(\x03\x12\x12\n\nbatch_size\x18\x04 \x01(\x05\x12?\n\x11\x66ilter_expression\x18\x05 \x01(\x0b\x32$.apache.rocketmq.v2.FilterExpression\x12\x37\n\x14long_polling_timeout\x18\x06 \x01(\x0b\x32\x19.google.protobuf.Duration\"\x95\x01\n\x13PullMessageResponse\x12,\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.StatusH\x00\x12.\n\x07message\x18\x02 \x01(\x0b\x32\x1b.apache.rocketmq.v2.MessageH\x00\x12\x15\n\x0bnext_offset\x18\x03 \x01(\x03H\x00\x42\t\n\x07\x63ontent\"\x8b\x01\n\x13UpdateOffsetRequest\x12+\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x37\n\rmessage_queue\x18\x02 \x01(\x0b\x32 .apache.rocketmq.v2.MessageQueue\x12\x0e\n\x06offset\x18\x03 \x01(\x03\"B\n\x14UpdateOffsetResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\"x\n\x10GetOffsetRequest\x12+\n\x05group\x18\x01 \x01(\x0b\x32\x1c.apache.rocketmq.v2.Resource\x12\x37\n\rmessage_queue\x18\x02 \x01(\x0b\x32 .apache.rocketmq.v2.MessageQueue\"O\n\x11GetOffsetResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\x12\x0e\n\x06offset\x18\x02 \x01(\x03\"\xd3\x01\n\x12QueryOffsetRequest\x12\x37\n\rmessage_queue\x18\x01 \x01(\x0b\x32 .apache.rocketmq.v2.MessageQueue\x12\x42\n\x13query_offset_policy\x18\x02 \x01(\x0e\x32%.apache.rocketmq.v2.QueryOffsetPolicy\x12\x32\n\ttimestamp\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x88\x01\x01\x42\x0c\n\n_timestamp\"Q\n\x13QueryOffsetResponse\x12*\n\x06status\x18\x01 \x01(\x0b\x32\x1a.apache.rocketmq.v2.Status\x12\x0e\n\x06offset\x18\x02 \x01(\x03\x32\xe7\x0c\n\x10MessagingService\x12]\n\nQueryRoute\x12%.apache.rocketmq.v2.QueryRouteRequest\x1a&.apache.rocketmq.v2.QueryRouteResponse\"\x00\x12Z\n\tHeartbeat\x12$.apache.rocketmq.v2.HeartbeatRequest\x1a%.apache.rocketmq.v2.HeartbeatResponse\"\x00\x12`\n\x0bSendMessage\x12&.apache.rocketmq.v2.SendMessageRequest\x1a\'.apache.rocketmq.v2.SendMessageResponse\"\x00\x12l\n\x0fQueryAssignment\x12*.apache.rocketmq.v2.QueryAssignmentRequest\x1a+.apache.rocketmq.v2.QueryAssignmentResponse\"\x00\x12k\n\x0eReceiveMessage\x12).apache.rocketmq.v2.ReceiveMessageRequest\x1a*.apache.rocketmq.v2.ReceiveMessageResponse\"\x00\x30\x01\x12]\n\nAckMessage\x12%.apache.rocketmq.v2.AckMessageRequest\x1a&.apache.rocketmq.v2.AckMessageResponse\"\x00\x12\x9c\x01\n\x1f\x46orwardMessageToDeadLetterQueue\x12:.apache.rocketmq.v2.ForwardMessageToDeadLetterQueueRequest\x1a;.apache.rocketmq.v2.ForwardMessageToDeadLetterQueueResponse\"\x00\x12\x62\n\x0bPullMessage\x12&.apache.rocketmq.v2.PullMessageRequest\x1a\'.apache.rocketmq.v2.PullMessageResponse\"\x00\x30\x01\x12\x63\n\x0cUpdateOffset\x12\'.apache.rocketmq.v2.UpdateOffsetRequest\x1a(.apache.rocketmq.v2.UpdateOffsetResponse\"\x00\x12Z\n\tGetOffset\x12$.apache.rocketmq.v2.GetOffsetRequest\x1a%.apache.rocketmq.v2.GetOffsetResponse\"\x00\x12`\n\x0bQueryOffset\x12&.apache.rocketmq.v2.QueryOffsetRequest\x1a\'.apache.rocketmq.v2.QueryOffsetResponse\"\x00\x12i\n\x0e\x45ndTransaction\x12).apache.rocketmq.v2.EndTransactionRequest\x1a*.apache.rocketmq.v2.EndTransactionResponse\"\x00\x12]\n\tTelemetry\x12$.apache.rocketmq.v2.TelemetryCommand\x1a$.apache.rocketmq.v2.TelemetryCommand\"\x00(\x01\x30\x01\x12\x84\x01\n\x17NotifyClientTermination\x12\x32.apache.rocketmq.v2.NotifyClientTerminationRequest\x1a\x33.apache.rocketmq.v2.NotifyClientTerminationResponse\"\x00\x12\x84\x01\n\x17\x43hangeInvisibleDuration\x12\x32.apache.rocketmq.v2.ChangeInvisibleDurationRequest\x1a\x33.apache.rocketmq.v2.ChangeInvisibleDurationResponse\"\x00\x42<\n\x12\x61pache.rocketmq.v2B\tMQServiceP\x01\xa0\x01\x01\xd8\x01\x01\xaa\x02\x12\x41pache.Rocketmq.V2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'service_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022apache.rocketmq.v2B\tMQServiceP\001\240\001\001\330\001\001\252\002\022Apache.Rocketmq.V2'
  _globals['_QUERYROUTEREQUEST']._serialized_start=120
  _globals['_QUERYROUTEREQUEST']._serialized_end=234
  _globals['_QUERYROUTERESPONSE']._serialized_start=236
  _globals['_QUERYROUTERESPONSE']._serialized_end=358
  _globals['_SENDMESSAGEREQUEST']._serialized_start=360
  _globals['_SENDMESSAGEREQUEST']._serialized_end=427
  _globals['_SENDRESULTENTRY']._serialized_start=429
  _globals['_SENDRESULTENTRY']._serialized_end=550
  _globals['_SENDMESSAGERESPONSE']._serialized_start=552
  _globals['_SENDMESSAGERESPONSE']._serialized_end=671
  _globals['_QUERYASSIGNMENTREQUEST']._serialized_start=674
  _globals['_QUERYASSIGNMENTREQUEST']._serialized_end=838
  _globals['_QUERYASSIGNMENTRESPONSE']._serialized_start=840
  _globals['_QUERYASSIGNMENTRESPONSE']._serialized_end=962
  _globals['_RECEIVEMESSAGEREQUEST']._serialized_start=965
  _globals['_RECEIVEMESSAGEREQUEST']._serialized_end=1405
  _globals['_RECEIVEMESSAGERESPONSE']._serialized_start=1408
  _globals['_RECEIVEMESSAGERESPONSE']._serialized_end=1595
  _globals['_ACKMESSAGEENTRY']._serialized_start=1597
  _globals['_ACKMESSAGEENTRY']._serialized_end=1658
  _globals['_ACKMESSAGEREQUEST']._serialized_start=1661
  _globals['_ACKMESSAGEREQUEST']._serialized_end=1824
  _globals['_ACKMESSAGERESULTENTRY']._serialized_start=1826
  _globals['_ACKMESSAGERESULTENTRY']._serialized_end=1937
  _globals['_ACKMESSAGERESPONSE']._serialized_start=1939
  _globals['_ACKMESSAGERESPONSE']._serialized_end=2063
  _globals['_FORWARDMESSAGETODEADLETTERQUEUEREQUEST']._serialized_start=2066
  _globals['_FORWARDMESSAGETODEADLETTERQUEUEREQUEST']._serialized_end=2297
  _globals['_FORWARDMESSAGETODEADLETTERQUEUERESPONSE']._serialized_start=2299
  _globals['_FORWARDMESSAGETODEADLETTERQUEUERESPONSE']._serialized_end=2384
  _globals['_HEARTBEATREQUEST']._serialized_start=2387
  _globals['_HEARTBEATREQUEST']._serialized_end=2518
  _globals['_HEARTBEATRESPONSE']._serialized_start=2520
  _globals['_HEARTBEATRESPONSE']._serialized_end=2583
  _globals['_ENDTRANSACTIONREQUEST']._serialized_start=2586
  _globals['_ENDTRANSACTIONREQUEST']._serialized_end=2839
  _globals['_ENDTRANSACTIONRESPONSE']._serialized_start=2841
  _globals['_ENDTRANSACTIONRESPONSE']._serialized_end=2909
  _globals['_PRINTTHREADSTACKTRACECOMMAND']._serialized_start=2911
  _globals['_PRINTTHREADSTACKTRACECOMMAND']._serialized_end=2956
  _globals['_THREADSTACKTRACE']._serialized_start=2958
  _globals['_THREADSTACKTRACE']._serialized_end=3047
  _globals['_VERIFYMESSAGECOMMAND']._serialized_start=3049
  _globals['_VERIFYMESSAGECOMMAND']._serialized_end=3132
  _globals['_VERIFYMESSAGERESULT']._serialized_start=3134
  _globals['_VERIFYMESSAGERESULT']._serialized_end=3170
  _globals['_RECOVERORPHANEDTRANSACTIONCOMMAND']._serialized_start=3172
  _globals['_RECOVERORPHANEDTRANSACTIONCOMMAND']._serialized_end=3277
  _globals['_TELEMETRYCOMMAND']._serialized_start=3280
  _globals['_TELEMETRYCOMMAND']._serialized_end=3834
  _globals['_NOTIFYCLIENTTERMINATIONREQUEST']._serialized_start=3836
  _globals['_NOTIFYCLIENTTERMINATIONREQUEST']._serialized_end=3928
  _globals['_NOTIFYCLIENTTERMINATIONRESPONSE']._serialized_start=3930
  _globals['_NOTIFYCLIENTTERMINATIONRESPONSE']._serialized_end=4007
  _globals['_CHANGEINVISIBLEDURATIONREQUEST']._serialized_start=4010
  _globals['_CHANGEINVISIBLEDURATIONREQUEST']._serialized_end=4231
  _globals['_CHANGEINVISIBLEDURATIONRESPONSE']._serialized_start=4233
  _globals['_CHANGEINVISIBLEDURATIONRESPONSE']._serialized_end=4334
  _globals['_PULLMESSAGEREQUEST']._serialized_start=4337
  _globals['_PULLMESSAGEREQUEST']._serialized_end=4617
  _globals['_PULLMESSAGERESPONSE']._serialized_start=4620
  _globals['_PULLMESSAGERESPONSE']._serialized_end=4769
  _globals['_UPDATEOFFSETREQUEST']._serialized_start=4772
  _globals['_UPDATEOFFSETREQUEST']._serialized_end=4911
  _globals['_UPDATEOFFSETRESPONSE']._serialized_start=4913
  _globals['_UPDATEOFFSETRESPONSE']._serialized_end=4979
  _globals['_GETOFFSETREQUEST']._serialized_start=4981
  _globals['_GETOFFSETREQUEST']._serialized_end=5101
  _globals['_GETOFFSETRESPONSE']._serialized_start=5103
  _globals['_GETOFFSETRESPONSE']._serialized_end=5182
  _globals['_QUERYOFFSETREQUEST']._serialized_start=5185
  _globals['_QUERYOFFSETREQUEST']._serialized_end=5396
  _globals['_QUERYOFFSETRESPONSE']._serialized_start=5398
  _globals['_QUERYOFFSETRESPONSE']._serialized_end=5479
  _globals['_MESSAGINGSERVICE']._serialized_start=5482
  _globals['_MESSAGINGSERVICE']._serialized_end=7121
# @@protoc_insertion_point(module_scope)
