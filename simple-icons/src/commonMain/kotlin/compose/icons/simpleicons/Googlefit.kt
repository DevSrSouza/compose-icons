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

public val SimpleIcons.Googlefit: ImageVector
    get() {
        if (_googlefit != null) {
            return _googlefit!!
        }
        _googlefit = Builder(name = "Googlefit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.218f, 4.868f)
                curveToRelative(-1.235f, -2.194f, -3.927f, -3.356f, -6.378f, -2.843f)
                curveToRelative(-1.11f, 0.243f, -2.173f, 0.774f, -2.979f, 1.583f)
                curveToRelative(-0.622f, 0.613f, -1.242f, 1.229f, -1.864f, 1.841f)
                curveToRelative(-0.915f, -0.91f, -1.788f, -1.937f, -2.882f, -2.648f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, false, -3.904f, -0.845f)
                curveToRelative(-4.757f, 0.578f, -6.936f, 6.346f, -3.615f, 9.85f)
                curveToRelative(3.481f, 3.418f, 6.937f, 6.863f, 10.413f, 10.288f)
                curveToRelative(3.291f, -3.251f, 6.573f, -6.51f, 9.871f, -9.752f)
                curveToRelative(2.132f, -1.831f, 2.8f, -5.026f, 1.338f, -7.474f)
                close()
                moveTo(6.162f, 11.223f)
                curveToRelative(-0.692f, -0.755f, -1.511f, -1.404f, -2.141f, -2.208f)
                curveToRelative(-0.821f, -1.218f, -0.158f, -3.012f, 1.26f, -3.397f)
                curveToRelative(0.781f, -0.256f, 1.683f, -0.031f, 2.279f, 0.527f)
                curveToRelative(0.627f, 0.609f, 1.236f, 1.237f, 1.866f, 1.843f)
                lineToRelative(0.005f, 0.006f)
                arcToRelative(414.706f, 414.706f, 0.0f, false, false, -3.269f, 3.229f)
                close()
                moveTo(12.008f, 16.981f)
                arcToRelative(3300.079f, 3300.079f, 0.0f, false, true, -3.255f, -3.22f)
                curveToRelative(2.555f, -2.516f, 5.103f, -5.042f, 7.65f, -7.566f)
                curveToRelative(0.393f, -0.394f, 0.93f, -0.646f, 1.487f, -0.673f)
                curveToRelative(2.086f, -0.154f, 3.285f, 2.372f, 1.801f, 3.866f)
                curveToRelative(-2.549f, 2.542f, -5.121f, 5.062f, -7.683f, 7.593f)
                close()
            }
        }
        .build()
        return _googlefit!!
    }

private var _googlefit: ImageVector? = null
