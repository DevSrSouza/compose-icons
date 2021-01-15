package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.SauceLabs: ImageVector
    get() {
        if (_sauceLabs != null) {
            return _sauceLabs!!
        }
        _sauceLabs = Builder(name = "SauceLabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.93f, 15.475f)
                lineToRelative(6.396f, 0.004f)
                lineToRelative(-3.582f, 6.758f)
                curveTo(2.178f, 20.057f, 0.002f, 16.18f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(1.761f, 0.0f, 3.436f, 0.381f, 4.94f, 1.064f)
                lineTo(5.428f, 12.58f)
                horizontalLineToRelative(10.25f)
                lineToRelative(-7.539f, 7.614f)
                lineToRelative(3.115f, -5.876f)
                horizontalLineTo(3.795f)
                curveTo(3.455f, 13.164f, 3.477f, 12.0f, 3.477f, 12.0f)
                curveToRelative(0.006f, -4.713f, 3.831f, -8.529f, 8.544f, -8.523f)
                curveToRelative(0.093f, 0.0f, 0.187f, 0.002f, 0.28f, 0.005f)
                lineToRelative(1.094f, -1.099f)
                curveToRelative(-0.455f, -0.065f, -0.915f, -0.098f, -1.375f, -0.098f)
                curveToRelative(-5.356f, 0.0f, -9.73f, 4.357f, -9.73f, 9.715f)
                curveToRelative(-0.001f, 0.0f, -0.061f, 1.719f, 0.64f, 3.475f)
                close()
                moveTo(18.255f, 1.764f)
                curveTo(21.82f, 3.943f, 23.997f, 7.82f, 24.0f, 12.0f)
                curveToRelative(0.0f, 6.616f, -5.384f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-1.704f, 0.003f, -3.389f, -0.36f, -4.941f, -1.065f)
                lineToRelative(11.426f, -11.513f)
                horizontalLineTo(8.205f)
                lineToRelative(7.656f, -7.616f)
                lineToRelative(-3.115f, 5.876f)
                horizontalLineToRelative(7.46f)
                curveToRelative(0.319f, 1.079f, 0.319f, 2.318f, 0.319f, 2.318f)
                curveToRelative(-0.008f, 4.714f, -3.834f, 8.529f, -8.547f, 8.522f)
                curveToRelative(-0.105f, 0.0f, -0.21f, -0.002f, -0.314f, -0.006f)
                lineToRelative(-1.084f, 1.096f)
                curveToRelative(5.314f, 0.777f, 10.256f, -2.901f, 11.032f, -8.218f)
                curveToRelative(0.067f, -0.461f, 0.103f, -0.928f, 0.103f, -1.395f)
                curveToRelative(0.0f, -1.189f, -0.22f, -2.369f, -0.647f, -3.479f)
                horizontalLineToRelative(-6.394f)
                lineToRelative(3.581f, -6.756f)
                close()
            }
        }
        .build()
        return _sauceLabs!!
    }

private var _sauceLabs: ImageVector? = null
