package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Wechat2Fill: ImageVector
    get() {
        if (_wechat2Fill != null) {
            return _wechat2Fill!!
        }
        _wechat2Fill = Builder(name = "Wechat2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.457f, 18.185f)
                curveTo(3.358f, 16.677f, 2.0f, 14.4f, 2.0f, 11.908f)
                curveTo(2.0f, 7.323f, 6.475f, 3.6f, 12.0f, 3.6f)
                reflectiveCurveToRelative(10.0f, 3.723f, 10.0f, 8.308f)
                curveToRelative(0.0f, 4.584f, -4.475f, 8.307f, -10.0f, 8.307f)
                arcToRelative(11.36f, 11.36f, 0.0f, false, true, -3.272f, -0.461f)
                curveToRelative(-0.092f, -0.03f, -0.216f, -0.03f, -0.308f, -0.03f)
                curveToRelative(-0.185f, 0.0f, -0.37f, 0.06f, -0.525f, 0.153f)
                lineToRelative(-2.191f, 1.261f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.185f, 0.062f)
                arcToRelative(0.342f, 0.342f, 0.0f, false, true, -0.34f, -0.338f)
                curveToRelative(0.0f, -0.093f, 0.03f, -0.154f, 0.062f, -0.247f)
                curveToRelative(0.03f, -0.03f, 0.308f, -1.046f, 0.463f, -1.661f)
                curveToRelative(0.0f, -0.062f, 0.03f, -0.154f, 0.03f, -0.216f)
                curveToRelative(0.0f, -0.246f, -0.092f, -0.43f, -0.277f, -0.553f)
                close()
                moveTo(8.667f, 10.511f)
                curveToRelative(0.717f, 0.0f, 1.285f, -0.568f, 1.285f, -1.285f)
                curveToRelative(0.0f, -0.718f, -0.568f, -1.286f, -1.285f, -1.286f)
                curveToRelative(-0.718f, 0.0f, -1.285f, 0.568f, -1.285f, 1.286f)
                curveToRelative(0.0f, 0.717f, 0.567f, 1.285f, 1.285f, 1.285f)
                close()
                moveTo(15.333f, 10.511f)
                curveToRelative(0.718f, 0.0f, 1.285f, -0.568f, 1.285f, -1.285f)
                curveToRelative(0.0f, -0.718f, -0.567f, -1.286f, -1.285f, -1.286f)
                curveToRelative(-0.717f, 0.0f, -1.285f, 0.568f, -1.285f, 1.286f)
                curveToRelative(0.0f, 0.717f, 0.568f, 1.285f, 1.285f, 1.285f)
                close()
            }
        }
        .build()
        return _wechat2Fill!!
    }

private var _wechat2Fill: ImageVector? = null
