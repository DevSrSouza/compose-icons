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

public val ThinGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 36.0f)
                lineTo(66.0f, 36.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 38.0f, 64.0f)
                lineTo(38.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(74.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(86.0f, 196.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(218.0f, 64.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 190.0f, 36.0f)
                close()
                moveTo(46.0f, 188.0f)
                lineTo(46.0f, 124.0f)
                lineTo(210.0f, 124.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(46.0f, 76.0f)
                lineTo(210.0f, 76.0f)
                verticalLineToRelative(40.0f)
                lineTo(46.0f, 116.0f)
                close()
                moveTo(66.0f, 44.0f)
                lineTo(190.0f, 44.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(46.0f, 68.0f)
                lineTo(46.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 66.0f, 44.0f)
                close()
                moveTo(78.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(50.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(46.0f, 196.0f)
                lineTo(78.0f, 196.0f)
                close()
                moveTo(206.0f, 220.0f)
                lineTo(182.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(178.0f, 196.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 206.0f, 220.0f)
                close()
                moveTo(92.0f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 156.0f)
                close()
                moveTo(180.0f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 156.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
