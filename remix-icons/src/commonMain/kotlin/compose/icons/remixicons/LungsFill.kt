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

public val RemixIcons.LungsFill: ImageVector
    get() {
        if (_lungsFill != null) {
            return _lungsFill!!
        }
        _lungsFill = Builder(name = "LungsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.5f)
                curveToRelative(1.412f, 0.47f, 2.048f, 2.159f, 2.327f, 4.023f)
                lineToRelative(-4.523f, 2.611f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(3.71f, -2.141f)
                curveTo(11.06f, 13.079f, 11.0f, 14.308f, 11.0f, 15.0f)
                curveToRelative(0.0f, 3.0f, -1.0f, 6.0f, -5.0f, 6.0f)
                reflectiveCurveToRelative(-4.0f, 0.0f, -4.0f, -4.0f)
                curveTo(2.0f, 9.5f, 5.5f, 4.5f, 8.5f, 5.5f)
                close()
                moveTo(22.001f, 17.0f)
                verticalLineToRelative(0.436f)
                curveToRelative(-0.005f, 3.564f, -0.15f, 3.564f, -4.0f, 3.564f)
                curveToRelative(-4.0f, 0.0f, -5.0f, -3.0f, -5.0f, -6.0f)
                curveToRelative(0.0f, -0.691f, -0.06f, -1.92f, -0.014f, -3.274f)
                lineToRelative(3.71f, 2.14f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(-4.523f, -2.61f)
                curveToRelative(0.279f, -1.865f, 0.915f, -3.553f, 2.327f, -4.024f)
                curveToRelative(3.0f, -1.0f, 6.5f, 4.0f, 6.5f, 11.5f)
                close()
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _lungsFill!!
    }

private var _lungsFill: ImageVector? = null
