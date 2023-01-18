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

public val DuotoneGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 144.0f, 52.0f)
                close()
                moveTo(190.9f, 103.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -13.8f, 0.0f)
                lineToRelative(-33.0f, 55.8f)
                lineTo(168.0f, 200.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(81.1f, 75.7f)
                lineTo(50.4f, 128.0f)
                horizontalLineToRelative(75.2f)
                lineTo(94.9f, 75.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 81.1f, 75.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 164.0f, 80.0f)
                close()
                moveTo(164.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 40.0f)
                close()
                moveTo(254.9f, 195.9f)
                lineTo(197.8f, 99.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -27.6f, 0.0f)
                lineToRelative(-26.1f, 44.1f)
                lineTo(101.8f, 71.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.6f, 0.0f)
                lineTo(1.1f, 195.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, 8.1f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 8.0f, 208.0f)
                lineTo(248.0f, 208.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.0f, -4.0f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 254.9f, 195.9f)
                close()
                moveTo(88.0f, 79.8f)
                lineTo(111.7f, 120.0f)
                lineTo(64.3f, 120.0f)
                close()
                moveTo(22.0f, 192.0f)
                lineToRelative(32.9f, -56.0f)
                horizontalLineToRelative(66.2f)
                lineToRelative(16.1f, 27.4f)
                horizontalLineToRelative(0.0f)
                lineTo(154.0f, 192.0f)
                close()
                moveTo(172.6f, 192.0f)
                lineTo(153.4f, 159.4f)
                lineTo(184.0f, 107.7f)
                lineTo(234.0f, 192.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
