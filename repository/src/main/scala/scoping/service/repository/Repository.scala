package scoping.service.repository

/*
import scoping.controller.Controller
import scoping.service.Service
*/

final private[service] class Repository(/*val controller: Controller, val service: Service,*/val repository: Repository)
//                                        ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉  ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉   ┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉
//                                                    ✘                        ✘                       ✔
