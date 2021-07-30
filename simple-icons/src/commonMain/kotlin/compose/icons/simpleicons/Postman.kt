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

public val SimpleIcons.Postman: ImageVector
    get() {
        if (_postman != null) {
            return _postman!!
        }
        _postman = Builder(name = "Postman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.527f, 0.099f)
                curveTo(6.955f, -0.744f, 0.942f, 3.9f, 0.099f, 10.473f)
                curveToRelative(-0.843f, 6.572f, 3.8f, 12.584f, 10.373f, 13.428f)
                curveToRelative(6.573f, 0.843f, 12.587f, -3.801f, 13.428f, -10.374f)
                curveTo(24.744f, 6.955f, 20.101f, 0.943f, 13.527f, 0.099f)
                close()
                moveTo(15.998f, 7.584f)
                arcToRelative(0.855f, 0.855f, 0.0f, false, false, -0.593f, 0.25f)
                lineToRelative(-4.453f, 4.453f)
                lineToRelative(-0.307f, -0.307f)
                lineToRelative(-0.643f, -0.643f)
                curveToRelative(4.389f, -4.376f, 5.18f, -4.418f, 5.996f, -3.753f)
                close()
                moveTo(11.135f, 12.445f)
                lineToRelative(4.44f, -4.44f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, true, 0.847f, 0.903f)
                lineToRelative(-4.699f, 4.125f)
                lineToRelative(-0.588f, -0.588f)
                close()
                moveTo(11.465f, 13.139f)
                lineToRelative(-1.1f, 0.238f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, true, -0.067f, -0.032f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, true, 0.01f, -0.073f)
                lineToRelative(0.645f, -0.645f)
                lineToRelative(0.512f, 0.512f)
                close()
                moveTo(8.662f, 12.68f)
                lineToRelative(1.172f, -1.172f)
                lineToRelative(0.879f, 0.878f)
                lineToRelative(-1.979f, 0.426f)
                arcToRelative(0.074f, 0.074f, 0.0f, false, true, -0.085f, -0.039f)
                arcToRelative(0.072f, 0.072f, 0.0f, false, true, 0.013f, -0.093f)
                close()
                moveTo(5.016f, 18.738f)
                arcToRelative(0.076f, 0.076f, 0.0f, false, true, -0.069f, -0.083f)
                arcToRelative(0.077f, 0.077f, 0.0f, false, true, 0.022f, -0.046f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.946f, -0.946f)
                lineToRelative(1.222f, 1.222f)
                lineToRelative(-2.123f, -0.147f)
                close()
                moveTo(7.441f, 17.482f)
                arcToRelative(0.228f, 0.228f, 0.0f, false, false, -0.117f, 0.256f)
                lineToRelative(0.203f, 0.865f)
                arcToRelative(0.125f, 0.125f, 0.0f, false, true, -0.211f, 0.117f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(-0.934f, -0.934f)
                lineToRelative(-0.294f, -0.295f)
                lineToRelative(3.762f, -3.758f)
                lineToRelative(1.82f, -0.393f)
                lineToRelative(0.874f, 0.874f)
                curveToRelative(-1.255f, 1.102f, -2.971f, 2.201f, -5.1f, 3.268f)
                close()
                moveTo(12.72f, 14.054f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.839f, -0.839f)
                lineToRelative(4.699f, -4.125f)
                arcToRelative(0.952f, 0.952f, 0.0f, false, false, 0.119f, -0.127f)
                curveToRelative(-0.148f, 1.345f, -2.029f, 3.245f, -3.977f, 5.091f)
                close()
                moveTo(16.377f, 7.594f)
                lineToRelative(-0.003f, -0.002f)
                arcToRelative(1.822f, 1.822f, 0.0f, false, true, 2.459f, -2.684f)
                lineToRelative(-1.61f, 1.613f)
                arcToRelative(0.119f, 0.119f, 0.0f, false, false, 0.0f, 0.169f)
                lineToRelative(1.247f, 1.247f)
                arcToRelative(1.817f, 1.817f, 0.0f, false, true, -2.093f, -0.343f)
                close()
                moveTo(18.955f, 7.594f)
                arcToRelative(1.714f, 1.714f, 0.0f, false, true, -0.271f, 0.218f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-1.207f, -1.207f)
                lineToRelative(1.533f, -1.533f)
                curveToRelative(0.661f, 0.72f, 0.637f, 1.832f, -0.054f, 2.522f)
                close()
                moveTo(18.855f, 6.05f)
                arcToRelative(0.143f, 0.143f, 0.0f, false, false, -0.053f, 0.157f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, true, -0.053f, 0.45f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, 0.023f, 0.197f)
                arcToRelative(0.141f, 0.141f, 0.0f, false, false, 0.084f, 0.03f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, 0.106f, -0.05f)
                arcToRelative(0.691f, 0.691f, 0.0f, false, false, 0.087f, -0.751f)
                arcToRelative(0.138f, 0.138f, 0.0f, false, false, -0.194f, -0.033f)
                close()
            }
        }
        .build()
        return _postman!!
    }

private var _postman: ImageVector? = null
