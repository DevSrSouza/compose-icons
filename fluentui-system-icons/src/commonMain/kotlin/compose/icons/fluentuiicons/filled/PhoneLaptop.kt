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

public val FilledGroup.PhoneLaptop: ImageVector
    get() {
        if (_phoneLaptop != null) {
            return _phoneLaptop!!
        }
        _phoneLaptop = Builder(name = "PhoneLaptop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2544f, 8.0027f)
                curveTo(9.2209f, 8.0027f, 10.0044f, 8.7862f, 10.0044f, 9.7527f)
                verticalLineTo(19.2528f)
                curveTo(10.0044f, 20.2193f, 9.2209f, 21.0028f, 8.2544f, 21.0028f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 21.0028f, 2.0f, 20.2193f, 2.0f, 19.2528f)
                verticalLineTo(9.7527f)
                curveTo(2.0f, 8.7862f, 2.7835f, 8.0027f, 3.75f, 8.0027f)
                horizontalLineTo(8.2544f)
                close()
                moveTo(6.2522f, 17.498f)
                horizontalLineTo(5.7522f)
                curveTo(5.338f, 17.498f, 5.0022f, 17.8337f, 5.0022f, 18.248f)
                curveTo(5.0022f, 18.6622f, 5.338f, 18.998f, 5.7522f, 18.998f)
                horizontalLineTo(6.2522f)
                curveTo(6.6664f, 18.998f, 7.0022f, 18.6622f, 7.0022f, 18.248f)
                curveTo(7.0022f, 17.8337f, 6.6664f, 17.498f, 6.2522f, 17.498f)
                close()
                moveTo(21.2494f, 16.4995f)
                curveTo(21.6636f, 16.4995f, 21.9994f, 16.8353f, 21.9994f, 17.2495f)
                curveTo(21.9994f, 17.6292f, 21.7172f, 17.943f, 21.3511f, 17.9927f)
                lineTo(21.2494f, 17.9995f)
                lineTo(10.9996f, 17.999f)
                verticalLineTo(16.499f)
                lineTo(21.2494f, 16.4995f)
                close()
                moveTo(18.25f, 5.0f)
                curveTo(19.2165f, 5.0f, 20.0f, 5.7835f, 20.0f, 6.75f)
                verticalLineTo(14.2503f)
                curveTo(20.0f, 15.2168f, 19.2165f, 16.0003f, 18.25f, 16.0003f)
                lineTo(10.9996f, 16.0f)
                lineTo(11.0f, 8.9997f)
                curveTo(11.0f, 7.9453f, 10.1841f, 7.0815f, 9.1493f, 7.0051f)
                lineTo(9.0f, 6.9997f)
                lineTo(3.9996f, 6.999f)
                lineTo(4.0f, 6.75f)
                curveTo(4.0f, 5.7835f, 4.7835f, 5.0f, 5.75f, 5.0f)
                horizontalLineTo(18.25f)
                close()
            }
        }
        .build()
        return _phoneLaptop!!
    }

private var _phoneLaptop: ImageVector? = null
