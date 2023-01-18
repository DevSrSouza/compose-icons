package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 92.7f)
                lineTo(163.3f, 24.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(115.6f, 49.1f)
                lineTo(57.5f, 70.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 47.4f, 83.2f)
                lineTo(26.6f, 207.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.8f, 3.5f)
                lineToRelative(55.0f, -55.1f)
                arcTo(31.7f, 31.7f, 0.0f, false, true, 84.0f, 140.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcToRelative(31.7f, 31.7f, 0.0f, false, true, -16.2f, -4.4f)
                lineToRelative(-55.1f, 55.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.5f, 6.8f)
                lineToRelative(124.6f, -20.7f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 12.3f, -10.2f)
                lineToRelative(21.8f, -58.1f)
                lineTo(232.0f, 115.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, -22.6f)
                close()
                moveTo(200.0f, 124.7f)
                lineTo(131.3f, 56.0f)
                lineTo(152.0f, 35.3f)
                lineTo(220.7f, 104.0f)
                close()
                moveTo(116.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 116.0f, 156.0f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
