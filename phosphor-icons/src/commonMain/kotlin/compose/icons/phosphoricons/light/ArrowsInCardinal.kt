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

public val LightGroup.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) {
            return _arrowsInCardinal!!
        }
        _arrowsInCardinal = Builder(name = "ArrowsInCardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.5f, 184.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, 8.5f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -4.2f, 1.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.3f, -1.8f)
                lineToRelative(-18.0f, -18.0f)
                lineTo(134.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 174.5f)
                lineToRelative(-18.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.5f, -8.5f)
                lineToRelative(28.3f, -28.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 8.4f, 0.0f)
                close()
                moveTo(123.8f, 100.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 8.4f, 0.0f)
                lineTo(160.5f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -8.5f)
                lineToRelative(-18.0f, 18.0f)
                lineTo(134.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 81.5f)
                lineToRelative(-18.0f, -18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 95.5f, 72.0f)
                close()
                moveTo(100.2f, 123.8f)
                lineTo(72.0f, 95.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, 8.5f)
                lineToRelative(18.0f, 18.0f)
                lineTo(24.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(81.5f, 134.0f)
                lineToRelative(-18.0f, 18.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, 1.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, -1.8f)
                lineToRelative(28.2f, -28.3f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 100.2f, 123.8f)
                close()
                moveTo(232.0f, 122.0f)
                lineTo(174.5f, 122.0f)
                lineToRelative(18.0f, -18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -8.5f)
                lineToRelative(-28.2f, 28.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 8.4f)
                lineTo(184.0f, 160.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, 1.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, -1.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, -8.5f)
                lineToRelative(-18.0f, -18.0f)
                lineTo(232.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
