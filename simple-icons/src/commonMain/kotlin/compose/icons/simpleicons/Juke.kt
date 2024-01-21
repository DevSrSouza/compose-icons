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

public val SimpleIcons.Juke: ImageVector
    get() {
        if (_juke != null) {
            return _juke!!
        }
        _juke = Builder(name = "Juke", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.965f, 15.778f)
                curveToRelative(-1.947f, 0.0f, -2.751f, -0.929f, -2.751f, -2.58f)
                lineTo(5.214f, 8.409f)
                curveToRelative(0.0f, -0.102f, 0.084f, -0.184f, 0.188f, -0.184f)
                horizontalLineToRelative(1.499f)
                curveToRelative(0.104f, 0.0f, 0.188f, 0.082f, 0.188f, 0.184f)
                verticalLineToRelative(4.82f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, 0.876f, 0.816f)
                curveToRelative(0.466f, 0.0f, 0.85f, -0.358f, 0.876f, -0.816f)
                verticalLineToRelative(-4.82f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, true, 0.188f, -0.185f)
                horizontalLineToRelative(1.498f)
                curveToRelative(0.104f, 0.0f, 0.188f, 0.083f, 0.188f, 0.185f)
                verticalLineToRelative(4.789f)
                curveToRelative(0.0f, 1.652f, -0.805f, 2.58f, -2.751f, 2.58f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(3.47f, 13.118f)
                curveToRelative(0.0f, 1.652f, -0.726f, 2.583f, -2.667f, 2.583f)
                lineTo(0.188f, 15.701f)
                arcTo(0.186f, 0.186f, 0.0f, false, true, 0.0f, 15.516f)
                verticalLineToRelative(-1.367f)
                curveToRelative(0.0f, -0.102f, 0.084f, -0.185f, 0.188f, -0.185f)
                horizontalLineToRelative(0.677f)
                curveToRelative(0.636f, 0.0f, 0.73f, -0.336f, 0.73f, -0.735f)
                lineTo(1.595f, 9.582f)
                arcToRelative(0.397f, 0.397f, 0.0f, false, false, -0.157f, -0.314f)
                lineTo(0.259f, 8.456f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, true, -0.042f, -0.145f)
                arcToRelative(0.133f, 0.133f, 0.0f, false, true, 0.125f, -0.087f)
                horizontalLineToRelative(2.939f)
                curveToRelative(0.104f, 0.0f, 0.188f, 0.083f, 0.188f, 0.185f)
                verticalLineToRelative(4.709f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(14.397f, 13.224f)
                verticalLineToRelative(2.195f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, -0.188f, 0.185f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, -0.183f, -0.18f)
                lineTo(12.526f, 8.409f)
                curveToRelative(0.0f, -0.1f, 0.081f, -0.182f, 0.183f, -0.185f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.104f, 0.0f, 0.188f, 0.083f, 0.188f, 0.185f)
                verticalLineToRelative(2.2f)
                curveToRelative(0.0f, 0.108f, 0.045f, 0.122f, 0.101f, 0.028f)
                lineToRelative(1.323f, -2.251f)
                curveToRelative(0.08f, -0.136f, 0.159f, -0.161f, 0.336f, -0.161f)
                horizontalLineToRelative(1.772f)
                curveToRelative(0.103f, 0.0f, 0.137f, 0.084f, 0.075f, 0.185f)
                lineToRelative(-2.063f, 3.387f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, 0.0f, 0.239f)
                lineToRelative(2.063f, 3.387f)
                curveToRelative(0.057f, 0.101f, 0.028f, 0.185f, -0.075f, 0.185f)
                horizontalLineToRelative(-1.772f)
                curveToRelative(-0.179f, 0.0f, -0.257f, -0.03f, -0.337f, -0.161f)
                lineToRelative(-1.323f, -2.25f)
                curveToRelative(-0.056f, -0.094f, -0.101f, -0.082f, -0.101f, 0.026f)
                lineToRelative(0.001f, 0.001f)
                close()
                moveTo(23.999f, 11.916f)
                arcToRelative(0.157f, 0.157f, 0.0f, false, true, -0.093f, 0.13f)
                lineToRelative(-2.406f, 1.45f)
                arcToRelative(0.102f, 0.102f, 0.0f, false, false, -0.058f, 0.091f)
                curveToRelative(0.0f, 0.039f, 0.023f, 0.074f, 0.057f, 0.091f)
                lineToRelative(2.446f, 1.694f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, true, 0.042f, 0.145f)
                arcToRelative(0.134f, 0.134f, 0.0f, false, true, -0.126f, 0.087f)
                horizontalLineToRelative(-4.299f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, -0.188f, -0.18f)
                lineTo(19.374f, 8.407f)
                curveToRelative(0.0f, -0.102f, 0.084f, -0.185f, 0.188f, -0.185f)
                horizontalLineToRelative(4.305f)
                curveToRelative(0.056f, 0.0f, 0.107f, 0.035f, 0.125f, 0.087f)
                arcToRelative(0.129f, 0.129f, 0.0f, false, true, -0.042f, 0.145f)
                lineToRelative(-2.445f, 1.693f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.0f, 0.182f)
                lineToRelative(2.395f, 1.456f)
                curveToRelative(0.065f, 0.037f, 0.098f, 0.08f, 0.098f, 0.13f)
                lineToRelative(0.001f, 0.001f)
                close()
            }
        }
        .build()
        return _juke!!
    }

private var _juke: ImageVector? = null
