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

public val TwotoneGroup.SettingsSystemDaydream: ImageVector
    get() {
        if (_settingsSystemDaydream != null) {
            return _settingsSystemDaydream!!
        }
        _settingsSystemDaydream = Builder(name = "SettingsSystemDaydream", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.87f)
                lineToRelative(-0.17f, -0.86f)
                curveTo(14.29f, 9.92f, 13.23f, 9.0f, 12.0f, 9.0f)
                curveToRelative(-0.96f, 0.0f, -1.84f, 0.57f, -2.26f, 1.45f)
                lineToRelative(-0.27f, 0.57f)
                horizontalLineToRelative(-0.73f)
                curveTo(7.74f, 11.15f, 7.0f, 11.99f, 7.0f, 13.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.66f, -1.16f, -3.05f, -2.74f, -3.41f)
                curveTo(15.66f, 8.28f, 13.95f, 7.0f, 12.0f, 7.0f)
                curveToRelative(-1.53f, 0.0f, -2.96f, 0.8f, -3.78f, 2.08f)
                curveTo(6.36f, 9.44f, 5.0f, 11.07f, 5.0f, 13.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(8.74f, 11.02f)
                horizontalLineToRelative(0.74f)
                lineToRelative(0.27f, -0.57f)
                curveTo(10.16f, 9.57f, 11.04f, 9.0f, 12.0f, 9.0f)
                curveToRelative(1.23f, 0.0f, 2.29f, 0.92f, 2.46f, 2.14f)
                lineToRelative(0.17f, 0.86f)
                horizontalLineToRelative(0.87f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(9.0f, 15.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.01f, 0.74f, -1.85f, 1.74f, -1.98f)
                close()
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(21.0f, 19.01f)
                lineTo(3.0f, 19.01f)
                lineTo(3.0f, 4.99f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.02f)
                close()
            }
        }
        .build()
        return _settingsSystemDaydream!!
    }

private var _settingsSystemDaydream: ImageVector? = null
