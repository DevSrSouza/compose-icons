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

public val SimpleIcons.Godaddy: ImageVector
    get() {
        if (_godaddy != null) {
            return _godaddy!!
        }
        _godaddy = Builder(name = "Godaddy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.702f, 2.29f)
                curveToRelative(-2.494f, -1.554f, -5.778f, -1.187f, -8.706f, 0.654f)
                curveTo(9.076f, 1.104f, 5.79f, 0.736f, 3.3f, 2.29f)
                curveToRelative(-3.941f, 2.463f, -4.42f, 8.806f, -1.07f, 14.167f)
                curveToRelative(2.47f, 3.954f, 6.333f, 6.269f, 9.77f, 6.226f)
                curveToRelative(3.439f, 0.043f, 7.301f, -2.273f, 9.771f, -6.226f)
                curveToRelative(3.347f, -5.361f, 2.872f, -11.704f, -1.069f, -14.167f)
                close()
                moveTo(4.042f, 15.328f)
                arcToRelative(12.838f, 12.838f, 0.0f, false, true, -1.546f, -3.541f)
                arcToRelative(10.12f, 10.12f, 0.0f, false, true, -0.336f, -3.338f)
                curveToRelative(0.15f, -1.98f, 0.956f, -3.524f, 2.27f, -4.345f)
                curveToRelative(1.315f, -0.822f, 3.052f, -0.87f, 4.903f, -0.137f)
                curveToRelative(0.281f, 0.113f, 0.556f, 0.24f, 0.825f, 0.382f)
                arcTo(15.11f, 15.11f, 0.0f, false, false, 7.5f, 7.54f)
                curveToRelative(-2.035f, 3.255f, -2.655f, 6.878f, -1.945f, 9.765f)
                arcToRelative(13.247f, 13.247f, 0.0f, false, true, -1.514f, -1.98f)
                close()
                moveTo(21.507f, 11.787f)
                arcToRelative(12.866f, 12.866f, 0.0f, false, true, -1.547f, 3.54f)
                arcToRelative(13.25f, 13.25f, 0.0f, false, true, -1.513f, 1.984f)
                curveToRelative(0.635f, -2.589f, 0.203f, -5.76f, -1.353f, -8.734f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.563f, -0.153f)
                lineToRelative(-4.852f, 3.032f)
                arcToRelative(0.397f, 0.397f, 0.0f, false, false, -0.126f, 0.546f)
                lineToRelative(0.712f, 1.139f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, 0.547f, 0.126f)
                lineToRelative(3.145f, -1.965f)
                curveToRelative(0.101f, 0.306f, 0.203f, 0.606f, 0.28f, 0.916f)
                curveToRelative(0.296f, 1.086f, 0.41f, 2.214f, 0.335f, 3.337f)
                curveToRelative(-0.15f, 1.982f, -0.956f, 3.525f, -2.27f, 4.347f)
                arcToRelative(4.437f, 4.437f, 0.0f, false, true, -2.25f, 0.65f)
                horizontalLineToRelative(-0.101f)
                arcToRelative(4.432f, 4.432f, 0.0f, false, true, -2.25f, -0.65f)
                curveToRelative(-1.314f, -0.822f, -2.121f, -2.365f, -2.27f, -4.347f)
                curveToRelative(-0.074f, -1.123f, 0.039f, -2.251f, 0.335f, -3.337f)
                arcToRelative(13.212f, 13.212f, 0.0f, false, true, 4.05f, -6.482f)
                arcToRelative(10.148f, 10.148f, 0.0f, false, true, 2.849f, -1.765f)
                curveToRelative(1.845f, -0.733f, 3.586f, -0.685f, 4.9f, 0.137f)
                curveToRelative(1.316f, 0.822f, 2.122f, 2.365f, 2.271f, 4.345f)
                arcToRelative(10.146f, 10.146f, 0.0f, false, true, -0.33f, 3.334f)
                close()
            }
        }
        .build()
        return _godaddy!!
    }

private var _godaddy: ImageVector? = null
