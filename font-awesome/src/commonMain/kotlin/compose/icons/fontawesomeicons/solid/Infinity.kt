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

public val SolidGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.1f, 96.0f)
                curveTo(405.0f, 96.0f, 353.3f, 137.3f, 320.0f, 174.6f)
                curveTo(286.7f, 137.3f, 235.0f, 96.0f, 168.9f, 96.0f)
                curveTo(75.8f, 96.0f, 0.0f, 167.8f, 0.0f, 256.0f)
                reflectiveCurveToRelative(75.8f, 160.0f, 168.9f, 160.0f)
                curveToRelative(66.1f, 0.0f, 117.8f, -41.3f, 151.1f, -78.6f)
                curveToRelative(33.3f, 37.3f, 85.0f, 78.6f, 151.1f, 78.6f)
                curveToRelative(93.1f, 0.0f, 168.9f, -71.8f, 168.9f, -160.0f)
                reflectiveCurveTo(564.2f, 96.0f, 471.1f, 96.0f)
                close()
                moveTo(168.9f, 320.0f)
                curveToRelative(-40.2f, 0.0f, -72.9f, -28.7f, -72.9f, -64.0f)
                reflectiveCurveToRelative(32.7f, -64.0f, 72.9f, -64.0f)
                curveToRelative(38.2f, 0.0f, 73.4f, 36.1f, 94.0f, 64.0f)
                curveToRelative(-20.4f, 27.6f, -55.9f, 64.0f, -94.0f, 64.0f)
                close()
                moveTo(471.1f, 320.0f)
                curveToRelative(-38.2f, 0.0f, -73.4f, -36.1f, -94.0f, -64.0f)
                curveToRelative(20.4f, -27.6f, 55.9f, -64.0f, 94.0f, -64.0f)
                curveToRelative(40.2f, 0.0f, 72.9f, 28.7f, 72.9f, 64.0f)
                reflectiveCurveToRelative(-32.7f, 64.0f, -72.9f, 64.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
