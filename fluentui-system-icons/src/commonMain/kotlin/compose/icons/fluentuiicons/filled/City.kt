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

public val FilledGroup.City: ImageVector
    get() {
        if (_city != null) {
            return _city!!
        }
        _city = Builder(name = "City", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 2.7461f)
                curveTo(12.75f, 2.3319f, 12.4142f, 1.9961f, 12.0f, 1.9961f)
                curveTo(11.5858f, 1.9961f, 11.25f, 2.3319f, 11.25f, 2.7461f)
                verticalLineTo(3.9994f)
                horizontalLineTo(9.25f)
                curveTo(8.2835f, 3.9994f, 7.5f, 4.7829f, 7.5f, 5.7494f)
                verticalLineTo(7.9038f)
                curveTo(9.0194f, 7.7661f, 10.5f, 8.94f, 10.5f, 10.6474f)
                verticalLineTo(21.2494f)
                curveTo(10.5f, 21.2755f, 10.4994f, 21.3015f, 10.4983f, 21.3274f)
                verticalLineTo(21.9994f)
                horizontalLineTo(13.4983f)
                verticalLineTo(20.7494f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.2494f)
                curveTo(13.5f, 11.7306f, 14.7312f, 10.4994f, 16.25f, 10.4994f)
                horizontalLineTo(16.5f)
                verticalLineTo(5.7494f)
                curveTo(16.5f, 4.7829f, 15.7165f, 3.9994f, 14.75f, 3.9994f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.7461f)
                close()
                moveTo(14.4983f, 21.9994f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 21.9994f, 20.5f, 21.2159f, 20.5f, 20.2494f)
                verticalLineTo(13.2494f)
                curveTo(20.5f, 12.2829f, 19.7165f, 11.4994f, 18.75f, 11.4994f)
                horizontalLineTo(16.25f)
                curveTo(15.2835f, 11.4994f, 14.5f, 12.2829f, 14.5f, 13.2494f)
                verticalLineTo(20.7494f)
                horizontalLineTo(14.4983f)
                verticalLineTo(21.9994f)
                close()
                moveTo(9.5f, 20.7494f)
                horizontalLineTo(9.4983f)
                verticalLineTo(21.3004f)
                lineTo(9.4982f, 21.3018f)
                verticalLineTo(21.9994f)
                horizontalLineTo(8.7554f)
                lineTo(8.75f, 21.9994f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 21.9994f, 3.5f, 21.2159f, 3.5f, 20.2494f)
                verticalLineTo(12.289f)
                curveTo(3.5f, 11.6996f, 3.7967f, 11.1498f, 4.2895f, 10.8262f)
                lineTo(6.7895f, 9.1846f)
                curveTo(7.9532f, 8.4205f, 9.5f, 9.2552f, 9.5f, 10.6474f)
                verticalLineTo(20.7494f)
                close()
            }
        }
        .build()
        return _city!!
    }

private var _city: ImageVector? = null
