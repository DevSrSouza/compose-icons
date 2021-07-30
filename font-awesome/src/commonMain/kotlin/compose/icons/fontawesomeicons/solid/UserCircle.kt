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

public val SolidGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 104.0f)
                curveToRelative(48.6f, 0.0f, 88.0f, 39.4f, 88.0f, 88.0f)
                reflectiveCurveToRelative(-39.4f, 88.0f, -88.0f, 88.0f)
                reflectiveCurveToRelative(-88.0f, -39.4f, -88.0f, -88.0f)
                reflectiveCurveToRelative(39.4f, -88.0f, 88.0f, -88.0f)
                close()
                moveTo(248.0f, 448.0f)
                curveToRelative(-58.7f, 0.0f, -111.3f, -26.6f, -146.5f, -68.2f)
                curveToRelative(18.8f, -35.4f, 55.6f, -59.8f, 98.5f, -59.8f)
                curveToRelative(2.4f, 0.0f, 4.8f, 0.4f, 7.1f, 1.1f)
                curveToRelative(13.0f, 4.2f, 26.6f, 6.9f, 40.9f, 6.9f)
                curveToRelative(14.3f, 0.0f, 28.0f, -2.7f, 40.9f, -6.9f)
                curveToRelative(2.3f, -0.7f, 4.7f, -1.1f, 7.1f, -1.1f)
                curveToRelative(42.9f, 0.0f, 79.7f, 24.4f, 98.5f, 59.8f)
                curveTo(359.3f, 421.4f, 306.7f, 448.0f, 248.0f, 448.0f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
