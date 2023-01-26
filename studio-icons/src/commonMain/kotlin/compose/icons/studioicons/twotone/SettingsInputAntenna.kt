package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SettingsInputAntenna: ImageVector
    get() {
        if (_settingsInputAntenna != null) {
            return _settingsInputAntenna!!
        }
        _settingsInputAntenna = Builder(name = "SettingsInputAntenna", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(13.0f, 14.29f)
                curveToRelative(0.88f, -0.39f, 1.5f, -1.26f, 1.5f, -2.29f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(9.5f, 10.62f, 9.5f, 12.0f)
                curveToRelative(0.0f, 1.02f, 0.62f, 1.9f, 1.5f, 2.29f)
                verticalLineToRelative(3.3f)
                lineTo(7.59f, 21.0f)
                lineTo(9.0f, 22.41f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(16.41f, 21.0f)
                lineTo(13.0f, 17.59f)
                verticalLineToRelative(-3.3f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.93f, 1.0f, 1.0f, 5.93f, 1.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.03f, 9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -6.07f, -4.93f, -11.0f, -11.0f, -11.0f)
                close()
            }
        }
        .build()
        return _settingsInputAntenna!!
    }

private var _settingsInputAntenna: ImageVector? = null
