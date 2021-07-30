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

public val CssGgIcons.ArrowsExpandLeft: ImageVector
    get() {
        if (_arrowsExpandLeft != null) {
            return _arrowsExpandLeft!!
        }
        _arrowsExpandLeft = Builder(name = "ArrowsExpandLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1005f, 4.1005f)
                verticalLineTo(2.1005f)
                horizontalLineTo(2.1005f)
                lineTo(2.1005f, 10.1005f)
                horizontalLineTo(4.1005f)
                lineTo(4.1005f, 5.5147f)
                lineTo(9.8787f, 11.293f)
                lineTo(11.293f, 9.8788f)
                lineTo(5.5147f, 4.1005f)
                horizontalLineTo(10.1005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8995f, 13.8995f)
                horizontalLineTo(21.8995f)
                verticalLineTo(21.8995f)
                horizontalLineTo(13.8995f)
                verticalLineTo(19.8995f)
                horizontalLineTo(18.4853f)
                lineTo(12.7071f, 14.1212f)
                lineTo(14.1213f, 12.707f)
                lineTo(19.8995f, 18.4853f)
                verticalLineTo(13.8995f)
                close()
            }
        }
        .build()
        return _arrowsExpandLeft!!
    }

private var _arrowsExpandLeft: ImageVector? = null
