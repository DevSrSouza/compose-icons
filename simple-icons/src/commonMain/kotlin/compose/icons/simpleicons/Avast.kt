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

public val SimpleIcons.Avast: ImageVector
    get() {
        if (_avast != null) {
            return _avast!!
        }
        _avast = Builder(name = "Avast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2941f, 2.991f)
                arcToRelative(3.0286f, 3.0286f, 0.0f, false, true, 4.4499f, 1.2039f)
                lineToRelative(7.0018f, 14.8042f)
                arcToRelative(11.937f, 11.937f, 0.0f, false, false, 2.2539f, -6.9131f)
                curveTo(24.0464f, 5.4569f, 18.7112f, 0.047f, 12.0834f, 4.0E-4f)
                curveTo(5.4556f, -0.0463f, 0.047f, 5.2889f, 4.0E-4f, 11.9167f)
                arcToRelative(11.9356f, 11.9356f, 0.0f, false, false, 2.2213f, 7.0344f)
                lineToRelative(0.2813f, -0.0613f)
                lineToRelative(4.5692f, -1.008f)
                curveToRelative(0.1287f, -0.0286f, 0.1967f, 0.1454f, 0.084f, 0.2127f)
                lineTo(3.3736f, 20.337f)
                arcToRelative(11.9563f, 11.9563f, 0.0f, false, false, 8.5431f, 3.6625f)
                curveToRelative(3.76f, 0.0267f, 7.1258f, -1.68f, 9.3444f, -4.3705f)
                lineTo(9.8095f, 7.5735f)
                arcToRelative(3.0272f, 3.0272f, 0.0f, false, true, 0.4846f, -4.5826f)
                close()
                moveTo(12.4434f, 16.5999f)
                lineTo(5.0703f, 17.2399f)
                arcToRelative(1.302f, 1.302f, 0.0f, true, true, 0.1866f, -2.5666f)
                lineToRelative(7.2031f, 1.6972f)
                curveToRelative(0.1287f, 0.0314f, 0.114f, 0.2174f, -0.0166f, 0.2294f)
                close()
                moveTo(9.03f, 10.116f)
                lineToRelative(8.9404f, 7.2324f)
                curveToRelative(0.102f, 0.0827f, 0.01f, 0.2447f, -0.1133f, 0.198f)
                lineTo(7.1035f, 13.4713f)
                arcToRelative(1.9593f, 1.9593f, 0.0f, true, true, 1.9266f, -3.3552f)
                close()
            }
        }
        .build()
        return _avast!!
    }

private var _avast: ImageVector? = null
