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

public val SolidGroup.EllipsisH: ImageVector
    get() {
        if (_ellipsisH != null) {
            return _ellipsisH!!
        }
        _ellipsisH = Builder(name = "EllipsisH", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(328.0f, 256.0f)
                curveToRelative(0.0f, 39.8f, -32.2f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.2f, -72.0f, -72.0f)
                reflectiveCurveToRelative(32.2f, -72.0f, 72.0f, -72.0f)
                reflectiveCurveToRelative(72.0f, 32.2f, 72.0f, 72.0f)
                close()
                moveTo(432.0f, 184.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, 32.2f, -72.0f, 72.0f)
                reflectiveCurveToRelative(32.2f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(72.0f, -32.2f, 72.0f, -72.0f)
                reflectiveCurveToRelative(-32.2f, -72.0f, -72.0f, -72.0f)
                close()
                moveTo(80.0f, 184.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, 32.2f, -72.0f, 72.0f)
                reflectiveCurveToRelative(32.2f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(72.0f, -32.2f, 72.0f, -72.0f)
                reflectiveCurveToRelative(-32.2f, -72.0f, -72.0f, -72.0f)
                close()
            }
        }
        .build()
        return _ellipsisH!!
    }

private var _ellipsisH: ImageVector? = null
