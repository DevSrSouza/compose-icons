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

public val BoldGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.6f, 51.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 92.0f, 229.9f)
                arcToRelative(38.2f, 38.2f, 0.0f, false, false, 12.0f, 2.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(140.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(46.2f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, false, 35.1f, -28.0f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 2.7f, -24.9f)
                arcTo(107.3f, 107.3f, 0.0f, false, false, 203.6f, 51.0f)
                close()
                moveTo(209.9f, 146.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -11.7f, 9.3f)
                lineTo(152.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                verticalLineToRelative(3.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -5.1f, 9.8f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -10.9f, 1.5f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 127.1f, 44.0f)
                horizontalLineToRelative(0.9f)
                arcToRelative(84.3f, 84.3f, 0.0f, false, true, 84.0f, 83.3f)
                arcTo(79.0f, 79.0f, 0.0f, false, true, 209.9f, 146.7f)
                close()
                moveTo(144.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 76.0f)
                close()
                moveTo(96.8f, 110.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 91.0f, 88.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.8f, 110.0f)
                close()
                moveTo(96.8f, 146.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 75.0f, 140.1f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 96.8f, 146.0f)
                close()
                moveTo(186.9f, 94.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 165.0f, 88.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 186.9f, 94.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
