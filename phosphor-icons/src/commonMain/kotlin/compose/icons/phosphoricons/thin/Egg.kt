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

public val ThinGroup.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                curveTo(92.9f, 20.0f, 44.0f, 86.5f, 44.0f, 152.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 86.5f, 163.1f, 20.0f, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -28.5f, 10.0f, -59.7f, 27.3f, -85.8f)
                curveTo(94.8f, 43.0f, 113.9f, 28.0f, 128.0f, 28.0f)
                reflectiveCurveToRelative(33.2f, 15.0f, 48.7f, 38.2f)
                curveTo(194.0f, 92.3f, 204.0f, 123.5f, 204.0f, 152.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 128.0f, 228.0f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
