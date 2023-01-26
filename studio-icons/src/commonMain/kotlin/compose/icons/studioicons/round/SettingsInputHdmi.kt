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

public val RoundGroup.SettingsInputHdmi: ImageVector
    get() {
        if (_settingsInputHdmi != null) {
            return _settingsInputHdmi!!
        }
        _settingsInputHdmi = Builder(name = "SettingsInputHdmi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveTo(5.45f, 7.0f, 5.0f, 7.45f, 5.0f, 8.0f)
                verticalLineToRelative(4.7f)
                curveToRelative(0.0f, 0.2f, 0.06f, 0.39f, 0.17f, 0.55f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(2.83f, -5.75f)
                curveTo(18.94f, 13.09f, 19.0f, 12.89f, 19.0f, 12.7f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 7.45f, 18.55f, 7.0f, 18.0f, 7.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.5f)
                curveTo(14.0f, 5.22f, 13.78f, 5.0f, 13.5f, 5.0f)
                reflectiveCurveTo(13.0f, 5.22f, 13.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.5f)
                curveTo(11.0f, 5.22f, 10.78f, 5.0f, 10.5f, 5.0f)
                reflectiveCurveTo(10.0f, 5.22f, 10.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _settingsInputHdmi!!
    }

private var _settingsInputHdmi: ImageVector? = null
