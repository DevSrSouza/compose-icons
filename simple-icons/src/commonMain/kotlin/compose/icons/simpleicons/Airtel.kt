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

public val SimpleIcons.Airtel: ImageVector
    get() {
        if (_airtel != null) {
            return _airtel!!
        }
        _airtel = Builder(name = "Airtel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.137f, 23.862f)
                curveToRelative(0.79f, 0.0f, 1.708f, -0.19f, 2.751f, -0.554f)
                curveToRelative(1.55f, -0.538f, 2.784f, -1.281f, 3.986f, -2.009f)
                lineToRelative(0.316f, -0.205f)
                arcToRelative(29.733f, 29.733f, 0.0f, false, false, 3.764f, -2.72f)
                arcToRelative(16.574f, 16.574f, 0.0f, false, false, 5.457f, -7.529f)
                curveToRelative(0.395f, -1.138f, 0.949f, -3.384f, 0.268f, -5.487f)
                arcToRelative(7.117f, 7.117f, 0.0f, false, false, -2.862f, -3.749f)
                curveToRelative(-0.158f, -0.126f, -1.898f, -1.47f, -5.203f, -1.47f)
                curveToRelative(-3.005f, 0.0f, -6.31f, 1.107f, -9.806f, 3.32f)
                lineToRelative(-0.11f, 0.08f)
                lineToRelative(-0.317f, 0.205f)
                arcToRelative(20.133f, 20.133f, 0.0f, false, false, -2.309f, 1.693f)
                curveTo(1.585f, 6.813f, -0.091f, 9.106f, 0.004f, 11.067f)
                curveToRelative(0.031f, 0.79f, 0.427f, 1.534f, 1.075f, 2.008f)
                arcToRelative(3.472f, 3.472f, 0.0f, false, false, 2.214f, 0.68f)
                curveToRelative(1.803f, 0.0f, 3.765f, -0.948f, 5.109f, -1.74f)
                lineToRelative(0.253f, -0.157f)
                lineToRelative(0.696f, -0.443f)
                lineToRelative(0.237f, -0.158f)
                curveToRelative(1.898f, -1.234f, 3.875f, -2.515f, 6.105f, -3.258f)
                arcToRelative(5.255f, 5.255f, 0.0f, false, true, 1.55f, -0.285f)
                arcToRelative(3.163f, 3.163f, 0.0f, false, true, 0.664f, 0.08f)
                arcToRelative(2.112f, 2.112f, 0.0f, false, true, 1.47f, 1.106f)
                curveToRelative(0.523f, 1.012f, 0.396f, 2.61f, -0.316f, 4.08f)
                arcToRelative(17.871f, 17.871f, 0.0f, false, true, -4.887f, 5.836f)
                arcToRelative(19.488f, 19.488f, 0.0f, false, true, -3.194f, 2.215f)
                lineToRelative(-0.095f, 0.031f)
                arcToRelative(9.634f, 9.634f, 0.0f, false, true, -1.471f, 0.696f)
                lineToRelative(-0.08f, 0.032f)
                lineToRelative(-0.41f, 0.158f)
                curveToRelative(-2.23f, 0.57f, -0.87f, -1.329f, -0.87f, -1.329f)
                curveToRelative(0.474f, -0.537f, 0.98f, -1.028f, 1.518f, -1.502f)
                curveToRelative(0.316f, -0.269f, 0.633f, -0.554f, 0.933f, -0.854f)
                lineToRelative(0.064f, -0.063f)
                curveToRelative(0.395f, -0.38f, 0.933f, -0.902f, 0.901f, -1.645f)
                curveToRelative(-0.047f, -0.98f, -1.075f, -1.582f, -2.056f, -1.613f)
                horizontalLineToRelative(-0.063f)
                curveToRelative(-0.95f, 0.0f, -1.819f, 0.522f, -2.404f, 0.98f)
                arcToRelative(7.27f, 7.27f, 0.0f, false, false, -1.598f, 1.74f)
                curveToRelative(-0.6f, 0.901f, -1.85f, 3.226f, -0.632f, 5.077f)
                curveToRelative(0.49f, 0.743f, 1.313f, 1.123f, 2.42f, 1.123f)
                close()
            }
        }
        .build()
        return _airtel!!
    }

private var _airtel: ImageVector? = null
