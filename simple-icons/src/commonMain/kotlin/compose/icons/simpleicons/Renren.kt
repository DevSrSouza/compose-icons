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

public val SimpleIcons.Renren: ImageVector
    get() {
        if (_renren != null) {
            return _renren!!
        }
        _renren = Builder(name = "Renren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.66f, 9.553f)
                lineTo(5.66f, 5.2542f)
                arcToRelative(6.7943f, 6.7943f, 0.0f, false, false, -4.0537f, 11.0861f)
                curveTo(3.9847f, 15.1881f, 5.648f, 12.5846f, 5.66f, 9.553f)
                close()
                moveTo(6.7923f, 13.6678f)
                curveToRelative(-0.4231f, 1.7523f, -1.6874f, 3.2496f, -3.2626f, 4.2448f)
                arcToRelative(6.7603f, 6.7603f, 0.0f, false, false, 3.2616f, 0.8332f)
                arcToRelative(6.7723f, 6.7723f, 0.0f, false, false, 3.2626f, -0.8332f)
                curveToRelative(-1.5753f, -0.9952f, -2.8386f, -2.4935f, -3.2616f, -4.2448f)
                close()
                moveTo(11.9773f, 7.5647f)
                arcToRelative(6.7903f, 6.7903f, 0.0f, false, false, -4.0528f, -2.3105f)
                lineTo(7.9245f, 9.52f)
                curveToRelative(0.0f, 3.0446f, 1.6663f, 5.663f, 4.0517f, 6.8183f)
                arcToRelative(6.7673f, 6.7673f, 0.0f, false, true, -1.6073f, -4.3868f)
                arcToRelative(6.7553f, 6.7553f, 0.0f, false, true, 1.6083f, -4.3868f)
                close()
                moveTo(11.9773f, 7.5647f)
                curveToRelative(1.0031f, 1.1832f, 1.6552f, 2.7145f, 1.6552f, 4.3878f)
                curveToRelative(0.0f, 1.6733f, -0.652f, 3.2026f, -1.6553f, 4.3878f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(0.001f, 0.001f)
                curveToRelative(2.3785f, -1.1512f, 4.0878f, -3.7557f, 4.0998f, -6.7873f)
                lineTo(16.077f, 5.2542f)
                arcToRelative(6.9013f, 6.9013f, 0.0f, false, false, -4.0998f, 2.3105f)
                close()
                moveTo(18.3413f, 9.52f)
                curveToRelative(0.0f, 3.0456f, 1.6663f, 5.663f, 4.0528f, 6.8193f)
                arcToRelative(6.7933f, 6.7933f, 0.0f, false, false, -4.0528f, -11.084f)
                close()
                moveTo(17.2091f, 13.6678f)
                curveToRelative(-0.423f, 1.7523f, -1.6873f, 3.2496f, -3.2626f, 4.2448f)
                arcToRelative(6.7603f, 6.7603f, 0.0f, false, false, 3.2616f, 0.8332f)
                arcToRelative(6.7723f, 6.7723f, 0.0f, false, false, 3.2626f, -0.8332f)
                curveToRelative(-1.5743f, -0.9952f, -2.8385f, -2.4935f, -3.2616f, -4.2448f)
                close()
            }
        }
        .build()
        return _renren!!
    }

private var _renren: ImageVector? = null
