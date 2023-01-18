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

public val FillGroup.Tote: ImageVector
    get() {
        if (_tote != null) {
            return _tote!!
        }
        _tote = Builder(name = "Tote", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.0f, 69.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 223.1f, 64.0f)
                lineTo(175.3f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -94.6f, 0.0f)
                lineTo(32.9f, 64.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 21.0f, 69.3f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -4.0f, 12.5f)
                lineToRelative(14.3f, 128.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 47.2f, 224.0f)
                lineTo(208.8f, 224.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.9f, -14.2f)
                lineTo(239.0f, 81.8f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 235.0f, 69.3f)
                close()
                moveTo(96.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(80.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(97.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 62.0f, 0.0f)
                close()
                moveTo(176.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(160.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tote!!
    }

private var _tote: ImageVector? = null
