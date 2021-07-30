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

public val SimpleIcons.Nodemon: ImageVector
    get() {
        if (_nodemon != null) {
            return _nodemon!!
        }
        _nodemon = Builder(name = "Nodemon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.33f, 7.851f)
                lineToRelative(-0.716f, -0.398f)
                curveToRelative(1.101f, -1.569f, 1.758f, -3.927f, 0.934f, -7.453f)
                curveToRelative(0.0f, 0.0f, -1.857f, 5.029f, -5.59f, 4.863f)
                lineToRelative(-4.37f, -2.431f)
                arcToRelative(1.171f, 1.171f, 0.0f, false, false, -0.536f, -0.15f)
                horizontalLineToRelative(-0.101f)
                arcToRelative(1.183f, 1.183f, 0.0f, false, false, -0.538f, 0.15f)
                lineTo(7.042f, 4.863f)
                curveTo(3.309f, 5.03f, 1.452f, 0.0f, 1.452f, 0.0f)
                curveToRelative(-0.825f, 3.526f, -0.166f, 5.884f, 0.934f, 7.453f)
                lineToRelative(-0.716f, 0.398f)
                arcToRelative(1.133f, 1.133f, 0.0f, false, false, -0.589f, 0.988f)
                lineToRelative(0.022f, 14.591f)
                curveToRelative(0.0f, 0.203f, 0.109f, 0.392f, 0.294f, 0.491f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.584f, 0.0f)
                lineToRelative(5.79f, -3.204f)
                curveToRelative(0.366f, -0.211f, 0.589f, -0.582f, 0.589f, -0.987f)
                verticalLineToRelative(-6.817f)
                curveToRelative(0.0f, -0.406f, 0.223f, -0.783f, 0.588f, -0.984f)
                lineToRelative(2.465f, -1.372f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, true, 0.59f, -0.154f)
                curveToRelative(0.2f, 0.0f, 0.407f, 0.05f, 0.585f, 0.154f)
                lineToRelative(2.465f, 1.372f)
                curveToRelative(0.365f, 0.201f, 0.588f, 0.578f, 0.588f, 0.984f)
                verticalLineToRelative(6.817f)
                curveToRelative(0.0f, 0.405f, 0.226f, 0.779f, 0.59f, 0.987f)
                lineToRelative(5.788f, 3.204f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, 0.589f, 0.0f)
                arcToRelative(0.564f, 0.564f, 0.0f, false, false, 0.292f, -0.491f)
                lineToRelative(0.019f, -14.591f)
                arcToRelative(1.129f, 1.129f, 0.0f, false, false, -0.589f, -0.988f)
                close()
            }
        }
        .build()
        return _nodemon!!
    }

private var _nodemon: ImageVector? = null
