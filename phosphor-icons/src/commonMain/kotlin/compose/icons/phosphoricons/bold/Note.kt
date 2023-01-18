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

public val BoldGroup.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = Builder(name = "Note", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 108.0f)
                close()
                moveTo(116.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(228.0f, 48.0f)
                lineTo(228.0f, 156.7f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -5.9f, 14.1f)
                lineToRelative(-51.3f, 51.3f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -14.1f, 5.9f)
                lineTo(48.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 28.0f)
                lineTo(208.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(52.0f, 204.0f)
                horizontalLineToRelative(92.0f)
                lineTo(144.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(204.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                close()
                moveTo(191.0f, 168.0f)
                lineTo(168.0f, 168.0f)
                verticalLineToRelative(23.0f)
                close()
            }
        }
        .build()
        return _note!!
    }

private var _note: ImageVector? = null
