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

public val FilledGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7246f, 2.2197f)
                curveTo(17.0174f, 1.9268f, 17.4923f, 1.9268f, 17.7852f, 2.2197f)
                lineTo(21.7852f, 6.2197f)
                curveTo(22.0781f, 6.5126f, 22.0781f, 6.9874f, 21.7852f, 7.2803f)
                curveTo(21.4923f, 7.5732f, 21.0174f, 7.5732f, 20.7246f, 7.2803f)
                lineTo(20.2543f, 6.8101f)
                lineTo(18.5607f, 8.5f)
                lineTo(21.0303f, 10.9697f)
                curveTo(21.3232f, 11.2626f, 21.3232f, 11.7374f, 21.0303f, 12.0303f)
                curveTo(20.7374f, 12.3232f, 20.2626f, 12.3232f, 19.9697f, 12.0303f)
                lineTo(18.5f, 10.5607f)
                lineTo(11.659f, 17.4017f)
                curveTo(10.9557f, 18.1049f, 10.0019f, 18.5f, 9.0074f, 18.5f)
                horizontalLineTo(6.5607f)
                lineTo(3.2803f, 21.7803f)
                curveTo(2.9874f, 22.0732f, 2.5126f, 22.0732f, 2.2197f, 21.7803f)
                curveTo(1.9268f, 21.4874f, 1.9268f, 21.0126f, 2.2197f, 20.7197f)
                lineTo(5.5f, 17.4393f)
                verticalLineTo(14.9926f)
                curveTo(5.5f, 13.9981f, 5.8951f, 13.0443f, 6.5984f, 12.341f)
                lineTo(6.9393f, 12.0f)
                lineTo(8.4697f, 13.5303f)
                curveTo(8.7626f, 13.8232f, 9.2374f, 13.8232f, 9.5303f, 13.5303f)
                curveTo(9.8232f, 13.2374f, 9.8232f, 12.7626f, 9.5303f, 12.4697f)
                lineTo(8.0f, 10.9393f)
                lineTo(8.9393f, 10.0f)
                lineTo(10.4697f, 11.5303f)
                curveTo(10.7626f, 11.8232f, 11.2374f, 11.8232f, 11.5303f, 11.5303f)
                curveTo(11.8232f, 11.2374f, 11.8232f, 10.7626f, 11.5303f, 10.4697f)
                lineTo(10.0f, 8.9393f)
                lineTo(10.9393f, 8.0f)
                lineTo(12.4697f, 9.5303f)
                curveTo(12.7626f, 9.8232f, 13.2374f, 9.8232f, 13.5303f, 9.5303f)
                curveTo(13.8232f, 9.2374f, 13.8232f, 8.7626f, 13.5303f, 8.4697f)
                lineTo(12.0f, 6.9393f)
                lineTo(13.4393f, 5.5f)
                lineTo(11.9697f, 4.0303f)
                curveTo(11.6768f, 3.7374f, 11.6768f, 3.2626f, 11.9697f, 2.9697f)
                curveTo(12.2626f, 2.6768f, 12.7374f, 2.6768f, 13.0303f, 2.9697f)
                lineTo(15.5f, 5.4394f)
                lineTo(17.1936f, 3.7494f)
                lineTo(16.7246f, 3.2803f)
                curveTo(16.4317f, 2.9874f, 16.4317f, 2.5126f, 16.7246f, 2.2197f)
                close()
                moveTo(19.1936f, 5.7494f)
                lineTo(18.2543f, 4.8101f)
                lineTo(16.5607f, 6.5f)
                lineTo(17.5f, 7.4394f)
                lineTo(19.1936f, 5.7494f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
