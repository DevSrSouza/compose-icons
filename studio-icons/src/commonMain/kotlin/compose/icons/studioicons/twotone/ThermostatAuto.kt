package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ThermostatAuto: ImageVector
    get() {
        if (_thermostatAuto != null) {
            return _thermostatAuto!!
        }
        _thermostatAuto = Builder(name = "ThermostatAuto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8f, 13.6f)
                lineTo(9.0f, 13.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(7.0f, 5.45f, 7.0f, 6.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-0.8f, 0.6f)
                curveTo(5.45f, 14.16f, 5.0f, 15.06f, 5.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                curveTo(11.0f, 15.06f, 10.55f, 14.17f, 9.8f, 13.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(5.0f, 4.34f, 5.0f, 6.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(-1.21f, 0.91f, -2.0f, 2.37f, -2.0f, 4.0f)
                curveToRelative(0.0f, 1.12f, 0.38f, 2.14f, 1.0f, 2.97f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.91f, 1.21f, 2.35f, 2.0f, 3.98f, 2.0f)
                reflectiveCurveToRelative(3.06f, -0.79f, 3.98f, -2.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.62f, -0.83f, 1.0f, -1.85f, 1.0f, -2.97f)
                curveTo(13.0f, 14.37f, 12.21f, 12.91f, 11.0f, 12.0f)
                close()
                moveTo(5.0f, 16.0f)
                curveToRelative(0.0f, -0.94f, 0.45f, -1.84f, 1.2f, -2.4f)
                lineTo(7.0f, 13.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(0.8f, 0.6f)
                curveToRelative(0.75f, 0.57f, 1.2f, 1.46f, 1.2f, 2.4f)
                horizontalLineTo(5.0f)
                close()
                moveTo(18.62f, 4.0f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(-3.38f, 9.0f)
                horizontalLineToRelative(1.56f)
                lineTo(16.0f, 10.7f)
                horizontalLineToRelative(3.63f)
                lineToRelative(0.8f, 2.3f)
                horizontalLineTo(22.0f)
                lineTo(18.62f, 4.0f)
                close()
                moveTo(16.47f, 9.39f)
                lineToRelative(1.31f, -3.72f)
                horizontalLineToRelative(0.08f)
                lineToRelative(1.31f, 3.72f)
                horizontalLineTo(16.47f)
                close()
            }
        }
        .build()
        return _thermostatAuto!!
    }

private var _thermostatAuto: ImageVector? = null
