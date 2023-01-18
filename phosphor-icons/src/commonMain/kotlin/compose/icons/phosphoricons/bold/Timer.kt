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

public val BoldGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 40.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 140.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 40.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, -76.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(170.4f, 97.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, 16.9f)
                lineToRelative(-33.9f, 34.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(34.0f, -33.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 170.4f, 97.6f)
                close()
                moveTo(92.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 0.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 12.0f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
