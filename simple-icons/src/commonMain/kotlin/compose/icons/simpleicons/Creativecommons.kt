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

public val SimpleIcons.Creativecommons: ImageVector
    get() {
        if (_creativecommons != null) {
            return _creativecommons!!
        }
        _creativecommons = Builder(name = "Creativecommons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.983f, 0.0f)
                curveToRelative(-3.292f, 0.0f, -6.19f, 1.217f, -8.428f, 3.485f)
                curveTo(1.25f, 5.819f, 0.0f, 8.844f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.189f, 1.217f, 6.148f, 3.522f, 8.45f)
                curveTo(5.827f, 22.75f, 8.822f, 24.0f, 11.983f, 24.0f)
                curveToRelative(3.16f, 0.0f, 6.222f, -1.25f, 8.593f, -3.583f)
                curveTo(22.815f, 18.214f, 24.0f, 15.287f, 24.0f, 12.0f)
                curveToRelative(0.0f, -3.255f, -1.186f, -6.214f, -3.458f, -8.483f)
                curveTo(18.238f, 1.217f, 15.275f, 0.0f, 11.983f, 0.0f)
                close()
                moveTo(12.016f, 2.17f)
                curveToRelative(2.7f, 0.0f, 5.103f, 1.02f, 6.98f, 2.893f)
                curveToRelative(1.843f, 1.841f, 2.83f, 4.274f, 2.83f, 6.937f)
                curveToRelative(0.0f, 2.696f, -0.954f, 5.063f, -2.798f, 6.872f)
                curveToRelative(-1.943f, 1.906f, -4.444f, 2.926f, -7.012f, 2.926f)
                curveToRelative(-2.601f, 0.0f, -5.038f, -1.019f, -6.914f, -2.893f)
                curveToRelative(-1.877f, -1.875f, -2.93f, -4.34f, -2.93f, -6.905f)
                curveToRelative(0.0f, -2.597f, 1.053f, -5.063f, 2.93f, -6.97f)
                curveToRelative(1.844f, -1.874f, 4.214f, -2.86f, 6.914f, -2.86f)
                close()
                moveTo(8.68f, 8.278f)
                curveTo(6.723f, 8.278f, 5.165f, 9.66f, 5.165f, 12.0f)
                curveToRelative(0.0f, 2.38f, 1.465f, 3.722f, 3.581f, 3.722f)
                curveToRelative(1.358f, 0.0f, 2.516f, -0.744f, 3.155f, -1.874f)
                lineToRelative(-1.491f, -0.758f)
                curveToRelative(-0.333f, 0.798f, -0.839f, 1.037f, -1.478f, 1.037f)
                curveToRelative(-1.105f, 0.0f, -1.61f, -0.917f, -1.61f, -2.126f)
                curveToRelative(0.0f, -1.21f, 0.426f, -2.127f, 1.61f, -2.127f)
                curveToRelative(0.32f, 0.0f, 0.96f, 0.173f, 1.332f, 0.97f)
                lineToRelative(1.597f, -0.838f)
                curveToRelative(-0.68f, -1.236f, -1.837f, -1.728f, -3.181f, -1.728f)
                close()
                moveTo(15.612f, 8.278f)
                curveToRelative(-1.957f, 0.0f, -3.514f, 1.382f, -3.514f, 3.722f)
                curveToRelative(0.0f, 2.38f, 1.464f, 3.722f, 3.58f, 3.722f)
                curveToRelative(1.359f, 0.0f, 2.516f, -0.744f, 3.155f, -1.874f)
                lineToRelative(-1.49f, -0.758f)
                curveToRelative(-0.333f, 0.798f, -0.84f, 1.037f, -1.478f, 1.037f)
                curveToRelative(-1.105f, 0.0f, -1.611f, -0.917f, -1.611f, -2.126f)
                curveToRelative(0.0f, -1.21f, 0.426f, -2.127f, 1.61f, -2.127f)
                curveToRelative(0.32f, 0.0f, 0.96f, 0.173f, 1.332f, 0.97f)
                lineToRelative(1.597f, -0.838f)
                curveToRelative(-0.68f, -1.236f, -1.837f, -1.728f, -3.181f, -1.728f)
                close()
            }
        }
        .build()
        return _creativecommons!!
    }

private var _creativecommons: ImageVector? = null
