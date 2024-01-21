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

public val SimpleIcons.Icon: ImageVector
    get() {
        if (_icon != null) {
            return _icon!!
        }
        _icon = Builder(name = "Icon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9267f, 23.9346f)
                curveToRelative(-0.9375f, -0.1776f, -1.7044f, -0.9446f, -1.8822f, -1.8824f)
                curveToRelative(-0.3199f, -1.6878f, 1.1324f, -3.1401f, 2.8202f, -2.8202f)
                curveToRelative(0.9375f, 0.1778f, 1.7046f, 0.9446f, 1.8824f, 1.8822f)
                curveToRelative(0.3199f, 1.688f, -1.1324f, 3.1403f, -2.8204f, 2.8204f)
                close()
                moveTo(21.1351f, 4.7681f)
                curveToRelative(-0.9375f, -0.1778f, -1.7046f, -0.9446f, -1.8824f, -1.8824f)
                curveToRelative(-0.3199f, -1.6881f, 1.1328f, -3.1403f, 2.8207f, -2.8202f)
                curveToRelative(0.9378f, 0.178f, 1.7044f, 0.9449f, 1.8822f, 1.8824f)
                curveToRelative(0.3199f, 1.6878f, -1.1326f, 3.1401f, -2.8204f, 2.8202f)
                close()
                moveTo(12.0209f, 6.0103f)
                curveToRelative(1.1475f, 0.0f, 2.2191f, 0.3235f, 3.1302f, 0.8829f)
                lineToRelative(2.5854f, -2.5856f)
                curveToRelative(-1.5958f, -1.1877f, -3.5735f, -1.8909f, -5.7155f, -1.8909f)
                curveToRelative(-5.2928f, 0.0f, -9.5835f, 4.2905f, -9.5835f, 9.5832f)
                curveToRelative(0.0f, 2.1423f, 0.7032f, 4.12f, 1.8912f, 5.7158f)
                lineToRelative(2.5854f, -2.5854f)
                curveToRelative(-0.5594f, -0.9111f, -0.8827f, -1.9829f, -0.8827f, -3.1304f)
                curveToRelative(0.0f, -3.308f, 2.6816f, -5.9896f, 5.9896f, -5.9896f)
                close()
                moveTo(17.1276f, 8.8697f)
                curveToRelative(0.5597f, 0.9111f, 0.8829f, 1.9827f, 0.8829f, 3.1302f)
                curveToRelative(0.0f, 3.308f, -2.6816f, 5.9896f, -5.9896f, 5.9896f)
                curveToRelative(-1.1475f, 0.0f, -2.2194f, -0.323f, -3.1304f, -0.8827f)
                lineTo(6.3051f, 19.6922f)
                curveToRelative(1.5958f, 1.1879f, 3.5735f, 1.8911f, 5.7158f, 1.8911f)
                curveToRelative(5.2928f, 0.0f, 9.5832f, -4.2905f, 9.5832f, -9.5835f)
                curveToRelative(0.0f, -2.1423f, -0.7035f, -4.1197f, -1.8909f, -5.7158f)
                close()
            }
        }
        .build()
        return _icon!!
    }

private var _icon: ImageVector? = null
