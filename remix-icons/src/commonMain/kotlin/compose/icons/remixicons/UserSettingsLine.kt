package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.UserSettingsLine: ImageVector
    get() {
        if (_userSettingsLine != null) {
            return _userSettingsLine!!
        }
        _userSettingsLine = Builder(name = "UserSettingsLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-3.315f, 0.0f, -6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(14.595f, 18.812f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, 0.0f, -1.623f)
                lineToRelative(-0.992f, -0.573f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(0.992f, 0.573f)
                arcTo(3.496f, 3.496f, 0.0f, false, true, 17.0f, 14.645f)
                lineTo(17.0f, 13.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.145f)
                curveToRelative(0.532f, 0.158f, 1.012f, 0.44f, 1.405f, 0.812f)
                lineToRelative(0.992f, -0.573f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(-0.992f, 0.573f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, 0.0f, 1.622f)
                lineToRelative(0.992f, 0.573f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(-0.992f, -0.573f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, true, -1.405f, 0.812f)
                lineTo(19.0f, 22.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.145f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, true, -1.405f, -0.812f)
                lineToRelative(-0.992f, 0.573f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(0.992f, -0.572f)
                close()
                moveTo(18.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _userSettingsLine!!
    }

private var _userSettingsLine: ImageVector? = null
