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

public val RoundGroup.SettingsAccessibility: ImageVector
    get() {
        if (_settingsAccessibility != null) {
            return _settingsAccessibility!!
        }
        _settingsAccessibility = Builder(name = "SettingsAccessibility", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.74f, 4.96f)
                curveToRelative(-0.13f, -0.53f, -0.67f, -0.85f, -1.2f, -0.73f)
                curveTo(17.16f, 4.77f, 14.49f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(6.84f, 4.77f, 4.46f, 4.24f)
                curveToRelative(-0.54f, -0.12f, -1.07f, 0.19f, -1.2f, 0.73f)
                lineTo(3.24f, 5.02f)
                curveTo(3.11f, 5.56f, 3.43f, 6.12f, 3.97f, 6.24f)
                curveTo(5.59f, 6.61f, 7.34f, 6.86f, 9.0f, 7.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(7.0f)
                curveToRelative(1.66f, -0.14f, 3.41f, -0.39f, 5.03f, -0.76f)
                curveToRelative(0.54f, -0.12f, 0.86f, -0.68f, 0.73f, -1.22f)
                lineTo(20.74f, 4.96f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(10.9f, 4.0f, 12.0f, 4.0f)
                close()
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
            }
        }
        .build()
        return _settingsAccessibility!!
    }

private var _settingsAccessibility: ImageVector? = null
