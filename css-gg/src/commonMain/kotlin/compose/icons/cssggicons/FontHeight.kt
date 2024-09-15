package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.FontHeight: ImageVector
    get() {
        if (_fontHeight != null) {
            return _fontHeight!!
        }
        _fontHeight = Builder(name = "FontHeight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 7.376f)
                curveTo(11.602f, 7.352f, 11.211f, 7.569f, 11.033f, 7.952f)
                lineTo(7.652f, 15.203f)
                curveTo(7.418f, 15.703f, 7.635f, 16.298f, 8.135f, 16.531f)
                curveTo(8.636f, 16.765f, 9.231f, 16.548f, 9.464f, 16.048f)
                lineTo(9.953f, 15.0f)
                horizontalLineTo(14.047f)
                lineTo(14.536f, 16.048f)
                curveTo(14.769f, 16.548f, 15.364f, 16.765f, 15.865f, 16.531f)
                curveTo(16.365f, 16.298f, 16.582f, 15.703f, 16.348f, 15.203f)
                lineTo(12.968f, 7.952f)
                curveTo(12.789f, 7.569f, 12.398f, 7.352f, 12.0f, 7.376f)
                close()
                moveTo(13.115f, 13.0f)
                horizontalLineTo(10.885f)
                lineTo(12.0f, 10.609f)
                lineTo(13.115f, 13.0f)
                close()
            }
        }
        .build()
        return _fontHeight!!
    }

private var _fontHeight: ImageVector? = null
