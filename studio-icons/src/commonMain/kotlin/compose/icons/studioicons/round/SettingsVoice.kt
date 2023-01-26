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

public val RoundGroup.SettingsVoice: ImageVector
    get() {
        if (_settingsVoice != null) {
            return _settingsVoice!!
        }
        _settingsVoice = Builder(name = "SettingsVoice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(7.0f, 23.55f, 7.45f, 24.0f, 8.0f, 24.0f)
                close()
                moveTo(12.0f, 24.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(11.0f, 23.55f, 11.45f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(16.0f, 24.0f)
                lineTo(16.0f, 24.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(15.0f, 23.55f, 15.45f, 24.0f, 16.0f, 24.0f)
                close()
                moveTo(9.0f, 10.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveTo(9.0f, 11.66f, 9.0f, 10.0f)
                close()
                moveTo(17.91f, 10.0f)
                curveToRelative(0.61f, 0.0f, 1.09f, 0.54f, 1.0f, 1.14f)
                curveToRelative(-0.49f, 3.0f, -2.89f, 5.34f, -5.91f, 5.78f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.08f)
                curveToRelative(-3.02f, -0.44f, -5.42f, -2.78f, -5.91f, -5.78f)
                curveToRelative(-0.1f, -0.6f, 0.39f, -1.14f, 1.0f, -1.14f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.49f, 0.0f, 0.9f, 0.36f, 0.98f, 0.85f)
                curveTo(7.48f, 13.21f, 9.53f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveToRelative(4.52f, -1.79f, 4.93f, -4.15f)
                curveTo(17.01f, 10.36f, 17.42f, 10.0f, 17.91f, 10.0f)
                lineTo(17.91f, 10.0f)
                close()
            }
        }
        .build()
        return _settingsVoice!!
    }

private var _settingsVoice: ImageVector? = null
