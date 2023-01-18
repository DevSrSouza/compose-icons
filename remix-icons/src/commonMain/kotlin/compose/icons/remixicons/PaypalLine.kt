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

public val RemixIcons.PaypalLine: ImageVector
    get() {
        if (_paypalLine != null) {
            return _paypalLine!!
        }
        _paypalLine = Builder(name = "PaypalLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.495f, 20.667f)
                horizontalLineToRelative(1.551f)
                lineToRelative(0.538f, -3.376f)
                arcToRelative(2.805f, 2.805f, 0.0f, false, true, 2.77f, -2.366f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.677f, 0.0f, 4.06f, -0.983f, 4.55f, -3.503f)
                curveToRelative(0.208f, -1.066f, 0.117f, -1.73f, -0.171f, -2.102f)
                curveToRelative(-1.207f, 3.054f, -3.79f, 4.16f, -6.962f, 4.16f)
                horizontalLineToRelative(-0.884f)
                curveToRelative(-0.384f, 0.0f, -0.794f, 0.209f, -0.852f, 0.58f)
                lineToRelative(-1.04f, 6.607f)
                close()
                moveTo(3.551f, 20.373f)
                arcToRelative(0.551f, 0.551f, 0.0f, false, true, -0.544f, -0.637f)
                lineTo(5.68f, 2.776f)
                arcTo(0.92f, 0.92f, 0.0f, false, true, 6.59f, 2.0f)
                horizontalLineToRelative(6.424f)
                curveToRelative(2.212f, 0.0f, 3.942f, 0.467f, 4.899f, 1.558f)
                curveToRelative(0.87f, 0.99f, 1.123f, 2.084f, 0.871f, 3.692f)
                curveToRelative(0.36f, 0.191f, 0.668f, 0.425f, 0.916f, 0.706f)
                curveToRelative(0.818f, 0.933f, 0.978f, 2.26f, 0.668f, 3.85f)
                curveToRelative(-0.74f, 3.805f, -3.276f, 5.12f, -6.514f, 5.12f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.805f, 0.805f, 0.0f, false, false, -0.794f, 0.679f)
                lineToRelative(-0.702f, 4.383f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, true, -0.794f, 0.679f)
                lineTo(6.72f, 22.667f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, -0.477f, -0.558f)
                lineToRelative(0.274f, -1.736f)
                lineTo(3.55f, 20.373f)
                close()
                moveTo(10.387f, 11.479f)
                horizontalLineToRelative(0.884f)
                curveToRelative(3.19f, 0.0f, 4.895f, -1.212f, 5.483f, -4.229f)
                curveToRelative(0.02f, -0.101f, 0.037f, -0.203f, 0.053f, -0.309f)
                curveToRelative(0.166f, -1.06f, 0.05f, -1.553f, -0.398f, -2.063f)
                curveToRelative(-0.465f, -0.53f, -1.603f, -0.878f, -3.396f, -0.878f)
                horizontalLineToRelative(-5.5f)
                lineTo(5.246f, 18.373f)
                horizontalLineToRelative(1.561f)
                lineToRelative(0.73f, -4.628f)
                lineToRelative(0.007f, 0.001f)
                arcToRelative(2.915f, 2.915f, 0.0f, false, true, 2.843f, -2.267f)
                close()
            }
        }
        .build()
        return _paypalLine!!
    }

private var _paypalLine: ImageVector? = null
