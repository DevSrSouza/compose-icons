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

public val ThinGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.3f, 228.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -6.6f, -1.9f)
                lineToRelative(-50.4f, -32.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -4.6f, 0.0f)
                lineTo(78.9f, 223.8f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -15.6f, -0.5f)
                arcTo(14.4f, 14.4f, 0.0f, false, true, 57.8f, 208.0f)
                lineToRelative(13.5f, -53.1f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, -1.5f, -4.9f)
                lineTo(24.6f, 112.4f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, -4.0f, -13.7f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, 11.0f, -8.7f)
                lineToRelative(59.1f, -3.8f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 3.8f, -2.8f)
                lineToRelative(22.0f, -55.5f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 23.0f, 0.0f)
                lineToRelative(22.0f, 55.5f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 3.8f, 2.8f)
                lineTo(224.4f, 90.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, 11.0f, 8.7f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, -4.0f, 13.7f)
                lineTo(186.2f, 150.0f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, -1.5f, 4.9f)
                lineToRelative(14.6f, 57.3f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -4.9f, 13.4f)
                arcTo(11.7f, 11.7f, 0.0f, false, true, 187.3f, 228.0f)
                close()
                moveTo(128.0f, 185.4f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, 6.6f, 2.0f)
                horizontalLineToRelative(0.0f)
                lineTo(185.0f, 219.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.7f, -0.1f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 1.8f, -5.0f)
                lineToRelative(-14.6f, -57.4f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, 4.2f, -12.9f)
                lineToRelative(45.2f, -37.6f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, 1.4f, -5.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.8f, -3.1f)
                lineToRelative(-59.1f, -3.8f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -10.7f, -7.9f)
                lineToRelative(-22.0f, -55.5f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -8.2f, 0.0f)
                lineToRelative(-22.0f, 55.5f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -10.7f, 7.9f)
                lineTo(32.1f, 98.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.9f, 3.1f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.5f, 5.2f)
                lineToRelative(45.2f, 37.6f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, 4.2f, 12.9f)
                lineTo(65.6f, 210.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.4f, 6.8f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, 6.6f, 0.2f)
                lineToRelative(46.8f, -29.6f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 128.0f, 185.4f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
