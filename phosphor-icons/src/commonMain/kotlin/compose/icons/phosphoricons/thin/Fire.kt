package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.3f, 148.6f)
                arcToRelative(55.6f, 55.6f, 0.0f, false, true, -46.7f, 46.7f)
                lineTo(136.0f, 195.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.6f, -8.0f)
                arcToRelative(47.7f, 47.7f, 0.0f, false, false, 40.0f, -40.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 180.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 183.3f, 148.6f)
                close()
                moveTo(216.0f, 140.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -176.0f, 0.0f)
                curveToRelative(0.0f, -22.3f, 9.7f, -48.1f, 28.7f, -76.9f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.5f, -1.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 3.1f, 0.6f)
                lineToRelative(36.1f, 24.1f)
                lineToRelative(32.8f, -68.9f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.9f, -2.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.5f, 1.1f)
                curveTo(184.1f, 50.4f, 216.0f, 89.3f, 216.0f, 140.0f)
                close()
                moveTo(208.0f, 140.0f)
                curveToRelative(0.0f, -45.9f, -28.3f, -82.1f, -60.0f, -114.3f)
                lineToRelative(-32.4f, 68.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.5f, 2.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -3.3f, -0.6f)
                lineTo(73.2f, 70.9f)
                curveTo(56.5f, 96.9f, 48.0f, 120.2f, 48.0f, 140.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
