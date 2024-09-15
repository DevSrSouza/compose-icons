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

public val CssGgIcons.Board: ImageVector
    get() {
        if (_board != null) {
            return _board!!
        }
        _board = Builder(name = "Board", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 4.0f)
                curveTo(3.791f, 4.0f, 2.0f, 5.791f, 2.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 18.209f, 3.791f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                curveTo(20.209f, 20.0f, 22.0f, 18.209f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 5.791f, 20.209f, 4.0f, 18.0f, 4.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(16.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 18.0f, 20.0f, 17.105f, 20.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 6.895f, 19.105f, 6.0f, 18.0f, 6.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(6.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 6.0f, 4.0f, 6.895f, 4.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.105f, 4.895f, 18.0f, 6.0f, 18.0f)
                close()
            }
        }
        .build()
        return _board!!
    }

private var _board: ImageVector? = null
