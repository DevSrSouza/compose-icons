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

public val BoldGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.5f, 97.5f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -51.0f, -51.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(47.2f, 47.2f, 0.0f, false, false, -4.1f, 5.0f)
                lineToRelative(-22.5f, -6.2f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 94.5f, 22.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.5f, 36.5f, 0.0f, false, false, -7.8f, 39.3f)
                lineTo(57.2f, 88.4f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -42.7f, 6.1f)
                horizontalLineToRelative(0.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 40.0f, 156.0f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, false, 20.3f, -6.3f)
                lineToRelative(65.2f, 47.9f)
                arcToRelative(36.1f, 36.1f, 0.0f, true, false, 60.0f, -15.1f)
                lineToRelative(-2.9f, -2.5f)
                lineTo(208.0f, 108.0f)
                arcTo(36.2f, 36.2f, 0.0f, false, false, 233.5f, 97.5f)
                close()
                moveTo(139.7f, 178.3f)
                lineTo(74.5f, 130.4f)
                arcToRelative(37.2f, 37.2f, 0.0f, false, false, -1.2f, -24.2f)
                lineToRelative(29.5f, -26.6f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 42.7f, -6.1f)
                arcToRelative(47.2f, 47.2f, 0.0f, false, false, 4.1f, -5.0f)
                lineToRelative(22.5f, 6.2f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 10.4f, 22.8f)
                lineToRelative(2.9f, 2.5f)
                lineTo(160.0f, 172.0f)
                arcTo(35.8f, 35.8f, 0.0f, false, false, 139.7f, 178.3f)
                close()
                moveTo(216.5f, 63.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.5f, 63.5f)
                close()
                moveTo(111.5f, 39.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                close()
                moveTo(31.5f, 128.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 17.0f)
                close()
                moveTo(168.5f, 216.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
