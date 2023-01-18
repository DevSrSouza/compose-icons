package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) {
            return _lineSegment!!
        }
        _lineSegment = Builder(name = "LineSegment", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.6f, 41.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -50.2f, 38.9f)
                lineTo(80.3f, 164.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -38.9f, 5.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, 45.2f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 45.2f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 5.0f, -38.9f)
                lineToRelative(84.1f, -84.1f)
                arcTo(32.7f, 32.7f, 0.0f, false, false, 192.0f, 96.0f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, false, 22.6f, -9.4f)
                arcTo(31.9f, 31.9f, 0.0f, false, false, 214.6f, 41.4f)
                close()
                moveTo(75.3f, 203.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -22.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 22.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 75.3f, 203.3f)
                close()
                moveTo(203.3f, 75.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -22.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.6f, 0.0f)
                close()
            }
        }
        .build()
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
