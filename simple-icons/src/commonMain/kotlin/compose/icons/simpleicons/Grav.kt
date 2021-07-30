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

public val SimpleIcons.Grav: ImageVector
    get() {
        if (_grav != null) {
            return _grav!!
        }
        _grav = Builder(name = "Grav", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(18.489f, 13.965f)
                curveToRelative(-1.251f, -0.825f, -1.965f, -1.523f, -2.589f, -2.777f)
                curveToRelative(-0.427f, 0.859f, -1.421f, 2.135f, -3.098f, 3.139f)
                curveToRelative(-0.84f, 2.61f, -4.823f, 7.605f, -6.113f, 6.885f)
                curveToRelative(-0.381f, -0.195f, -0.452f, -0.48f, -0.367f, -0.765f)
                curveToRelative(0.093f, -0.704f, 1.566f, -2.34f, 1.566f, -2.34f)
                reflectiveCurveToRelative(0.029f, 0.345f, 0.494f, 1.065f)
                curveToRelative(-0.629f, -1.936f, 1.021f, -4.305f, 1.456f, -5.131f)
                curveToRelative(0.689f, -0.209f, 0.734f, -1.095f, 0.734f, -1.095f)
                curveToRelative(0.046f, -1.364f, -0.569f, -2.34f, -1.155f, -2.94f)
                curveToRelative(0.421f, 0.525f, 0.556f, 1.306f, 0.57f, 2.025f)
                verticalLineToRelative(0.255f)
                curveToRelative(-0.029f, 0.601f, -0.21f, 1.41f, -0.585f, 1.41f)
                verticalLineToRelative(0.016f)
                curveToRelative(-0.39f, -0.016f, -0.885f, 0.074f, -1.319f, 0.21f)
                lineToRelative(-0.961f, 0.239f)
                reflectiveCurveToRelative(0.51f, -0.015f, 0.78f, 0.226f)
                curveToRelative(-0.314f, 0.51f, -1.005f, 1.125f, -1.771f, 1.484f)
                curveToRelative(-1.109f, 0.525f, -1.439f, -0.51f, -0.869f, -1.17f)
                curveToRelative(0.135f, -0.165f, 0.285f, -0.3f, 0.404f, -0.404f)
                curveToRelative(-0.09f, -0.09f, -0.135f, -0.21f, -0.149f, -0.36f)
                curveToRelative(-0.075f, -0.345f, -0.045f, -0.78f, 0.45f, -1.485f)
                curveToRelative(0.09f, -0.149f, 0.21f, -0.3f, 0.345f, -0.449f)
                lineToRelative(0.015f, -0.016f)
                lineToRelative(0.016f, -0.015f)
                verticalLineToRelative(-0.015f)
                curveToRelative(0.029f, -0.046f, 0.074f, -0.076f, 0.104f, -0.12f)
                curveToRelative(0.57f, -0.585f, 1.485f, -1.2f, 2.911f, -1.74f)
                curveToRelative(1.694f, -2.49f, 2.309f, -2.956f, 2.309f, -2.956f)
                curveToRelative(0.181f, -0.179f, 0.511f, -0.419f, 0.615f, -0.479f)
                curveToRelative(-0.87f, -1.515f, -1.049f, -3.646f, -0.824f, -4.215f)
                curveToRelative(-0.03f, 0.03f, -0.046f, 0.06f, -0.061f, 0.105f)
                curveToRelative(0.09f, -0.195f, 0.135f, -0.255f, 0.225f, -0.36f)
                curveToRelative(0.24f, -0.27f, 1.035f, -0.42f, 1.336f, 0.18f)
                curveToRelative(0.15f, 0.315f, 0.18f, 0.735f, 0.18f, 1.035f)
                curveToRelative(-0.645f, -0.029f, -1.215f, 0.69f, -1.215f, 0.69f)
                reflectiveCurveToRelative(0.524f, -0.24f, 1.186f, -0.255f)
                curveToRelative(0.0f, 0.0f, 0.179f, 0.164f, 0.389f, 0.449f)
                curveToRelative(-0.284f, 0.556f, -0.779f, 1.725f, -0.42f, 2.971f)
                curveToRelative(0.061f, 0.24f, 0.15f, 0.45f, 0.256f, 0.629f)
                curveToRelative(0.015f, 0.016f, 0.015f, 0.016f, 0.015f, 0.031f)
                lineToRelative(0.03f, 0.029f)
                curveToRelative(0.585f, 0.886f, 1.649f, 0.976f, 1.649f, 0.976f)
                curveToRelative(-0.495f, -0.24f, -0.915f, -0.646f, -1.169f, -1.125f)
                curveToRelative(-0.136f, -0.255f, -0.227f, -0.48f, -0.271f, -0.646f)
                curveToRelative(-0.285f, -1.08f, 0.135f, -1.725f, 0.375f, -2.145f)
                curveToRelative(0.54f, -0.84f, 1.544f, -1.351f, 2.609f, -1.23f)
                curveToRelative(1.5f, 0.165f, 2.581f, 1.53f, 2.399f, 3.03f)
                curveToRelative(-0.104f, 0.915f, -0.659f, 1.681f, -1.409f, 2.085f)
                curveToRelative(0.181f, 0.494f, -0.015f, 1.08f, -0.015f, 1.08f)
                curveToRelative(0.449f, 0.57f, 0.479f, 0.9f, 0.465f, 1.215f)
                curveToRelative(-0.585f, -0.09f, -1.141f, 0.301f, -1.141f, 0.301f)
                reflectiveCurveToRelative(1.111f, -0.256f, 1.756f, 0.314f)
                curveToRelative(0.42f, 0.449f, 0.704f, 0.87f, 0.869f, 1.17f)
                curveToRelative(0.24f, 0.435f, 1.35f, 0.465f, 1.229f, 1.23f)
                curveToRelative(-0.135f, 0.779f, -0.989f, 0.779f, -2.31f, -0.09f)
                lineToRelative(0.074f, -0.151f)
                close()
                moveTo(13.665f, 9.355f)
                curveToRelative(-0.22f, -0.219f, -0.574f, -0.219f, -0.795f, 0.0f)
                lineToRelative(-0.465f, 0.468f)
                curveToRelative(-0.222f, 0.21f, -0.222f, 0.57f, 0.0f, 0.796f)
                lineToRelative(0.51f, 0.51f)
                curveToRelative(0.222f, 0.225f, 0.577f, 0.21f, 0.795f, 0.0f)
                lineToRelative(0.47f, -0.466f)
                curveToRelative(0.221f, -0.225f, 0.221f, -0.585f, 0.0f, -0.794f)
                lineToRelative(-0.515f, -0.525f)
                verticalLineToRelative(0.011f)
                close()
                moveTo(11.46f, 9.169f)
                curveToRelative(-0.14f, 0.14f, -0.14f, 0.368f, 0.0f, 0.511f)
                curveToRelative(0.141f, 0.138f, 0.368f, 0.138f, 0.51f, 0.0f)
                curveToRelative(0.14f, -0.143f, 0.14f, -0.371f, 0.0f, -0.511f)
                curveToRelative(-0.142f, -0.141f, -0.369f, -0.141f, -0.51f, 0.0f)
                close()
                moveTo(12.729f, 8.917f)
                curveToRelative(0.142f, -0.139f, 0.142f, -0.366f, 0.0f, -0.51f)
                curveToRelative(-0.141f, -0.138f, -0.367f, -0.138f, -0.51f, 0.0f)
                curveToRelative(-0.139f, 0.144f, -0.139f, 0.371f, 0.0f, 0.51f)
                curveToRelative(0.142f, 0.142f, 0.369f, 0.142f, 0.51f, 0.0f)
                close()
                moveTo(18.114f, 7.613f)
                curveToRelative(0.591f, -1.131f, -0.247f, -1.791f, -0.825f, -2.332f)
                curveToRelative(-0.924f, -0.87f, -1.846f, -1.245f, -2.9f, -0.029f)
                curveToRelative(-1.052f, 1.199f, -0.383f, 2.609f, 0.58f, 3.284f)
                curveToRelative(0.96f, 0.69f, 2.535f, 0.226f, 3.135f, -0.915f)
                lineToRelative(0.01f, -0.008f)
                close()
                moveTo(16.519f, 7.15f)
                curveToRelative(-0.372f, -0.445f, 0.322f, -1.252f, 0.757f, -0.77f)
                curveToRelative(0.8f, 0.89f, -0.387f, 1.216f, -0.757f, 0.77f)
                close()
            }
        }
        .build()
        return _grav!!
    }

private var _grav: ImageVector? = null
