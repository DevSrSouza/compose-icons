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

public val ThinGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.7f, 104.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -3.5f, -8.5f)
                lineTo(160.5f, 26.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(117.8f, 52.6f)
                lineToRelative(-58.9f, 22.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -7.6f, 9.3f)
                lineTo(28.1f, 223.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 228.0f)
                horizontalLineToRelative(0.7f)
                lineToRelative(139.4f, -23.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 9.3f, -7.6f)
                lineToRelative(22.0f, -58.9f)
                lineToRelative(25.8f, -25.7f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 232.7f, 104.0f)
                close()
                moveTo(173.9f, 194.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.1f, 2.5f)
                lineTo(43.7f, 218.0f)
                lineToRelative(58.4f, -58.4f)
                arcTo(24.4f, 24.4f, 0.0f, false, false, 116.0f, 164.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcToRelative(24.4f, 24.4f, 0.0f, false, false, 4.4f, 13.9f)
                lineTo(38.0f, 212.3f)
                lineTo(59.2f, 85.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.5f, -3.1f)
                lineTo(119.0f, 60.7f)
                lineTo(195.4f, 137.0f)
                close()
                moveTo(100.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 140.0f)
                close()
                moveTo(223.5f, 106.8f)
                lineTo(200.0f, 130.3f)
                lineTo(125.7f, 56.0f)
                lineToRelative(23.5f, -23.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(68.7f, 68.7f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 223.5f, 106.8f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
