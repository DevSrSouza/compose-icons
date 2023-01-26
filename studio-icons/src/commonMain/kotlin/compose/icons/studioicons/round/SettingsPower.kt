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

public val RoundGroup.SettingsPower: ImageVector
    get() {
        if (_settingsPower != null) {
            return _settingsPower!!
        }
        _settingsPower = Builder(name = "SettingsPower", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(3.0f)
                curveTo(13.0f, 2.45f, 12.55f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.94f, 5.06f)
                lineToRelative(-0.02f, 0.02f)
                curveTo(15.51f, 5.49f, 15.56f, 6.16f, 16.0f, 6.54f)
                curveToRelative(1.51f, 1.34f, 2.33f, 3.43f, 1.88f, 5.7f)
                curveToRelative(-0.46f, 2.28f, -2.29f, 4.14f, -4.56f, 4.62f)
                curveTo(9.43f, 17.69f, 6.0f, 14.74f, 6.0f, 11.0f)
                curveToRelative(0.0f, -1.78f, 0.78f, -3.37f, 2.01f, -4.47f)
                curveToRelative(0.43f, -0.39f, 0.47f, -1.04f, 0.07f, -1.45f)
                lineTo(8.06f, 5.06f)
                curveTo(7.69f, 4.69f, 7.1f, 4.67f, 6.7f, 5.02f)
                curveToRelative(-2.01f, 1.77f, -3.12f, 4.53f, -2.56f, 7.52f)
                curveToRelative(0.59f, 3.15f, 3.11f, 5.7f, 6.26f, 6.31f)
                curveToRelative(5.12f, 0.99f, 9.6f, -2.9f, 9.6f, -7.85f)
                curveToRelative(0.0f, -2.38f, -1.05f, -4.52f, -2.71f, -5.99f)
                curveTo(16.9f, 4.67f, 16.31f, 4.69f, 15.94f, 5.06f)
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
        return _settingsPower!!
    }

private var _settingsPower: ImageVector? = null
