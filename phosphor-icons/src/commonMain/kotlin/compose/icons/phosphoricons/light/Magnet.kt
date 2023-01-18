package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.5f, 51.7f)
                arcTo(85.2f, 85.2f, 0.0f, false, false, 144.6f, 26.0f)
                horizontalLineToRelative(-0.3f)
                arcTo(85.5f, 85.5f, 0.0f, false, false, 83.4f, 51.2f)
                lineTo(17.3f, 118.1f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 0.1f, 19.8f)
                lineTo(46.0f, 166.5f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 9.9f, 4.1f)
                lineTo(56.0f, 170.6f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 9.9f, -4.2f)
                lineToRelative(65.7f, -67.2f)
                arcToRelative(17.8f, 17.8f, 0.0f, false, true, 30.5f, 12.4f)
                arcToRelative(19.1f, 19.1f, 0.0f, false, true, -5.4f, 13.4f)
                lineToRelative(-67.0f, 65.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -4.3f, 10.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 4.1f, 10.0f)
                lineToRelative(28.7f, 28.6f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 9.9f, 4.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.8f, -4.0f)
                lineToRelative(66.5f, -65.2f)
                curveTo(238.0f, 139.8f, 238.6f, 85.2f, 205.5f, 51.7f)
                close()
                moveTo(57.4f, 158.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.5f, 0.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, -0.6f)
                lineTo(25.9f, 129.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, -2.8f)
                lineTo(54.0f, 98.1f)
                lineToRelative(31.3f, 31.3f)
                close()
                moveTo(129.5f, 230.2f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -2.9f, 0.0f)
                lineTo(98.0f, 201.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, -2.8f)
                lineToRelative(28.7f, -27.9f)
                lineTo(158.0f, 202.1f)
                close()
                moveTo(195.9f, 165.0f)
                lineToRelative(-29.3f, 28.7f)
                lineToRelative(-31.3f, -31.2f)
                lineToRelative(29.8f, -28.9f)
                arcToRelative(30.8f, 30.8f, 0.0f, false, false, 9.0f, -22.1f)
                arcToRelative(29.5f, 29.5f, 0.0f, false, false, -29.8f, -29.4f)
                arcTo(30.3f, 30.3f, 0.0f, false, false, 123.0f, 90.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-29.3f, 30.0f)
                lineTo(62.4f, 89.6f)
                lineTo(91.9f, 59.7f)
                arcTo(73.6f, 73.6f, 0.0f, false, true, 144.3f, 38.0f)
                horizontalLineToRelative(0.2f)
                arcTo(73.6f, 73.6f, 0.0f, false, true, 197.0f, 60.1f)
                curveTo(225.4f, 88.9f, 224.9f, 136.0f, 195.9f, 165.0f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
