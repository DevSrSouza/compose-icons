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

public val SimpleIcons.Nubank: ImageVector
    get() {
        if (_nubank != null) {
            return _nubank!!
        }
        _nubank = Builder(name = "Nubank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.208f, 7.88f)
                curveToRelative(0.0f, -2.918f, -3.267f, -4.709f, -5.615f, -4.709f)
                curveToRelative(-1.57f, 0.0f, -2.547f, 0.77f, -2.547f, 2.005f)
                verticalLineToRelative(0.792f)
                horizontalLineToRelative(-0.663f)
                curveTo(1.227f, 5.968f, 0.0f, 7.195f, 0.0f, 8.358f)
                verticalLineToRelative(8.86f)
                curveToRelative(0.0f, 0.457f, 0.371f, 0.828f, 0.828f, 0.828f)
                horizontalLineToRelative(2.154f)
                curveToRelative(0.014f, 0.0f, 0.029f, 0.0f, 0.036f, -0.007f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, 0.792f, -0.827f)
                lineTo(3.81f, 6.732f)
                horizontalLineToRelative(1.798f)
                curveToRelative(0.984f, 0.0f, 1.79f, 0.806f, 1.79f, 1.79f)
                verticalLineToRelative(8.69f)
                curveToRelative(0.0f, 0.456f, 0.371f, 0.827f, 0.828f, 0.827f)
                horizontalLineToRelative(2.155f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, false, 0.827f, -0.827f)
                curveToRelative(0.007f, -3.853f, 0.0f, -9.332f, 0.0f, -9.332f)
                close()
                moveTo(0.978f, 17.283f)
                arcToRelative(0.207f, 0.207f, 0.0f, false, true, -0.207f, -0.207f)
                lineTo(0.771f, 8.365f)
                curveToRelative(0.0f, -0.728f, 0.891f, -1.627f, 1.612f, -1.627f)
                horizontalLineToRelative(0.663f)
                verticalLineToRelative(10.345f)
                arcToRelative(0.207f, 0.207f, 0.0f, false, true, -0.207f, 0.207f)
                lineTo(0.977f, 17.29f)
                close()
                moveTo(10.445f, 17.083f)
                curveToRelative(0.0f, 0.114f, -0.093f, 0.2f, -0.207f, 0.2f)
                horizontalLineToRelative(-1.87f)
                arcToRelative(0.207f, 0.207f, 0.0f, false, true, -0.206f, -0.207f)
                lineTo(8.162f, 8.53f)
                arcTo(2.564f, 2.564f, 0.0f, false, false, 5.6f, 5.968f)
                lineTo(3.81f, 5.968f)
                verticalLineToRelative(-0.792f)
                curveToRelative(0.0f, -0.464f, 0.228f, -1.234f, 1.783f, -1.234f)
                curveToRelative(3.004f, 0.0f, 4.845f, 2.297f, 4.845f, 3.938f)
                curveToRelative(0.007f, 0.0f, 0.007f, 5.35f, 0.007f, 9.203f)
                close()
                moveTo(23.165f, 5.953f)
                horizontalLineToRelative(-2.154f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, false, -0.828f, 0.828f)
                verticalLineToRelative(10.48f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(1.796f, 1.796f, 0.0f, false, true, -1.791f, -1.79f)
                lineTo(16.602f, 6.78f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, false, -0.828f, -0.827f)
                lineTo(13.62f, 5.953f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, false, -0.828f, 0.827f)
                verticalLineToRelative(9.34f)
                curveToRelative(0.0f, 2.917f, 3.267f, 4.708f, 5.615f, 4.708f)
                curveToRelative(1.57f, 0.0f, 2.547f, -0.77f, 2.547f, -2.005f)
                verticalLineToRelative(-0.792f)
                horizontalLineToRelative(0.663f)
                curveToRelative(1.156f, 0.0f, 2.383f, -1.227f, 2.383f, -2.39f)
                verticalLineToRelative(-8.86f)
                arcToRelative(0.839f, 0.839f, 0.0f, false, false, -0.835f, -0.828f)
                close()
                moveTo(20.183f, 18.831f)
                curveToRelative(0.0f, 0.464f, -0.228f, 1.234f, -1.783f, 1.234f)
                curveToRelative(-3.004f, 0.0f, -4.845f, -2.297f, -4.845f, -3.938f)
                curveToRelative(0.0f, 0.0f, -0.007f, -5.322f, 0.0f, -9.203f)
                curveToRelative(0.0f, -0.114f, 0.093f, -0.2f, 0.207f, -0.2f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.114f, 0.0f, 0.206f, 0.093f, 0.206f, 0.207f)
                verticalLineToRelative(8.554f)
                arcToRelative(2.564f, 2.564f, 0.0f, false, false, 2.562f, 2.561f)
                horizontalLineToRelative(1.79f)
                close()
                moveTo(23.229f, 15.642f)
                curveToRelative(0.0f, 0.728f, -0.891f, 1.627f, -1.612f, 1.627f)
                horizontalLineToRelative(-0.663f)
                lineTo(20.954f, 6.924f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.207f, -0.2f)
                horizontalLineToRelative(1.869f)
                curveToRelative(0.114f, 0.0f, 0.207f, 0.093f, 0.207f, 0.207f)
                verticalLineToRelative(8.711f)
                close()
            }
        }
        .build()
        return _nubank!!
    }

private var _nubank: ImageVector? = null
