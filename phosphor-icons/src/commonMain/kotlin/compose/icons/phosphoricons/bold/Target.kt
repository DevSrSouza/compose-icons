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

public val BoldGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.3f, 90.4f)
                arcTo(107.9f, 107.9f, 0.0f, false, true, 128.0f, 235.9f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 195.4f, 43.6f)
                lineToRelative(20.1f, -20.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-62.1f, 62.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-33.9f, 34.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 10.0f, 58.0f)
                arcToRelative(36.4f, 36.4f, 0.0f, false, false, 9.8f, -18.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.5f, 4.8f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 85.6f, 170.4f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 128.0f, 68.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, 33.1f, 9.9f)
                lineToRelative(17.2f, -17.2f)
                arcToRelative(83.9f, 83.9f, 0.0f, true, false, 28.5f, 38.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.0f, -15.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 229.3f, 90.4f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
