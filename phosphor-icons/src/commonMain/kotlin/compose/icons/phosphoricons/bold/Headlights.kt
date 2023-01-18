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

public val BoldGroup.Headlights: ImageVector
    get() {
        if (_headlights != null) {
            return _headlights!!
        }
        _headlights = Builder(name = "Headlights", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(176.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 80.0f)
                close()
                moveTo(240.0f, 164.0f)
                lineTo(176.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(240.0f, 116.0f)
                lineTo(176.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(148.0f, 64.0f)
                lineTo(148.0f, 192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(88.0f, 212.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 4.0f, 127.4f)
                curveTo(4.3f, 81.4f, 42.4f, 44.0f, 88.9f, 44.0f)
                lineTo(128.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 148.0f, 64.0f)
                close()
                moveTo(124.0f, 68.0f)
                lineTo(88.9f, 68.0f)
                curveTo(55.6f, 68.0f, 28.2f, 94.7f, 28.0f, 127.5f)
                arcTo(59.9f, 59.9f, 0.0f, false, false, 88.0f, 188.0f)
                horizontalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return _headlights!!
    }

private var _headlights: ImageVector? = null
