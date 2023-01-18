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

public val RemixIcons.UserLocationLine: ImageVector
    get() {
        if (_userLocationLine != null) {
            return _userLocationLine!!
        }
        _userLocationLine = Builder(name = "UserLocationLine", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(20.828f, 21.071f)
                lineTo(18.0f, 24.0f)
                lineToRelative(-2.828f, -2.929f)
                curveToRelative(-1.563f, -1.618f, -1.563f, -4.24f, 0.0f, -5.858f)
                arcToRelative(3.904f, 3.904f, 0.0f, false, true, 5.656f, 0.0f)
                curveToRelative(1.563f, 1.618f, 1.563f, 4.24f, 0.0f, 5.858f)
                close()
                moveTo(19.39f, 19.681f)
                curveToRelative(0.813f, -0.842f, 0.813f, -2.236f, 0.0f, -3.078f)
                arcToRelative(1.904f, 1.904f, 0.0f, false, false, -2.78f, 0.0f)
                curveToRelative(-0.813f, 0.842f, -0.813f, 2.236f, 0.0f, 3.079f)
                lineTo(18.0f, 21.12f)
                lineToRelative(1.39f, -1.44f)
                close()
            }
        }
        .build()
        return _userLocationLine!!
    }

private var _userLocationLine: ImageVector? = null
