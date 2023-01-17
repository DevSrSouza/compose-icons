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
        _glassWater = Builder(name = "GlassWater", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(55.1f, 0.0f, 46.6f, 3.7f, 40.6f, 10.2f)
                reflectiveCurveToRelative(-9.1f, 15.2f, -8.5f, 24.1f)
                lineTo(60.9f, 437.7f)
                curveToRelative(3.0f, 41.9f, 37.8f, 74.3f, 79.8f, 74.3f)
                lineTo(307.3f, 512.0f)
                curveToRelative(42.0f, 0.0f, 76.8f, -32.4f, 79.8f, -74.3f)
                lineTo(415.9f, 34.3f)
                curveToRelative(0.6f, -8.9f, -2.4f, -17.6f, -8.5f, -24.1f)
                reflectiveCurveTo(392.9f, 0.0f, 384.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(105.0f, 156.5f)
                lineTo(98.4f, 64.0f)
                lineTo(349.6f, 64.0f)
                lineTo(343.0f, 156.5f)
                lineToRelative(-24.2f, 12.1f)
                curveToRelative(-19.4f, 9.7f, -42.2f, 9.7f, -61.6f, 0.0f)
                curveToRelative(-20.9f, -10.4f, -45.5f, -10.4f, -66.4f, 0.0f)
                curveToRelative(-19.4f, 9.7f, -42.2f, 9.7f, -61.6f, 0.0f)
                lineTo(105.0f, 156.5f)
                close()
            }
        }
        .build()
        return _glassWater!!
    }

private var _glassWater: ImageVector? = null
