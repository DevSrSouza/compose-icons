package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 10.5f)
                curveTo(19.6569f, 10.5f, 21.0f, 11.8431f, 21.0f, 13.5f)
                verticalLineTo(19.5f)
                curveTo(21.0f, 21.1569f, 19.6569f, 22.5f, 18.0f, 22.5f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 22.5f, 3.0f, 21.1569f, 3.0f, 19.5f)
                verticalLineTo(13.5f)
                curveTo(3.0f, 11.8431f, 4.3432f, 10.5f, 6.0f, 10.5f)
                verticalLineTo(7.5f)
                curveTo(6.0f, 4.1863f, 8.6863f, 1.5f, 12.0f, 1.5f)
                curveTo(15.3137f, 1.5f, 18.0f, 4.1863f, 18.0f, 7.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(14.2091f, 3.5f, 16.0f, 5.2909f, 16.0f, 7.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.5f)
                curveTo(8.0f, 5.2909f, 9.7909f, 3.5f, 12.0f, 3.5f)
                close()
                moveTo(18.0f, 12.5f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 12.5f, 5.0f, 12.9477f, 5.0f, 13.5f)
                verticalLineTo(19.5f)
                curveTo(5.0f, 20.0523f, 5.4477f, 20.5f, 6.0f, 20.5f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 20.5f, 19.0f, 20.0523f, 19.0f, 19.5f)
                verticalLineTo(13.5f)
                curveTo(19.0f, 12.9477f, 18.5523f, 12.5f, 18.0f, 12.5f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
