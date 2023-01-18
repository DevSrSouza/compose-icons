package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.7f, 88.4f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, true, -5.0f, 11.3f)
                lineTo(99.3f, 232.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -22.6f, 0.0f)
                lineTo(24.0f, 179.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, -22.6f)
                lineToRelative(21.9f, -21.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(34.8f, 34.9f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 92.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.1f, -2.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -0.6f, -11.1f)
                lineTo(62.8f, 123.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(81.9f, 98.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(34.8f, 34.9f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.1f, -2.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -0.6f, -11.1f)
                lineTo(98.8f, 87.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(19.1f, -19.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(34.8f, 34.9f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 164.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.1f, -2.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -0.6f, -11.1f)
                lineTo(134.8f, 51.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(156.7f, 24.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.6f, 0.0f)
                lineTo(232.0f, 76.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 236.7f, 88.4f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
