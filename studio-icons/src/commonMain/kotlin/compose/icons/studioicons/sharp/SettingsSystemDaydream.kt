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

public val SharpGroup.SettingsSystemDaydream: ImageVector
    get() {
        if (_settingsSystemDaydream != null) {
            return _settingsSystemDaydream!!
        }
        _settingsSystemDaydream = Builder(name = "SettingsSystemDaydream", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(16.88f, 11.0f, 15.5f, 11.0f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3.0f, -3.45f, -3.0f)
                curveToRelative(-1.4f, 0.0f, -2.6f, 0.83f, -3.16f, 2.02f)
                horizontalLineToRelative(-0.16f)
                curveTo(7.17f, 10.18f, 6.0f, 11.45f, 6.0f, 13.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(23.0f, 3.0f)
                lineTo(1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 3.0f)
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
