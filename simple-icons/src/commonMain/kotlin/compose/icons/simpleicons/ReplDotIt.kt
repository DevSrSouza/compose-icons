package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.ReplDotIt: ImageVector
    get() {
        if (_replDotIt != null) {
            return _replDotIt!!
        }
        _replDotIt = Builder(name = "ReplDotIt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.265f, 0.002f)
                arcToRelative(11.911f, 11.911f, 0.0f, false, false, -2.437f, 0.204f)
                curveToRelative(13.876f, 1.704f, 10.27f, 17.94f, 1.717f, 17.819f)
                curveToRelative(0.0f, 0.0f, 12.453f, 1.625f, 11.673f, -10.215f)
                arcTo(11.911f, 11.911f, 0.0f, false, false, 12.265f, 0.002f)
                close()
                moveTo(8.213f, 0.827f)
                curveToRelative(-0.2f, 0.002f, -0.402f, 0.008f, -0.61f, 0.016f)
                arcTo(11.856f, 11.856f, 0.0f, false, false, 0.146f, 13.608f)
                curveTo(2.93f, -0.421f, 18.805f, 4.122f, 17.9f, 12.688f)
                curveToRelative(0.0f, 0.0f, 2.85f, -12.014f, -9.688f, -11.861f)
                close()
                moveTo(9.667f, 5.862f)
                curveTo(6.002f, 5.886f, 0.691f, 7.45f, 0.816f, 16.344f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, 2.897f, 4.33f)
                curveToRelative(0.052f, 0.051f, 0.108f, 0.1f, 0.162f, 0.149f)
                arcToRelative(12.02f, 12.02f, 0.0f, false, false, 1.137f, 0.926f)
                curveToRelative(0.061f, 0.044f, 0.12f, 0.092f, 0.181f, 0.135f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 1.312f, 0.779f)
                curveToRelative(0.132f, 0.068f, 0.266f, 0.13f, 0.4f, 0.193f)
                arcToRelative(11.854f, 11.854f, 0.0f, false, false, 1.199f, 0.486f)
                curveToRelative(0.1f, 0.034f, 0.195f, 0.077f, 0.297f, 0.109f)
                arcToRelative(11.874f, 11.874f, 0.0f, false, false, 1.49f, 0.353f)
                curveToRelative(0.153f, 0.027f, 0.307f, 0.05f, 0.461f, 0.07f)
                arcToRelative(12.016f, 12.016f, 0.0f, false, false, 1.578f, 0.123f)
                lineToRelative(0.06f, 0.003f)
                curveToRelative(0.4f, 0.0f, 0.792f, -0.021f, 1.18f, -0.06f)
                curveToRelative(-13.949f, -3.327f, -8.645f, -18.924f, -0.114f, -17.68f)
                curveToRelative(0.0f, 0.0f, -1.469f, -0.41f, -3.389f, -0.398f)
                close()
                moveTo(12.103f, 8.624f)
                arcToRelative(3.355f, 3.355f, 0.0f, true, false, 3.354f, 3.356f)
                arcToRelative(3.355f, 3.355f, 0.0f, false, false, -3.354f, -3.356f)
                close()
                moveTo(6.153f, 10.816f)
                reflectiveCurveTo(2.82f, 23.09f, 16.172f, 23.196f)
                arcToRelative(11.978f, 11.978f, 0.0f, false, false, 7.743f, -9.992f)
                curveToRelative(0.033f, -0.319f, 0.043f, -0.644f, 0.05f, -0.97f)
                curveToRelative(0.001f, -0.085f, 0.013f, -0.168f, 0.013f, -0.255f)
                curveToRelative(0.0f, -0.371f, -0.023f, -0.737f, -0.056f, -1.1f)
                curveToRelative(-3.527f, 13.887f, -19.132f, 8.448f, -17.77f, -0.063f)
                close()
            }
        }
        .build()
        return _replDotIt!!
    }

private var _replDotIt: ImageVector? = null
