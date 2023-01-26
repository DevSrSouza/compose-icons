package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SettingsInputSvideo: ImageVector
    get() {
        if (_settingsInputSvideo != null) {
            return _settingsInputSvideo!!
        }
        _settingsInputSvideo = Builder(name = "SettingsInputSvideo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(5.0f, 10.67f, 5.0f, 11.5f)
                reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f)
                reflectiveCurveTo(8.0f, 12.33f, 8.0f, 11.5f)
                close()
                moveTo(15.0f, 6.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(9.67f, 5.0f, 9.0f, 5.67f, 9.0f, 6.5f)
                reflectiveCurveTo(9.67f, 8.0f, 10.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(8.5f, 15.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveTo(7.67f, 18.0f, 8.5f, 18.0f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(9.33f, 15.0f, 8.5f, 15.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.93f, 1.0f, 1.0f, 5.93f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.93f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.93f, 11.0f, -11.0f)
                reflectiveCurveTo(18.07f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.96f, 0.0f, -9.0f, -4.04f, -9.0f, -9.0f)
                reflectiveCurveToRelative(4.04f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.04f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.04f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(17.5f, 10.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 15.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _settingsInputSvideo!!
    }

private var _settingsInputSvideo: ImageVector? = null
