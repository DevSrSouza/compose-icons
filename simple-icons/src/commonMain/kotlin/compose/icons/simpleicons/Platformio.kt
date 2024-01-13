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

public val SimpleIcons.Platformio: ImageVector
    get() {
        if (_platformio != null) {
            return _platformio!!
        }
        _platformio = Builder(name = "Platformio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.992f)
                curveToRelative(1.25f, 0.211f, 7.051f, -3.743f, 9.113f, -8.217f)
                curveToRelative(0.253f, -0.686f, 0.61f, -1.198f, 0.746f, -2.5f)
                curveToRelative(0.21f, -2.016f, -0.41f, -3.912f, -1.59f, -5.419f)
                curveToRelative(-0.987f, -1.163f, -2.305f, -2.004f, -3.88f, -2.532f)
                lineToRelative(0.683f, -2.583f)
                arcToRelative(1.371f, 1.371f, 0.0f, true, false, -0.76f, -0.189f)
                lineTo(15.64f, 5.1f)
                curveToRelative(-1.109f, -0.288f, -2.328f, -0.437f, -3.64f, -0.444f)
                moveToRelative(5.978f, 11.667f)
                curveToRelative(-1.548f, 1.346f, -2.525f, 1.488f, -3.045f, 1.467f)
                curveToRelative(-0.274f, -0.034f, -0.75f, -0.558f, -0.919f, -1.104f)
                curveToRelative(-0.188f, -0.612f, -0.28f, -1.282f, -0.273f, -2.2f)
                curveToRelative(-0.199f, -2.476f, 1.465f, -5.624f, 3.937f, -6.041f)
                curveToRelative(1.003f, -0.186f, 2.39f, 0.493f, 2.889f, 2.088f)
                curveToRelative(0.506f, 1.422f, -0.645f, 4.147f, -2.589f, 5.79f)
                close()
                moveTo(12.0f, 4.656f)
                curveToRelative(-1.315f, 0.007f, -2.538f, 0.156f, -3.65f, 0.447f)
                lineToRelative(-0.675f, -2.56f)
                arcTo(1.37f, 1.37f, 0.0f, false, false, 6.962f, 0.0f)
                arcToRelative(1.372f, 1.372f, 0.0f, false, false, -0.044f, 2.742f)
                lineTo(7.6f, 5.328f)
                curveToRelative(-1.57f, 0.528f, -2.885f, 1.367f, -3.871f, 2.528f)
                curveToRelative(-1.179f, 1.507f, -1.8f, 3.403f, -1.588f, 5.419f)
                curveToRelative(0.136f, 1.302f, 0.492f, 1.814f, 0.745f, 2.5f)
                curveToRelative(2.062f, 4.474f, 7.862f, 8.428f, 9.113f, 8.217f)
                moveToRelative(-1.507f, -9.507f)
                curveToRelative(0.007f, 0.92f, -0.086f, 1.589f, -0.274f, 2.201f)
                curveToRelative(-0.167f, 0.546f, -0.644f, 1.07f, -0.918f, 1.104f)
                curveToRelative(-0.52f, 0.021f, -1.498f, -0.121f, -3.045f, -1.467f)
                curveToRelative(-1.944f, -1.643f, -3.095f, -4.368f, -2.589f, -5.79f)
                curveToRelative(0.5f, -1.595f, 1.886f, -2.274f, 2.889f, -2.088f)
                curveToRelative(2.471f, 0.417f, 4.136f, 3.565f, 3.937f, 6.04f)
                close()
                moveTo(16.942f, 12.295f)
                arcToRelative(1.24f, 1.24f, 0.0f, true, false, 0.0f, 2.48f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, false, 0.0f, -2.48f)
                close()
                moveTo(17.358f, 13.444f)
                arcToRelative(0.325f, 0.325f, 0.0f, true, true, 0.0f, -0.65f)
                arcToRelative(0.325f, 0.325f, 0.0f, false, true, 0.0f, 0.65f)
                close()
                moveTo(7.25f, 12.294f)
                arcToRelative(1.24f, 1.24f, 0.0f, true, false, 0.0f, 2.48f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, false, 0.0f, -2.48f)
                close()
                moveTo(6.832f, 13.444f)
                arcToRelative(0.325f, 0.325f, 0.0f, true, true, 0.0f, -0.65f)
                arcToRelative(0.325f, 0.325f, 0.0f, false, true, 0.0f, 0.65f)
                close()
            }
        }
        .build()
        return _platformio!!
    }

private var _platformio: ImageVector? = null
