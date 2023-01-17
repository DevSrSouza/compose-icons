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

public val SolidGroup.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.1f, 235.3f)
                curveToRelative(33.7f, 20.7f, 62.9f, 48.1f, 85.8f, 80.5f)
                curveToRelative(7.0f, 9.9f, 13.4f, 20.3f, 19.1f, 31.0f)
                curveToRelative(5.7f, -10.8f, 12.1f, -21.1f, 19.1f, -31.0f)
                curveToRelative(22.9f, -32.4f, 52.1f, -59.8f, 85.8f, -80.5f)
                curveTo(437.6f, 207.8f, 490.1f, 192.0f, 546.0f, 192.0f)
                horizontalLineToRelative(9.9f)
                curveToRelative(11.1f, 0.0f, 20.1f, 9.0f, 20.1f, 20.1f)
                curveTo(576.0f, 360.1f, 456.1f, 480.0f, 308.1f, 480.0f)
                horizontalLineTo(288.0f)
                horizontalLineTo(267.9f)
                curveTo(119.9f, 480.0f, 0.0f, 360.1f, 0.0f, 212.1f)
                curveTo(0.0f, 201.0f, 9.0f, 192.0f, 20.1f, 192.0f)
                horizontalLineTo(30.0f)
                curveToRelative(55.9f, 0.0f, 108.4f, 15.8f, 153.1f, 43.3f)
                close()
                moveTo(301.5f, 37.6f)
                curveToRelative(15.7f, 16.9f, 61.1f, 71.8f, 84.4f, 164.6f)
                curveToRelative(-38.0f, 21.6f, -71.4f, 50.8f, -97.9f, 85.6f)
                curveToRelative(-26.5f, -34.8f, -59.9f, -63.9f, -97.9f, -85.6f)
                curveToRelative(23.2f, -92.8f, 68.6f, -147.7f, 84.4f, -164.6f)
                curveTo(278.0f, 33.9f, 282.9f, 32.0f, 288.0f, 32.0f)
                reflectiveCurveToRelative(10.0f, 1.9f, 13.5f, 5.6f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
