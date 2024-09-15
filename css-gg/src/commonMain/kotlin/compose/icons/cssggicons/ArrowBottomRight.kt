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

public val CssGgIcons.ArrowBottomRight: ImageVector
    get() {
        if (_arrowBottomRight != null) {
            return _arrowBottomRight!!
        }
        _arrowBottomRight = Builder(name = "ArrowBottomRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.757f, 7.172f)
                lineTo(7.172f, 5.757f)
                lineTo(16.243f, 14.828f)
                lineTo(16.243f, 10.243f)
                horizontalLineTo(18.243f)
                lineTo(18.243f, 18.243f)
                horizontalLineTo(10.243f)
                verticalLineTo(16.243f)
                lineTo(14.828f, 16.243f)
                lineTo(5.757f, 7.172f)
                close()
            }
        }
        .build()
        return _arrowBottomRight!!
    }

private var _arrowBottomRight: ImageVector? = null
