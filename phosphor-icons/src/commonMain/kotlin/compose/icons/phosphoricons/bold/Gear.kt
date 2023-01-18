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

public val BoldGroup.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 72.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 56.0f, 56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 128.0f, 72.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 128.0f, 160.0f)
                close()
                moveTo(238.0f, 148.0f)
                lineTo(223.9f, 129.2f)
                verticalLineToRelative(-2.4f)
                lineTo(238.0f, 108.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 2.0f, -10.3f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, false, -11.4f, -27.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -8.7f, -5.9f)
                lineToRelative(-23.1f, -3.3f)
                lineToRelative(-1.9f, -1.9f)
                lineToRelative(-3.3f, -23.1f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -5.9f, -8.7f)
                arcTo(113.4f, 113.4f, 0.0f, false, false, 158.3f, 16.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 148.0f, 18.0f)
                lineTo(129.3f, 32.0f)
                horizontalLineToRelative(-2.6f)
                lineTo(108.0f, 18.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -10.3f, -2.0f)
                arcTo(113.4f, 113.4f, 0.0f, false, false, 70.3f, 27.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -5.9f, 8.7f)
                lineTo(61.1f, 59.2f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -1.9f, 1.9f)
                lineTo(36.1f, 64.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -8.7f, 5.9f)
                arcTo(113.4f, 113.4f, 0.0f, false, false, 16.0f, 97.7f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 18.0f, 108.0f)
                lineToRelative(14.1f, 18.8f)
                verticalLineToRelative(2.4f)
                lineTo(18.0f, 148.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -2.0f, 10.3f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, false, 11.4f, 27.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 8.7f, 5.9f)
                lineToRelative(23.1f, 3.3f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(3.3f, 23.1f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 5.9f, 8.7f)
                arcTo(113.4f, 113.4f, 0.0f, false, false, 97.7f, 240.0f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, false, 3.1f, 0.4f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 108.0f, 238.0f)
                lineToRelative(18.7f, -14.0f)
                horizontalLineToRelative(2.6f)
                lineTo(148.0f, 238.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 10.3f, 2.0f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, false, 27.4f, -11.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 5.9f, -8.7f)
                lineToRelative(3.4f, -23.2f)
                lineToRelative(1.7f, -1.7f)
                lineToRelative(23.2f, -3.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 8.7f, -5.9f)
                arcTo(113.4f, 113.4f, 0.0f, false, false, 240.0f, 158.3f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 238.0f, 148.0f)
                close()
                moveTo(210.5f, 168.7f)
                lineTo(189.2f, 171.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -7.0f, 3.6f)
                curveToRelative(-1.7f, 1.8f, -4.9f, 5.1f, -6.5f, 6.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -3.9f, 7.3f)
                lineToRelative(-3.1f, 21.3f)
                arcToRelative(85.3f, 85.3f, 0.0f, false, true, -11.2f, 4.7f)
                lineToRelative(-17.2f, -13.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -7.9f, -2.3f)
                horizontalLineToRelative(-8.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.9f, 2.3f)
                lineToRelative(-17.2f, 13.0f)
                arcToRelative(85.3f, 85.3f, 0.0f, false, true, -11.2f, -4.7f)
                lineToRelative(-3.1f, -21.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -3.9f, -7.3f)
                arcToRelative(60.5f, 60.5f, 0.0f, false, true, -6.2f, -6.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -7.3f, -3.9f)
                lineToRelative(-21.3f, -3.1f)
                arcToRelative(85.3f, 85.3f, 0.0f, false, true, -4.7f, -11.2f)
                lineToRelative(13.0f, -17.2f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 2.4f, -7.5f)
                curveToRelative(-0.1f, -2.5f, -0.2f, -7.1f, -0.1f, -9.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -2.3f, -7.9f)
                lineToRelative(-13.0f, -17.2f)
                arcToRelative(85.3f, 85.3f, 0.0f, false, true, 4.7f, -11.2f)
                lineToRelative(21.3f, -3.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.3f, -3.9f)
                arcToRelative(60.5f, 60.5f, 0.0f, false, true, 6.2f, -6.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.9f, -7.3f)
                lineToRelative(3.1f, -21.3f)
                arcToRelative(85.3f, 85.3f, 0.0f, false, true, 11.2f, -4.7f)
                lineToRelative(17.2f, 13.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 7.9f, 2.3f)
                curveToRelative(2.9f, -0.1f, 5.9f, -0.1f, 8.8f, 0.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 7.9f, -2.3f)
                lineToRelative(17.2f, -13.0f)
                arcToRelative(85.3f, 85.3f, 0.0f, false, true, 11.2f, 4.7f)
                lineToRelative(3.1f, 21.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.9f, 7.3f)
                arcToRelative(60.5f, 60.5f, 0.0f, false, true, 6.2f, 6.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.3f, 3.9f)
                lineToRelative(21.3f, 3.1f)
                arcToRelative(85.3f, 85.3f, 0.0f, false, true, 4.7f, 11.2f)
                lineToRelative(-13.0f, 17.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -2.3f, 7.5f)
                curveToRelative(0.0f, 2.5f, 0.1f, 7.1f, 0.0f, 9.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 2.3f, 7.9f)
                lineToRelative(13.0f, 17.2f)
                arcTo(85.3f, 85.3f, 0.0f, false, true, 210.5f, 168.7f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
