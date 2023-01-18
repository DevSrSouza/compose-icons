package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PhoneUpdate: ImageVector
    get() {
        if (_phoneUpdate != null) {
            return _phoneUpdate!!
        }
        _phoneUpdate = Builder(name = "PhoneUpdate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.9926f, 16.9926f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(12.0f, 7.0309f)
                lineTo(11.8982f, 7.0378f)
                lineTo(11.8006f, 7.0577f)
                curveTo(11.5185f, 7.1353f, 11.3029f, 7.3736f, 11.2584f, 7.6681f)
                lineTo(11.25f, 7.7809f)
                lineTo(11.2493f, 14.4919f)
                lineTo(10.2887f, 13.5308f)
                lineTo(10.2045f, 13.4582f)
                curveTo(9.9109f, 13.2403f, 9.4943f, 13.2645f, 9.228f, 13.5308f)
                curveTo(8.9617f, 13.7971f, 8.9375f, 14.2137f, 9.1554f, 14.5073f)
                lineTo(9.228f, 14.5915f)
                lineTo(11.4697f, 16.8331f)
                lineTo(11.5218f, 16.8806f)
                lineTo(11.5767f, 16.922f)
                lineTo(11.6535f, 16.9682f)
                lineTo(11.7651f, 17.0153f)
                lineTo(11.8615f, 17.04f)
                lineTo(11.9532f, 17.0514f)
                horizontalLineTo(12.0468f)
                lineTo(12.1393f, 17.0398f)
                lineTo(12.2019f, 17.0253f)
                lineTo(12.3026f, 16.9893f)
                lineTo(12.3631f, 16.9592f)
                lineTo(12.4296f, 16.9177f)
                lineTo(12.4921f, 16.8688f)
                lineTo(12.5303f, 16.8331f)
                lineTo(14.772f, 14.5915f)
                lineTo(14.8446f, 14.5073f)
                curveTo(15.0383f, 14.2464f, 15.0407f, 13.8881f, 14.8518f, 13.6248f)
                lineTo(14.772f, 13.5308f)
                lineTo(14.6879f, 13.4582f)
                curveTo(14.4269f, 13.2645f, 14.0687f, 13.2621f, 13.8053f, 13.451f)
                lineTo(13.7113f, 13.5308f)
                lineTo(12.7493f, 14.4919f)
                lineTo(12.75f, 7.7809f)
                lineTo(12.7432f, 7.6791f)
                curveTo(12.698f, 7.3463f, 12.4346f, 7.0829f, 12.1018f, 7.0378f)
                lineTo(12.0f, 7.0309f)
                close()
            }
        }
        .build()
        return _phoneUpdate!!
    }

private var _phoneUpdate: ImageVector? = null
