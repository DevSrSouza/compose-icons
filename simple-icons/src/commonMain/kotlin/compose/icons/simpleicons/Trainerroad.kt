package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Trainerroad: VectorAsset
    get() {
        if (_trainerroad != null) {
            return _trainerroad!!
        }
        _trainerroad = VectorAssetBuilder(name = "Trainerroad", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.489f, 2.392f)
                lineTo(1.281f, 14.558f)
                curveToRelative(0.862f, -1.684f, 2.586f, -2.817f, 4.574f, -2.817f)
                horizontalLineToRelative(0.007f)
                arcToRelative(5.08f, 5.08f, 0.0f, false, true, 2.894f, 0.9f)
                lineToRelative(-0.017f, -0.011f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, 0.878f, -1.336f)
                lineToRelative(0.007f, -0.023f)
                curveToRelative(0.413f, -1.328f, -0.787f, -5.473f, 3.662f, -5.538f)
                curveToRelative(2.222f, -0.031f, 5.068f, 1.816f, 4.992f, 1.805f)
                curveToRelative(-3.994f, -0.614f, -5.263f, -0.787f, -6.242f, 1.115f)
                curveToRelative(-0.889f, 1.726f, -0.657f, 3.163f, -1.802f, 4.24f)
                curveToRelative(-0.979f, 0.923f, -3.32f, 1.534f, -4.048f, 1.383f)
                curveToRelative(-0.33f, -0.069f, 0.837f, -0.379f, 1.921f, -1.136f)
                arcToRelative(4.36f, 4.36f, 0.0f, true, false, 2.089f, 4.058f)
                lineToRelative(0.001f, -0.014f)
                curveToRelative(0.251f, 0.145f, 0.489f, 0.294f, 0.711f, 0.444f)
                arcToRelative(5.146f, 5.146f, 0.0f, false, true, -3.087f, 3.967f)
                lineToRelative(-0.034f, 0.013f)
                horizontalLineToRelative(9.235f)
                curveToRelative(-0.733f, -1.264f, -3.514f, -5.267f, -9.87f, -6.403f)
                curveToRelative(0.783f, -0.387f, 7.589f, -0.197f, 13.546f, 5.381f)
                lineToRelative(3.304f, -18.192f)
                close()
                moveTo(10.018f, 3.98f)
                curveToRelative(0.592f, 0.019f, 1.176f, 0.177f, 1.664f, 0.294f)
                curveToRelative(1.338f, 0.32f, 2.533f, 0.674f, 2.372f, 0.747f)
                curveToRelative(-0.033f, 0.014f, -0.586f, -0.064f, -0.816f, -0.088f)
                arcToRelative(4.118f, 4.118f, 0.0f, false, false, -1.558f, 0.072f)
                lineToRelative(0.028f, -0.006f)
                curveToRelative(-2.099f, 0.503f, -2.857f, 2.962f, -3.0f, 3.183f)
                curveToRelative(-0.017f, 0.024f, -1.186f, -0.6f, -1.274f, -1.826f)
                curveToRelative(-0.062f, -0.894f, 0.258f, -1.752f, 1.525f, -2.224f)
                lineToRelative(0.002f, 0.002f)
                arcToRelative(2.751f, 2.751f, 0.0f, false, true, 1.057f, -0.154f)
                close()
                moveTo(15.407f, 8.073f)
                curveToRelative(0.651f, -0.008f, 1.469f, 0.085f, 2.505f, 0.305f)
                arcToRelative(8.972f, 8.972f, 0.0f, false, false, -1.865f, 1.456f)
                lineToRelative(-0.002f, 0.002f)
                curveToRelative(-1.07f, 1.098f, -2.061f, 2.566f, -1.691f, 3.379f)
                reflectiveCurveToRelative(2.652f, 1.826f, 4.3f, 2.92f)
                curveToRelative(0.852f, 0.568f, 1.515f, 2.559f, 1.517f, 2.566f)
                curveToRelative(-3.11f, -2.417f, -5.369f, -3.097f, -7.048f, -4.1f)
                curveToRelative(-1.971f, -1.186f, -0.712f, -4.058f, -0.114f, -5.301f)
                curveToRelative(0.342f, -0.704f, 0.964f, -1.209f, 2.397f, -1.227f)
                close()
                moveTo(0.759f, 17.427f)
                lineTo(0.0f, 21.608f)
                horizontalLineToRelative(3.904f)
                curveToRelative(-1.708f, -0.717f, -2.93f, -2.284f, -3.143f, -4.157f)
                lineToRelative(-0.002f, -0.024f)
                close()
            }
        }
        .build()
        return _trainerroad!!
    }

private var _trainerroad: VectorAsset? = null
