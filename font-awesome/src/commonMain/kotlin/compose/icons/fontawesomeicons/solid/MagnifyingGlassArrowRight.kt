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

public val SolidGroup.MagnifyingGlassArrowRight: ImageVector
    get() {
        if (_magnifyingGlassArrowRight != null) {
            return _magnifyingGlassArrowRight!!
        }
        _magnifyingGlassArrowRight = Builder(name = "MagnifyingGlassArrowRight", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 208.0f)
                curveToRelative(0.0f, 45.9f, -14.9f, 88.3f, -40.0f, 122.7f)
                lineTo(502.6f, 457.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineTo(330.7f, 376.0f)
                curveToRelative(-34.4f, 25.2f, -76.8f, 40.0f, -122.7f, 40.0f)
                curveTo(93.1f, 416.0f, 0.0f, 322.9f, 0.0f, 208.0f)
                reflectiveCurveTo(93.1f, 0.0f, 208.0f, 0.0f)
                reflectiveCurveTo(416.0f, 93.1f, 416.0f, 208.0f)
                close()
                moveTo(241.0f, 119.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(31.0f, 31.0f)
                horizontalLineTo(120.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineTo(238.1f)
                lineToRelative(-31.0f, 31.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(72.0f, -72.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-72.0f, -72.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassArrowRight!!
    }

private var _magnifyingGlassArrowRight: ImageVector? = null
