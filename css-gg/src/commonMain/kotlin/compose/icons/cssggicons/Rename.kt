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

public val CssGgIcons.Rename: ImageVector
    get() {
        if (_rename != null) {
            return _rename!!
        }
        _rename = Builder(name = "Rename", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 6.0f, 2.0f, 7.3432f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.6569f, 3.3431f, 18.0f, 5.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 16.0f, 4.0f, 15.5523f, 4.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 8.4477f, 4.4477f, 8.0f, 5.0f, 8.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 18.0f, 22.0f, 16.6569f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 7.3432f, 20.6569f, 6.0f, 19.0f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 8.0f, 20.0f, 8.4477f, 20.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(20.0f, 15.5523f, 19.5523f, 16.0f, 19.0f, 16.0f)
                close()
            }
        }
        .build()
        return _rename!!
    }

private var _rename: ImageVector? = null
