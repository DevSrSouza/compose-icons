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

public val TwotoneGroup.SettingsInputHdmi: ImageVector
    get() {
        if (_settingsInputHdmi != null) {
            return _settingsInputHdmi!!
        }
        _settingsInputHdmi = Builder(name = "SettingsInputHdmi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.53f)
                lineToRelative(2.79f, 5.58f)
                lineToRelative(0.21f, 0.42f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.47f)
                lineToRelative(0.21f, -0.42f)
                lineTo(17.0f, 12.53f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                lineTo(18.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(8.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(3.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(3.0f, -6.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.01f)
                lineTo(13.99f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(17.0f, 12.53f)
                lineToRelative(-3.0f, 6.0f)
                lineTo(14.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.47f)
                lineToRelative(-3.0f, -6.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.53f)
                close()
            }
        }
        .build()
        return _settingsInputHdmi!!
    }

private var _settingsInputHdmi: ImageVector? = null
