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

public val ThinGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 228.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -5.9f, -1.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 216.0f)
                verticalLineTo(40.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 86.3f, 29.8f)
                lineToRelative(143.9f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, 20.4f)
                lineToRelative(-143.9f, 88.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 80.0f, 228.0f)
                close()
                moveTo(80.0f, 36.0f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -2.0f, 0.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 76.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.0f, 3.5f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 4.1f, -0.1f)
                lineToRelative(144.0f, -88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.8f)
                lineToRelative(-144.0f, -88.0f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 80.0f, 36.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
