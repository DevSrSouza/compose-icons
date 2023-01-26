package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SettingsSuggest: ImageVector
    get() {
        if (_settingsSuggest != null) {
            return _settingsSuggest!!
        }
        _settingsSuggest = Builder(name = "SettingsSuggest", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.41f, 6.59f)
                lineTo(15.0f, 5.5f)
                lineToRelative(2.41f, -1.09f)
                lineTo(18.5f, 2.0f)
                lineToRelative(1.09f, 2.41f)
                lineTo(22.0f, 5.5f)
                lineToRelative(-2.41f, 1.09f)
                lineTo(18.5f, 9.0f)
                lineTo(17.41f, 6.59f)
                close()
                moveTo(21.28f, 12.72f)
                lineTo(20.5f, 11.0f)
                lineToRelative(-0.78f, 1.72f)
                lineTo(18.0f, 13.5f)
                lineToRelative(1.72f, 0.78f)
                lineTo(20.5f, 16.0f)
                lineToRelative(0.78f, -1.72f)
                lineTo(23.0f, 13.5f)
                lineTo(21.28f, 12.72f)
                close()
                moveTo(16.24f, 14.37f)
                lineToRelative(1.94f, 1.47f)
                lineToRelative(-2.5f, 4.33f)
                lineToRelative(-2.24f, -0.94f)
                curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f)
                lineTo(12.5f, 22.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(-0.3f, -2.41f)
                curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f)
                lineToRelative(-2.24f, 0.94f)
                lineToRelative(-2.5f, -4.33f)
                lineToRelative(1.94f, -1.47f)
                curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14.0f)
                reflectiveCurveToRelative(0.0f, -0.25f, 0.01f, -0.37f)
                lineToRelative(-1.94f, -1.47f)
                lineToRelative(2.5f, -4.33f)
                lineToRelative(2.24f, 0.94f)
                curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f)
                lineTo(7.5f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.3f, 2.41f)
                curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f)
                lineToRelative(2.24f, -0.94f)
                lineToRelative(2.5f, 4.33f)
                lineToRelative(-1.94f, 1.47f)
                curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f)
                reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f)
                close()
                moveTo(13.0f, 14.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveTo(13.0f, 15.66f, 13.0f, 14.0f)
                close()
            }
        }
        .build()
        return _settingsSuggest!!
    }

private var _settingsSuggest: ImageVector? = null
