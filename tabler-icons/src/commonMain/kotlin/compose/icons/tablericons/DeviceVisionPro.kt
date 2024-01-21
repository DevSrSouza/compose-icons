package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DeviceVisionPro: ImageVector
    get() {
        if (_deviceVisionPro != null) {
            return _deviceVisionPro!!
        }
        _deviceVisionPro = Builder(name = "DeviceVisionPro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(1.143f, 0.0f, 2.235f, 0.035f, 3.275f, 0.104f)
                curveToRelative(1.017f, 0.068f, 1.95f, 0.207f, 2.798f, 0.42f)
                curveToRelative(0.813f, 0.203f, 1.52f, 0.505f, 2.119f, 0.909f)
                arcToRelative(3.903f, 3.903f, 0.0f, false, true, 1.328f, 1.531f)
                curveToRelative(0.326f, 0.657f, 0.48f, 1.48f, 0.48f, 2.466f)
                curveToRelative(0.0f, 1.006f, -0.189f, 1.91f, -0.574f, 2.707f)
                curveToRelative(-0.375f, 0.779f, -0.886f, 1.396f, -1.537f, 1.848f)
                arcToRelative(3.696f, 3.696f, 0.0f, false, true, -2.16f, 0.66f)
                curveToRelative(-0.509f, 0.0f, -0.97f, -0.068f, -1.382f, -0.21f)
                arcToRelative(5.84f, 5.84f, 0.0f, false, true, -1.17f, -0.548f)
                arcToRelative(18.45f, 18.45f, 0.0f, false, true, -1.045f, -0.695f)
                arcToRelative(9.104f, 9.104f, 0.0f, false, false, -1.001f, -0.63f)
                arcToRelative(2.376f, 2.376f, 0.0f, false, false, -1.13f, -0.301f)
                curveToRelative(-0.373f, 0.0f, -0.75f, 0.097f, -1.132f, 0.3f)
                curveToRelative(-0.316f, 0.17f, -0.65f, 0.38f, -1.0f, 0.63f)
                curveToRelative(-0.322f, 0.23f, -0.67f, 0.462f, -1.047f, 0.695f)
                arcToRelative(5.78f, 5.78f, 0.0f, false, true, -1.168f, 0.548f)
                curveToRelative(-0.413f, 0.142f, -0.872f, 0.21f, -1.378f, 0.21f)
                arcToRelative(3.706f, 3.706f, 0.0f, false, true, -2.165f, -0.659f)
                curveToRelative(-0.651f, -0.452f, -1.162f, -1.07f, -1.537f, -1.848f)
                curveToRelative(-0.385f, -0.798f, -0.574f, -1.7f, -0.574f, -2.709f)
                curveToRelative(-0.004f, -0.98f, 0.15f, -1.802f, 0.477f, -2.46f)
                arcToRelative(3.897f, 3.897f, 0.0f, false, true, 1.33f, -1.531f)
                curveToRelative(0.6f, -0.403f, 1.307f, -0.704f, 2.12f, -0.907f)
                arcToRelative(16.088f, 16.088f, 0.0f, false, true, 2.8f, -0.423f)
                curveToRelative(1.04f, -0.071f, 2.13f, -0.107f, 3.273f, -0.107f)
                close()
            }
        }
        .build()
        return _deviceVisionPro!!
    }

private var _deviceVisionPro: ImageVector? = null
