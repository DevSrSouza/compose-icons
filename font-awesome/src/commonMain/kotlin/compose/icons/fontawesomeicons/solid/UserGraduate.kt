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

public val SolidGroup.UserGraduate: ImageVector
    get() {
        if (_userGraduate != null) {
            return _userGraduate!!
        }
        _userGraduate = Builder(name = "UserGraduate", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.3f, 0.5f)
                curveToRelative(3.1f, -0.6f, 6.3f, -0.6f, 9.4f, 0.0f)
                lineToRelative(200.0f, 40.0f)
                curveTo(439.9f, 42.7f, 448.0f, 52.6f, 448.0f, 64.0f)
                reflectiveCurveToRelative(-8.1f, 21.3f, -19.3f, 23.5f)
                lineTo(352.0f, 102.9f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                reflectiveCurveToRelative(-128.0f, -57.3f, -128.0f, -128.0f)
                verticalLineTo(102.9f)
                lineTo(48.0f, 93.3f)
                verticalLineToRelative(65.1f)
                lineToRelative(15.7f, 78.4f)
                curveToRelative(0.9f, 4.7f, -0.3f, 9.6f, -3.3f, 13.3f)
                reflectiveCurveToRelative(-7.6f, 5.9f, -12.4f, 5.9f)
                horizontalLineTo(16.0f)
                curveToRelative(-4.8f, 0.0f, -9.3f, -2.1f, -12.4f, -5.9f)
                reflectiveCurveToRelative(-4.3f, -8.6f, -3.3f, -13.3f)
                lineTo(16.0f, 158.4f)
                verticalLineTo(86.6f)
                curveTo(6.5f, 83.3f, 0.0f, 74.3f, 0.0f, 64.0f)
                curveTo(0.0f, 52.6f, 8.1f, 42.7f, 19.3f, 40.5f)
                lineToRelative(200.0f, -40.0f)
                close()
                moveTo(111.9f, 327.7f)
                curveToRelative(10.5f, -3.4f, 21.8f, 0.4f, 29.4f, 8.5f)
                lineToRelative(71.0f, 75.5f)
                curveToRelative(6.3f, 6.7f, 17.0f, 6.7f, 23.3f, 0.0f)
                lineToRelative(71.0f, -75.5f)
                curveToRelative(7.6f, -8.1f, 18.9f, -11.9f, 29.4f, -8.5f)
                curveTo(401.0f, 348.6f, 448.0f, 409.4f, 448.0f, 481.3f)
                curveToRelative(0.0f, 17.0f, -13.8f, 30.7f, -30.7f, 30.7f)
                horizontalLineTo(30.7f)
                curveTo(13.8f, 512.0f, 0.0f, 498.2f, 0.0f, 481.3f)
                curveToRelative(0.0f, -71.9f, 47.0f, -132.7f, 111.9f, -153.6f)
                close()
            }
        }
        .build()
        return _userGraduate!!
    }

private var _userGraduate: ImageVector? = null
