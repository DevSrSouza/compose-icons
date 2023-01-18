package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) {
            return _lineSegments!!
        }
        _lineSegments = Builder(name = "LineSegments", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.2f, 34.8f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.4f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.4f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 2.0f, 1.8f)
                lineToRelative(-28.2f, 52.3f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, -25.1f, 3.7f)
                lineTo(121.0f, 112.5f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 74.8f, 74.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.4f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 2.0f, 1.8f)
                lineTo(48.6f, 171.3f)
                arcToRelative(29.8f, 29.8f, 0.0f, false, false, -29.8f, 7.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.4f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 42.4f, 0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -42.4f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, -2.0f, -1.8f)
                lineToRelative(28.2f, -52.3f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 96.0f, 126.0f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 16.5f, -5.0f)
                lineTo(135.0f, 143.5f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 3.8f, 37.7f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 42.4f, 0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -42.4f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, -2.0f, -1.8f)
                lineToRelative(28.2f, -52.3f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 216.0f, 86.0f)
                arcToRelative(29.6f, 29.6f, 0.0f, false, false, 21.2f, -8.8f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 237.2f, 34.8f)
                close()
                moveTo(52.7f, 212.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.4f, -25.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.4f, 25.4f)
                close()
                moveTo(83.3f, 108.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, -25.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, 25.4f)
                close()
                moveTo(172.7f, 172.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.4f, -25.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.4f, 25.4f)
                close()
                moveTo(228.7f, 68.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.4f, -25.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.4f, 25.4f)
                close()
            }
        }
        .build()
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
