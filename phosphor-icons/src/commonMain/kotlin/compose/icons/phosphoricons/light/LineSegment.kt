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

public val LightGroup.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) {
            return _lineSegment!!
        }
        _lineSegment = Builder(name = "LineSegment", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.2f, 42.8f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 167.0f, 80.5f)
                lineTo(80.5f, 167.0f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, -37.7f, 3.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.4f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 42.4f, 0.0f)
                arcTo(29.9f, 29.9f, 0.0f, false, false, 89.0f, 175.5f)
                lineTo(175.5f, 89.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 37.7f, -46.2f)
                close()
                moveTo(76.7f, 204.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.4f, -25.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.4f, 25.4f)
                close()
                moveTo(204.7f, 76.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.4f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.4f, 0.0f)
                close()
            }
        }
        .build()
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
