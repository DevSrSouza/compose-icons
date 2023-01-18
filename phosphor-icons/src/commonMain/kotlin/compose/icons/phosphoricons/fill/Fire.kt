package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.1f, 66.6f)
                curveToRelative(-13.0f, -20.8f, -29.9f, -38.7f, -44.6f, -53.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.0f, -2.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -5.9f, 4.4f)
                lineTo(108.7f, 80.2f)
                lineTo(76.5f, 58.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -6.0f, -1.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.1f, 3.4f)
                curveTo(45.9f, 90.3f, 36.0f, 116.9f, 36.0f, 140.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 115.1f, 212.5f, 91.1f, 197.1f, 66.6f)
                close()
                moveTo(187.3f, 149.2f)
                arcToRelative(59.6f, 59.6f, 0.0f, false, true, -50.1f, 50.1f)
                lineTo(136.0f, 199.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.2f, -15.9f)
                arcToRelative(44.4f, 44.4f, 0.0f, false, false, 36.7f, -36.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.8f, 2.4f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
