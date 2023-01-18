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

public val ThinGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.7f, 116.7f)
                lineTo(164.9f, 93.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, -2.4f)
                lineTo(139.3f, 27.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(93.5f, 91.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, 2.4f)
                lineTo(27.3f, 116.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 22.6f)
                lineToRelative(63.8f, 23.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.4f, 2.4f)
                lineToRelative(23.2f, 63.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.6f, 0.0f)
                lineToRelative(23.2f, -63.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.4f, -2.4f)
                lineToRelative(63.8f, -23.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -22.6f)
                close()
                moveTo(226.0f, 131.8f)
                lineTo(162.1f, 155.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.1f, 7.1f)
                lineTo(131.8f, 226.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -7.6f, 0.0f)
                lineTo(101.0f, 162.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.1f, -7.1f)
                lineTo(30.0f, 131.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, -7.6f)
                lineTo(93.9f, 101.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 7.1f, -7.1f)
                lineTo(124.2f, 30.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 7.6f, 0.0f)
                lineTo(155.0f, 93.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 7.1f, 7.1f)
                lineTo(226.0f, 124.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, 7.6f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null
