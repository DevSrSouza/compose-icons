package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 104.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(248.0f, 248.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 456.0f)
                curveToRelative(-49.7f, 0.0f, -95.1f, -18.3f, -130.1f, -48.4f)
                curveToRelative(14.9f, -23.0f, 40.4f, -38.6f, 69.6f, -39.5f)
                curveToRelative(20.8f, 6.4f, 40.6f, 9.6f, 60.5f, 9.6f)
                reflectiveCurveToRelative(39.7f, -3.1f, 60.5f, -9.6f)
                curveToRelative(29.2f, 1.0f, 54.7f, 16.5f, 69.6f, 39.5f)
                curveToRelative(-35.0f, 30.1f, -80.4f, 48.4f, -130.1f, 48.4f)
                close()
                moveTo(410.7f, 371.9f)
                curveToRelative(-24.4f, -31.4f, -62.1f, -51.9f, -105.1f, -51.9f)
                curveToRelative(-10.2f, 0.0f, -26.0f, 9.6f, -57.6f, 9.6f)
                curveToRelative(-31.5f, 0.0f, -47.4f, -9.6f, -57.6f, -9.6f)
                curveToRelative(-42.9f, 0.0f, -80.6f, 20.5f, -105.1f, 51.9f)
                curveTo(61.9f, 339.2f, 48.0f, 299.2f, 48.0f, 256.0f)
                curveToRelative(0.0f, -110.3f, 89.7f, -200.0f, 200.0f, -200.0f)
                reflectiveCurveToRelative(200.0f, 89.7f, 200.0f, 200.0f)
                curveToRelative(0.0f, 43.2f, -13.9f, 83.2f, -37.3f, 115.9f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
