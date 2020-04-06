package gl51.service.impl

import gl51.data.Ip
import gl51.service.IPService
import gl51.service.IpConverterService

import javax.inject.Inject

class BinaryConvertServiceImpl implements IpConverterService {

    @Inject
    IPService service

    @Override
    String getAndConvertIp() {
        Ip ip = service.fetchIp()
        ///
    }
}
