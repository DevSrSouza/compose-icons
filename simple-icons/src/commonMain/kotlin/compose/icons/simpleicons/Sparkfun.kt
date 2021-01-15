package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Sparkfun: ImageVector
    get() {
        if (_sparkfun != null) {
            return _sparkfun!!
        }
        _sparkfun = Builder(name = "Sparkfun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0532f, 3.8362f)
                reflectiveCurveToRelative(0.34f, 1.4413f, -0.7462f, 1.6403f)
                curveToRelative(-0.7541f, 0.133f, -1.9733f, -0.6171f, -2.5864f, -1.3632f)
                curveToRelative(-0.7582f, -0.9222f, -0.6602f, -1.6493f, -0.075f, -2.2905f)
                curveToRelative(0.8831f, -0.9802f, 2.3994f, -0.6f, 2.3994f, -0.6f)
                reflectiveCurveToRelative(-2.7745f, -2.4305f, -5.661f, -0.4382f)
                curveToRelative(-2.5706f, 1.7704f, -1.8324f, 4.1808f, 0.488f, 6.2862f)
                curveToRelative(2.0904f, 1.9024f, 0.4221f, 3.9888f, -1.6883f, 3.7197f)
                curveToRelative(-1.4403f, -0.184f, -2.0304f, -1.3442f, -1.6873f, -2.0554f)
                curveToRelative(0.3f, -0.61f, 1.3362f, -0.9842f, 1.3362f, -0.9842f)
                reflectiveCurveToRelative(-1.1912f, -0.48f, -2.5905f, 0.046f)
                curveTo(4.98f, 8.27f, 3.9447f, 9.3093f, 4.0267f, 11.9198f)
                lineTo(4.0267f, 24.0f)
                reflectiveCurveToRelative(1.3013f, -1.6023f, 2.8326f, -3.2356f)
                curveToRelative(1.7113f, -1.8404f, 2.4924f, -3.0826f, 4.2508f, -2.9376f)
                curveToRelative(3.3286f, 0.207f, 5.736f, -1.2742f, 7.3723f, -3.6456f)
                curveToRelative(3.1416f, -4.5629f, 0.6802f, -9.6619f, -1.4302f, -10.345f)
                close()
                moveTo(17.0532f, 3.8362f)
            }
        }
        .build()
        return _sparkfun!!
    }

private var _sparkfun: ImageVector? = null
