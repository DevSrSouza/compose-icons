package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.0f, 64.0f)
                horizontalLineToRelative(-79.0f)
                curveToRelative(-10.7f, 0.0f, -16.0f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-80.7f, 80.7f)
                curveToRelative(-22.2f, -14.0f, -48.5f, -22.1f, -76.7f, -22.1f)
                curveTo(64.5f, 160.0f, 0.0f, 224.5f, 0.0f, 304.0f)
                reflectiveCurveToRelative(64.5f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(80.7f, -80.7f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(7.6f, 7.6f, 20.5f, 2.2f, 20.5f, -8.5f)
                verticalLineTo(76.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(144.0f, 384.0f)
                curveToRelative(-44.1f, 0.0f, -80.0f, -35.9f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.9f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.9f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.9f, 80.0f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
