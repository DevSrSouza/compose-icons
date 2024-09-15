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

public val SimpleIcons.Qzone: ImageVector
    get() {
        if (_qzone != null) {
            return _qzone!!
        }
        _qzone = Builder(name = "Qzone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.987f, 9.201f)
                curveToRelative(-0.032f, -0.099f, -0.127f, -0.223f, -0.334f, -0.258f)
                curveToRelative(-0.207f, -0.036f, -7.352f, -1.406f, -7.352f, -1.406f)
                reflectiveCurveToRelative(-0.105f, -0.022f, -0.198f, -0.07f)
                curveToRelative(-0.092f, -0.047f, -0.127f, -0.167f, -0.127f, -0.167f)
                reflectiveCurveTo(12.447f, 0.954f, 12.349f, 0.768f)
                curveToRelative(-0.099f, -0.187f, -0.245f, -0.238f, -0.349f, -0.238f)
                curveToRelative(-0.104f, 0.0f, -0.251f, 0.051f, -0.349f, 0.238f)
                curveTo(11.553f, 0.954f, 8.024f, 7.3f, 8.024f, 7.3f)
                reflectiveCurveToRelative(-0.035f, 0.12f, -0.128f, 0.167f)
                curveToRelative(-0.092f, 0.047f, -0.197f, 0.07f, -0.197f, 0.07f)
                reflectiveCurveTo(0.555f, 8.907f, 0.347f, 8.942f)
                curveToRelative(-0.208f, 0.036f, -0.302f, 0.16f, -0.333f, 0.258f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, false, 0.125f, 0.449f)
                lineTo(5.501f, 15.14f)
                reflectiveCurveToRelative(0.072f, 0.08f, 0.119f, 0.172f)
                curveToRelative(0.016f, 0.104f, 0.005f, 0.21f, 0.005f, 0.21f)
                reflectiveCurveToRelative(-1.189f, 7.243f, -1.22f, 7.451f)
                curveToRelative(-0.031f, 0.208f, 0.075f, 0.369f, 0.159f, 0.43f)
                curveToRelative(0.083f, 0.062f, 0.233f, 0.106f, 0.421f, 0.013f)
                curveToRelative(0.189f, -0.093f, 6.813f, -3.261f, 6.813f, -3.261f)
                reflectiveCurveToRelative(0.098f, -0.044f, 0.201f, -0.061f)
                curveToRelative(0.103f, -0.017f, 0.201f, 0.061f, 0.201f, 0.061f)
                reflectiveCurveToRelative(6.624f, 3.168f, 6.813f, 3.261f)
                curveToRelative(0.188f, 0.094f, 0.338f, 0.049f, 0.421f, -0.013f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, false, 0.159f, -0.43f)
                curveToRelative(-0.021f, -0.14f, -0.93f, -5.678f, -0.93f, -5.678f)
                curveToRelative(0.876f, -0.54f, 1.425f, -1.039f, 1.849f, -1.747f)
                curveToRelative(-2.594f, 0.969f, -6.007f, 1.717f, -9.416f, 1.866f)
                curveToRelative(-0.915f, 0.041f, -2.41f, 0.097f, -3.474f, -0.015f)
                curveToRelative(-0.678f, -0.071f, -1.17f, -0.144f, -1.243f, -0.438f)
                curveToRelative(-0.053f, -0.215f, 0.054f, -0.46f, 0.545f, -0.831f)
                arcToRelative(2640.863f, 2640.863f, 0.0f, false, true, 2.861f, -2.155f)
                curveToRelative(1.285f, -0.968f, 3.559f, -2.47f, 3.559f, -2.731f)
                curveToRelative(0.0f, -0.285f, -2.144f, -0.781f, -4.038f, -0.781f)
                curveToRelative(-1.945f, 0.0f, -2.275f, 0.132f, -2.811f, 0.168f)
                curveToRelative(-0.488f, 0.034f, -0.769f, 0.005f, -0.804f, -0.138f)
                curveToRelative(-0.06f, -0.248f, 0.183f, -0.389f, 0.588f, -0.568f)
                curveToRelative(0.709f, -0.314f, 1.86f, -0.594f, 1.984f, -0.626f)
                curveToRelative(0.194f, -0.052f, 3.082f, -0.805f, 5.619f, -0.535f)
                curveToRelative(1.318f, 0.14f, 3.244f, 0.668f, 3.244f, 1.276f)
                curveToRelative(0.0f, 0.342f, -1.721f, 1.494f, -3.225f, 2.597f)
                curveToRelative(-1.149f, 0.843f, -2.217f, 1.561f, -2.217f, 1.688f)
                curveToRelative(0.0f, 0.342f, 3.533f, 1.241f, 6.69f, 1.01f)
                lineToRelative(0.003f, -0.022f)
                curveToRelative(0.048f, -0.092f, 0.119f, -0.172f, 0.119f, -0.172f)
                lineToRelative(5.363f, -5.491f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, false, 0.127f, -0.449f)
                close()
            }
        }
        .build()
        return _qzone!!
    }

private var _qzone: ImageVector? = null
