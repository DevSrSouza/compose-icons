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

public val SimpleIcons.Jet: ImageVector
    get() {
        if (_jet != null) {
            return _jet!!
        }
        _jet = Builder(name = "Jet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.778f, 19.044f)
                curveToRelative(3.048f, -0.498f, 4.755f, -0.73f, 8.219f, -2.395f)
                lineTo(24.0f, 13.81f)
                curveToRelative(-3.228f, 3.225f, -9.249f, 5.146f, -15.07f, 5.098f)
                curveToRelative(-0.75f, -0.01f, -1.948f, 0.017f, -2.246f, -0.024f)
                curveToRelative(3.1f, 0.49f, 6.18f, 0.556f, 9.094f, 0.159f)
                moveTo(3.836f, 15.764f)
                curveToRelative(0.75f, 0.003f, 1.805f, -0.014f, 2.403f, -0.394f)
                curveToRelative(0.535f, -0.467f, 0.93f, -1.106f, 1.247f, -1.828f)
                lineToRelative(1.545f, -4.697f)
                lineToRelative(-2.157f, 0.013f)
                lineToRelative(-1.199f, 3.664f)
                curveToRelative(-0.225f, 1.161f, -0.943f, 1.566f, -1.483f, 1.483f)
                lineToRelative(-1.354f, -0.097f)
                lineToRelative(-0.515f, 1.676f)
                lineToRelative(1.513f, 0.18f)
                moveToRelative(13.29f, -0.104f)
                lineToRelative(1.672f, -5.074f)
                horizontalLineToRelative(2.44f)
                lineToRelative(0.543f, -1.665f)
                lineToRelative(-5.907f, -0.01f)
                lineToRelative(-0.556f, 1.662f)
                horizontalLineTo(16.6f)
                lineToRelative(-1.73f, 5.077f)
                lineToRelative(2.257f, 0.01f)
                moveToRelative(-3.859f, -0.024f)
                lineToRelative(0.564f, -1.718f)
                horizontalLineToRelative(-3.204f)
                lineToRelative(0.297f, -0.909f)
                horizontalLineToRelative(2.668f)
                lineToRelative(0.543f, -1.641f)
                horizontalLineToRelative(-2.661f)
                lineToRelative(0.262f, -0.81f)
                horizontalLineToRelative(3.08f)
                lineToRelative(0.57f, -1.713f)
                lineToRelative(-5.267f, 0.027f)
                lineToRelative(-2.205f, 6.757f)
                lineToRelative(5.353f, 0.007f)
                moveToRelative(1.245f, -9.809f)
                curveToRelative(1.883f, -0.072f, 3.743f, 0.083f, 5.969f, 0.277f)
                curveToRelative(-2.192f, -0.809f, -5.7f, -1.407f, -8.344f, -1.407f)
                curveToRelative(-4.344f, 0.0f, -8.644f, 1.054f, -12.117f, 2.675f)
                lineTo(0.0f, 11.07f)
                curveToRelative(3.321f, -3.387f, 9.114f, -5.298f, 14.513f, -5.243f)
            }
        }
        .build()
        return _jet!!
    }

private var _jet: ImageVector? = null
