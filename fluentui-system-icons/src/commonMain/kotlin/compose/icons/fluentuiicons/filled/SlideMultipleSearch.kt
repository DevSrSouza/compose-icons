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

public val FilledGroup.SlideMultipleSearch: ImageVector
    get() {
        if (_slideMultipleSearch != null) {
            return _slideMultipleSearch!!
        }
        _slideMultipleSearch = Builder(name = "SlideMultipleSearch", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.75f)
                curveTo(2.0f, 5.1266f, 4.1266f, 3.0f, 6.75f, 3.0f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 3.0f, 19.0f, 4.0074f, 19.0f, 5.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(7.75f)
                curveTo(5.9551f, 5.5f, 4.5f, 6.9551f, 4.5f, 8.75f)
                verticalLineTo(11.0907f)
                curveTo(3.5617f, 11.263f, 2.7067f, 11.6735f, 2.0f, 12.2572f)
                verticalLineTo(7.75f)
                close()
                moveTo(10.4253f, 18.9504f)
                lineTo(11.9749f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 20.5f, 22.0f, 19.4926f, 22.0f, 18.25f)
                verticalLineTo(8.75f)
                curveTo(22.0f, 7.5074f, 20.9926f, 6.5f, 19.75f, 6.5f)
                horizontalLineTo(7.75f)
                curveTo(6.5074f, 6.5f, 5.5f, 7.5074f, 5.5f, 8.75f)
                verticalLineTo(11.0f)
                curveTo(8.5376f, 11.0f, 11.0f, 13.4624f, 11.0f, 16.5f)
                curveTo(11.0f, 17.3805f, 10.7931f, 18.2126f, 10.4253f, 18.9504f)
                close()
                moveTo(5.5f, 21.0f)
                curveTo(6.4719f, 21.0f, 7.3718f, 20.6919f, 8.1074f, 20.1681f)
                lineTo(10.7197f, 22.7803f)
                curveTo(11.0126f, 23.0732f, 11.4874f, 23.0732f, 11.7803f, 22.7803f)
                curveTo(12.0732f, 22.4874f, 12.0732f, 22.0126f, 11.7803f, 21.7197f)
                lineTo(9.1681f, 19.1074f)
                curveTo(9.6919f, 18.3718f, 10.0f, 17.4719f, 10.0f, 16.5f)
                curveTo(10.0f, 14.0147f, 7.9853f, 12.0f, 5.5f, 12.0f)
                curveTo(3.0147f, 12.0f, 1.0f, 14.0147f, 1.0f, 16.5f)
                curveTo(1.0f, 18.9853f, 3.0147f, 21.0f, 5.5f, 21.0f)
                close()
                moveTo(5.5f, 19.5f)
                curveTo(3.8431f, 19.5f, 2.5f, 18.1569f, 2.5f, 16.5f)
                curveTo(2.5f, 14.8431f, 3.8431f, 13.5f, 5.5f, 13.5f)
                curveTo(7.1568f, 13.5f, 8.5f, 14.8431f, 8.5f, 16.5f)
                curveTo(8.5f, 18.1569f, 7.1568f, 19.5f, 5.5f, 19.5f)
                close()
            }
        }
        .build()
        return _slideMultipleSearch!!
    }

private var _slideMultipleSearch: ImageVector? = null
