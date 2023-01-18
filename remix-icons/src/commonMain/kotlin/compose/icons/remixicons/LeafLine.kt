package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.LeafLine: ImageVector
    get() {
        if (_leafLine != null) {
            return _leafLine!!
        }
        _leafLine = Builder(name = "LeafLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 9.627f, -5.373f, 14.0f, -12.0f, 14.0f)
                lineTo(5.243f, 19.0f)
                curveTo(5.08f, 19.912f, 5.0f, 20.907f, 5.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(0.0f, -1.363f, 0.116f, -2.6f, 0.346f, -3.732f)
                curveTo(3.116f, 16.974f, 3.0f, 15.218f, 3.0f, 13.0f)
                curveTo(3.0f, 7.477f, 7.477f, 3.0f, 13.0f, 3.0f)
                curveToRelative(2.0f, 0.0f, 4.0f, 1.0f, 8.0f, 0.0f)
                close()
                moveTo(13.0f, 5.0f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                curveToRelative(0.0f, 0.362f, 0.003f, 0.711f, 0.01f, 1.046f)
                curveToRelative(1.254f, -1.978f, 3.091f, -3.541f, 5.494f, -4.914f)
                lineToRelative(0.992f, 1.736f)
                curveTo(8.641f, 12.5f, 6.747f, 14.354f, 5.776f, 17.0f)
                lineTo(9.0f, 17.0f)
                curveToRelative(6.015f, 0.0f, 9.871f, -3.973f, 9.997f, -11.612f)
                curveToRelative(-1.372f, 0.133f, -2.647f, 0.048f, -4.22f, -0.188f)
                curveTo(13.627f, 5.027f, 13.401f, 5.0f, 13.0f, 5.0f)
                close()
            }
        }
        .build()
        return _leafLine!!
    }

private var _leafLine: ImageVector? = null
