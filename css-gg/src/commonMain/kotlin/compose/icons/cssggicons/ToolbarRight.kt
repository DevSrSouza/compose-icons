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

public val CssGgIcons.ToolbarRight: ImageVector
    get() {
        if (_toolbarRight != null) {
            return _toolbarRight!!
        }
        _toolbarRight = Builder(name = "ToolbarRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 8.0f)
                curveTo(22.0f, 6.3432f, 20.6569f, 5.0f, 19.0f, 5.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 5.0f, 2.0f, 6.3432f, 2.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 17.6569f, 3.3431f, 19.0f, 5.0f, 19.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 19.0f, 22.0f, 17.6569f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 7.0f, 4.0f, 7.4477f, 4.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 16.5523f, 4.4477f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 17.0f, 20.0f, 16.5523f, 20.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 7.4477f, 19.5523f, 7.0f, 19.0f, 7.0f)
                close()
            }
        }
        .build()
        return _toolbarRight!!
    }

private var _toolbarRight: ImageVector? = null
