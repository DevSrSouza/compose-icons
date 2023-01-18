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

public val DuotoneGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 72.0f)
                lineTo(162.6f, 200.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 149.0f, 205.0f)
                lineTo(51.0f, 107.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.3f, -13.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 228.0f)
                close()
                moveTo(88.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 188.0f)
                close()
                moveTo(28.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 184.0f)
                close()
                moveTo(68.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 168.0f)
                close()
                moveTo(256.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(219.3f, 48.0f)
                lineTo(191.5f, 75.8f)
                lineTo(170.4f, 202.0f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, -10.9f, 12.6f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -4.9f, 0.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.2f, -4.7f)
                lineTo(45.3f, 112.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -3.9f, -16.1f)
                arcTo(15.7f, 15.7f, 0.0f, false, true, 54.0f, 85.6f)
                lineTo(180.2f, 64.5f)
                lineTo(208.0f, 36.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 219.3f, 32.0f)
                lineTo(248.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 40.0f)
                close()
                moveTo(174.3f, 81.7f)
                lineTo(56.6f, 101.3f)
                lineToRelative(98.1f, 98.1f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
