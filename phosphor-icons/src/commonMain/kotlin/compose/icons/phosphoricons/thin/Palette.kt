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

public val ThinGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 56.7f)
                arcTo(99.7f, 99.7f, 0.0f, false, false, 128.0f, 28.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 94.7f, 222.3f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 25.5f, -3.5f)
                arcTo(27.8f, 27.8f, 0.0f, false, false, 132.0f, 195.9f)
                lineTo(132.0f, 192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(46.2f)
                arcToRelative(27.7f, 27.7f, 0.0f, false, false, 27.3f, -21.8f)
                arcTo(99.7f, 99.7f, 0.0f, false, false, 198.0f, 56.7f)
                close()
                moveTo(217.7f, 148.5f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 198.2f, 164.0f)
                lineTo(152.0f, 164.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(3.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -26.6f, 18.9f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 62.6f, 63.3f)
                arcTo(91.2f, 91.2f, 0.0f, false, true, 127.1f, 36.0f)
                horizontalLineToRelative(0.9f)
                arcToRelative(92.4f, 92.4f, 0.0f, false, true, 92.0f, 91.2f)
                arcTo(89.7f, 89.7f, 0.0f, false, true, 217.7f, 148.5f)
                close()
                moveTo(136.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 76.0f)
                close()
                moveTo(89.9f, 106.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 98.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.0f, -2.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 89.9f, 106.0f)
                close()
                moveTo(89.9f, 150.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 87.0f, 160.9f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 76.0f, 158.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.9f, -8.0f)
                close()
                moveTo(180.0f, 98.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.0f, -2.9f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 180.0f, 98.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
