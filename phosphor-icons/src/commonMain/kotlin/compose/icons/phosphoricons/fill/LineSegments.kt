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

public val FillGroup.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) {
            return _lineSegments!!
        }
        _lineSegments = Builder(name = "LineSegments", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.6f, 78.6f)
                arcTo(31.6f, 31.6f, 0.0f, false, true, 216.0f, 88.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, true, -7.6f, -0.9f)
                lineToRelative(-26.7f, 49.4f)
                lineToRelative(0.9f, 0.9f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, 45.2f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, -45.2f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -5.0f, -38.9f)
                lineToRelative(-20.1f, -20.1f)
                arcTo(32.7f, 32.7f, 0.0f, false, true, 96.0f, 128.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, true, -7.6f, -0.9f)
                lineTo(61.7f, 176.5f)
                lineToRelative(0.9f, 0.9f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, 45.2f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, -45.2f, 0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, -45.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 30.2f, -8.5f)
                lineToRelative(26.7f, -49.4f)
                lineToRelative(-0.9f, -0.9f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, -45.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 50.2f, 38.9f)
                lineToRelative(20.1f, 20.1f)
                arcToRelative(32.4f, 32.4f, 0.0f, false, true, 23.9f, -3.5f)
                lineToRelative(26.7f, -49.4f)
                lineToRelative(-0.9f, -0.9f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, -45.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 45.2f, 45.2f)
                close()
            }
        }
        .build()
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
