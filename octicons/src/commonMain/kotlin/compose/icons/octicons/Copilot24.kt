package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Copilot24: ImageVector
    get() {
        if (_copilot24 != null) {
            return _copilot24!!
        }
        _copilot24 = Builder(name = "Copilot24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(14.25f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(2.214f, 0.0f, 4.248f, 0.657f, 5.747f, 1.756f)
                curveToRelative(0.136f, 0.099f, 0.268f, 0.204f, 0.397f, 0.312f)
                curveToRelative(0.584f, 0.235f, 1.077f, 0.546f, 1.474f, 0.952f)
                curveToRelative(0.85f, 0.869f, 1.132f, 2.037f, 1.132f, 3.368f)
                curveToRelative(0.0f, 0.368f, -0.014f, 0.733f, -0.052f, 1.086f)
                lineToRelative(0.633f, 1.478f)
                lineToRelative(0.043f, 0.022f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 24.0f, 15.222f)
                verticalLineToRelative(1.028f)
                curveToRelative(0.0f, 0.529f, -0.309f, 0.987f, -0.565f, 1.293f)
                curveToRelative(-0.28f, 0.336f, -0.636f, 0.653f, -0.966f, 0.918f)
                arcToRelative(13.84f, 13.84f, 0.0f, false, true, -1.299f, 0.911f)
                lineToRelative(-0.024f, 0.015f)
                lineToRelative(-0.006f, 0.004f)
                lineToRelative(-0.039f, 0.025f)
                curveToRelative(-0.223f, 0.135f, -0.45f, 0.264f, -0.68f, 0.386f)
                curveToRelative(-0.46f, 0.245f, -1.122f, 0.571f, -1.941f, 0.895f)
                curveTo(16.845f, 21.344f, 14.561f, 22.0f, 12.0f, 22.0f)
                curveToRelative(-2.561f, 0.0f, -4.845f, -0.656f, -6.479f, -1.303f)
                arcToRelative(19.046f, 19.046f, 0.0f, false, true, -1.942f, -0.894f)
                arcToRelative(14.081f, 14.081f, 0.0f, false, true, -0.535f, -0.3f)
                lineToRelative(-0.144f, -0.087f)
                lineToRelative(-0.04f, -0.025f)
                lineToRelative(-0.006f, -0.004f)
                lineToRelative(-0.024f, -0.015f)
                arcToRelative(13.16f, 13.16f, 0.0f, false, true, -1.299f, -0.911f)
                arcToRelative(6.913f, 6.913f, 0.0f, false, true, -0.967f, -0.918f)
                curveTo(0.31f, 17.237f, 0.0f, 16.779f, 0.0f, 16.25f)
                verticalLineToRelative(-1.028f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 2.626f, -4.248f)
                lineToRelative(0.043f, -0.022f)
                lineToRelative(0.633f, -1.478f)
                arcToRelative(10.195f, 10.195f, 0.0f, false, true, -0.052f, -1.086f)
                curveToRelative(0.0f, -1.331f, 0.282f, -2.498f, 1.132f, -3.368f)
                curveToRelative(0.397f, -0.406f, 0.89f, -0.717f, 1.474f, -0.952f)
                curveToRelative(0.129f, -0.108f, 0.261f, -0.213f, 0.397f, -0.312f)
                curveTo(7.752f, 2.657f, 9.786f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 11.654f)
                verticalLineToRelative(6.669f)
                arcToRelative(17.59f, 17.59f, 0.0f, false, false, 2.073f, 0.98f)
                curveTo(7.595f, 19.906f, 9.686f, 20.5f, 12.0f, 20.5f)
                curveToRelative(2.314f, 0.0f, 4.405f, -0.594f, 5.927f, -1.197f)
                arcToRelative(17.59f, 17.59f, 0.0f, false, false, 2.073f, -0.98f)
                verticalLineToRelative(-6.669f)
                lineToRelative(-0.038f, -0.09f)
                curveToRelative(-0.046f, 0.061f, -0.095f, 0.12f, -0.145f, 0.177f)
                curveToRelative(-0.793f, 0.9f, -2.057f, 1.259f, -3.782f, 1.259f)
                curveToRelative(-1.59f, 0.0f, -2.738f, -0.544f, -3.508f, -1.492f)
                arcToRelative(4.323f, 4.323f, 0.0f, false, true, -0.355f, -0.508f)
                horizontalLineToRelative(-0.344f)
                arcToRelative(4.323f, 4.323f, 0.0f, false, true, -0.355f, 0.508f)
                curveTo(10.704f, 12.456f, 9.555f, 13.0f, 7.965f, 13.0f)
                curveToRelative(-1.725f, 0.0f, -2.989f, -0.359f, -3.782f, -1.259f)
                arcToRelative(3.026f, 3.026f, 0.0f, false, true, -0.145f, -0.177f)
                close()
                moveTo(10.309f, 10.562f)
                curveToRelative(0.445f, -0.547f, 0.708f, -1.334f, 0.851f, -2.301f)
                curveToRelative(0.057f, -0.357f, 0.087f, -0.718f, 0.09f, -1.079f)
                verticalLineToRelative(-0.031f)
                curveToRelative(-0.001f, -0.762f, -0.166f, -1.26f, -0.43f, -1.568f)
                lineToRelative(-0.008f, -0.01f)
                curveToRelative(-0.341f, -0.391f, -1.046f, -0.689f, -2.533f, -0.529f)
                curveToRelative(-1.505f, 0.163f, -2.347f, 0.537f, -2.824f, 1.024f)
                curveToRelative(-0.462f, 0.473f, -0.705f, 1.18f, -0.705f, 2.32f)
                curveToRelative(0.0f, 0.605f, 0.044f, 1.087f, 0.135f, 1.472f)
                curveToRelative(0.092f, 0.384f, 0.231f, 0.672f, 0.423f, 0.89f)
                curveToRelative(0.365f, 0.413f, 1.084f, 0.75f, 2.657f, 0.75f)
                curveToRelative(0.91f, 0.0f, 1.527f, -0.223f, 1.964f, -0.564f)
                curveToRelative(0.14f, -0.11f, 0.268f, -0.235f, 0.38f, -0.374f)
                close()
                moveTo(12.813f, 8.065f)
                curveToRelative(0.136f, 1.057f, 0.403f, 1.913f, 0.878f, 2.497f)
                curveToRelative(0.442f, 0.545f, 1.134f, 0.938f, 2.344f, 0.938f)
                curveToRelative(1.573f, 0.0f, 2.292f, -0.337f, 2.657f, -0.751f)
                curveToRelative(0.384f, -0.435f, 0.558f, -1.151f, 0.558f, -2.361f)
                curveToRelative(0.0f, -1.14f, -0.243f, -1.847f, -0.705f, -2.319f)
                curveToRelative(-0.477f, -0.488f, -1.318f, -0.862f, -2.824f, -1.025f)
                curveToRelative(-1.487f, -0.161f, -2.192f, 0.139f, -2.533f, 0.529f)
                curveToRelative(-0.268f, 0.308f, -0.437f, 0.808f, -0.438f, 1.578f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.002f, 0.299f, 0.023f, 0.598f, 0.063f, 0.894f)
                close()
            }
        }
        .build()
        return _copilot24!!
    }

private var _copilot24: ImageVector? = null
