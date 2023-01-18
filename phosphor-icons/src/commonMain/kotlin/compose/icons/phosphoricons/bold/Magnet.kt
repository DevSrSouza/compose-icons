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

public val BoldGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.8f, 47.4f)
                arcTo(91.3f, 91.3f, 0.0f, false, false, 144.6f, 20.0f)
                horizontalLineToRelative(-0.3f)
                arcTo(91.5f, 91.5f, 0.0f, false, false, 79.2f, 47.0f)
                lineTo(13.1f, 113.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.2f)
                lineToRelative(28.7f, 28.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.3f, 5.8f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 14.1f, -6.0f)
                lineToRelative(65.6f, -67.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 16.8f, -0.2f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 3.5f, 8.4f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, -3.7f, 9.1f)
                lineTo(85.5f, 185.7f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -0.2f, 28.5f)
                lineToRelative(28.6f, 28.7f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 14.2f, 5.8f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 14.0f, -5.7f)
                lineToRelative(66.4f, -65.2f)
                horizontalLineToRelative(0.1f)
                curveTo(244.6f, 141.8f, 245.1f, 83.3f, 209.8f, 47.4f)
                close()
                moveTo(55.9f, 150.9f)
                lineToRelative(-23.0f, -23.0f)
                lineTo(54.0f, 106.6f)
                lineToRelative(22.9f, 22.9f)
                close()
                moveTo(128.1f, 223.1f)
                lineTo(105.1f, 200.1f)
                lineTo(126.6f, 179.2f)
                lineTo(149.5f, 202.1f)
                close()
                moveTo(191.7f, 160.8f)
                lineTo(166.6f, 185.3f)
                lineTo(143.9f, 162.5f)
                lineTo(169.2f, 138.0f)
                verticalLineToRelative(-0.2f)
                arcToRelative(36.6f, 36.6f, 0.0f, false, false, 10.8f, -26.3f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, false, -10.9f, -25.4f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -50.4f, 0.4f)
                horizontalLineToRelative(-0.1f)
                lineTo(93.6f, 112.3f)
                lineTo(70.9f, 89.5f)
                lineTo(96.2f, 63.9f)
                arcTo(67.6f, 67.6f, 0.0f, false, true, 144.3f, 44.0f)
                horizontalLineToRelative(0.2f)
                arcToRelative(67.6f, 67.6f, 0.0f, false, true, 48.2f, 20.3f)
                curveTo(218.8f, 90.8f, 218.3f, 134.0f, 191.7f, 160.8f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
