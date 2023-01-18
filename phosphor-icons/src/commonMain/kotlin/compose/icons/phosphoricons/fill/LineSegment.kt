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

public val FillGroup.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) {
            return _lineSegment!!
        }
        _lineSegment = Builder(name = "LineSegment", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.6f, 86.6f)
                arcTo(31.6f, 31.6f, 0.0f, false, true, 192.0f, 96.0f)
                arcToRelative(32.7f, 32.7f, 0.0f, false, true, -16.3f, -4.4f)
                lineTo(91.6f, 175.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -5.0f, 38.9f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, -45.2f, 0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, -45.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 38.9f, -5.0f)
                lineToRelative(84.1f, -84.1f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 50.2f, 6.3f)
                close()
            }
        }
        .build()
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
