package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(315.4f, 15.5f)
                curveTo(309.7f, 5.9f, 299.2f, 0.0f, 288.0f, 0.0f)
                reflectiveCurveToRelative(-21.7f, 5.9f, -27.4f, 15.5f)
                lineToRelative(-96.0f, 160.0f)
                curveToRelative(-5.9f, 9.9f, -6.1f, 22.2f, -0.4f, 32.2f)
                reflectiveCurveToRelative(16.3f, 16.2f, 27.8f, 16.2f)
                horizontalLineTo(384.0f)
                curveToRelative(11.5f, 0.0f, 22.2f, -6.2f, 27.8f, -16.2f)
                reflectiveCurveToRelative(5.5f, -22.3f, -0.4f, -32.2f)
                lineToRelative(-96.0f, -160.0f)
                close()
                moveTo(288.0f, 312.0f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                horizontalLineTo(472.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                verticalLineTo(312.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                horizontalLineTo(328.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                close()
                moveTo(128.0f, 512.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 0.0f, -256.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null
