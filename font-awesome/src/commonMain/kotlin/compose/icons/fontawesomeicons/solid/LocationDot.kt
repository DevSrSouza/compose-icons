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

public val SolidGroup.LocationDot: ImageVector
    get() {
        if (_locationDot != null) {
            return _locationDot!!
        }
        _locationDot = Builder(name = "LocationDot", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.7f, 499.2f)
                curveTo(267.0f, 435.0f, 384.0f, 279.4f, 384.0f, 192.0f)
                curveTo(384.0f, 86.0f, 298.0f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveTo(0.0f, 86.0f, 0.0f, 192.0f)
                curveToRelative(0.0f, 87.4f, 117.0f, 243.0f, 168.3f, 307.2f)
                curveToRelative(12.3f, 15.3f, 35.1f, 15.3f, 47.4f, 0.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                close()
            }
        }
        .build()
        return _locationDot!!
    }

private var _locationDot: ImageVector? = null
