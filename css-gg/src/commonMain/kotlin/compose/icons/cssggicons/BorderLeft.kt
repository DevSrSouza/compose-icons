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

public val CssGgIcons.BorderLeft: ImageVector
    get() {
        if (_borderLeft != null) {
            return _borderLeft!!
        }
        _borderLeft = Builder(name = "BorderLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 19.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(7.0f, 19.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _borderLeft!!
    }

private var _borderLeft: ImageVector? = null
