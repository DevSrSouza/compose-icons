package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UserDoctor: ImageVector
    get() {
        if (_userDoctor != null) {
            return _userDoctor!!
        }
        _userDoctor = Builder(name = "UserDoctor", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 224.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
                moveTo(128.0f, 311.2f)
                curveTo(54.0f, 332.9f, 0.0f, 401.3f, 0.0f, 482.3f)
                curveTo(0.0f, 498.7f, 13.3f, 512.0f, 29.7f, 512.0f)
                lineTo(418.3f, 512.0f)
                curveToRelative(16.4f, 0.0f, 29.7f, -13.3f, 29.7f, -29.7f)
                curveToRelative(0.0f, -81.0f, -54.0f, -149.4f, -128.0f, -171.1f)
                lineTo(320.0f, 362.0f)
                curveToRelative(27.6f, 7.1f, 48.0f, 32.2f, 48.0f, 62.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(336.0f, 480.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(336.0f, 424.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(256.0f, 480.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(240.0f, 424.0f)
                curveToRelative(0.0f, -29.8f, 20.4f, -54.9f, 48.0f, -62.0f)
                lineTo(288.0f, 304.9f)
                curveToRelative(-6.0f, -0.6f, -12.1f, -0.9f, -18.3f, -0.9f)
                lineTo(178.3f, 304.0f)
                curveToRelative(-6.2f, 0.0f, -12.3f, 0.3f, -18.3f, 0.9f)
                verticalLineToRelative(65.4f)
                curveToRelative(23.1f, 6.9f, 40.0f, 28.3f, 40.0f, 53.7f)
                curveToRelative(0.0f, 30.9f, -25.1f, 56.0f, -56.0f, 56.0f)
                reflectiveCurveToRelative(-56.0f, -25.1f, -56.0f, -56.0f)
                curveToRelative(0.0f, -25.4f, 16.9f, -46.8f, 40.0f, -53.7f)
                lineTo(128.0f, 311.2f)
                close()
                moveTo(144.0f, 448.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _userDoctor!!
    }

private var _userDoctor: ImageVector? = null
