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

public val ThinGroup.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) {
            return _lineSegment!!
        }
        _lineSegment = Builder(name = "LineSegment", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.8f, 44.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -42.2f, 36.6f)
                lineTo(80.8f, 169.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -36.6f, 2.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, 39.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 42.2f, -36.6f)
                lineToRelative(88.8f, -88.8f)
                arcTo(28.3f, 28.3f, 0.0f, false, false, 192.0f, 92.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, 19.8f, -8.2f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 211.8f, 44.2f)
                close()
                moveTo(78.1f, 206.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, true, true, 28.2f, 28.2f)
                close()
                moveTo(206.1f, 78.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, true, true, 28.2f, 0.0f)
                close()
            }
        }
        .build()
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
