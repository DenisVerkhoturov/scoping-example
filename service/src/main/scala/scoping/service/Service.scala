package scoping.service

/*
import scoping.controller.Controller
*/
import scoping.service.repository.Repository

final class Service(/*val controller: Controller,*/val service: Service, val repository: Repository)
//                    ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉   ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉  ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉
//                                ✘                         ✔                       ✔
