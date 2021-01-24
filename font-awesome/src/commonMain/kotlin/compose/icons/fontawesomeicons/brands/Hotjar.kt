package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Hotjar: ImageVector
    get() {
        if (_hotjar != null) {
            return _hotjar!!
        }
        _hotjar = Builder(name = "Hotjar", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.9f, 161.5f)
                curveTo(340.2f, 29.0f, 121.1f, 0.0f, 121.1f, 0.0f)
                reflectiveCurveTo(222.2f, 110.4f, 93.0f, 197.7f)
                curveTo(11.3f, 252.8f, -21.0f, 324.4f, 14.0f, 402.6f)
                curveToRelative(26.8f, 59.9f, 83.5f, 84.3f, 144.6f, 93.4f)
                curveToRelative(-29.2f, -55.1f, -6.6f, -122.4f, -4.1f, -129.6f)
                curveToRelative(57.1f, 86.4f, 165.0f, 0.0f, 110.8f, -93.9f)
                curveToRelative(71.0f, 15.4f, 81.6f, 138.6f, 27.1f, 215.5f)
                curveToRelative(80.5f, -25.3f, 134.1f, -88.9f, 148.8f, -145.6f)
                curveToRelative(15.5f, -59.3f, 3.7f, -127.9f, -26.3f, -180.9f)
                close()
            }
        }
        .build()
        return _hotjar!!
    }

private var _hotjar: ImageVector? = null
