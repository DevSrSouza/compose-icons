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

public val RegularGroup.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) {
            return _lineSegments!!
        }
        _lineSegments = Builder(name = "LineSegments", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.6f, 33.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -45.2f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, 45.2f)
                lineToRelative(0.9f, 0.9f)
                lineToRelative(-26.7f, 49.4f)
                arcToRelative(32.4f, 32.4f, 0.0f, false, false, -23.9f, 3.5f)
                lineToRelative(-20.1f, -20.1f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 73.4f, 73.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, 45.2f)
                lineToRelative(0.9f, 0.9f)
                lineTo(47.6f, 168.9f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -30.2f, 8.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, 45.2f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 45.2f, 0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, -45.2f)
                lineToRelative(-0.9f, -0.9f)
                lineToRelative(26.7f, -49.4f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, 7.6f, 0.9f)
                arcToRelative(32.7f, 32.7f, 0.0f, false, false, 16.3f, -4.4f)
                lineToRelative(20.1f, 20.1f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 5.0f, 38.9f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 45.2f, 0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, -45.2f)
                lineToRelative(-0.9f, -0.9f)
                lineToRelative(26.7f, -49.4f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, 7.6f, 0.9f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, false, 22.6f, -9.4f)
                arcTo(31.9f, 31.9f, 0.0f, false, false, 238.6f, 33.4f)
                close()
                moveTo(51.3f, 211.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -22.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.6f, 22.6f)
                close()
                moveTo(84.7f, 107.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, -22.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.6f)
                close()
                moveTo(171.3f, 171.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -22.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.6f, 22.6f)
                close()
                moveTo(227.3f, 67.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -22.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.6f, 22.6f)
                close()
            }
        }
        .build()
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
