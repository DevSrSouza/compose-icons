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

public val SimpleIcons.Backblaze: ImageVector
    get() {
        if (_backblaze != null) {
            return _backblaze!!
        }
        _backblaze = Builder(name = "Backblaze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3108f, 3.0E-4f)
                curveToRelative(0.6527f, 1.3502f, 1.5666f, 4.0812f, -1.3887f, 7.1738f)
                curveToRelative(-1.8096f, 1.8796f, -3.078f, 3.8487f, -2.3496f, 6.0644f)
                curveToRelative(0.3642f, 1.1037f, 1.1864f, 2.5079f, 2.8867f, 2.7852f)
                curveToRelative(0.6107f, 0.1008f, 1.3425f, -6.0E-4f, 1.7403f, -0.1406f)
                curveToRelative(2.4538f, -0.8544f, 2.098f, -3.4138f, 1.5546f, -5.0469f)
                curveToRelative(-0.07f, -0.2129f, -0.1915f, -0.7333f, -0.2363f, -0.9238f)
                curveToRelative(-0.3726f, -1.6023f, 0.776f, -2.6562f, 1.129f, -3.8047f)
                curveToRelative(0.028f, -0.0925f, 0.0534f, -0.1819f, 0.0702f, -0.2715f)
                curveToRelative(0.042f, -0.21f, 0.067f, -0.423f, 0.0781f, -0.6387f)
                curveToRelative(0.0f, -1.8264f, -0.9882f, -2.6303f, -1.7754f, -3.5996f)
                curveTo(10.1794f, 0.5643f, 9.3107f, 3.0E-4f, 9.3107f, 3.0E-4f)
                close()
                moveTo(15.5862f, 6.0178f)
                reflectiveCurveToRelative(-0.709f, 0.3366f, -1.2188f, 0.8829f)
                curveToRelative(-0.4454f, 0.4818f, -0.8635f, 0.8789f, -1.2949f, 1.8593f)
                curveToRelative(-0.028f, 0.14f, -0.0518f, 0.2863f, -0.0742f, 0.4375f)
                curveToRelative(-0.2325f, 1.6416f, 1.1473f, 3.1446f, 0.7187f, 5.1895f)
                curveToRelative(-0.112f, 0.535f, -0.3554f, 0.7123f, -0.7812f, 1.6367f)
                curveToRelative(-0.5098f, 1.1065f, -0.383f, 2.588f, 0.3594f, 3.5293f)
                curveToRelative(0.6723f, 0.8488f, 1.879f, 1.2321f, 3.0527f, 0.9492f)
                curveToRelative(2.1065f, -0.5042f, 3.0646f, -2.2822f, 2.8965f, -4.2851f)
                curveToRelative(-0.1317f, -1.58f, -0.8154f, -2.7536f, -2.754f, -4.961f)
                curveToRelative(-0.9607f, -1.0925f, -1.6072f, -2.409f, -1.5624f, -3.4062f)
                curveToRelative(0.1373f, -1.2074f, 0.6582f, -1.832f, 0.6582f, -1.832f)
                close()
                moveTo(4.8928f, 15.1936f)
                curveToRelative(-0.0222f, 0.0145f, -0.0439f, 0.0614f, -0.0586f, 0.1602f)
                arcToRelative(0.0469f, 0.0469f, 0.0f, false, true, -0.0059f, 0.0195f)
                verticalLineToRelative(0.01f)
                curveToRelative(-0.1148f, 0.5406f, -0.1649f, 1.823f, 0.1153f, 2.9687f)
                curveToRelative(0.353f, 1.4427f, 1.4175f, 3.902f, 4.412f, 5.129f)
                curveToRelative(2.5184f, 1.0336f, 5.718f, 0.5411f, 7.8497f, -1.627f)
                curveToRelative(0.5294f, -0.5435f, 0.408f, -0.4897f, -0.4883f, -0.2012f)
                verticalLineToRelative(-0.002f)
                curveToRelative(-1.1121f, 0.3558f, -3.5182f, 0.5463f, -4.7676f, -1.0f)
                curveToRelative(-1.5239f, -1.8852f, -0.4302f, -3.3633f, -1.3574f, -3.1504f)
                curveToRelative(-3.6164f, 0.8348f, -5.2667f, -1.4657f, -5.5469f, -2.1016f)
                curveToRelative(-0.0023f, -0.002f, -0.0857f, -0.2487f, -0.1523f, -0.205f)
                close()
            }
        }
        .build()
        return _backblaze!!
    }

private var _backblaze: ImageVector? = null
