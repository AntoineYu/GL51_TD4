package gl51.service.impl

import gl51.data.Ip
import gl51.service.IpConvertService
import gl51.service.IpService

import javax.inject.Inject

class BinaryConvertServiceImpl implements IpConvertService {

    @Inject
    IpService service

    @Override
    String getAndConvertIp() {
        Ip ip = service.fetchIp()
        ///
    }
}
