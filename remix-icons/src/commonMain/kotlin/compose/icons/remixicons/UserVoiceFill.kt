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

public val RemixIcons.UserVoiceFill: ImageVector
    get() {
        if (_userVoiceFill != null) {
            return _userVoiceFill!!
        }
        _userVoiceFill = Builder(name = "UserVoiceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                lineTo(1.0f, 22.0f)
                close()
                moveTo(9.0f, 13.0f)
                curveToRelative(-3.315f, 0.0f, -6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(18.246f, 3.184f)
                arcTo(9.97f, 9.97f, 0.0f, false, true, 19.0f, 7.0f)
                arcToRelative(9.97f, 9.97f, 0.0f, false, true, -0.754f, 3.816f)
                lineToRelative(-1.677f, -1.22f)
                arcTo(7.99f, 7.99f, 0.0f, false, false, 17.0f, 7.0f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, -0.43f, -2.596f)
                lineToRelative(1.676f, -1.22f)
                close()
                moveTo(21.548f, 0.784f)
                arcTo(13.942f, 13.942f, 0.0f, false, true, 23.0f, 7.0f)
                curveToRelative(0.0f, 2.233f, -0.523f, 4.344f, -1.452f, 6.216f)
                lineToRelative(-1.645f, -1.196f)
                arcTo(11.955f, 11.955f, 0.0f, false, false, 21.0f, 7.0f)
                curveToRelative(0.0f, -1.792f, -0.393f, -3.493f, -1.097f, -5.02f)
                lineTo(21.548f, 0.784f)
                close()
            }
        }
        .build()
        return _userVoiceFill!!
    }

private var _userVoiceFill: ImageVector? = null
