package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.CssGgIcons

public val CssGgIcons.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(9.4477f, 12.0f, 9.0f, 12.4477f, 9.0f, 13.0f)
                curveTo(9.0f, 13.5523f, 9.4477f, 14.0f, 10.0f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5522f, 14.0f, 15.0f, 13.5523f, 15.0f, 13.0f)
                curveTo(15.0f, 12.4477f, 14.5522f, 12.0f, 14.0f, 12.0f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 2.0f)
                curveTo(2.3431f, 2.0f, 1.0f, 3.3431f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 20.6569f, 2.3431f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 22.0f, 23.0f, 20.6569f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.3431f, 21.6569f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 4.0f, 3.0f, 4.4477f, 3.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 4.4477f, 20.5522f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(3.0f, 19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.5523f, 20.5522f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 20.0f, 3.0f, 19.5523f, 3.0f, 19.0f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
