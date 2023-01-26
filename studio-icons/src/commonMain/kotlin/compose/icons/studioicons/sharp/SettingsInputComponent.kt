package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SettingsInputComponent: ImageVector
    get() {
        if (_settingsInputComponent != null) {
            return _settingsInputComponent!!
        }
        _settingsInputComponent = Builder(name = "SettingsInputComponent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(1.0f, 6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(7.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(9.0f, 18.82f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(4.82f)
                close()
                moveTo(1.0f, 18.82f)
                horizontalLineToRelative(2.0f)
                lineTo(3.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 14.0f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(4.82f)
                close()
                moveTo(21.0f, 6.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(23.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 2.0f)
                close()
                moveTo(17.0f, 18.82f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.82f)
                close()
            }
        }
        .build()
        return _settingsInputComponent!!
    }

private var _settingsInputComponent: ImageVector? = null
