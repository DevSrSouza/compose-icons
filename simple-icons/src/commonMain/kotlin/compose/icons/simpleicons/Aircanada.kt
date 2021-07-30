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

public val SimpleIcons.Aircanada: ImageVector
    get() {
        if (_aircanada != null) {
            return _aircanada!!
        }
        _aircanada = Builder(name = "Aircanada", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.394f, 16.958f)
                curveToRelative(0.0f, -0.789f, 0.338f, -0.902f, 1.127f, -0.451f)
                arcToRelative(54.235f, 54.235f, 0.0f, false, false, 2.704f, 1.465f)
                curveToRelative(0.0f, -0.45f, 0.451f, -0.789f, 1.24f, -0.564f)
                curveToRelative(0.789f, 0.226f, 1.577f, 0.338f, 1.577f, 0.338f)
                reflectiveCurveToRelative(-0.45f, -1.014f, -0.676f, -1.464f)
                curveToRelative(-0.338f, -0.789f, 0.0f, -1.24f, 0.338f, -1.352f)
                curveToRelative(0.0f, 0.0f, -0.45f, -0.338f, -0.789f, -0.564f)
                curveToRelative(-0.676f, -0.45f, -0.563f, -1.014f, 0.113f, -1.24f)
                curveToRelative(0.902f, -0.45f, 2.141f, -0.9f, 2.141f, -0.9f)
                curveToRelative(-0.338f, -0.226f, -0.789f, -0.79f, -0.338f, -1.578f)
                curveToRelative(0.45f, -0.676f, 1.24f, -1.69f, 1.24f, -1.69f)
                horizontalLineTo(18.93f)
                curveToRelative(-0.79f, 0.0f, -1.015f, -0.676f, -1.015f, -1.127f)
                curveToRelative(0.0f, 0.0f, -1.239f, 0.901f, -2.14f, 1.465f)
                curveToRelative(-0.79f, 0.563f, -1.465f, 0.0f, -1.352f, -0.902f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, 0.338f, -2.93f)
                curveToRelative(-0.451f, 0.451f, -1.24f, 0.339f, -1.69f, -0.337f)
                curveToRelative(-0.564f, -1.127f, -1.127f, -2.48f, -1.127f, -2.48f)
                reflectiveCurveTo(11.38f, 4.0f, 10.817f, 5.128f)
                curveToRelative(-0.338f, 0.676f, -1.127f, 0.788f, -1.578f, 0.45f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, 0.338f, 2.93f)
                curveToRelative(0.113f, 0.789f, -0.563f, 1.352f, -1.352f, 0.789f)
                curveToRelative(-0.901f, -0.564f, -2.253f, -1.465f, -2.253f, -1.465f)
                curveToRelative(0.0f, 0.45f, -0.226f, 1.014f, -1.014f, 1.127f)
                horizontalLineTo(2.817f)
                reflectiveCurveToRelative(0.789f, 1.014f, 1.24f, 1.69f)
                curveToRelative(0.45f, 0.676f, 0.0f, 1.352f, -0.339f, 1.577f)
                curveToRelative(0.0f, 0.0f, 1.127f, 0.564f, 2.141f, 0.902f)
                curveToRelative(0.676f, 0.338f, 0.902f, 0.788f, 0.113f, 1.24f)
                curveToRelative(-0.226f, 0.225f, -0.789f, 0.563f, -0.789f, 0.563f)
                curveToRelative(0.45f, 0.112f, 0.789f, 0.563f, 0.45f, 1.352f)
                curveToRelative(-0.225f, 0.45f, -0.675f, 1.464f, -0.675f, 1.464f)
                reflectiveCurveToRelative(0.788f, -0.225f, 1.577f, -0.338f)
                curveToRelative(0.789f, -0.225f, 1.127f, 0.226f, 1.24f, 0.564f)
                curveToRelative(0.0f, 0.0f, 1.352f, -0.789f, 2.704f, -1.465f)
                curveToRelative(0.676f, -0.45f, 1.127f, -0.225f, 1.127f, 0.45f)
                verticalLineToRelative(1.916f)
                curveToRelative(0.0f, 1.127f, -0.226f, 2.254f, -0.564f, 2.93f)
                curveToRelative(-5.07f, -0.564f, -9.352f, -4.62f, -9.352f, -10.028f)
                curveToRelative(0.0f, -5.521f, 4.62f, -10.029f, 10.366f, -10.029f)
                curveToRelative(5.747f, 0.0f, 10.367f, 4.508f, 10.367f, 10.029f)
                curveToRelative(0.0f, 5.183f, -4.057f, 9.464f, -9.24f, 10.028f)
                verticalLineToRelative(1.352f)
                curveTo(19.268f, 22.592f, 24.0f, 17.746f, 24.0f, 11.775f)
                curveTo(24.0f, 5.352f, 18.592f, 0.282f, 11.944f, 0.282f)
                curveTo(5.408f, 0.282f, 0.0f, 5.352f, 0.0f, 11.662f)
                curveToRelative(0.0f, 5.521f, 4.169f, 10.14f, 9.69f, 11.155f)
                curveToRelative(0.902f, 0.225f, 1.465f, 0.338f, 2.028f, 0.901f)
                curveToRelative(0.564f, -1.126f, 0.676f, -3.38f, 0.676f, -4.62f)
                close()
            }
        }
        .build()
        return _aircanada!!
    }

private var _aircanada: ImageVector? = null
