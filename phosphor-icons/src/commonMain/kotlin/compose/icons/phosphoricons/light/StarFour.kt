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

public val LightGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.4f, 114.8f)
                lineTo(165.6f, 91.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.2f, -1.2f)
                lineTo(141.2f, 26.6f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -26.4f, 0.0f)
                lineTo(91.6f, 90.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.2f, 1.2f)
                lineTo(26.6f, 114.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 0.0f, 26.4f)
                lineToRelative(63.8f, 23.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.2f, 1.2f)
                lineToRelative(23.2f, 63.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 26.4f, 0.0f)
                lineToRelative(23.2f, -63.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.2f, -1.2f)
                lineToRelative(63.8f, -23.2f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 0.0f, -26.4f)
                close()
                moveTo(225.3f, 129.9f)
                lineTo(161.5f, 153.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.4f, 8.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-23.2f, 63.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.8f, 0.0f)
                lineToRelative(-23.2f, -63.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.4f, -8.4f)
                lineTo(30.7f, 129.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.8f)
                lineToRelative(63.8f, -23.2f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.4f, -8.4f)
                lineToRelative(23.2f, -63.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.8f, 0.0f)
                lineToRelative(23.2f, 63.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.4f, 8.4f)
                lineToRelative(63.8f, 23.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.8f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null
