package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.3f, 84.9f)
                arcToRelative(100.3f, 100.3f, 0.0f, true, true, -22.5f, -30.4f)
                lineToRelative(25.4f, -25.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                lineToRelative(-62.0f, 62.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(31.0f, -31.0f)
                arcToRelative(44.1f, 44.1f, 0.0f, true, false, 15.7f, 31.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.8f, -4.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.2f, 3.7f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 128.0f, 76.0f)
                arcToRelative(51.5f, 51.5f, 0.0f, false, true, 33.8f, 12.5f)
                lineToRelative(28.4f, -28.3f)
                arcTo(92.1f, 92.1f, 0.0f, true, false, 211.0f, 88.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.3f, -3.4f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
