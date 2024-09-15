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

public val SimpleIcons.Webrtc: ImageVector
    get() {
        if (_webrtc != null) {
            return _webrtc!!
        }
        _webrtc = Builder(name = "Webrtc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.36f)
                curveToRelative(-2.827f, 0.0f, -5.146f, 2.173f, -5.379f, 4.94f)
                arcToRelative(5.412f, 5.412f, 0.0f, false, false, -1.221f, -0.14f)
                curveTo(2.418f, 5.16f, 0.0f, 7.578f, 0.0f, 10.56f)
                curveToRelative(0.0f, 2.22f, 1.341f, 4.127f, 3.257f, 4.957f)
                arcToRelative(5.373f, 5.373f, 0.0f, false, false, -0.737f, 2.723f)
                curveToRelative(0.0f, 2.982f, 2.418f, 5.4f, 5.4f, 5.4f)
                curveToRelative(1.663f, 0.0f, 3.149f, -0.752f, 4.14f, -1.934f)
                curveToRelative(0.991f, 1.182f, 2.477f, 1.934f, 4.14f, 1.934f)
                curveToRelative(2.983f, 0.0f, 5.4f, -2.418f, 5.4f, -5.4f)
                curveToRelative(0.0f, -0.972f, -0.258f, -1.883f, -0.707f, -2.671f)
                curveTo(22.728f, 14.707f, 24.0f, 12.842f, 24.0f, 10.679f)
                curveToRelative(0.0f, -2.982f, -2.418f, -5.401f, -5.4f, -5.401f)
                curveToRelative(-0.417f, 0.0f, -0.822f, 0.049f, -1.212f, 0.138f)
                curveTo(17.211f, 2.595f, 14.867f, 0.36f, 12.0f, 0.36f)
                close()
                moveTo(6.283f, 7.228f)
                horizontalLineToRelative(10.592f)
                curveToRelative(0.746f, 0.0f, 1.352f, 0.605f, 1.352f, 1.349f)
                verticalLineToRelative(7.646f)
                curveToRelative(0.0f, 0.744f, -0.606f, 1.348f, -1.352f, 1.348f)
                horizontalLineToRelative(-3.609f)
                lineToRelative(-7.24f, 3.549f)
                lineToRelative(1.101f, -3.549f)
                horizontalLineToRelative(-0.845f)
                curveToRelative(-0.746f, 0.0f, -1.352f, -0.604f, -1.352f, -1.348f)
                lineTo(4.931f, 8.577f)
                curveToRelative(0.0f, -0.744f, 0.606f, -1.349f, 1.352f, -1.349f)
                close()
            }
        }
        .build()
        return _webrtc!!
    }

private var _webrtc: ImageVector? = null
