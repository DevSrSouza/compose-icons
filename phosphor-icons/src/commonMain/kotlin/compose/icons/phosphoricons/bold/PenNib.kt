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

public val BoldGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 89.9f)
                lineTo(166.1f, 21.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -28.2f, 0.0f)
                lineTo(113.4f, 45.7f)
                lineTo(56.1f, 67.1f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 43.4f, 82.6f)
                lineTo(20.2f, 222.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 32.0f, 236.0f)
                lineToRelative(2.0f, -0.2f)
                lineToRelative(139.4f, -23.2f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 15.5f, -12.7f)
                lineToRelative(21.4f, -57.2f)
                lineToRelative(24.5f, -24.6f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 234.8f, 89.9f)
                close()
                moveTo(167.2f, 189.3f)
                lineTo(67.0f, 206.0f)
                lineToRelative(33.5f, -33.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineTo(50.0f, 189.0f)
                lineTo(66.7f, 88.8f)
                lineTo(117.0f, 70.0f)
                lineToRelative(69.1f, 69.0f)
                close()
                moveTo(104.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f)
                close()
                moveTo(200.0f, 119.0f)
                lineTo(137.0f, 56.0f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(63.0f, 63.0f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
