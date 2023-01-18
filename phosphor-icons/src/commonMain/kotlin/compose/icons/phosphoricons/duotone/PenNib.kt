package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 56.0f)
                lineTo(60.3f, 78.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -5.1f, 6.2f)
                lineTo(32.0f, 224.0f)
                lineToRelative(139.5f, -23.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.1f, -5.1f)
                lineTo(200.0f, 136.0f)
                close()
                moveTo(116.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 116.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 92.7f)
                lineTo(163.3f, 24.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(115.6f, 49.1f)
                lineTo(57.5f, 70.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 47.4f, 83.2f)
                lineTo(24.1f, 222.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 32.0f, 232.0f)
                horizontalLineToRelative(1.3f)
                lineToRelative(139.5f, -23.2f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 12.3f, -10.2f)
                lineToRelative(21.8f, -58.1f)
                lineTo(232.0f, 115.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 232.0f, 92.7f)
                close()
                moveTo(170.1f, 192.9f)
                lineTo(55.3f, 212.0f)
                lineToRelative(47.4f, -47.4f)
                arcTo(27.1f, 27.1f, 0.0f, false, false, 116.0f, 168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcToRelative(27.1f, 27.1f, 0.0f, false, false, 3.4f, 13.3f)
                lineTo(44.0f, 200.7f)
                lineTo(63.1f, 85.9f)
                lineTo(118.0f, 65.3f)
                lineTo(190.7f, 138.0f)
                close()
                moveTo(104.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f)
                close()
                moveTo(200.0f, 124.7f)
                lineTo(131.3f, 56.0f)
                lineTo(152.0f, 35.3f)
                lineTo(220.7f, 104.0f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
