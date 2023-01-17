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

public val SimpleIcons.Opensea: ImageVector
    get() {
        if (_opensea != null) {
            return _opensea!!
        }
        _opensea = Builder(name = "Opensea", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.374f, 0.0f, 0.0f, 5.374f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.374f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.374f, 12.0f, -12.0f)
                reflectiveCurveTo(18.629f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(5.92f, 12.403f)
                lineToRelative(0.051f, -0.081f)
                lineToRelative(3.123f, -4.884f)
                arcToRelative(0.107f, 0.107f, 0.0f, false, true, 0.187f, 0.014f)
                curveToRelative(0.52f, 1.169f, 0.972f, 2.623f, 0.76f, 3.528f)
                curveToRelative(-0.088f, 0.372f, -0.335f, 0.876f, -0.614f, 1.342f)
                arcToRelative(2.405f, 2.405f, 0.0f, false, true, -0.117f, 0.199f)
                arcToRelative(0.106f, 0.106f, 0.0f, false, true, -0.09f, 0.045f)
                lineTo(6.013f, 12.566f)
                arcToRelative(0.106f, 0.106f, 0.0f, false, true, -0.091f, -0.163f)
                close()
                moveTo(19.834f, 14.083f)
                arcToRelative(0.109f, 0.109f, 0.0f, false, true, -0.065f, 0.101f)
                curveToRelative(-0.243f, 0.103f, -1.07f, 0.485f, -1.414f, 0.962f)
                curveToRelative(-0.878f, 1.222f, -1.548f, 2.97f, -3.048f, 2.97f)
                lineTo(9.053f, 18.116f)
                arcToRelative(4.019f, 4.019f, 0.0f, false, true, -4.013f, -4.028f)
                verticalLineToRelative(-0.072f)
                curveToRelative(0.0f, -0.058f, 0.048f, -0.106f, 0.108f, -0.106f)
                horizontalLineToRelative(3.485f)
                curveToRelative(0.07f, 0.0f, 0.12f, 0.063f, 0.115f, 0.132f)
                curveToRelative(-0.026f, 0.226f, 0.017f, 0.459f, 0.125f, 0.67f)
                curveToRelative(0.206f, 0.42f, 0.636f, 0.682f, 1.099f, 0.682f)
                horizontalLineToRelative(1.726f)
                verticalLineToRelative(-1.347f)
                lineTo(9.99f, 14.047f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.089f, -0.173f)
                lineToRelative(0.063f, -0.09f)
                curveToRelative(0.16f, -0.231f, 0.391f, -0.586f, 0.621f, -0.992f)
                curveToRelative(0.156f, -0.274f, 0.308f, -0.566f, 0.43f, -0.86f)
                curveToRelative(0.024f, -0.052f, 0.043f, -0.107f, 0.065f, -0.16f)
                curveToRelative(0.033f, -0.094f, 0.067f, -0.182f, 0.091f, -0.269f)
                arcToRelative(4.57f, 4.57f, 0.0f, false, false, 0.065f, -0.223f)
                curveToRelative(0.057f, -0.25f, 0.081f, -0.514f, 0.081f, -0.787f)
                curveToRelative(0.0f, -0.108f, -0.004f, -0.221f, -0.014f, -0.327f)
                curveToRelative(-0.005f, -0.117f, -0.02f, -0.235f, -0.034f, -0.352f)
                arcToRelative(3.415f, 3.415f, 0.0f, false, false, -0.048f, -0.312f)
                arcToRelative(6.494f, 6.494f, 0.0f, false, false, -0.098f, -0.468f)
                lineToRelative(-0.014f, -0.06f)
                curveToRelative(-0.03f, -0.108f, -0.056f, -0.21f, -0.09f, -0.317f)
                arcToRelative(11.824f, 11.824f, 0.0f, false, false, -0.328f, -0.972f)
                arcToRelative(5.212f, 5.212f, 0.0f, false, false, -0.142f, -0.355f)
                curveToRelative(-0.072f, -0.178f, -0.146f, -0.339f, -0.213f, -0.49f)
                arcToRelative(3.564f, 3.564f, 0.0f, false, true, -0.094f, -0.197f)
                arcToRelative(4.658f, 4.658f, 0.0f, false, false, -0.103f, -0.213f)
                curveToRelative(-0.024f, -0.053f, -0.053f, -0.104f, -0.072f, -0.152f)
                lineToRelative(-0.211f, -0.388f)
                curveToRelative(-0.029f, -0.053f, 0.019f, -0.118f, 0.077f, -0.101f)
                lineToRelative(1.32f, 0.357f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.173f, 0.05f)
                lineToRelative(0.192f, 0.054f)
                lineToRelative(0.07f, 0.019f)
                verticalLineToRelative(-0.783f)
                curveToRelative(0.0f, -0.379f, 0.302f, -0.686f, 0.679f, -0.686f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.477f, 0.202f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.2f, 0.484f)
                lineTo(13.054f, 6.65f)
                lineToRelative(0.141f, 0.039f)
                curveToRelative(0.01f, 0.005f, 0.022f, 0.01f, 0.031f, 0.017f)
                curveToRelative(0.034f, 0.024f, 0.084f, 0.062f, 0.147f, 0.11f)
                curveToRelative(0.05f, 0.038f, 0.103f, 0.086f, 0.165f, 0.137f)
                arcToRelative(10.351f, 10.351f, 0.0f, false, true, 0.574f, 0.504f)
                curveToRelative(0.214f, 0.199f, 0.454f, 0.432f, 0.684f, 0.691f)
                curveToRelative(0.065f, 0.074f, 0.127f, 0.146f, 0.192f, 0.226f)
                curveToRelative(0.062f, 0.079f, 0.132f, 0.156f, 0.19f, 0.232f)
                curveToRelative(0.079f, 0.104f, 0.16f, 0.212f, 0.235f, 0.324f)
                curveToRelative(0.033f, 0.053f, 0.074f, 0.108f, 0.105f, 0.161f)
                curveToRelative(0.096f, 0.142f, 0.178f, 0.288f, 0.257f, 0.435f)
                curveToRelative(0.034f, 0.067f, 0.067f, 0.141f, 0.096f, 0.213f)
                curveToRelative(0.089f, 0.197f, 0.159f, 0.396f, 0.202f, 0.598f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, 0.029f, 0.132f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.014f, 0.057f, 0.019f, 0.12f, 0.024f, 0.184f)
                arcToRelative(2.057f, 2.057f, 0.0f, false, true, -0.106f, 0.874f)
                curveToRelative(-0.031f, 0.084f, -0.06f, 0.17f, -0.098f, 0.254f)
                curveToRelative(-0.075f, 0.17f, -0.161f, 0.343f, -0.264f, 0.502f)
                curveToRelative(-0.034f, 0.06f, -0.075f, 0.122f, -0.113f, 0.182f)
                curveToRelative(-0.043f, 0.063f, -0.089f, 0.123f, -0.127f, 0.18f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, true, -0.173f, 0.221f)
                curveToRelative(-0.053f, 0.072f, -0.106f, 0.144f, -0.166f, 0.209f)
                curveToRelative(-0.081f, 0.098f, -0.16f, 0.19f, -0.245f, 0.278f)
                curveToRelative(-0.048f, 0.058f, -0.1f, 0.118f, -0.156f, 0.17f)
                curveToRelative(-0.052f, 0.06f, -0.108f, 0.113f, -0.156f, 0.161f)
                curveToRelative(-0.084f, 0.084f, -0.15f, 0.147f, -0.208f, 0.202f)
                lineToRelative(-0.137f, 0.122f)
                arcToRelative(0.102f, 0.102f, 0.0f, false, true, -0.072f, 0.03f)
                horizontalLineToRelative(-1.051f)
                verticalLineToRelative(1.346f)
                horizontalLineToRelative(1.322f)
                curveToRelative(0.295f, 0.0f, 0.576f, -0.104f, 0.804f, -0.298f)
                curveToRelative(0.077f, -0.067f, 0.415f, -0.36f, 0.816f, -0.802f)
                arcToRelative(0.094f, 0.094f, 0.0f, false, true, 0.05f, -0.03f)
                lineToRelative(3.65f, -1.057f)
                arcToRelative(0.108f, 0.108f, 0.0f, false, true, 0.138f, 0.103f)
                close()
            }
        }
        .build()
        return _opensea!!
    }

private var _opensea: ImageVector? = null
