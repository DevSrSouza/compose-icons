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

public val CssGgIcons.ArrowsExpandUpRight: ImageVector
    get() {
        if (_arrowsExpandUpRight != null) {
            return _arrowsExpandUpRight!!
        }
        _arrowsExpandUpRight = Builder(name = "ArrowsExpandUpRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                verticalLineTo(3.0f)
                lineTo(21.0f, 3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.414f)
                lineTo(13.636f, 11.778f)
                curveTo(13.246f, 12.169f, 12.612f, 12.169f, 12.222f, 11.778f)
                curveTo(11.831f, 11.388f, 11.831f, 10.755f, 12.222f, 10.364f)
                lineTo(17.586f, 5.0f)
                lineTo(13.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 13.0f)
                curveTo(3.895f, 13.0f, 3.0f, 13.895f, 3.0f, 15.0f)
                lineTo(3.0f, 19.0f)
                curveTo(3.0f, 20.105f, 3.895f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(10.105f, 21.0f, 11.0f, 20.105f, 11.0f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 13.895f, 10.105f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _arrowsExpandUpRight!!
    }

private var _arrowsExpandUpRight: ImageVector? = null
