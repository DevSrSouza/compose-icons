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

public val RemixIcons.FootprintLine: ImageVector
    get() {
        if (_footprintLine != null) {
            return _footprintLine!!
        }
        _footprintLine = Builder(name = "FootprintLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(8.058f, 14.0f)
                lineToRelative(0.045f, -0.132f)
                curveTo(8.87f, 11.762f, 9.0f, 11.37f, 9.0f, 11.0f)
                curveToRelative(0.0f, -0.75f, -0.203f, -1.643f, -0.528f, -2.273f)
                curveTo(8.23f, 8.257f, 8.06f, 8.12f, 8.0f, 8.12f)
                curveTo(6.72f, 8.12f, 5.5f, 9.484f, 5.5f, 11.0f)
                curveToRelative(0.0f, 0.959f, 0.075f, 1.773f, 0.227f, 2.758f)
                lineToRelative(0.038f, 0.242f)
                horizontalLineToRelative(2.293f)
                close()
                moveTo(8.0f, 6.12f)
                curveToRelative(2.0f, 0.0f, 3.0f, 2.88f, 3.0f, 4.88f)
                curveToRelative(0.0f, 1.0f, -0.5f, 2.0f, -1.0f, 3.5f)
                lineTo(9.5f, 16.0f)
                lineTo(4.0f, 16.0f)
                curveToRelative(0.0f, -1.0f, -0.5f, -2.5f, -0.5f, -5.0f)
                reflectiveCurveTo(5.498f, 6.12f, 8.0f, 6.12f)
                close()
                moveTo(20.054f, 14.098f)
                lineToRelative(-0.217f, 1.231f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.417f, -0.955f)
                lineToRelative(0.218f, -1.23f)
                lineToRelative(5.416f, 0.954f)
                close()
                moveTo(19.004f, 9.852f)
                curveToRelative(0.165f, -0.5f, 0.301f, -0.895f, 0.303f, -0.9f)
                curveToRelative(0.202f, -0.658f, 0.361f, -1.303f, 0.485f, -2.008f)
                curveToRelative(0.263f, -1.492f, -0.702f, -3.047f, -1.962f, -3.27f)
                curveToRelative(-0.059f, -0.01f, -0.25f, 0.095f, -0.57f, 0.515f)
                curveToRelative(-0.43f, 0.565f, -0.784f, 1.41f, -0.915f, 2.147f)
                curveToRelative(-0.058f, 0.33f, -0.049f, 0.405f, 0.27f, 2.263f)
                curveToRelative(0.045f, 0.256f, 0.082f, 0.486f, 0.116f, 0.717f)
                lineToRelative(0.02f, 0.138f)
                lineToRelative(2.254f, 0.398f)
                close()
                moveTo(18.178f, 1.705f)
                curveToRelative(2.464f, 0.434f, 4.018f, 3.124f, 3.584f, 5.586f)
                curveToRelative(-0.434f, 2.463f, -1.187f, 3.853f, -1.36f, 4.838f)
                lineToRelative(-5.417f, -0.955f)
                lineToRelative(-0.232f, -1.564f)
                curveToRelative(-0.232f, -1.564f, -0.55f, -2.636f, -0.377f, -3.62f)
                curveToRelative(0.347f, -1.97f, 1.832f, -4.632f, 3.802f, -4.285f)
                close()
            }
        }
        .build()
        return _footprintLine!!
    }

private var _footprintLine: ImageVector? = null
