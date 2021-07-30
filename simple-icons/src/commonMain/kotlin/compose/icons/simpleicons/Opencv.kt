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

public val SimpleIcons.Opencv: ImageVector
    get() {
        if (_opencv != null) {
            return _opencv!!
        }
        _opencv = Builder(name = "Opencv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8992f, 0.8525f)
                curveTo(8.735f, 0.8525f, 6.17f, 3.4175f, 6.17f, 6.5817f)
                curveToRelative(0.0f, 2.102f, 1.1321f, 3.9398f, 2.8198f, 4.9366f)
                lineToRelative(1.6412f, -2.7849f)
                curveToRelative(0.0411f, -0.0699f, 0.0176f, -0.1593f, -0.0495f, -0.2048f)
                curveToRelative(-0.6233f, -0.4227f, -1.0328f, -1.137f, -1.0328f, -1.947f)
                curveToRelative(0.0f, -1.298f, 1.0524f, -2.3504f, 2.3505f, -2.3504f)
                curveToRelative(1.2981f, 0.0f, 2.3505f, 1.0524f, 2.3505f, 2.3505f)
                curveToRelative(0.0f, 0.8098f, -0.4095f, 1.5242f, -1.0328f, 1.947f)
                curveToRelative(-0.0671f, 0.0454f, -0.0907f, 0.1348f, -0.0495f, 0.2047f)
                lineToRelative(1.6414f, 2.785f)
                curveToRelative(1.6878f, -0.9969f, 2.8199f, -2.8346f, 2.8199f, -4.9367f)
                curveToRelative(0.0f, -3.1642f, -2.5653f, -5.7292f, -5.7295f, -5.7292f)
                close()
                moveTo(5.7292f, 11.6891f)
                curveTo(2.565f, 11.6891f, 0.0f, 14.2541f, 0.0f, 17.4183f)
                curveToRelative(0.0f, 3.1642f, 2.565f, 5.7292f, 5.7292f, 5.7292f)
                curveToRelative(3.1798f, 0.0f, 5.8074f, -2.6995f, 5.7275f, -5.8762f)
                lineTo(8.2313f, 17.2713f)
                curveToRelative(-0.0847f, 0.0f, -0.1513f, 0.0717f, -0.1519f, 0.1564f)
                curveToRelative(-0.0082f, 1.266f, -1.0644f, 2.3411f, -2.3502f, 2.3411f)
                curveToRelative(-1.2981f, 0.0f, -2.3505f, -1.0524f, -2.3505f, -2.3505f)
                curveToRelative(0.0f, -1.2982f, 1.0524f, -2.3505f, 2.3505f, -2.3505f)
                curveToRelative(0.34f, 0.0f, 0.663f, 0.0724f, 0.9547f, 0.2022f)
                curveToRelative(0.0713f, 0.0318f, 0.1566f, 0.0077f, 0.1962f, -0.0595f)
                lineToRelative(1.6464f, -2.7935f)
                curveToRelative(-0.8273f, -0.4636f, -1.7815f, -0.7279f, -2.7973f, -0.7279f)
                close()
                moveTo(21.1716f, 12.4505f)
                lineToRelative(-1.6366f, 2.7878f)
                curveToRelative(-0.041f, 0.07f, -0.0172f, 0.1594f, 0.05f, 0.2048f)
                curveToRelative(0.624f, 0.4217f, 1.0348f, 1.1354f, 1.0363f, 1.9452f)
                curveToRelative(0.0022f, 1.298f, -1.0483f, 2.352f, -2.3465f, 2.3542f)
                curveToRelative(-1.298f, 0.0023f, -2.3523f, -1.0482f, -2.3545f, -2.3462f)
                curveToRelative(-0.0015f, -0.8098f, 0.4068f, -1.5248f, 1.0294f, -1.9486f)
                curveToRelative(0.067f, -0.0457f, 0.0905f, -0.1353f, 0.0492f, -0.2051f)
                lineToRelative(-1.6464f, -2.7818f)
                curveToRelative(-1.6859f, 0.9998f, -2.8146f, 2.8394f, -2.811f, 4.9415f)
                curveToRelative(0.0056f, 3.1641f, 2.575f, 5.7248f, 5.7393f, 5.7192f)
                curveToRelative(3.1641f, -0.0054f, 5.7246f, -2.575f, 5.7192f, -5.7392f)
                curveToRelative(-0.0037f, -2.1022f, -1.139f, -3.938f, -2.8284f, -4.9318f)
                close()
            }
        }
        .build()
        return _opencv!!
    }

private var _opencv: ImageVector? = null
