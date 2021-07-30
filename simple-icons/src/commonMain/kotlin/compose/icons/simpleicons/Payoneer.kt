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

public val SimpleIcons.Payoneer: ImageVector
    get() {
        if (_payoneer != null) {
            return _payoneer!!
        }
        _payoneer = Builder(name = "Payoneer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.474f, 3.31f)
                curveToRelative(0.234f, 1.802f, 1.035f, 5.642f, 1.398f, 7.263f)
                curveToRelative(0.095f, 0.459f, 0.201f, 0.853f, 0.298f, 1.013f)
                curveToRelative(0.501f, 0.865f, 0.907f, -0.287f, 0.907f, -0.287f)
                curveTo(5.644f, 6.616f, 3.17f, 3.597f, 2.38f, 2.787f)
                curveToRelative(-0.139f, -0.15f, -0.384f, -0.332f, -0.608f, -0.396f)
                curveToRelative(-0.32f, -0.095f, -0.374f, 0.086f, -0.374f, 0.236f)
                curveToRelative(0.01f, 0.148f, 0.065f, 0.565f, 0.075f, 0.682f)
                close()
                moveTo(23.309f, 1.847f)
                curveToRelative(0.31f, 0.224f, 1.386f, 1.355f, 0.0f, 1.526f)
                curveToRelative(-1.984f, 0.234f, -5.76f, 0.373f, -12.022f, 5.61f)
                curveTo(8.92f, 10.968f, 3.607f, 16.311f, 0.76f, 22.957f)
                arcToRelative(0.181f, 0.181f, 0.0f, false, true, -0.216f, 0.106f)
                curveToRelative(-0.255f, -0.074f, -0.714f, -0.352f, -0.48f, -1.418f)
                curveToRelative(0.32f, -1.44f, 3.201f, -8.938f, 10.817f, -15.552f)
                curveToRelative(2.485f, -2.155f, 8.416f, -7.232f, 12.426f, -4.245f)
                close()
            }
        }
        .build()
        return _payoneer!!
    }

private var _payoneer: ImageVector? = null
