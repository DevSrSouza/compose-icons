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

public val BoldGroup.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) {
            return _lineSegments!!
        }
        _lineSegments = Builder(name = "LineSegments", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.5f, 30.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -51.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -1.2f, 49.7f)
                lineToRelative(-23.8f, 44.2f)
                arcToRelative(37.2f, 37.2f, 0.0f, false, false, -21.0f, 3.1f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -58.0f, -41.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -1.2f, 49.7f)
                lineTo(45.5f, 164.4f)
                arcToRelative(36.5f, 36.5f, 0.0f, false, false, -31.0f, 10.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, true, false, 52.2f, 1.3f)
                lineToRelative(23.8f, -44.2f)
                arcToRelative(50.9f, 50.9f, 0.0f, false, false, 5.5f, 0.4f)
                arcToRelative(36.5f, 36.5f, 0.0f, false, false, 15.5f, -3.5f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 59.2f, -8.7f)
                lineToRelative(23.8f, -44.2f)
                arcToRelative(50.9f, 50.9f, 0.0f, false, false, 5.5f, 0.4f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 25.5f, -61.5f)
                close()
                moveTo(87.5f, 87.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                close()
                moveTo(48.5f, 208.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(168.5f, 168.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(224.5f, 64.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
