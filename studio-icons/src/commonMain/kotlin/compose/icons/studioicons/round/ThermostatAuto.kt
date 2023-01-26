package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ThermostatAuto: ImageVector
    get() {
        if (_thermostatAuto != null) {
            return _thermostatAuto!!
        }
        _thermostatAuto = Builder(name = "ThermostatAuto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.81f, 4.0f)
                lineTo(17.81f, 4.0f)
                curveToRelative(-0.48f, 0.0f, -0.92f, 0.3f, -1.09f, 0.75f)
                lineTo(14.0f, 12.02f)
                curveTo(13.82f, 12.49f, 14.17f, 13.0f, 14.67f, 13.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.31f, 0.0f, 0.58f, -0.19f, 0.68f, -0.48f)
                lineTo(16.0f, 10.7f)
                horizontalLineToRelative(3.63f)
                lineToRelative(0.64f, 1.82f)
                curveToRelative(0.1f, 0.29f, 0.38f, 0.48f, 0.68f, 0.48f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.51f, 0.0f, 0.86f, -0.51f, 0.68f, -0.98f)
                lineTo(18.9f, 4.75f)
                curveTo(18.73f, 4.3f, 18.3f, 4.0f, 17.81f, 4.0f)
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
