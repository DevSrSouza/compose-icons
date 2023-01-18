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

public val ThinGroup.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) {
            return _lineSegments!!
        }
        _lineSegments = Builder(name = "LineSegments", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.8f, 36.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -39.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, 39.6f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, 3.1f, 2.7f)
                lineToRelative(-29.7f, 55.2f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -26.4f, 3.9f)
                lineToRelative(-24.8f, -24.8f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 76.2f, 76.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, 39.6f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, 3.1f, 2.7f)
                lineTo(49.6f, 173.7f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -29.4f, 6.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, 39.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, -39.6f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, -3.1f, -2.7f)
                lineToRelative(29.7f, -55.2f)
                arcTo(28.5f, 28.5f, 0.0f, false, false, 96.0f, 124.0f)
                arcToRelative(28.3f, 28.3f, 0.0f, false, false, 16.8f, -5.6f)
                lineToRelative(24.8f, 24.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 42.2f, -3.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, -3.1f, -2.7f)
                lineToRelative(29.7f, -55.2f)
                arcTo(28.5f, 28.5f, 0.0f, false, false, 216.0f, 84.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, 19.8f, -8.2f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 235.8f, 36.2f)
                close()
                moveTo(54.1f, 214.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 28.2f)
                close()
                moveTo(81.9f, 110.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 0.0f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 28.2f)
                horizontalLineToRelative(0.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 81.9f, 110.1f)
                close()
                moveTo(174.1f, 174.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 28.2f)
                close()
                moveTo(230.1f, 70.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 28.2f)
                close()
            }
        }
        .build()
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
