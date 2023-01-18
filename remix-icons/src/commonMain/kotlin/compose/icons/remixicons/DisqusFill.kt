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

public val RemixIcons.DisqusFill: ImageVector
    get() {
        if (_disqusFill != null) {
            return _disqusFill!!
        }
        _disqusFill = Builder(name = "DisqusFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-2.53f, 0.0f, -4.84f, -0.94f, -6.601f, -2.488f)
                lineTo(1.5f, 20.0f)
                lineToRelative(1.424f, -3.797f)
                curveTo(2.33f, 14.925f, 2.0f, 13.501f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.733f)
                lineToRelative(0.263f, -0.004f)
                curveToRelative(3.375f, -0.103f, 5.337f, -2.211f, 5.337f, -5.025f)
                verticalLineToRelative(-0.027f)
                lineToRelative(-0.003f, -0.215f)
                curveTo(17.23f, 8.956f, 15.21f, 7.0f, 11.79f, 7.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(11.831f, 9.458f)
                curveToRelative(1.628f, 0.0f, 2.709f, 0.928f, 2.709f, 2.529f)
                verticalLineToRelative(0.028f)
                lineToRelative(-0.005f, 0.183f)
                curveToRelative(-0.079f, 1.5f, -1.138f, 2.345f, -2.704f, 2.345f)
                horizontalLineToRelative(-1.108f)
                lineTo(10.723f, 9.458f)
                horizontalLineToRelative(1.108f)
                close()
            }
        }
        .build()
        return _disqusFill!!
    }

private var _disqusFill: ImageVector? = null
