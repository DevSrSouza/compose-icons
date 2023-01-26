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

public val RoundGroup.SettingsBackupRestore: ImageVector
    get() {
        if (_settingsBackupRestore != null) {
            return _settingsBackupRestore!!
        }
        _settingsBackupRestore = Builder(name = "SettingsBackupRestore", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.77f, 3.0f)
                curveToRelative(-2.65f, 0.07f, -5.0f, 1.28f, -6.6f, 3.16f)
                lineTo(3.85f, 4.85f)
                curveTo(3.54f, 4.54f, 3.0f, 4.76f, 3.0f, 5.21f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 9.78f, 3.22f, 10.0f, 3.5f, 10.0f)
                horizontalLineToRelative(4.29f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(6.59f, 7.59f)
                curveTo(7.88f, 6.02f, 9.82f, 5.0f, 12.0f, 5.0f)
                curveToRelative(4.32f, 0.0f, 7.74f, 3.94f, 6.86f, 8.41f)
                curveToRelative(-0.54f, 2.77f, -2.81f, 4.98f, -5.58f, 5.47f)
                curveToRelative(-3.8f, 0.68f, -7.18f, -1.74f, -8.05f, -5.16f)
                curveTo(5.11f, 13.3f, 4.71f, 13.0f, 4.27f, 13.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.65f, 0.0f, -1.14f, 0.61f, -0.98f, 1.23f)
                curveTo(4.28f, 18.12f, 7.8f, 21.0f, 12.0f, 21.0f)
                curveToRelative(5.06f, 0.0f, 9.14f, -4.17f, 9.0f, -9.26f)
                curveTo(20.86f, 6.86f, 16.65f, 2.88f, 11.77f, 3.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveTo(14.0f, 13.1f, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _settingsBackupRestore!!
    }

private var _settingsBackupRestore: ImageVector? = null
