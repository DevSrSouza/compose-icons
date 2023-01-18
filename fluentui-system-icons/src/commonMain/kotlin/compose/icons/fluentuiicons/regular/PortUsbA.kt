package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.PortUsbA: ImageVector
    get() {
        if (_portUsbA != null) {
            return _portUsbA!!
        }
        _portUsbA = Builder(name = "PortUsbA", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                horizontalLineTo(6.0f)
                curveTo(5.47f, 8.0015f, 4.9622f, 8.2128f, 4.5875f, 8.5875f)
                curveTo(4.2128f, 8.9622f, 4.0016f, 9.47f, 4.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(4.0016f, 14.53f, 4.2128f, 15.0378f, 4.5875f, 15.4125f)
                curveTo(4.9622f, 15.7872f, 5.47f, 15.9984f, 6.0f, 16.0f)
                horizontalLineTo(18.0f)
                curveTo(18.53f, 15.9984f, 19.0378f, 15.7872f, 19.4125f, 15.4125f)
                curveTo(19.7872f, 15.0378f, 19.9984f, 14.53f, 20.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(19.9985f, 9.47f, 19.7872f, 8.9622f, 19.4125f, 8.5875f)
                curveTo(19.0378f, 8.2128f, 18.53f, 8.0015f, 18.0f, 8.0f)
                close()
                moveTo(5.5f, 10.0f)
                curveTo(5.4994f, 9.9342f, 5.5118f, 9.8688f, 5.5367f, 9.8079f)
                curveTo(5.5616f, 9.7469f, 5.5984f, 9.6916f, 5.645f, 9.645f)
                curveTo(5.6915f, 9.5984f, 5.7469f, 9.5616f, 5.8079f, 9.5367f)
                curveTo(5.8689f, 9.5118f, 5.9342f, 9.4993f, 6.0f, 9.5f)
                horizontalLineTo(18.0f)
                curveTo(18.0658f, 9.4993f, 18.1312f, 9.5118f, 18.1921f, 9.5367f)
                curveTo(18.2531f, 9.5616f, 18.3084f, 9.5984f, 18.355f, 9.645f)
                curveTo(18.4016f, 9.6916f, 18.4384f, 9.7469f, 18.4633f, 9.8079f)
                curveTo(18.4882f, 9.8688f, 18.5007f, 9.9342f, 18.5f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _portUsbA!!
    }

private var _portUsbA: ImageVector? = null
