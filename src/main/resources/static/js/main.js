'use strict';

var stompClient = null;
var username = null;

var socketJs = new SockJS('/ws');
stompClient = Stomp.over(socketJs);

stompClient.connect({}, () => console.log("Connected"), () => console.log("onError"));