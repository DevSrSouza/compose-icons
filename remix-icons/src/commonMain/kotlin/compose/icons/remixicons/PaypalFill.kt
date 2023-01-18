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

public val RemixIcons.PaypalFill: ImageVector
    get() {
        if (_paypalFill != null) {
            return _paypalFill!!
        }
        _paypalFill = Builder(name = "PaypalFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.067f, 8.478f)
                curveToRelative(0.492f, 0.88f, 0.556f, 2.014f, 0.3f, 3.327f)
                curveToRelative(-0.74f, 3.806f, -3.276f, 5.12f, -6.514f, 5.12f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.805f, 0.805f, 0.0f, false, false, -0.794f, 0.68f)
                lineToRelative(-0.04f, 0.22f)
                lineToRelative(-0.63f, 3.993f)
                lineToRelative(-0.032f, 0.17f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, true, -0.794f, 0.679f)
                lineTo(7.72f, 22.667f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, -0.477f, -0.558f)
                lineTo(7.418f, 21.0f)
                horizontalLineToRelative(1.518f)
                lineToRelative(0.95f, -6.02f)
                horizontalLineToRelative(1.385f)
                curveToRelative(4.678f, 0.0f, 7.75f, -2.203f, 8.796f, -6.502f)
                close()
                moveTo(17.107f, 3.388f)
                curveToRelative(0.762f, 0.868f, 0.983f, 1.81f, 0.752f, 3.285f)
                curveToRelative(-0.019f, 0.123f, -0.04f, 0.24f, -0.062f, 0.36f)
                curveToRelative(-0.735f, 3.773f, -3.089f, 5.446f, -6.956f, 5.446f)
                lineTo(8.957f, 12.479f)
                curveToRelative(-0.63f, 0.0f, -1.174f, 0.414f, -1.354f, 1.002f)
                lineToRelative(-0.014f, -0.002f)
                lineToRelative(-0.93f, 5.894f)
                lineTo(3.121f, 19.373f)
                arcToRelative(0.051f, 0.051f, 0.0f, false, true, -0.05f, -0.06f)
                lineToRelative(2.598f, -16.51f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 6.607f, 2.0f)
                horizontalLineToRelative(5.976f)
                curveToRelative(2.183f, 0.0f, 3.716f, 0.469f, 4.523f, 1.388f)
                close()
            }
        }
        .build()
        return _paypalFill!!
    }

private var _paypalFill: ImageVector? = null
