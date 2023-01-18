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

public val RegularGroup.ProtocolHandler: ImageVector
    get() {
        if (_protocolHandler != null) {
            return _protocolHandler!!
        }
        _protocolHandler = Builder(name = "ProtocolHandler", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7319f, 17.7319f)
                lineTo(12.7067f, 16.7067f)
                lineTo(13.7674f, 15.6461f)
                lineTo(14.7925f, 16.6712f)
                curveTo(15.183f, 17.0617f, 15.8162f, 17.0617f, 16.2067f, 16.6712f)
                lineTo(20.1712f, 12.7067f)
                curveTo(20.5617f, 12.3162f, 20.5617f, 11.683f, 20.1712f, 11.2925f)
                lineTo(16.2067f, 7.3281f)
                curveTo(15.8162f, 6.9375f, 15.183f, 6.9375f, 14.7925f, 7.3281f)
                lineTo(13.7674f, 8.3532f)
                lineTo(12.7067f, 7.2925f)
                lineTo(13.7319f, 6.2674f)
                curveTo(14.7082f, 5.2911f, 16.2911f, 5.2911f, 17.2674f, 6.2674f)
                lineTo(21.2319f, 10.2319f)
                curveTo(22.2082f, 11.2082f, 22.2082f, 12.7911f, 21.2319f, 13.7674f)
                lineTo(17.2674f, 17.7319f)
                curveTo(16.2911f, 18.7082f, 14.7082f, 18.7082f, 13.7319f, 17.7319f)
                close()
                moveTo(6.7319f, 6.2674f)
                lineTo(2.7674f, 10.2319f)
                curveTo(1.7911f, 11.2082f, 1.7911f, 12.7911f, 2.7674f, 13.7674f)
                lineTo(6.7319f, 17.7319f)
                curveTo(7.7082f, 18.7082f, 9.2911f, 18.7082f, 10.2674f, 17.7319f)
                lineTo(14.2319f, 13.7674f)
                curveTo(15.2082f, 12.7911f, 15.2082f, 11.2082f, 14.2319f, 10.2319f)
                lineTo(10.2674f, 6.2674f)
                curveTo(9.2911f, 5.2911f, 7.7082f, 5.2911f, 6.7319f, 6.2674f)
                close()
                moveTo(3.828f, 11.2925f)
                lineTo(7.7925f, 7.3281f)
                curveTo(8.183f, 6.9375f, 8.8162f, 6.9375f, 9.2067f, 7.3281f)
                lineTo(13.1712f, 11.2925f)
                curveTo(13.5617f, 11.683f, 13.5617f, 12.3162f, 13.1712f, 12.7067f)
                lineTo(9.2067f, 16.6712f)
                curveTo(8.8162f, 17.0617f, 8.183f, 17.0617f, 7.7925f, 16.6712f)
                lineTo(3.828f, 12.7067f)
                curveTo(3.4375f, 12.3162f, 3.4375f, 11.683f, 3.828f, 11.2925f)
                close()
            }
        }
        .build()
        return _protocolHandler!!
    }

private var _protocolHandler: ImageVector? = null
