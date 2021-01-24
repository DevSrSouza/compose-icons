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

public val SolidGroup.EllipsisV: ImageVector
    get() {
        if (_ellipsisV != null) {
            return _ellipsisV!!
        }
        _ellipsisV = Builder(name = "EllipsisV", defaultWidth = 192.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 192.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 184.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                reflectiveCurveToRelative(-32.2f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.2f, -72.0f, -72.0f)
                reflectiveCurveToRelative(32.2f, -72.0f, 72.0f, -72.0f)
                close()
                moveTo(24.0f, 80.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(72.0f, -32.2f, 72.0f, -72.0f)
                reflectiveCurveTo(135.8f, 8.0f, 96.0f, 8.0f)
                reflectiveCurveTo(24.0f, 40.2f, 24.0f, 80.0f)
                close()
                moveTo(24.0f, 432.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(72.0f, -32.2f, 72.0f, -72.0f)
                reflectiveCurveToRelative(-32.2f, -72.0f, -72.0f, -72.0f)
                reflectiveCurveToRelative(-72.0f, 32.2f, -72.0f, 72.0f)
                close()
            }
        }
        .build()
        return _ellipsisV!!
    }

private var _ellipsisV: ImageVector? = null
