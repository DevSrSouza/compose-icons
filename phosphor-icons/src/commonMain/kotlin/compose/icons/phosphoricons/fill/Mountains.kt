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

public val FillGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 52.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 140.0f, 52.0f)
                close()
                moveTo(255.0f, 204.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.0f, 4.0f)
                horizontalLineTo(8.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.9f, -4.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.0f, -8.1f)
                lineTo(74.2f, 71.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.6f, 0.0f)
                lineToRelative(42.3f, 71.9f)
                lineToRelative(26.1f, -44.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 27.6f, 0.0f)
                lineToRelative(57.1f, 96.4f)
                arcTo(8.3f, 8.3f, 0.0f, false, true, 255.0f, 204.0f)
                close()
                moveTo(64.3f, 120.0f)
                horizontalLineToRelative(47.4f)
                lineTo(88.0f, 79.8f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
