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

public val RegularGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.6978f, 12.9737f)
                lineTo(14.3802f, 15.2109f)
                lineTo(11.5044f, 18.3278f)
                verticalLineTo(13.1348f)
                lineTo(11.6978f, 12.9737f)
                close()
                moveTo(12.8693f, 11.9976f)
                lineTo(15.9462f, 9.434f)
                curveTo(16.2759f, 9.1593f, 16.3083f, 8.6644f, 16.0172f, 8.3491f)
                lineTo(11.3055f, 3.2448f)
                curveTo(10.8425f, 2.7431f, 10.0044f, 3.0707f, 10.0044f, 3.7535f)
                verticalLineTo(9.6081f)
                lineTo(8.8842f, 8.6738f)
                curveTo(8.5661f, 8.4085f, 8.0932f, 8.4513f, 7.8279f, 8.7694f)
                curveTo(7.5626f, 9.0875f, 7.6054f, 9.5604f, 7.9234f, 9.8257f)
                lineTo(10.0044f, 11.5614f)
                verticalLineTo(12.4321f)
                lineTo(7.9237f, 14.1657f)
                curveTo(7.6055f, 14.4309f, 7.5625f, 14.9038f, 7.8276f, 15.222f)
                curveTo(8.0928f, 15.5402f, 8.5657f, 15.5833f, 8.8839f, 15.3181f)
                lineTo(10.0044f, 14.3845f)
                verticalLineTo(20.2466f)
                curveTo(10.0044f, 20.9295f, 10.8426f, 21.2571f, 11.3057f, 20.7552f)
                lineTo(16.0173f, 15.6486f)
                curveTo(16.3082f, 15.3333f, 16.2759f, 14.8388f, 15.9465f, 14.564f)
                lineTo(12.8693f, 11.9976f)
                close()
                moveTo(11.6983f, 11.0208f)
                lineTo(11.5044f, 10.8592f)
                verticalLineTo(5.6717f)
                lineTo(14.3798f, 8.7867f)
                lineTo(11.6983f, 11.0208f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
