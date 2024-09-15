package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowBottomLeft: ImageVector
    get() {
        if (_arrowBottomLeft != null) {
            return _arrowBottomLeft!!
        }
        _arrowBottomLeft = Builder(name = "ArrowBottomLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.243f, 7.172f)
                lineTo(16.828f, 5.757f)
                lineTo(7.757f, 14.828f)
                lineTo(7.757f, 10.243f)
                horizontalLineTo(5.757f)
                lineTo(5.757f, 18.243f)
                horizontalLineTo(13.757f)
                verticalLineTo(16.243f)
                lineTo(9.171f, 16.243f)
                lineTo(18.243f, 7.172f)
                close()
            }
        }
        .build()
        return _arrowBottomLeft!!
    }

private var _arrowBottomLeft: ImageVector? = null
