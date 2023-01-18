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

public val BoldGroup.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) {
            return _paintBrushHousehold!!
        }
        _paintBrushHousehold = Builder(name = "PaintBrushHousehold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.5f, 22.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -51.0f, 0.0f)
                lineToRelative(-0.4f, 0.5f)
                lineTo(130.0f, 81.0f)
                lineToRelative(-6.2f, -6.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -39.6f, 0.0f)
                lineTo(7.5f, 151.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(76.7f, -76.7f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, -39.6f)
                lineTo(175.0f, 126.0f)
                lineToRelative(58.0f, -52.1f)
                lineToRelative(0.5f, -0.4f)
                arcTo(36.2f, 36.2f, 0.0f, false, false, 233.5f, 22.5f)
                close()
                moveTo(96.0f, 223.0f)
                lineToRelative(-8.6f, -8.6f)
                lineToRelative(17.3f, -18.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.4f, -16.6f)
                lineTo(70.4f, 197.4f)
                lineToRelative(-11.0f, -11.0f)
                lineToRelative(17.3f, -18.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.4f, -16.6f)
                lineTo(42.4f, 169.4f)
                lineTo(33.0f, 160.0f)
                lineToRelative(39.0f, -39.0f)
                lineToRelative(63.0f, 63.0f)
                close()
                moveTo(216.7f, 56.3f)
                lineToRelative(-60.9f, 54.6f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 155.0f, 140.0f)
                lineToRelative(9.2f, 9.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineTo(152.0f, 167.0f)
                lineTo(89.0f, 104.0f)
                lineToRelative(12.2f, -12.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineTo(116.0f, 101.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 29.1f, -0.8f)
                lineToRelative(54.6f, -60.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
