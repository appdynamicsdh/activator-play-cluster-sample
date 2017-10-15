#!/bin/bash
while :
do
	~/appdynamics/scala/activator-play-cluster-sample/send_to_websocket.sh '{"n": 99}'
	sleep 1
done   
