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

public val SimpleIcons.Overleaf: ImageVector
    get() {
        if (_overleaf != null) {
            return _overleaf!!
        }
        _overleaf = Builder(name = "Overleaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3515f, 0.7484f)
                curveTo(19.1109f, -0.5101f, 7.365f, -0.982f, 7.3452f, 6.0266f)
                curveToRelative(-3.4272f, 2.194f, -5.6967f, 5.768f, -5.6967f, 9.598f)
                arcToRelative(8.373f, 8.373f, 0.0f, false, false, 13.1225f, 6.898f)
                arcToRelative(8.373f, 8.373f, 0.0f, false, false, -1.7668f, -14.7194f)
                curveToRelative(-0.6062f, -0.2339f, -1.9234f, -0.6481f, -2.9753f, -0.559f)
                curveToRelative(-1.5007f, 0.9544f, -3.3308f, 2.9155f, -4.1949f, 4.8693f)
                curveToRelative(2.5894f, -3.082f, 7.5046f, -2.425f, 9.1937f, 1.2287f)
                curveToRelative(1.6892f, 3.6538f, -0.9944f, 7.8237f, -5.0198f, 7.7998f)
                arcToRelative(5.4995f, 5.4995f, 0.0f, false, true, -4.1949f, -1.9328f)
                curveToRelative(-1.485f, -1.7483f, -1.8678f, -3.6444f, -1.5615f, -5.4975f)
                curveToRelative(1.057f, -6.4947f, 8.759f, -10.1894f, 14.486f, -11.6094f)
                curveToRelative(-1.8677f, 0.989f, -5.2373f, 2.6134f, -7.5948f, 4.3837f)
                curveTo(18.015f, 9.1382f, 19.1308f, 3.345f, 22.3515f, 0.7484f)
                close()
            }
        }
        .build()
        return _overleaf!!
    }

private var _overleaf: ImageVector? = null
