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

public val ThinGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 39.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.8f, -3.8f)
                curveTo(141.4f, 31.6f, 81.7f, 53.9f, 56.4f, 95.6f)
                curveTo(39.1f, 124.2f, 40.0f, 158.1f, 59.0f, 191.3f)
                lineTo(37.2f, 213.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(64.7f, 197.0f)
                curveToRelative(17.4f, 9.9f, 35.0f, 14.9f, 51.9f, 14.9f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, false, 43.8f, -12.3f)
                curveTo(202.1f, 174.3f, 224.4f, 114.6f, 220.0f, 39.8f)
                close()
                moveTo(156.2f, 192.7f)
                curveToRelative(-25.4f, 15.4f, -55.7f, 14.8f, -85.7f, -1.6f)
                lineToRelative(92.3f, -92.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, -5.6f)
                lineTo(64.9f, 185.5f)
                curveToRelative(-16.4f, -30.0f, -17.0f, -60.3f, -1.6f, -85.7f)
                curveToRelative(23.3f, -38.5f, 78.8f, -59.3f, 148.9f, -56.0f)
                curveTo(215.5f, 113.9f, 194.7f, 169.4f, 156.2f, 192.7f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
