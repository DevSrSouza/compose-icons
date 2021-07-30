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

public val SimpleIcons.Rottentomatoes: ImageVector
    get() {
        if (_rottentomatoes != null) {
            return _rottentomatoes!!
        }
        _rottentomatoes = Builder(name = "Rottentomatoes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.866f, 0.0f)
                lineTo(4.335f, 1.262f)
                lineToRelative(2.082f, 1.8f)
                curveToRelative(-2.629f, -0.989f, -4.842f, 1.4f, -5.012f, 2.338f)
                curveToRelative(1.384f, -0.323f, 2.24f, -0.422f, 3.344f, -0.335f)
                curveToRelative(-7.042f, 4.634f, -4.978f, 13.148f, -1.434f, 16.094f)
                curveToRelative(5.784f, 4.612f, 13.77f, 3.202f, 17.91f, -1.316f)
                curveTo(27.26f, 13.363f, 22.993f, 0.65f, 10.86f, 2.766f)
                curveToRelative(0.107f, -1.17f, 0.633f, -1.503f, 1.243f, -1.602f)
                curveToRelative(-0.89f, -1.493f, -3.67f, -0.734f, -4.556f, 1.374f)
                curveTo(7.52f, 2.602f, 5.866f, 0.0f, 5.866f, 0.0f)
                close()
                moveTo(4.422f, 7.217f)
                lineTo(6.9f, 7.217f)
                curveToRelative(2.673f, 0.0f, 2.898f, 0.012f, 3.55f, 0.202f)
                curveToRelative(1.06f, 0.307f, 1.868f, 0.973f, 2.313f, 1.904f)
                curveToRelative(0.05f, 0.106f, 0.092f, 0.206f, 0.13f, 0.305f)
                lineToRelative(7.623f, 0.008f)
                lineToRelative(0.027f, 2.912f)
                lineToRelative(-2.745f, -0.024f)
                verticalLineToRelative(7.549f)
                lineToRelative(-2.982f, -0.016f)
                verticalLineToRelative(-7.522f)
                lineToRelative(-2.127f, 0.016f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, true, -1.056f, 1.134f)
                curveToRelative(-0.287f, 0.176f, -0.3f, 0.19f, -0.254f, 0.264f)
                curveToRelative(0.127f, 0.2f, 2.125f, 3.642f, 2.125f, 3.659f)
                lineToRelative(-3.39f, 0.019f)
                lineToRelative(-2.013f, -3.376f)
                curveToRelative(-0.034f, -0.047f, -0.122f, -0.068f, -0.344f, -0.084f)
                lineToRelative(-0.297f, -0.02f)
                lineToRelative(0.037f, 3.48f)
                lineToRelative(-3.075f, -0.038f)
                close()
                moveTo(7.438f, 9.505f)
                lineToRelative(0.024f, 0.338f)
                curveToRelative(0.014f, 0.186f, 0.024f, 0.729f, 0.024f, 1.206f)
                verticalLineToRelative(0.867f)
                lineToRelative(0.582f, -0.025f)
                curveToRelative(0.32f, -0.013f, 0.695f, -0.049f, 0.833f, -0.078f)
                curveToRelative(0.694f, -0.146f, 1.048f, -0.478f, 1.087f, -1.018f)
                curveToRelative(0.027f, -0.378f, -0.063f, -0.636f, -0.303f, -0.87f)
                curveToRelative(-0.318f, -0.309f, -0.761f, -0.416f, -1.733f, -0.418f)
                close()
            }
        }
        .build()
        return _rottentomatoes!!
    }

private var _rottentomatoes: ImageVector? = null
