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

public val SimpleIcons.Hcl: ImageVector
    get() {
        if (_hcl != null) {
            return _hcl!!
        }
        _hcl = Builder(name = "Hcl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3968f, 10.4013f)
                lineToRelative(-1.0971f, 2.4399f)
                lineTo(24.0f, 12.8412f)
                lineToRelative(-0.3435f, 0.7629f)
                lineTo(17.294f, 13.6041f)
                lineToRelative(1.4331f, -3.2028f)
                close()
                moveTo(14.9983f, 11.4909f)
                horizontalLineToRelative(2.4633f)
                curveToRelative(-0.0152f, -0.5377f, -0.5358f, -0.911f, -1.5672f, -1.0592f)
                curveToRelative(-2.0348f, -0.2994f, -4.2354f, -0.1718f, -5.802f, 0.6934f)
                curveToRelative(-1.2346f, 0.6859f, -1.329f, 1.7176f, -0.099f, 2.2232f)
                curveToRelative(1.0357f, 0.4218f, 3.2106f, 0.4656f, 4.767f, 0.201f)
                curveToRelative(1.0077f, -0.1712f, 1.7776f, -0.502f, 2.2093f, -0.9974f)
                lineTo(14.454f, 12.5519f)
                curveToRelative(-0.3262f, 0.251f, -0.7526f, 0.376f, -1.25f, 0.3804f)
                curveToRelative(-1.4124f, 0.0094f, -1.5988f, -0.4182f, -1.3525f, -0.9106f)
                curveToRelative(0.293f, -0.5801f, 0.9075f, -0.8966f, 1.8447f, -0.9216f)
                curveToRelative(0.7381f, -0.0199f, 1.1029f, 0.1436f, 1.3021f, 0.3908f)
                moveTo(0.0f, 13.6067f)
                horizontalLineToRelative(2.604f)
                lineToRelative(0.5578f, -1.2789f)
                horizontalLineToRelative(2.553f)
                lineToRelative(-0.5732f, 1.2771f)
                horizontalLineToRelative(2.635f)
                lineToRelative(1.4457f, -3.2031f)
                horizontalLineToRelative(-2.653f)
                lineToRelative(-0.4769f, 1.0807f)
                lineTo(3.5421f, 11.4825f)
                lineToRelative(0.4831f, -1.0807f)
                lineToRelative(-2.5781f, -6.0E-4f)
                close()
            }
        }
        .build()
        return _hcl!!
    }

private var _hcl: ImageVector? = null
