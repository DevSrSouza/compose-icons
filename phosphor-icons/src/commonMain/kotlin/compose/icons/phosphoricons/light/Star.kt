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

public val LightGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.3f, 230.0f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, true, -7.7f, -2.2f)
                lineToRelative(-50.4f, -32.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -2.4f, 0.0f)
                lineTo(79.9f, 225.5f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, -17.8f, -0.6f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -6.2f, -17.4f)
                lineToRelative(13.5f, -53.1f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.9f, -2.8f)
                lineTo(23.3f, 113.9f)
                arcTo(14.7f, 14.7f, 0.0f, false, true, 18.7f, 98.0f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 31.5f, 88.0f)
                lineToRelative(59.1f, -3.8f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.6f)
                lineToRelative(22.0f, -55.4f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, 26.8f, 0.0f)
                lineToRelative(22.0f, 55.4f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.6f)
                lineTo(224.5f, 88.0f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, 12.8f, 10.0f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -4.6f, 15.9f)
                lineToRelative(-45.2f, 37.7f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.9f, 2.8f)
                lineToRelative(14.6f, 57.3f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -5.6f, 15.6f)
                arcTo(14.2f, 14.2f, 0.0f, false, true, 187.3f, 230.0f)
                close()
                moveTo(128.0f, 183.5f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 7.6f, 2.2f)
                horizontalLineToRelative(0.0f)
                lineToRelative(50.5f, 31.9f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 2.5f, -0.1f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 1.0f, -2.9f)
                lineTo(175.0f, 157.3f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, 4.8f, -14.9f)
                lineTo(225.0f, 104.7f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.8f, -2.9f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -2.1f, -1.8f)
                lineToRelative(-59.0f, -3.8f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, -12.5f, -9.1f)
                lineToRelative(-22.0f, -55.5f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -4.4f, 0.0f)
                lineToRelative(-22.0f, 55.5f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, -12.5f, 9.1f)
                lineToRelative(-59.0f, 3.8f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -2.1f, 1.8f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.8f, 2.9f)
                lineToRelative(45.2f, 37.7f)
                arcTo(14.7f, 14.7f, 0.0f, false, true, 81.0f, 157.3f)
                lineTo(67.5f, 210.5f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 1.6f, 4.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 4.4f, 0.2f)
                lineToRelative(46.9f, -29.7f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 128.0f, 183.5f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
