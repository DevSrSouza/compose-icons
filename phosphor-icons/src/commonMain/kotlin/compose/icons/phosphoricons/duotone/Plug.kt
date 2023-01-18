package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(212.0f, 132.0f)
                lineToRelative(-57.4f, 57.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, -45.2f, 0.0f)
                lineTo(66.6f, 146.6f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, -45.2f)
                lineTo(124.0f, 44.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.7f, 66.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineTo(192.0f, 100.7f)
                lineTo(155.3f, 64.0f)
                lineToRelative(34.4f, -34.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(144.0f, 52.7f)
                lineTo(117.7f, 26.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineToRelative(6.4f, 6.3f)
                lineTo(61.0f, 95.7f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 0.0f, 56.6f)
                lineTo(76.7f, 168.0f)
                lineTo(26.3f, 218.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(88.0f, 179.3f)
                lineTo(103.7f, 195.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 56.6f, 0.0f)
                lineTo(212.0f, 143.3f)
                lineToRelative(6.3f, 6.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(203.3f, 112.0f)
                lineToRelative(34.4f, -34.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 237.7f, 66.3f)
                close()
                moveTo(149.0f, 183.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -34.0f, 0.0f)
                lineTo(72.3f, 141.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 0.0f, -34.0f)
                lineTo(124.0f, 55.3f)
                lineTo(200.7f, 132.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
