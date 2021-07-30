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

public val SimpleIcons.Aerlingus: ImageVector
    get() {
        if (_aerlingus != null) {
            return _aerlingus!!
        }
        _aerlingus = Builder(name = "Aerlingus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.857f, 13.511f)
                curveToRelative(-0.48f, 1.545f, -2.081f, 2.995f, -4.002f, 3.296f)
                curveToRelative(0.31f, 0.48f, 0.452f, 1.074f, 0.377f, 1.733f)
                curveToRelative(-0.208f, 1.789f, -1.921f, 3.23f, -3.758f, 3.249f)
                curveToRelative(-1.243f, 0.009f, -2.928f, -0.528f, -4.115f, -2.402f)
                curveToRelative(-1.064f, -1.666f, -1.215f, -4.313f, -1.14f, -5.113f)
                curveToRelative(-1.299f, 1.328f, -2.109f, 2.618f, -2.495f, 3.512f)
                curveToRelative(-0.866f, 2.025f, -1.196f, 4.492f, -1.177f, 5.65f)
                curveToRelative(0.0f, 0.0f, -0.16f, 0.151f, -0.31f, 0.18f)
                curveToRelative(-0.48f, -0.085f, -0.895f, -0.264f, -1.206f, -0.537f)
                curveToRelative(-0.376f, -0.34f, -0.461f, -0.66f, -0.461f, -0.66f)
                curveToRelative(0.574f, -2.872f, 1.488f, -4.66f, 2.853f, -6.704f)
                curveToRelative(1.836f, -2.76f, 4.67f, -4.464f, 8.032f, -5.49f)
                curveToRelative(2.43f, -0.744f, 4.954f, -0.904f, 6.686f, 0.565f)
                curveToRelative(0.933f, 0.772f, 0.989f, 1.883f, 0.716f, 2.721f)
                close()
                moveTo(9.544f, 11.986f)
                curveToRelative(-0.575f, 0.96f, -2.147f, 2.505f, -3.39f, 3.305f)
                curveToRelative(-2.59f, 1.657f, -4.454f, 1.77f, -5.387f, 1.177f)
                arcToRelative(1.451f, 1.451f, 0.0f, false, true, -0.292f, -0.235f)
                curveToRelative(-0.725f, -0.763f, -0.602f, -2.119f, 0.245f, -3.23f)
                curveToRelative(0.415f, -0.546f, 0.951f, -0.932f, 1.47f, -1.111f)
                curveToRelative(-0.406f, -0.189f, -0.679f, -0.584f, -0.735f, -1.14f)
                curveToRelative(-0.113f, -1.11f, 0.725f, -2.57f, 1.883f, -3.164f)
                curveToRelative(1.017f, -0.518f, 3.211f, -1.036f, 4.821f, 1.366f)
                curveToRelative(0.631f, 0.932f, 1.196f, 2.26f, 1.385f, 3.032f)
                close()
                moveTo(20.184f, 1.89f)
                curveToRelative(-0.14f, -1.384f, -1.62f, -1.893f, -3.248f, -1.196f)
                curveToRelative(-0.772f, 0.33f, -1.45f, 0.885f, -1.93f, 1.516f)
                curveToRelative(0.075f, -0.63f, -0.104f, -1.186f, -0.556f, -1.516f)
                curveToRelative(-0.895f, -0.65f, -2.524f, -0.17f, -3.635f, 1.036f)
                curveToRelative(-0.386f, 0.424f, -1.648f, 1.95f, -1.714f, 4.19f)
                curveToRelative(-0.028f, 1.083f, 0.452f, 3.485f, 2.034f, 5.142f)
                curveToRelative(4.219f, -1.591f, 6.488f, -4.03f, 7.354f, -5.038f)
                curveToRelative(0.999f, -1.168f, 1.422f, -2.194f, 1.601f, -2.947f)
                curveToRelative(0.132f, -0.594f, 0.113f, -1.017f, 0.094f, -1.187f)
                close()
            }
        }
        .build()
        return _aerlingus!!
    }

private var _aerlingus: ImageVector? = null
