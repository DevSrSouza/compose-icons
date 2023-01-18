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

public val ThinGroup.CellSignalFull: ImageVector
    get() {
        if (_cellSignalFull != null) {
            return _cellSignalFull!!
        }
        _cellSignalFull = Builder(name = "CellSignalFull", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.6f, 32.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -13.1f, 2.6f)
                lineToRelative(-66.3f, 66.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-40.0f, 40.0f)
                horizontalLineToRelative(0.0f)
                lineTo(18.8f, 199.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 27.3f, 220.0f)
                lineTo(192.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 43.3f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 196.6f, 32.2f)
                close()
                moveTo(124.0f, 105.6f)
                lineToRelative(32.0f, -32.0f)
                lineTo(156.0f, 212.0f)
                lineTo(124.0f, 212.0f)
                close()
                moveTo(116.0f, 212.0f)
                lineTo(84.0f, 212.0f)
                lineTo(84.0f, 145.6f)
                lineToRelative(32.0f, -32.0f)
                close()
                moveTo(23.6f, 209.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.9f, -4.3f)
                lineTo(76.0f, 153.6f)
                lineTo(76.0f, 212.0f)
                lineTo(27.3f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.6f, 209.5f)
                close()
                moveTo(196.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(164.0f, 212.0f)
                lineTo(164.0f, 65.6f)
                lineToRelative(25.2f, -25.1f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 2.7f, -1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, 0.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.5f, 3.7f)
                close()
            }
        }
        .build()
        return _cellSignalFull!!
    }

private var _cellSignalFull: ImageVector? = null
