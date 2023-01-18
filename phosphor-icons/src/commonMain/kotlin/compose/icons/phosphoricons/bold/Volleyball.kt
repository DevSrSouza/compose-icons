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

public val BoldGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.7f, 169.3f)
                arcToRelative(107.3f, 107.3f, 0.0f, false, false, 8.3f, -40.7f)
                verticalLineToRelative(-1.1f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, -162.0f, -93.0f)
                curveTo(22.4f, 64.2f, 4.7f, 130.4f, 34.5f, 182.0f)
                arcToRelative(101.0f, 101.0f, 0.0f, false, false, 6.7f, 10.3f)
                lineToRelative(0.6f, 0.8f)
                arcTo(106.9f, 106.9f, 0.0f, false, false, 100.0f, 232.3f)
                arcToRelative(109.2f, 109.2f, 0.0f, false, false, 28.2f, 3.7f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 98.5f, -64.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 227.7f, 169.3f)
                close()
                moveTo(114.7f, 45.0f)
                arcToRelative(84.4f, 84.4f, 0.0f, false, true, 46.6f, 71.0f)
                lineTo(134.9f, 116.0f)
                lineTo(96.8f, 50.0f)
                arcTo(86.6f, 86.6f, 0.0f, false, true, 114.7f, 45.0f)
                close()
                moveTo(134.9f, 140.0f)
                horizontalLineToRelative(76.2f)
                arcToRelative(85.1f, 85.1f, 0.0f, false, true, -4.7f, 18.0f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, true, -84.6f, 4.8f)
                close()
                moveTo(200.7f, 86.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, 10.4f, 30.0f)
                lineTo(185.3f, 116.0f)
                arcToRelative(108.3f, 108.3f, 0.0f, false, false, -14.4f, -49.7f)
                arcToRelative(109.5f, 109.5f, 0.0f, false, false, -11.4f, -16.2f)
                arcTo(83.4f, 83.4f, 0.0f, false, true, 200.7f, 86.0f)
                close()
                moveTo(76.0f, 62.0f)
                lineTo(89.0f, 84.4f)
                arcToRelative(107.8f, 107.8f, 0.0f, false, false, -35.9f, 37.3f)
                arcToRelative(115.6f, 115.6f, 0.0f, false, false, -8.3f, 17.9f)
                arcTo(84.5f, 84.5f, 0.0f, false, true, 76.0f, 62.0f)
                close()
                moveTo(62.8f, 181.0f)
                arcToRelative(82.7f, 82.7f, 0.0f, false, true, 11.1f, -47.3f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 101.0f, 105.2f)
                lineTo(114.1f, 128.0f)
                lineTo(76.0f, 194.0f)
                arcTo(85.4f, 85.4f, 0.0f, false, true, 62.8f, 181.0f)
                close()
                moveTo(106.3f, 209.1f)
                arcToRelative(75.3f, 75.3f, 0.0f, false, true, -9.5f, -3.1f)
                lineToRelative(12.9f, -22.4f)
                arcToRelative(108.4f, 108.4f, 0.0f, false, false, 70.0f, 10.6f)
                arcToRelative(78.1f, 78.1f, 0.0f, false, true, -9.7f, 6.5f)
                arcTo(83.0f, 83.0f, 0.0f, false, true, 106.3f, 209.1f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
