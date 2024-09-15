package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Freebsd: ImageVector
    get() {
        if (_freebsd != null) {
            return _freebsd!!
        }
        _freebsd = Builder(name = "Freebsd", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 6.0f)
                curveTo(5.0f, 7.852f, 5.621f, 9.855f, 6.5f, 11.469f)
                curveTo(5.555f, 13.094f, 5.0f, 14.988f, 5.0f, 17.0f)
                curveTo(5.0f, 23.063f, 9.938f, 28.0f, 16.0f, 28.0f)
                curveTo(21.695f, 28.0f, 26.387f, 23.648f, 26.938f, 18.094f)
                curveTo(26.973f, 17.73f, 27.0f, 17.371f, 27.0f, 17.0f)
                curveTo(27.0f, 15.426f, 26.664f, 13.902f, 26.031f, 12.5f)
                curveTo(25.98f, 12.586f, 25.949f, 12.648f, 25.906f, 12.719f)
                curveTo(25.563f, 13.484f, 25.164f, 14.293f, 24.75f, 14.969f)
                curveTo(24.906f, 15.633f, 25.0f, 16.301f, 25.0f, 17.0f)
                curveTo(25.0f, 17.305f, 24.996f, 17.609f, 24.969f, 17.906f)
                curveTo(24.516f, 22.457f, 20.68f, 26.0f, 16.0f, 26.0f)
                curveTo(11.016f, 26.0f, 7.0f, 21.984f, 7.0f, 17.0f)
                curveTo(7.0f, 12.016f, 11.016f, 8.0f, 16.0f, 8.0f)
                curveTo(16.43f, 8.0f, 16.836f, 8.035f, 17.25f, 8.094f)
                curveTo(17.492f, 7.77f, 17.742f, 7.48f, 17.969f, 7.219f)
                lineTo(17.969f, 7.188f)
                lineTo(18.156f, 7.0f)
                curveTo(18.375f, 6.762f, 18.582f, 6.559f, 18.781f, 6.375f)
                curveTo(17.879f, 6.137f, 16.953f, 6.0f, 16.0f, 6.0f)
                curveTo(14.605f, 6.0f, 13.262f, 6.273f, 12.031f, 6.75f)
                curveTo(11.742f, 6.547f, 11.391f, 6.32f, 10.938f, 6.094f)
                curveTo(9.816f, 5.535f, 8.168f, 5.0f, 6.0f, 5.0f)
                close()
                moveTo(26.0f, 5.0f)
                curveTo(23.832f, 5.0f, 22.184f, 5.535f, 21.063f, 6.094f)
                curveTo(19.941f, 6.652f, 19.281f, 7.281f, 19.281f, 7.281f)
                lineTo(19.0f, 7.594f)
                lineTo(19.0f, 8.031f)
                curveTo(19.0f, 8.031f, 19.023f, 9.242f, 19.656f, 10.469f)
                curveTo(20.289f, 11.695f, 21.719f, 13.0f, 24.0f, 13.0f)
                lineTo(24.531f, 13.0f)
                lineTo(24.844f, 12.563f)
                curveTo(24.844f, 12.563f, 27.0f, 9.445f, 27.0f, 6.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.219f, 7.156f)
                curveTo(8.313f, 7.297f, 9.25f, 7.547f, 9.906f, 7.844f)
                curveTo(9.16f, 8.34f, 8.508f, 8.934f, 7.906f, 9.594f)
                curveTo(7.609f, 8.813f, 7.355f, 7.965f, 7.219f, 7.156f)
                close()
                moveTo(24.719f, 7.156f)
                curveTo(24.391f, 8.914f, 23.809f, 10.293f, 23.469f, 10.875f)
                curveTo(22.371f, 10.707f, 21.773f, 10.188f, 21.438f, 9.531f)
                curveTo(21.156f, 8.988f, 21.16f, 8.723f, 21.125f, 8.438f)
                curveTo(21.297f, 8.293f, 21.355f, 8.199f, 21.938f, 7.906f)
                curveTo(22.582f, 7.586f, 23.574f, 7.309f, 24.719f, 7.156f)
                close()
            }
        }
        .build()
        return _freebsd!!
    }

private var _freebsd: ImageVector? = null
