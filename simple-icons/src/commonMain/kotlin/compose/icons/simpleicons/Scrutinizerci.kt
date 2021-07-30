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

public val SimpleIcons.Scrutinizerci: ImageVector
    get() {
        if (_scrutinizerci != null) {
            return _scrutinizerci!!
        }
        _scrutinizerci = Builder(name = "Scrutinizerci", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.862f, 0.0f)
                lineTo(6.879f, 0.06f)
                arcToRelative(6.139f, 6.127f, 0.0f, false, false, -3.744f, 2.508f)
                arcToRelative(6.36f, 6.36f, 0.0f, false, false, -1.357f, 2.64f)
                lineToRelative(-0.12f, 0.553f)
                lineToRelative(-0.12f, 0.857f)
                curveToRelative(-0.06f, 0.8f, -0.06f, 1.351f, 0.12f, 1.471f)
                horizontalLineToRelative(5.276f)
                curveToRelative(0.06f, 0.0f, -0.186f, -0.246f, -0.186f, -0.672f)
                curveToRelative(0.0f, -0.738f, 0.252f, -0.924f, 0.552f, -1.23f)
                curveToRelative(0.552f, -0.426f, 2.945f, -0.12f, 4.728f, -0.246f)
                curveToRelative(2.448f, 0.0f, 4.602f, -0.06f, 4.848f, -0.12f)
                curveToRelative(2.7f, -0.427f, 5.03f, -2.388f, 5.522f, -4.536f)
                curveToRelative(0.12f, -0.547f, 0.12f, -1.105f, 0.06f, -1.165f)
                curveTo(22.398f, 0.0f, 21.418f, 0.0f, 14.86f, 0.0f)
                close()
                moveTo(9.194f, 9.007f)
                curveToRelative(-3.758f, -0.015f, -7.47f, 0.0f, -7.53f, 0.06f)
                curveToRelative(-0.126f, 0.126f, -0.06f, 0.798f, 0.06f, 1.35f)
                arcToRelative(5.64f, 5.64f, 0.0f, false, false, 1.843f, 2.761f)
                arcToRelative(7.549f, 7.549f, 0.0f, false, false, 3.312f, 1.59f)
                curveToRelative(0.366f, 0.126f, 1.044f, 0.126f, 4.597f, 0.126f)
                curveToRelative(4.236f, 0.0f, 4.915f, 0.06f, 5.22f, 0.24f)
                arcToRelative(1.842f, 1.836f, 0.0f, false, true, 0.372f, 0.372f)
                curveToRelative(0.18f, 0.24f, 0.18f, 0.307f, 0.18f, 0.98f)
                curveToRelative(0.0f, 0.671f, -0.065f, 0.731f, -0.185f, 1.043f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, true, -0.426f, 0.366f)
                curveToRelative(-0.186f, 0.12f, -0.307f, 0.12f, -4.357f, 0.18f)
                curveToRelative(-4.67f, 0.0f, -5.155f, 0.0f, -6.32f, 0.431f)
                arcToRelative(6.445f, 6.433f, 0.0f, false, false, -2.46f, 1.35f)
                curveToRelative(-1.163f, 1.04f, -1.841f, 2.203f, -1.961f, 3.428f)
                lineToRelative(0.06f, 0.611f)
                arcToRelative(283.022f, 282.613f, 0.0f, false, false, 15.404f, 0.0f)
                lineToRelative(0.492f, -0.12f)
                arcToRelative(4.543f, 4.537f, 0.0f, false, false, 0.737f, -0.245f)
                lineToRelative(0.367f, -0.18f)
                arcToRelative(7.735f, 7.723f, 0.0f, false, false, 3.499f, -4.297f)
                arcToRelative(8.407f, 8.395f, 0.0f, false, false, -0.373f, -6.06f)
                arcToRelative(8.527f, 8.521f, 0.0f, false, false, -2.328f, -2.88f)
                arcToRelative(6.937f, 6.925f, 0.0f, false, false, -2.394f, -0.985f)
                curveToRelative(-0.246f, -0.06f, -4.051f, -0.106f, -7.81f, -0.12f)
                close()
            }
        }
        .build()
        return _scrutinizerci!!
    }

private var _scrutinizerci: ImageVector? = null
