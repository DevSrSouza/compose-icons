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

public val SimpleIcons.Pingdom: ImageVector
    get() {
        if (_pingdom != null) {
            return _pingdom!!
        }
        _pingdom = Builder(name = "Pingdom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.96f, 17.804f)
                lineToRelative(7.959f, -3.396f)
                lineToRelative(-7.049f, 7.241f)
                curveToRelative(-0.124f, -1.315f, -0.432f, -2.61f, -0.91f, -3.844f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(24.0f, 11.118f)
                curveToRelative(-5.101f, -0.236f, -10.208f, 0.414f, -15.087f, 1.92f)
                curveToRelative(1.024f, 1.073f, 1.881f, 2.292f, 2.535f, 3.621f)
                curveToRelative(4.042f, -2.25f, 9.646f, -5.123f, 12.552f, -5.531f)
                verticalLineToRelative(-0.015f)
                verticalLineToRelative(0.005f)
                close()
                moveTo(11.426f, 11.393f)
                lineToRelative(0.207f, -0.06f)
                curveToRelative(1.538f, -0.459f, 3.049f, -1.015f, 4.523f, -1.656f)
                curveToRelative(1.492f, -0.585f, 2.896f, -1.38f, 4.159f, -2.367f)
                curveToRelative(1.345f, -1.069f, 2.355f, -2.499f, 2.915f, -4.122f)
                curveToRelative(0.12f, -0.267f, 0.211f, -0.549f, 0.267f, -0.837f)
                curveToRelative(-2.024f, 2.76f, -10.041f, 3.048f, -10.041f, 3.048f)
                lineToRelative(1.89f, -1.734f)
                curveTo(9.84f, 3.684f, 4.47f, 5.424f, 0.0f, 8.645f)
                curveToRelative(3.03f, 0.322f, 5.877f, 1.596f, 8.139f, 3.634f)
                curveToRelative(1.086f, -0.336f, 2.196f, -0.576f, 3.286f, -0.879f)
                verticalLineToRelative(-0.006f)
                lineToRelative(0.001f, -0.001f)
                close()
            }
        }
        .build()
        return _pingdom!!
    }

private var _pingdom: ImageVector? = null
