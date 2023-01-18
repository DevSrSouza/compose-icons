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

public val ThinGroup.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.0f, 132.7f)
                lineToRelative(-52.2f, -19.2f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.3f, -2.3f)
                lineTo(123.3f, 59.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(81.5f, 111.2f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.3f, 2.3f)
                lineTo(27.0f, 132.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 22.6f)
                lineToRelative(52.2f, 19.2f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 2.3f, 2.3f)
                lineTo(100.7f, 229.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.6f, 0.0f)
                lineToRelative(19.2f, -52.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 2.3f, -2.3f)
                lineTo(197.0f, 155.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -22.6f)
                close()
                moveTo(194.2f, 147.8f)
                lineTo(142.1f, 167.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.1f, 7.1f)
                lineToRelative(-19.2f, 52.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.6f, 0.0f)
                lineTo(89.0f, 174.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.1f, -7.1f)
                lineTo(29.8f, 147.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -7.6f)
                lineTo(81.9f, 121.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 7.1f, -7.1f)
                lineToRelative(19.2f, -52.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.6f, 0.0f)
                lineTo(135.0f, 113.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 7.1f, 7.1f)
                lineToRelative(52.1f, 19.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.6f)
                close()
                moveTo(148.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                lineTo(172.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(180.0f, 36.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(180.0f, 44.0f)
                lineTo(180.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(172.0f, 44.0f)
                lineTo(152.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 40.0f)
                close()
                moveTo(244.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(228.0f, 92.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 92.0f)
                lineTo(208.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(12.0f)
                lineTo(220.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(228.0f, 84.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 88.0f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
