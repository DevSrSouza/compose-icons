package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.LineStyle: ImageVector
    get() {
        if (_lineStyle != null) {
            return _lineStyle!!
        }
        _lineStyle = Builder(name = "LineStyle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 5.0f)
                curveTo(2.3358f, 5.0f, 2.0f, 5.3358f, 2.0f, 5.75f)
                curveTo(2.0f, 6.1642f, 2.3358f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(6.25f)
                curveTo(6.6642f, 6.5f, 7.0f, 6.1642f, 7.0f, 5.75f)
                curveTo(7.0f, 5.3358f, 6.6642f, 5.0f, 6.25f, 5.0f)
                horizontalLineTo(2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7524f, 11.503f)
                horizontalLineTo(21.2524f)
                curveTo(21.6667f, 11.503f, 22.0024f, 11.8388f, 22.0024f, 12.253f)
                curveTo(22.0024f, 12.6327f, 21.7203f, 12.9465f, 21.3542f, 12.9961f)
                lineTo(21.2524f, 13.003f)
                horizontalLineTo(2.7524f)
                curveTo(2.3382f, 13.003f, 2.0024f, 12.6672f, 2.0024f, 12.253f)
                curveTo(2.0024f, 11.8733f, 2.2846f, 11.5595f, 2.6507f, 11.5098f)
                lineTo(2.7524f, 11.503f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.25f)
                curveTo(2.0f, 17.5596f, 2.5596f, 17.0f, 3.25f, 17.0f)
                horizontalLineTo(20.75f)
                curveTo(21.4404f, 17.0f, 22.0f, 17.5596f, 22.0f, 18.25f)
                curveTo(22.0f, 18.9404f, 21.4404f, 19.5f, 20.75f, 19.5f)
                horizontalLineTo(3.25f)
                curveTo(2.5596f, 19.5f, 2.0f, 18.9404f, 2.0f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 5.75f)
                curveTo(9.75f, 5.3358f, 10.0858f, 5.0f, 10.5f, 5.0f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 5.0f, 14.25f, 5.3358f, 14.25f, 5.75f)
                curveTo(14.25f, 6.1642f, 13.9142f, 6.5f, 13.5f, 6.5f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 6.5f, 9.75f, 6.1642f, 9.75f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 5.0f)
                curveTo(17.3358f, 5.0f, 17.0f, 5.3358f, 17.0f, 5.75f)
                curveTo(17.0f, 6.1642f, 17.3358f, 6.5f, 17.75f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 6.5f, 22.0f, 6.1642f, 22.0f, 5.75f)
                curveTo(22.0f, 5.3358f, 21.6642f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _lineStyle!!
    }

private var _lineStyle: ImageVector? = null
