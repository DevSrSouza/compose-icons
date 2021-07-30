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

public val SimpleIcons.Sahibinden: ImageVector
    get() {
        if (_sahibinden != null) {
            return _sahibinden!!
        }
        _sahibinden = Builder(name = "Sahibinden", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(11.517f, 4.723f)
                curveToRelative(0.563f, -0.007f, 1.13f, -0.004f, 1.69f, 0.063f)
                curveToRelative(2.412f, 0.054f, 4.853f, 2.18f, 4.879f, 4.508f)
                horizontalLineToRelative(-3.319f)
                curveToRelative(0.009f, -0.694f, -0.603f, -1.555f, -1.279f, -1.732f)
                curveToRelative(-1.105f, -0.269f, -2.46f, -0.355f, -3.43f, 0.294f)
                curveToRelative(-0.738f, 0.445f, -1.065f, 1.672f, -0.095f, 2.056f)
                curveToRelative(2.288f, 1.083f, 5.158f, 0.846f, 7.224f, 2.372f)
                curveToRelative(1.698f, 1.21f, 1.598f, 3.666f, 0.274f, 5.086f)
                curveToRelative(-1.718f, 1.84f, -4.636f, 2.132f, -7.099f, 1.782f)
                curveToRelative(-2.448f, -0.117f, -4.755f, -2.245f, -4.819f, -4.562f)
                horizontalLineToRelative(3.311f)
                curveToRelative(-0.056f, 0.832f, 0.638f, 1.557f, 1.46f, 1.822f)
                curveToRelative(1.27f, 0.275f, 2.726f, 0.358f, 3.93f, -0.19f)
                curveToRelative(0.96f, -0.323f, 1.024f, -1.544f, 0.284f, -2.103f)
                curveToRelative(-1.595f, -0.897f, -3.565f, -0.924f, -5.297f, -1.518f)
                curveToRelative(-2.012f, -0.39f, -3.643f, -2.278f, -3.26f, -4.197f)
                curveToRelative(0.424f, -2.342f, 3.127f, -3.727f, 5.546f, -3.681f)
                close()
            }
        }
        .build()
        return _sahibinden!!
    }

private var _sahibinden: ImageVector? = null
