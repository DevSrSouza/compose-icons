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
                moveTo(10.101f, 4.101f)
                verticalLineTo(2.101f)
                horizontalLineTo(2.1f)
                lineTo(2.1f, 10.101f)
                horizontalLineTo(4.1f)
                lineTo(4.1f, 5.515f)
                lineTo(9.879f, 11.293f)
                lineTo(11.293f, 9.879f)
                lineTo(5.515f, 4.101f)
                horizontalLineTo(10.101f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.899f, 13.899f)
                horizontalLineTo(21.899f)
                verticalLineTo(21.899f)
                horizontalLineTo(13.899f)
                verticalLineTo(19.899f)
                horizontalLineTo(18.485f)
                lineTo(12.707f, 14.121f)
                lineTo(14.121f, 12.707f)
                lineTo(19.899f, 18.485f)
                verticalLineTo(13.899f)
                close()
            }
        }
        .build()
        return _arrowsExpandLeft!!
    }

private var _arrowsExpandLeft: ImageVector? = null
