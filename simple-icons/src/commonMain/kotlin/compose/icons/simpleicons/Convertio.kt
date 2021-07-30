package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Convertio: ImageVector
    get() {
        if (_convertio != null) {
            return _convertio!!
        }
        _convertio = Builder(name = "Convertio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.037f)
                curveTo(5.373f, 0.037f, 0.0f, 5.394f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.606f, 5.373f, 11.963f, 12.0f, 11.963f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.357f, 12.0f, -11.963f)
                curveTo(24.0f, 5.394f, 18.627f, 0.037f, 12.0f, 0.037f)
                close()
                moveTo(11.459f, 4.837f)
                curveToRelative(1.91f, -0.13f, 3.876f, 0.395f, 5.432f, 1.934f)
                curveToRelative(1.426f, 1.437f, 2.51f, 3.44f, 2.488f, 5.317f)
                horizontalLineToRelative(2.133f)
                lineToRelative(-4.444f, 4.963f)
                lineToRelative(-4.445f, -4.963f)
                horizontalLineToRelative(2.313f)
                curveToRelative(-0.001f, -1.724f, -0.427f, -2.742f, -1.78f, -4.076f)
                curveToRelative(-1.325f, -1.336f, -2.667f, -2.11f, -4.978f, -2.303f)
                arcToRelative(9.245f, 9.245f, 0.0f, false, true, 3.281f, -0.871f)
                close()
                moveTo(6.934f, 6.95f)
                lineToRelative(4.445f, 4.963f)
                lineTo(9.066f, 11.913f)
                curveToRelative(0.0f, 1.724f, 0.426f, 2.742f, 1.778f, 4.076f)
                curveToRelative(1.326f, 1.336f, 2.667f, 2.112f, 4.978f, 2.305f)
                curveToRelative(-2.684f, 1.268f, -6.22f, 1.398f, -8.71f, -1.064f)
                curveToRelative(-1.427f, -1.437f, -2.512f, -3.44f, -2.489f, -5.317f)
                lineTo(2.488f, 11.913f)
                lineTo(6.934f, 6.95f)
                close()
            }
        }
        .build()
        return _convertio!!
    }

private var _convertio: ImageVector? = null
