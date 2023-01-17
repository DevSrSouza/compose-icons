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

public val SolidGroup.MagnifyingGlassChart: ImageVector
    get() {
        if (_magnifyingGlassChart != null) {
            return _magnifyingGlassChart!!
        }
        _magnifyingGlassChart = Builder(name = "MagnifyingGlassChart", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(104.0f, 216.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                close()
                moveTo(184.0f, 120.0f)
                lineTo(184.0f, 280.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(232.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                close()
                moveTo(264.0f, 184.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(312.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassChart!!
    }

private var _magnifyingGlassChart: ImageVector? = null
