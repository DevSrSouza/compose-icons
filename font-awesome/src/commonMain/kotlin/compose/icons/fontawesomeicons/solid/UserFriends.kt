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

public val SolidGroup.UserFriends: ImageVector
    get() {
        if (_userFriends != null) {
            return _userFriends!!
        }
        _userFriends = Builder(name = "UserFriends", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 256.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveTo(253.9f, 32.0f, 192.0f, 32.0f)
                reflectiveCurveTo(80.0f, 82.1f, 80.0f, 144.0f)
                reflectiveCurveToRelative(50.1f, 112.0f, 112.0f, 112.0f)
                close()
                moveTo(268.8f, 288.0f)
                horizontalLineToRelative(-8.3f)
                curveToRelative(-20.8f, 10.0f, -43.9f, 16.0f, -68.5f, 16.0f)
                reflectiveCurveToRelative(-47.6f, -6.0f, -68.5f, -16.0f)
                horizontalLineToRelative(-8.3f)
                curveTo(51.6f, 288.0f, 0.0f, 339.6f, 0.0f, 403.2f)
                lineTo(0.0f, 432.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-28.8f)
                curveToRelative(0.0f, -63.6f, -51.6f, -115.2f, -115.2f, -115.2f)
                close()
                moveTo(480.0f, 256.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                close()
                moveTo(528.0f, 288.0f)
                horizontalLineToRelative(-3.8f)
                curveToRelative(-13.9f, 4.8f, -28.6f, 8.0f, -44.2f, 8.0f)
                reflectiveCurveToRelative(-30.3f, -3.2f, -44.2f, -8.0f)
                lineTo(432.0f, 288.0f)
                curveToRelative(-20.4f, 0.0f, -39.2f, 5.9f, -55.7f, 15.4f)
                curveToRelative(24.4f, 26.3f, 39.7f, 61.2f, 39.7f, 99.8f)
                verticalLineToRelative(38.4f)
                curveToRelative(0.0f, 2.2f, -0.5f, 4.3f, -0.6f, 6.4f)
                lineTo(592.0f, 448.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                close()
            }
        }
        .build()
        return _userFriends!!
    }

private var _userFriends: ImageVector? = null
