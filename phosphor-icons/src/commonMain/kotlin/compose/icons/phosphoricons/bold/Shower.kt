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

public val BoldGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 228.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 228.0f)
                close()
                moveTo(92.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 92.0f, 180.0f)
                close()
                moveTo(28.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 28.0f, 180.0f)
                close()
                moveTo(60.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 60.0f, 180.0f)
                close()
                moveTo(256.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(221.0f, 52.0f)
                lineTo(195.4f, 77.5f)
                lineTo(181.8f, 193.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -13.3f, 16.6f)
                arcToRelative(21.2f, 21.2f, 0.0f, false, true, -6.6f, 1.1f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, -14.1f, -5.9f)
                lineTo(51.2f, 108.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 63.0f, 74.2f)
                lineTo(178.5f, 60.6f)
                lineToRelative(26.7f, -26.7f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 219.3f, 28.0f)
                lineTo(244.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 40.0f)
                close()
                moveTo(170.3f, 85.7f)
                lineTo(74.0f, 97.0f)
                lineToRelative(85.0f, 85.0f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
