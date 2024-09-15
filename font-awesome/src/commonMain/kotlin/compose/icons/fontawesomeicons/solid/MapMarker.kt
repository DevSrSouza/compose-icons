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

public val SolidGroup.MapMarker: ImageVector
    get() {
        if (_mapMarker != null) {
            return _mapMarker!!
        }
        _mapMarker = Builder(name = "MapMarker", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.27f, 501.67f)
                curveTo(26.97f, 291.03f, 0.0f, 269.41f, 0.0f, 192.0f)
                curveTo(0.0f, 85.96f, 85.96f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveToRelative(192.0f, 85.96f, 192.0f, 192.0f)
                curveToRelative(0.0f, 77.41f, -26.97f, 99.03f, -172.27f, 309.67f)
                curveToRelative(-9.53f, 13.77f, -29.93f, 13.77f, -39.46f, 0.0f)
                close()
            }
        }
        .build()
        return _mapMarker!!
    }

private var _mapMarker: ImageVector? = null
