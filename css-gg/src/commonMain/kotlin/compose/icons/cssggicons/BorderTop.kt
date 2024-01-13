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

public val CssGgIcons.BorderTop: ImageVector
    get() {
        if (_borderTop != null) {
            return _borderTop!!
        }
        _borderTop = Builder(name = "BorderTop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                verticalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                verticalLineTo(4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 7.0f)
                close()
            }
        }
        .build()
        return _borderTop!!
    }

private var _borderTop: ImageVector? = null
