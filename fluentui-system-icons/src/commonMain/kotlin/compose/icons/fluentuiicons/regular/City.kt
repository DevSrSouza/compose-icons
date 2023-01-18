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

public val RegularGroup.City: ImageVector
    get() {
        if (_city != null) {
            return _city!!
        }
        _city = Builder(name = "City", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.9961f)
                curveTo(12.4142f, 1.9961f, 12.75f, 2.3319f, 12.75f, 2.7461f)
                verticalLineTo(3.9994f)
                horizontalLineTo(14.75f)
                curveTo(15.7165f, 3.9994f, 16.5f, 4.7829f, 16.5f, 5.7494f)
                verticalLineTo(10.9994f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 10.9994f, 20.5f, 11.7829f, 20.5f, 12.7494f)
                verticalLineTo(20.2494f)
                curveTo(20.5f, 21.2159f, 19.7165f, 21.9994f, 18.75f, 21.9994f)
                horizontalLineTo(9.7545f)
                lineTo(9.75f, 21.9994f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 21.9994f, 3.5f, 21.2159f, 3.5f, 20.2494f)
                verticalLineTo(11.82f)
                curveTo(3.5f, 11.2011f, 3.8269f, 10.6283f, 4.3597f, 10.3134f)
                lineTo(7.5f, 8.4578f)
                verticalLineTo(5.7494f)
                curveTo(7.5f, 4.7829f, 8.2835f, 3.9994f, 9.25f, 3.9994f)
                horizontalLineTo(11.25f)
                verticalLineTo(2.7461f)
                curveTo(11.25f, 2.3319f, 11.5858f, 1.9961f, 12.0f, 1.9961f)
                close()
                moveTo(9.0f, 8.0178f)
                curveTo(9.8097f, 8.1378f, 10.5f, 8.8244f, 10.5f, 9.7518f)
                verticalLineTo(20.4994f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.7494f)
                curveTo(13.5f, 11.8678f, 14.1519f, 11.1384f, 15.0f, 11.0171f)
                verticalLineTo(5.7494f)
                curveTo(15.0f, 5.6113f, 14.8881f, 5.4994f, 14.75f, 5.4994f)
                horizontalLineTo(12.0094f)
                lineTo(12.0f, 5.4995f)
                lineTo(11.9906f, 5.4994f)
                horizontalLineTo(9.25f)
                curveTo(9.1119f, 5.4994f, 9.0f, 5.6113f, 9.0f, 5.7494f)
                verticalLineTo(8.0178f)
                close()
                moveTo(15.25f, 12.4994f)
                curveTo(15.1119f, 12.4994f, 15.0f, 12.6113f, 15.0f, 12.7494f)
                verticalLineTo(20.4994f)
                horizontalLineTo(18.75f)
                curveTo(18.8881f, 20.4994f, 19.0f, 20.3875f, 19.0f, 20.2494f)
                verticalLineTo(12.7494f)
                curveTo(19.0f, 12.6113f, 18.8881f, 12.4994f, 18.75f, 12.4994f)
                horizontalLineTo(15.25f)
                close()
                moveTo(8.6228f, 9.5366f)
                lineTo(5.1228f, 11.6048f)
                curveTo(5.0467f, 11.6498f, 5.0f, 11.7316f, 5.0f, 11.82f)
                verticalLineTo(20.2494f)
                curveTo(5.0f, 20.3875f, 5.1119f, 20.4994f, 5.25f, 20.4994f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.7518f)
                curveTo(9.0f, 9.5582f, 8.7895f, 9.4381f, 8.6228f, 9.5366f)
                close()
            }
        }
        .build()
        return _city!!
    }

private var _city: ImageVector? = null
