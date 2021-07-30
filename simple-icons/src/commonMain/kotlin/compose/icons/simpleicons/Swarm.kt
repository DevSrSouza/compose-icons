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

public val SimpleIcons.Swarm: ImageVector
    get() {
        if (_swarm != null) {
            return _swarm!!
        }
        _swarm = Builder(name = "Swarm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.358f, 1.216f)
                curveToRelative(-1.82f, 0.023f, -4.234f, 2.581f, -2.57f, 6.704f)
                curveToRelative(0.018f, 0.034f, 0.08f, 0.17f, 0.091f, 0.204f)
                horizontalLineToRelative(0.003f)
                curveToRelative(5.172f, -2.298f, 4.45f, -6.287f, 3.112f, -6.8f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -0.636f, -0.108f)
                close()
                moveTo(4.001f, 2.768f)
                curveToRelative(-1.867f, 0.027f, -3.392f, 0.81f, -3.874f, 2.06f)
                curveToRelative(-0.91f, 2.365f, 3.07f, 7.996f, 12.229f, 3.93f)
                lineToRelative(0.004f, -0.003f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, true, -0.16f, -0.362f)
                curveTo(10.193f, 4.303f, 6.73f, 2.728f, 4.0f, 2.768f)
                close()
                moveTo(15.51f, 9.432f)
                lineToRelative(-0.138f, 0.034f)
                arcToRelative(7.08f, 7.08f, 0.0f, false, false, -2.153f, 0.951f)
                curveToRelative(-0.949f, 0.624f, -1.786f, 1.549f, -2.147f, 2.641f)
                curveToRelative(-0.097f, 0.295f, -0.17f, 0.618f, -0.194f, 0.928f)
                arcToRelative(9.153f, 9.153f, 0.0f, false, false, 0.77f, 4.451f)
                arcToRelative(9.165f, 9.165f, 0.0f, false, false, 2.681f, 3.46f)
                curveToRelative(0.686f, 0.544f, 1.92f, 0.887f, 2.93f, 0.887f)
                curveToRelative(0.949f, 0.0f, 1.884f, -0.282f, 2.725f, -0.71f)
                curveToRelative(0.262f, -0.133f, 0.841f, -0.494f, 0.879f, -0.52f)
                arcToRelative(3.847f, 3.847f, 0.0f, false, true, -1.378f, -0.663f)
                curveToRelative(-1.447f, -1.107f, -2.594f, -2.595f, -3.409f, -4.423f)
                curveToRelative(-0.826f, -1.854f, -1.163f, -3.73f, -1.002f, -5.575f)
                arcToRelative(3.813f, 3.813f, 0.0f, false, true, 0.436f, -1.46f)
                close()
                moveTo(19.008f, 9.458f)
                curveToRelative(-0.868f, 0.0f, -1.704f, 0.722f, -1.783f, 1.623f)
                curveToRelative(-0.132f, 1.503f, 0.166f, 3.033f, 0.824f, 4.51f)
                curveToRelative(0.648f, 1.453f, 1.567f, 2.683f, 2.749f, 3.586f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, 1.06f, 0.346f)
                curveToRelative(0.677f, 0.0f, 1.353f, -0.36f, 1.621f, -1.002f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, false, -0.068f, -5.356f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, false, -3.891f, -3.618f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, -0.512f, -0.089f)
                close()
                moveTo(8.958f, 14.956f)
                arcToRelative(28.722f, 28.722f, 0.0f, false, false, -2.175f, 4.098f)
                curveToRelative(-0.023f, 0.054f, -0.378f, 0.932f, -0.483f, 1.205f)
                arcToRelative(0.676f, 0.676f, 0.0f, false, false, 0.384f, 0.86f)
                curveToRelative(0.273f, 0.107f, 1.164f, 0.43f, 1.22f, 0.449f)
                arcToRelative(28.93f, 28.93f, 0.0f, false, false, 4.453f, 1.12f)
                arcToRelative(11.15f, 11.15f, 0.0f, false, true, -2.442f, -3.48f)
                arcToRelative(11.136f, 11.136f, 0.0f, false, true, -0.958f, -4.252f)
                close()
            }
        }
        .build()
        return _swarm!!
    }

private var _swarm: ImageVector? = null
