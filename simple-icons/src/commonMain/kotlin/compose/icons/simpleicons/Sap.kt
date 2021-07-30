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

public val SimpleIcons.Sap: ImageVector
    get() {
        if (_sap != null) {
            return _sap!!
        }
        _sap = Builder(name = "Sap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.064f)
                verticalLineToRelative(11.872f)
                horizontalLineToRelative(12.13f)
                lineTo(24.0f, 6.064f)
                close()
                moveTo(3.264f, 8.272f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.863f, 0.001f, 1.915f, 0.245f, 2.676f, 0.633f)
                lineToRelative(-0.82f, 1.43f)
                curveToRelative(-0.835f, -0.404f, -1.255f, -0.442f, -1.73f, -0.467f)
                curveToRelative(-0.708f, -0.038f, -1.064f, 0.215f, -1.069f, 0.488f)
                curveToRelative(-0.007f, 0.332f, 0.669f, 0.633f, 1.305f, 0.838f)
                curveToRelative(0.964f, 0.306f, 2.19f, 0.715f, 2.377f, 1.9f)
                lineTo(7.77f, 8.437f)
                horizontalLineToRelative(2.046f)
                lineToRelative(2.064f, 5.576f)
                lineToRelative(-0.007f, -5.575f)
                horizontalLineToRelative(2.37f)
                curveToRelative(2.257f, 0.0f, 3.318f, 0.764f, 3.318f, 2.519f)
                curveToRelative(0.0f, 1.575f, -1.09f, 2.514f, -2.936f, 2.514f)
                horizontalLineToRelative(-0.763f)
                lineToRelative(-0.01f, 2.094f)
                lineToRelative(-3.588f, -0.003f)
                lineToRelative(-0.25f, -0.908f)
                curveToRelative(-0.37f, 0.122f, -0.787f, 0.189f, -1.23f, 0.189f)
                curveToRelative(-0.456f, 0.0f, -0.885f, -0.071f, -1.263f, -0.2f)
                lineToRelative(-0.358f, 0.919f)
                lineToRelative(-2.0f, 0.006f)
                lineToRelative(0.09f, -0.462f)
                curveToRelative(-0.029f, 0.025f, -0.057f, 0.05f, -0.087f, 0.074f)
                curveToRelative(-0.535f, 0.43f, -1.208f, 0.629f, -2.037f, 0.644f)
                lineToRelative(-0.213f, 0.002f)
                arcToRelative(5.075f, 5.075f, 0.0f, false, true, -2.581f, -0.675f)
                lineToRelative(0.73f, -1.448f)
                curveToRelative(0.79f, 0.467f, 1.286f, 0.572f, 1.956f, 0.558f)
                curveToRelative(0.347f, -0.007f, 0.598f, -0.07f, 0.761f, -0.239f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, false, 0.156f, -0.369f)
                curveToRelative(0.007f, -0.376f, -0.53f, -0.553f, -1.185f, -0.756f)
                curveToRelative(-0.531f, -0.164f, -1.135f, -0.389f, -1.606f, -0.735f)
                curveToRelative(-0.559f, -0.41f, -0.825f, -0.924f, -0.812f, -1.65f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 0.566f, -1.377f)
                curveToRelative(0.519f, -0.537f, 1.357f, -0.863f, 2.363f, -0.863f)
                close()
                moveTo(13.861f, 9.942f)
                verticalLineToRelative(1.904f)
                horizontalLineToRelative(0.521f)
                curveToRelative(0.694f, 0.0f, 1.247f, -0.23f, 1.248f, -0.964f)
                curveToRelative(0.0f, -0.709f, -0.554f, -0.94f, -1.248f, -0.94f)
                close()
                moveTo(8.774f, 10.709f)
                lineToRelative(-0.748f, 2.362f)
                curveToRelative(0.223f, 0.085f, 0.481f, 0.133f, 0.757f, 0.133f)
                curveToRelative(0.268f, 0.0f, 0.52f, -0.047f, 0.742f, -0.126f)
                lineToRelative(-0.736f, -2.37f)
                close()
            }
        }
        .build()
        return _sap!!
    }

private var _sap: ImageVector? = null
