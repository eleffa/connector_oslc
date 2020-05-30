# connector_oslc

Context : Collaborative system engineering 
------------------------------------------
Enterprise information systems can be described as a collection of applications independent. These applications generally have a very specific role and are often used by a set of actors in a defined profession. However, the company's main objective is to produce a final result with the help of these different actors. The problem that arises is therefore communication between the applications and especially the exchange of data because of the different format structures and the interfacing of applications is mostly time-consuming. This raises the issue of difficulties in the integration of applications but also their interoperability.

Contribution
------------
In order to solve these problems, the SIP - FSF project aims to create an integration platform application based on the OSLC standard. This platform will allow tools to share and exchange their data thus enabling interoperability between different areas of the engineering life cycle. For building this platform, there are many tasks. The following figure shows the general architecture of this platform.

![alt text](https://github.com/eleffa/connector_oslc/blob/master/archi.png?raw=true)

Our contribution focuses on two main tasks:

- The traceability of engineering artifacts is tedious 
The traceability of engineering artifacts is an important task for systems engineers. For example, all the requirements related to a project must be properly traced in order to build a system that meets the needs of the stakeholders, and especially to verify and validate the system.

- An unsuitable format for data exchange
The application environment of an extended enterprise is very heterogeneous, with applications and supported data.


What Is This?
-------------
Connector OSLC version 1.0.

This program is a prototype which role is to get or put artefact (requirement, projet, testcase) in the large triple store virtuoso
and to create the hazardlog by linking all the artefact together.


How To Install
---------------
To install this software, you need to download the clone of the virtuoso jar in the site https://github.com/srdc/virt-jena and compile it with maven.
After that just compile the whole repository.

Known bug
08004 LI100: Number of licensed connections exceeded. This error is due to the license.


