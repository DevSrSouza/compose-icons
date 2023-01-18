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

public val ThinGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 92.0f)
                lineTo(223.5f, 92.0f)
                lineToRelative(-6.6f, -45.7f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 205.1f, 36.0f)
                lineTo(50.9f, 36.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 39.1f, 46.3f)
                lineTo(32.5f, 92.0f)
                lineTo(16.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(32.0f, 100.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(68.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(80.0f, 180.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(224.0f, 100.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(47.0f, 47.4f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 50.9f, 44.0f)
                lineTo(205.1f, 44.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.9f, 3.4f)
                lineTo(215.4f, 92.0f)
                lineTo(40.6f, 92.0f)
                close()
                moveTo(72.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(44.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(40.0f, 180.0f)
                lineTo(72.0f, 180.0f)
                close()
                moveTo(212.0f, 212.0f)
                lineTo(188.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(184.0f, 180.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 212.0f)
                close()
                moveTo(216.0f, 172.0f)
                lineTo(148.0f, 172.0f)
                lineTo(148.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(44.0f)
                lineTo(116.0f, 172.0f)
                lineTo(116.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(44.0f)
                lineTo(40.0f, 172.0f)
                lineTo(40.0f, 100.0f)
                lineTo(216.0f, 100.0f)
                close()
                moveTo(64.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 132.0f)
                close()
                moveTo(176.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 132.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
