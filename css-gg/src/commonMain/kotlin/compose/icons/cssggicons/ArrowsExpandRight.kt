package compose.icons.cssggicons

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
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowsExpandRight: ImageVector
    get() {
        if (_arrowsExpandRight != null) {
            return _arrowsExpandRight!!
        }
        _arrowsExpandRight = Builder(name = "ArrowsExpandRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8995f, 4.1005f)
                verticalLineTo(2.1005f)
                horizontalLineTo(21.8995f)
                verticalLineTo(10.1005f)
                horizontalLineTo(19.8995f)
                verticalLineTo(5.5148f)
                lineTo(14.1213f, 11.293f)
                lineTo(12.7071f, 9.8788f)
                lineTo(18.4854f, 4.1005f)
                horizontalLineTo(13.8995f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.1005f, 13.8995f)
                horizontalLineTo(2.1005f)
                verticalLineTo(21.8995f)
                horizontalLineTo(10.1005f)
                verticalLineTo(19.8995f)
                horizontalLineTo(5.5147f)
                lineTo(11.2929f, 14.1212f)
                lineTo(9.8787f, 12.707f)
                lineTo(4.1005f, 18.4853f)
                verticalLineTo(13.8995f)
                close()
            }
        }
        .build()
        return _arrowsExpandRight!!
    }

private var _arrowsExpandRight: ImageVector? = null
