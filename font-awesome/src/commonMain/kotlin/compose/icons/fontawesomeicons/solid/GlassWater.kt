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

public val SolidGroup.GlassWater: ImageVector
    get() {
        if (_glassWater != null) {
            return _glassWater!!
        }
        _glassWater = Builder(name = "GlassWater", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 0.0f)
                curveTo(23.1f, 0.0f, 14.6f, 3.7f, 8.6f, 10.2f)
                reflectiveCurveTo(-0.6f, 25.4f, 0.1f, 34.3f)
                lineTo(28.9f, 437.7f)
                curveToRelative(3.0f, 41.9f, 37.8f, 74.3f, 79.8f, 74.3f)
                horizontalLineTo(275.3f)
                curveToRelative(42.0f, 0.0f, 76.8f, -32.4f, 79.8f, -74.3f)
                lineTo(383.9f, 34.3f)
                curveToRelative(0.6f, -8.9f, -2.4f, -17.6f, -8.5f, -24.1f)
                reflectiveCurveTo(360.9f, 0.0f, 352.0f, 0.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(73.0f, 156.5f)
                lineTo(66.4f, 64.0f)
                horizontalLineTo(317.6f)
                lineTo(311.0f, 156.5f)
                lineToRelative(-24.2f, 12.1f)
                curveToRelative(-19.4f, 9.7f, -42.2f, 9.7f, -61.6f, 0.0f)
                curveToRelative(-20.9f, -10.4f, -45.5f, -10.4f, -66.4f, 0.0f)
                curveToRelative(-19.4f, 9.7f, -42.2f, 9.7f, -61.6f, 0.0f)
                lineTo(73.0f, 156.5f)
                close()
            }
        }
        .build()
        return _glassWater!!
    }

private var _glassWater: ImageVector? = null
