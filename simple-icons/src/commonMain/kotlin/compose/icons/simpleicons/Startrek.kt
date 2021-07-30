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

public val SimpleIcons.Startrek: ImageVector
    get() {
        if (_startrek != null) {
            return _startrek!!
        }
        _startrek = Builder(name = "Startrek", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.943f, 14.596f)
                curveToRelative(0.094f, 0.0f, 0.3f, 0.095f, 0.576f, 0.462f)
                arcToRelative(57.71f, 57.71f, 0.0f, false, true, 2.165f, 3.23f)
                curveToRelative(-1.627f, 0.646f, -3.595f, 1.01f, -5.684f, 1.01f)
                curveToRelative(-0.988f, 0.0f, -1.948f, -0.097f, -2.856f, -0.26f)
                curveToRelative(1.417f, -1.507f, 2.918f, -2.856f, 4.703f, -3.98f)
                curveToRelative(0.555f, -0.278f, 0.819f, -0.462f, 1.096f, -0.462f)
                close()
                moveTo(17.367f, 8.394f)
                curveToRelative(2.858f, 1.055f, 4.788f, 2.906f, 4.788f, 4.998f)
                curveToRelative(0.0f, 1.415f, -0.881f, 2.73f, -2.338f, 3.755f)
                curveToRelative(-0.385f, -2.26f, -0.898f, -4.477f, -1.644f, -6.616f)
                arcToRelative(38.69f, 38.69f, 0.0f, false, false, -0.808f, -2.136f)
                close()
                moveTo(7.73f, 8.077f)
                arcToRelative(38.965f, 38.965f, 0.0f, false, false, -1.096f, 3.288f)
                arcToRelative(56.361f, 56.361f, 0.0f, false, false, -1.327f, 6.404f)
                curveToRelative(-2.11f, -1.1f, -3.462f, -2.69f, -3.462f, -4.385f)
                curveToRelative(0.001f, -2.274f, 2.44f, -4.337f, 5.885f, -5.307f)
                close()
                moveTo(12.463f, 0.086f)
                curveToRelative(-0.095f, 0.0f, -0.08f, -0.007f, -0.174f, 0.086f)
                arcToRelative(25.88f, 25.88f, 0.0f, false, false, -3.663f, 5.77f)
                curveTo(3.631f, 6.89f, 0.0f, 9.887f, 0.0f, 13.385f)
                curveToRelative(0.0f, 2.588f, 1.991f, 4.903f, 5.048f, 6.317f)
                arcToRelative(64.85f, 64.85f, 0.0f, false, false, -0.347f, 4.01f)
                curveToRelative(0.0f, 0.094f, 0.108f, 0.202f, 0.203f, 0.202f)
                horizontalLineToRelative(0.086f)
                curveToRelative(0.094f, 0.0f, 0.08f, 0.007f, 0.173f, -0.086f)
                arcToRelative(79.757f, 79.757f, 0.0f, false, true, 2.538f, -3.203f)
                curveToRelative(1.338f, 0.336f, 2.78f, 0.52f, 4.299f, 0.52f)
                curveToRelative(2.455f, 0.0f, 4.738f, -0.48f, 6.635f, -1.298f)
                curveToRelative(0.46f, 0.772f, 0.908f, 1.555f, 1.385f, 2.395f)
                curveToRelative(0.0f, 0.094f, 0.194f, 0.086f, 0.288f, 0.086f)
                arcToRelative(0.175f, 0.175f, 0.0f, false, false, 0.173f, -0.173f)
                arcToRelative(69.569f, 69.569f, 0.0f, false, false, -0.346f, -3.088f)
                curveToRelative(2.369f, -1.42f, 3.865f, -3.45f, 3.865f, -5.682f)
                curveToRelative(0.0f, -3.252f, -3.156f, -6.072f, -7.615f, -7.212f)
                arcToRelative(33.526f, 33.526f, 0.0f, false, false, -3.75f, -6.0f)
                curveToRelative(0.0f, -0.094f, -0.078f, -0.087f, -0.172f, -0.087f)
                close()
            }
        }
        .build()
        return _startrek!!
    }

private var _startrek: ImageVector? = null
