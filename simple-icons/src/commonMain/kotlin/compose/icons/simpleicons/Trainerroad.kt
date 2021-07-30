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

public val SimpleIcons.Trainerroad: ImageVector
    get() {
        if (_trainerroad != null) {
            return _trainerroad!!
        }
        _trainerroad = Builder(name = "Trainerroad", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.489f, 2.393f)
                lineTo(1.28f, 14.558f)
                curveToRelative(0.862f, -1.684f, 2.586f, -2.817f, 4.574f, -2.817f)
                horizontalLineToRelative(0.007f)
                arcToRelative(5.08f, 5.08f, 0.0f, false, true, 2.893f, 0.9f)
                lineToRelative(-0.017f, -0.011f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, 0.878f, -1.336f)
                lineToRelative(0.007f, -0.023f)
                curveToRelative(0.413f, -1.328f, -0.787f, -5.472f, 3.662f, -5.537f)
                curveToRelative(2.222f, -0.031f, 5.067f, 1.815f, 4.991f, 1.804f)
                curveToRelative(-3.993f, -0.614f, -5.262f, -0.787f, -6.241f, 1.115f)
                curveToRelative(-0.889f, 1.726f, -0.657f, 3.163f, -1.802f, 4.24f)
                curveToRelative(-0.979f, 0.923f, -3.32f, 1.534f, -4.048f, 1.383f)
                curveToRelative(-0.33f, -0.07f, 0.837f, -0.38f, 1.921f, -1.136f)
                arcToRelative(4.36f, 4.36f, 0.0f, true, false, 2.09f, 4.058f)
                verticalLineToRelative(-0.014f)
                curveToRelative(0.251f, 0.145f, 0.49f, 0.294f, 0.711f, 0.444f)
                arcToRelative(5.146f, 5.146f, 0.0f, false, true, -3.087f, 3.966f)
                lineToRelative(-0.034f, 0.013f)
                horizontalLineToRelative(9.235f)
                curveToRelative(-0.733f, -1.264f, -3.514f, -5.266f, -9.87f, -6.402f)
                curveToRelative(0.783f, -0.387f, 7.589f, -0.197f, 13.545f, 5.38f)
                lineTo(24.0f, 2.395f)
                close()
                moveTo(10.017f, 3.981f)
                curveToRelative(0.592f, 0.019f, 1.176f, 0.177f, 1.664f, 0.294f)
                curveToRelative(1.338f, 0.32f, 2.533f, 0.674f, 2.372f, 0.747f)
                curveToRelative(-0.033f, 0.014f, -0.586f, -0.064f, -0.816f, -0.088f)
                arcToRelative(4.118f, 4.118f, 0.0f, false, false, -1.558f, 0.072f)
                lineTo(11.707f, 5.0f)
                curveToRelative(-2.099f, 0.503f, -2.857f, 2.961f, -3.0f, 3.182f)
                curveToRelative(-0.017f, 0.024f, -1.186f, -0.6f, -1.274f, -1.826f)
                curveToRelative(-0.062f, -0.893f, 0.258f, -1.751f, 1.525f, -2.223f)
                lineToRelative(0.002f, 0.002f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 1.057f, -0.154f)
                close()
                moveTo(15.406f, 8.073f)
                curveToRelative(0.65f, -0.008f, 1.469f, 0.085f, 2.505f, 0.305f)
                arcToRelative(8.971f, 8.971f, 0.0f, false, false, -1.865f, 1.456f)
                lineToRelative(-0.002f, 0.002f)
                curveToRelative(-1.07f, 1.098f, -2.061f, 2.566f, -1.691f, 3.379f)
                curveToRelative(0.37f, 0.813f, 2.652f, 1.826f, 4.3f, 2.92f)
                curveToRelative(0.851f, 0.568f, 1.514f, 2.558f, 1.516f, 2.565f)
                curveToRelative(-3.11f, -2.416f, -5.368f, -3.096f, -7.047f, -4.1f)
                curveToRelative(-1.97f, -1.185f, -0.712f, -4.057f, -0.114f, -5.3f)
                curveToRelative(0.342f, -0.704f, 0.964f, -1.209f, 2.397f, -1.227f)
                close()
                moveTo(0.759f, 17.427f)
                lineTo(0.0f, 21.607f)
                horizontalLineToRelative(3.904f)
                curveTo(2.196f, 20.89f, 0.974f, 19.323f, 0.76f, 17.451f)
                close()
            }
        }
        .build()
        return _trainerroad!!
    }

private var _trainerroad: ImageVector? = null
