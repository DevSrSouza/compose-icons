package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) {
            return _paintBrushHousehold!!
        }
        _paintBrushHousehold = Builder(name = "PaintBrushHousehold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.6f, 25.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -45.2f, 0.0f)
                lineToRelative(-0.3f, 0.3f)
                lineTo(130.2f, 86.9f)
                lineTo(121.0f, 77.7f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, -34.0f, 0.0f)
                lineTo(10.3f, 154.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(178.3f, 169.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 0.0f, -34.0f)
                lineToRelative(-9.2f, -9.2f)
                lineToRelative(61.2f, -54.9f)
                lineToRelative(0.3f, -0.3f)
                arcTo(31.9f, 31.9f, 0.0f, false, false, 230.6f, 25.4f)
                close()
                moveTo(96.0f, 228.7f)
                lineTo(81.9f, 214.6f)
                lineTo(107.4f, 189.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -11.3f)
                lineTo(70.6f, 203.3f)
                lineTo(53.9f, 186.6f)
                lineTo(79.4f, 161.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -11.3f)
                lineTo(42.6f, 175.3f)
                lineTo(27.3f, 160.0f)
                lineTo(72.0f, 115.3f)
                lineTo(140.7f, 184.0f)
                close()
                moveTo(219.5f, 59.2f)
                lineToRelative(-61.0f, 54.7f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -5.4f, 11.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 4.7f, 11.7f)
                lineToRelative(9.2f, 9.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.4f)
                lineToRelative(-15.0f, 15.0f)
                lineTo(83.3f, 104.0f)
                lineToRelative(15.0f, -15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(9.2f, 9.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.7f, 4.7f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 11.5f, -5.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(54.7f, -61.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.7f, 22.7f)
                close()
            }
        }
        .build()
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
