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

public val SolidGroup.Droplet: ImageVector
    get() {
        if (_droplet != null) {
            return _droplet!!
        }
        _droplet = Builder(name = "Droplet", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 512.0f)
                curveTo(86.0f, 512.0f, 0.0f, 426.0f, 0.0f, 320.0f)
                curveTo(0.0f, 228.8f, 130.2f, 57.7f, 166.6f, 11.7f)
                curveTo(172.6f, 4.2f, 181.5f, 0.0f, 191.1f, 0.0f)
                horizontalLineToRelative(1.8f)
                curveToRelative(9.6f, 0.0f, 18.5f, 4.2f, 24.5f, 11.7f)
                curveTo(253.8f, 57.7f, 384.0f, 228.8f, 384.0f, 320.0f)
                curveToRelative(0.0f, 106.0f, -86.0f, 192.0f, -192.0f, 192.0f)
                close()
                moveTo(96.0f, 336.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _droplet!!
    }

private var _droplet: ImageVector? = null
