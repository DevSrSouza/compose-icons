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

public val BoldGroup.Plugs: ImageVector
    get() {
        if (_plugs != null) {
            return _plugs!!
        }
        _plugs = Builder(name = "Plugs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.5f, 15.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(200.0f, 39.0f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -51.0f, 0.0f)
                lineTo(124.0f, 59.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.5f, 17.4f)
                lineToRelative(72.0f, 72.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.4f, -16.5f)
                lineToRelative(22.6f, -22.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -51.0f)
                lineTo(217.0f, 56.0f)
                lineToRelative(23.5f, -23.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.5f, 15.5f)
                close()
                moveTo(202.5f, 92.5f)
                lineTo(180.0f, 115.0f)
                lineTo(141.0f, 76.0f)
                lineToRelative(22.5f, -22.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(22.0f, 22.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 0.0f, 17.0f)
                close()
                moveTo(148.5f, 139.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(120.0f, 151.0f)
                lineToRelative(-15.0f, -15.0f)
                lineToRelative(11.5f, -11.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(88.0f, 119.0f)
                lineTo(76.5f, 107.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 59.1f, 124.0f)
                lineTo(36.5f, 146.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 51.0f)
                lineTo(39.0f, 200.0f)
                lineTo(15.5f, 223.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(56.0f, 217.0f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 51.0f, 0.0f)
                lineTo(132.0f, 196.9f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 8.0f, 3.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.5f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(137.0f, 168.0f)
                lineToRelative(11.5f, -11.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 148.5f, 139.5f)
                close()
                moveTo(92.5f, 202.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-22.0f, -22.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(76.0f, 141.0f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _plugs!!
    }

private var _plugs: ImageVector? = null
