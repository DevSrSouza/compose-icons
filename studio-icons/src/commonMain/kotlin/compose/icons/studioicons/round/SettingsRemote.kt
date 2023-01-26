package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SettingsRemote: ImageVector
    get() {
        if (_settingsRemote != null) {
            return _settingsRemote!!
        }
        _settingsRemote = Builder(name = "SettingsRemote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(10.0f)
                curveTo(16.0f, 9.45f, 15.55f, 9.0f, 15.0f, 9.0f)
                close()
                moveTo(12.0f, 14.25f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveTo(12.69f, 14.25f, 12.0f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.82f, 6.82f)
                lineTo(7.82f, 6.82f)
                curveToRelative(0.35f, 0.35f, 0.9f, 0.38f, 1.3f, 0.1f)
                curveTo(9.93f, 6.34f, 10.93f, 6.0f, 12.0f, 6.0f)
                curveToRelative(1.07f, 0.0f, 2.07f, 0.34f, 2.88f, 0.91f)
                curveToRelative(0.4f, 0.28f, 0.95f, 0.26f, 1.3f, -0.09f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.43f, -0.43f, 0.39f, -1.15f, -0.09f, -1.5f)
                curveTo(14.94f, 4.49f, 13.53f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-1.53f, 0.0f, -2.94f, 0.49f, -4.09f, 1.32f)
                curveTo(7.42f, 5.67f, 7.39f, 6.39f, 7.82f, 6.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(9.36f, 0.0f, 6.94f, 0.93f, 5.05f, 2.47f)
                curveToRelative(-0.46f, 0.38f, -0.5f, 1.07f, -0.08f, 1.49f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.36f, 0.36f, 0.93f, 0.39f, 1.32f, 0.07f)
                curveTo(7.84f, 2.77f, 9.83f, 2.0f, 12.0f, 2.0f)
                curveToRelative(2.17f, 0.0f, 4.16f, 0.77f, 5.7f, 2.04f)
                curveToRelative(0.39f, 0.32f, 0.96f, 0.29f, 1.32f, -0.07f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.42f, -0.42f, 0.38f, -1.11f, -0.08f, -1.49f)
                curveTo(17.06f, 0.93f, 14.64f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _settingsRemote!!
    }

private var _settingsRemote: ImageVector? = null
