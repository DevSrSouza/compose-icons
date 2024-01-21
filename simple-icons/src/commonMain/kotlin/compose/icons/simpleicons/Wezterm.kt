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

public val SimpleIcons.Wezterm: ImageVector
    get() {
        if (_wezterm != null) {
            return _wezterm!!
        }
        _wezterm = Builder(name = "Wezterm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.27f, 8.524f)
                curveToRelative(0.0f, -0.623f, 0.62f, -1.007f, 2.123f, -1.007f)
                lineToRelative(-0.5f, 2.757f)
                curveToRelative(-0.931f, -0.623f, -1.624f, -1.199f, -1.624f, -1.75f)
                close()
                moveTo(7.278f, 15.331f)
                curveToRelative(0.0f, 0.647f, -0.644f, 1.079f, -2.123f, 1.15f)
                lineToRelative(0.524f, -2.924f)
                curveToRelative(0.931f, 0.624f, 1.6f, 1.175f, 1.6f, 1.774f)
                close()
                moveTo(4.653f, 21.323f)
                lineTo(5.107f, 18.615f)
                curveToRelative(3.603f, -0.336f, 5.01f, -1.798f, 5.01f, -3.404f)
                curveToRelative(0.0f, -1.653f, -2.004f, -2.948f, -3.841f, -4.074f)
                lineToRelative(0.668f, -3.548f)
                curveToRelative(0.764f, 0.072f, 1.67f, 0.216f, 2.744f, 0.432f)
                lineToRelative(0.31f, -2.469f)
                curveToRelative(-0.81f, -0.12f, -1.575f, -0.168f, -2.29f, -0.216f)
                lineTo(8.257f, 2.7f)
                lineToRelative(-2.363f, -0.024f)
                lineToRelative(-0.453f, 2.684f)
                curveTo(1.838f, 5.648f, 0.43f, 7.158f, 0.43f, 8.764f)
                curveToRelative(0.0f, 1.63f, 2.004f, 2.876f, 3.841f, 3.954f)
                lineToRelative(-0.668f, 3.716f)
                curveToRelative(-0.859f, -0.048f, -1.908f, -0.192f, -3.125f, -0.408f)
                lineTo(0.0f, 18.495f)
                curveToRelative(1.026f, 0.12f, 1.98f, 0.192f, 2.84f, 0.216f)
                lineToRelative(-0.525f, 2.588f)
                close()
                moveTo(20.206f, 19.429f)
                horizontalLineToRelative(2.673f)
                curveToRelative(0.334f, -2.804f, 0.81f, -8.46f, 1.121f, -14.86f)
                horizontalLineToRelative(-2.553f)
                curveToRelative(-0.071f, 1.51f, -0.334f, 10.498f, -0.43f, 11.241f)
                horizontalLineToRelative(-0.071f)
                curveToRelative(-0.644f, -2.42f, -1.169f, -4.386f, -1.813f, -6.782f)
                horizontalLineToRelative(-1.456f)
                curveToRelative(-0.62f, 2.396f, -1.05f, 4.194f, -1.694f, 6.782f)
                horizontalLineToRelative(-0.096f)
                curveToRelative(-0.071f, -0.743f, -0.477f, -9.73f, -0.525f, -11.24f)
                horizontalLineToRelative(-2.648f)
                curveToRelative(0.31f, 6.399f, 0.763f, 12.055f, 1.097f, 14.86f)
                horizontalLineToRelative(2.625f)
                lineToRelative(1.838f, -7.12f)
                close()
            }
        }
        .build()
        return _wezterm!!
    }

private var _wezterm: ImageVector? = null
