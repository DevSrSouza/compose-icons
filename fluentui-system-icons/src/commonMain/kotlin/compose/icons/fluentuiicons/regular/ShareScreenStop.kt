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

public val RegularGroup.ShareScreenStop: ImageVector
    get() {
        if (_shareScreenStop != null) {
            return _shareScreenStop!!
        }
        _shareScreenStop = Builder(name = "ShareScreenStop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 4.0f, 22.0f, 5.0074f, 22.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.9926f, 20.9926f, 20.0f, 19.75f, 20.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 20.0f, 2.0f, 18.9926f, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.25f, 5.5f)
                curveTo(3.8358f, 5.5f, 3.5f, 5.8358f, 3.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 18.1642f, 3.8358f, 18.5f, 4.25f, 18.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 18.5f, 20.5f, 18.1642f, 20.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.8358f, 20.1642f, 5.5f, 19.75f, 5.5f)
                horizontalLineTo(4.25f)
                close()
                moveTo(8.2197f, 8.2151f)
                curveTo(8.5126f, 7.9223f, 8.9874f, 7.9223f, 9.2803f, 8.2151f)
                lineTo(12.0007f, 10.9356f)
                lineTo(14.7249f, 8.2189f)
                curveTo(15.0182f, 7.9264f, 15.4931f, 7.9271f, 15.7856f, 8.2204f)
                curveTo(16.0781f, 8.5137f, 16.0774f, 8.9886f, 15.7841f, 9.2811f)
                lineTo(13.0614f, 11.9962f)
                lineTo(15.7848f, 14.7197f)
                curveTo(16.0777f, 15.0126f, 16.0777f, 15.4874f, 15.7848f, 15.7803f)
                curveTo(15.4919f, 16.0732f, 15.0171f, 16.0732f, 14.7242f, 15.7803f)
                lineTo(12.0004f, 13.0565f)
                lineTo(9.2807f, 15.78f)
                curveTo(8.988f, 16.0731f, 8.5131f, 16.0734f, 8.22f, 15.7807f)
                curveTo(7.9269f, 15.488f, 7.9266f, 15.0131f, 8.2193f, 14.72f)
                lineTo(10.9397f, 11.9958f)
                lineTo(8.2197f, 9.2758f)
                curveTo(7.9268f, 8.9829f, 7.9268f, 8.508f, 8.2197f, 8.2151f)
                close()
            }
        }
        .build()
        return _shareScreenStop!!
    }

private var _shareScreenStop: ImageVector? = null