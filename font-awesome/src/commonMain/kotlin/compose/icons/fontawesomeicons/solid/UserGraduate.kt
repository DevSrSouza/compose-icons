package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(319.4f, 320.6f)
                lineTo(224.0f, 416.0f)
                lineToRelative(-95.4f, -95.4f)
                curveTo(57.1f, 323.7f, 0.0f, 382.2f, 0.0f, 454.4f)
                verticalLineToRelative(9.6f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-9.6f)
                curveToRelative(0.0f, -72.2f, -57.1f, -130.7f, -128.6f, -133.8f)
                close()
                moveTo(13.6f, 79.8f)
                lineToRelative(6.4f, 1.5f)
                verticalLineToRelative(58.4f)
                curveToRelative(-7.0f, 4.2f, -12.0f, 11.5f, -12.0f, 20.3f)
                curveToRelative(0.0f, 8.4f, 4.6f, 15.4f, 11.1f, 19.7f)
                lineTo(3.5f, 242.0f)
                curveToRelative(-1.7f, 6.9f, 2.1f, 14.0f, 7.6f, 14.0f)
                horizontalLineToRelative(41.8f)
                curveToRelative(5.5f, 0.0f, 9.3f, -7.1f, 7.6f, -14.0f)
                lineToRelative(-15.6f, -62.3f)
                curveTo(51.4f, 175.4f, 56.0f, 168.4f, 56.0f, 160.0f)
                curveToRelative(0.0f, -8.8f, -5.0f, -16.1f, -12.0f, -20.3f)
                verticalLineTo(87.1f)
                lineToRelative(66.0f, 15.9f)
                curveToRelative(-8.6f, 17.2f, -14.0f, 36.4f, -14.0f, 57.0f)
                curveToRelative(0.0f, 70.7f, 57.3f, 128.0f, 128.0f, 128.0f)
                reflectiveCurveToRelative(128.0f, -57.3f, 128.0f, -128.0f)
                curveToRelative(0.0f, -20.6f, -5.3f, -39.8f, -14.0f, -57.0f)
                lineToRelative(96.3f, -23.2f)
                curveToRelative(18.2f, -4.4f, 18.2f, -27.1f, 0.0f, -31.5f)
                lineToRelative(-190.4f, -46.0f)
                curveToRelative(-13.0f, -3.1f, -26.7f, -3.1f, -39.7f, 0.0f)
                lineTo(13.6f, 48.2f)
                curveToRelative(-18.1f, 4.4f, -18.1f, 27.2f, 0.0f, 31.6f)
                close()
            }
        }
        .build()
        return _userGraduate!!
    }

private var _userGraduate: ImageVector? = null
