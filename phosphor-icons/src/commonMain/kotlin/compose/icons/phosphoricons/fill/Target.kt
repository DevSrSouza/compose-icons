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

public val FillGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.9f, 83.2f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, -20.4f, 118.3f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, true, -147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, true, 0.0f, -147.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 195.7f, 49.0f)
                lineToRelative(22.6f, -22.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineToRelative(-62.1f, 62.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-37.7f, 37.7f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 62.0f, -35.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.6f, -8.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 8.4f, 7.5f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -95.5f, 42.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 73.1f, -84.4f)
                lineToRelative(22.8f, -22.8f)
                arcToRelative(87.9f, 87.9f, 0.0f, true, false, 23.1f, 29.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.5f, -6.9f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
