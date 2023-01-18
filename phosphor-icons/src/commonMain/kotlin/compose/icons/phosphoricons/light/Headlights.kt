package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Headlights: ImageVector
    get() {
        if (_headlights != null) {
            return _headlights!!
        }
        _headlights = Builder(name = "Headlights", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(168.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 162.0f, 80.0f)
                close()
                moveTo(240.0f, 170.0f)
                lineTo(168.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(240.0f, 106.0f)
                lineTo(168.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(240.0f, 138.0f)
                lineTo(168.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(142.0f, 64.0f)
                lineTo(142.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(88.0f, 206.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, true, -78.0f, -78.6f)
                curveTo(10.3f, 84.7f, 45.7f, 50.0f, 88.9f, 50.0f)
                lineTo(128.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 142.0f, 64.0f)
                close()
                moveTo(130.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(88.9f, 62.0f)
                curveTo(52.3f, 62.0f, 22.3f, 91.4f, 22.0f, 127.5f)
                arcTo(66.1f, 66.1f, 0.0f, false, false, 88.0f, 194.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _headlights!!
    }

private var _headlights: ImageVector? = null
