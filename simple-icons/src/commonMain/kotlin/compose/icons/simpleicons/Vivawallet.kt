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

public val SimpleIcons.Vivawallet: ImageVector
    get() {
        if (_vivawallet != null) {
            return _vivawallet!!
        }
        _vivawallet = Builder(name = "Vivawallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.275f, 17.428f)
                curveToRelative(0.376f, 0.777f, 0.949f, 1.223f, 1.572f, 1.228f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.619f, 0.0f, 1.191f, -0.435f, 1.575f, -1.194f)
                lineToRelative(0.504f, -1.08f)
                lineToRelative(-4.9f, -10.387f)
                lineToRelative(-3.388f, 1.58f)
                close()
                moveTo(13.642f, 17.461f)
                curveToRelative(0.382f, 0.76f, 0.957f, 1.195f, 1.575f, 1.195f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.625f, -0.004f, 1.2f, -0.45f, 1.574f, -1.226f)
                lineToRelative(4.567f, -9.852f)
                lineToRelative(-3.389f, -1.581f)
                lineToRelative(-4.844f, 10.381f)
                close()
                moveTo(12.037f, 18.667f)
                curveToRelative(-0.74f, 1.245f, -1.905f, 1.977f, -3.18f, 1.977f)
                horizontalLineToRelative(-0.022f)
                curveToRelative(-1.391f, -0.01f, -2.643f, -0.89f, -3.353f, -2.355f)
                curveTo(3.657f, 14.397f, 1.828f, 10.507f, 0.0f, 6.617f)
                lineToRelative(6.99f, -3.259f)
                lineToRelative(5.039f, 10.683f)
                lineToRelative(4.985f, -10.685f)
                lineTo(24.0f, 6.613f)
                lineTo(18.592f, 18.29f)
                curveToRelative(-0.709f, 1.465f, -1.962f, 2.345f, -3.353f, 2.355f)
                horizontalLineToRelative(-0.022f)
                curveToRelative(-1.275f, 0.0f, -2.442f, -0.732f, -3.18f, -1.977f)
                close()
            }
        }
        .build()
        return _vivawallet!!
    }

private var _vivawallet: ImageVector? = null
