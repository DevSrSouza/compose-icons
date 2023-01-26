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

public val OutlineGroup.SettingsAccessibility: ImageVector
    get() {
        if (_settingsAccessibility != null) {
            return _settingsAccessibility!!
        }
        _settingsAccessibility = Builder(name = "SettingsAccessibility", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 4.0f)
                curveToRelative(-2.61f, 0.7f, -5.67f, 1.0f, -8.5f, 1.0f)
                reflectiveCurveTo(6.11f, 4.7f, 3.5f, 4.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(1.86f, 0.5f, 4.0f, 0.83f, 6.0f, 1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                curveToRelative(2.0f, -0.17f, 4.14f, -0.5f, 6.0f, -1.0f)
                lineTo(20.5f, 4.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(10.9f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(7.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                close()
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(24.0f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _settingsAccessibility!!
    }

private var _settingsAccessibility: ImageVector? = null
