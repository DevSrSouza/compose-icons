package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 60.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.1f, 44.1f, 0.0f, false, false, 128.1f, 60.0f)
                close()
                moveTo(128.1f, 124.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.1f, 124.0f)
                close()
                moveTo(128.1f, 12.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f)
                curveToRelative(0.0f, 77.4f, 81.7f, 135.4f, 85.1f, 137.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 13.8f, 0.0f)
                arcToRelative(260.0f, 260.0f, 0.0f, false, false, 42.2f, -38.9f)
                curveToRelative(28.1f, -32.3f, 42.9f, -66.5f, 42.9f, -98.9f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 128.1f, 12.0f)
                close()
                moveTo(159.4f, 186.7f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, true, -31.3f, 30.2f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, true, -31.3f, -30.2f)
                curveTo(80.1f, 167.4f, 60.1f, 137.3f, 60.1f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveTo(196.1f, 137.3f, 176.2f, 167.4f, 159.4f, 186.7f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
