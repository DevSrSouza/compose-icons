package compose.icons.fluentuiicons.filled

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
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.LineStyle: ImageVector
    get() {
        if (_lineStyle != null) {
            return _lineStyle!!
        }
        _lineStyle = Builder(name = "LineStyle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(6.5523f, 5.0f, 7.0f, 5.4477f, 7.0f, 6.0f)
                curveTo(7.0f, 6.5523f, 6.5523f, 7.0f, 6.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 7.0f, 2.0f, 6.5523f, 2.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.5f)
                curveTo(2.0f, 17.6716f, 2.6716f, 17.0f, 3.5f, 17.0f)
                horizontalLineTo(20.5f)
                curveTo(21.3284f, 17.0f, 22.0f, 17.6716f, 22.0f, 18.5f)
                curveTo(22.0f, 19.3284f, 21.3284f, 20.0f, 20.5f, 20.0f)
                horizontalLineTo(3.5f)
                curveTo(2.6716f, 20.0f, 2.0f, 19.3284f, 2.0f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 5.0f)
                curveTo(10.1977f, 5.0f, 9.75f, 5.4477f, 9.75f, 6.0f)
                curveTo(9.75f, 6.5523f, 10.1977f, 7.0f, 10.75f, 7.0f)
                horizontalLineTo(13.25f)
                curveTo(13.8023f, 7.0f, 14.25f, 6.5523f, 14.25f, 6.0f)
                curveTo(14.25f, 5.4477f, 13.8023f, 5.0f, 13.25f, 5.0f)
                horizontalLineTo(10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                curveTo(17.0f, 5.4477f, 17.4477f, 5.0f, 18.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                curveTo(22.0f, 6.5523f, 21.5523f, 7.0f, 21.0f, 7.0f)
                horizontalLineTo(18.0f)
                curveTo(17.4477f, 7.0f, 17.0f, 6.5523f, 17.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                curveTo(2.4477f, 11.0f, 2.0f, 11.4477f, 2.0f, 12.0f)
                curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 12.5523f, 22.0f, 12.0f)
                curveTo(22.0f, 11.4477f, 21.5523f, 11.0f, 21.0f, 11.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _lineStyle!!
    }

private var _lineStyle: ImageVector? = null
