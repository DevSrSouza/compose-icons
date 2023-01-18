package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.0f, 60.7f)
                curveTo(167.2f, 34.0f, 145.9f, 18.0f, 128.0f, 18.0f)
                reflectiveCurveTo(88.8f, 34.0f, 71.0f, 60.7f)
                reflectiveCurveTo(42.0f, 121.6f, 42.0f, 152.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 121.6f, 203.4f, 88.3f, 185.0f, 60.7f)
                close()
                moveTo(128.0f, 226.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -28.1f, 9.8f, -58.9f, 27.0f, -84.7f)
                curveTo(96.1f, 44.7f, 114.6f, 30.0f, 128.0f, 30.0f)
                reflectiveCurveToRelative(31.9f, 14.7f, 47.0f, 37.3f)
                curveToRelative(17.2f, 25.8f, 27.0f, 56.6f, 27.0f, 84.7f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 128.0f, 226.0f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
