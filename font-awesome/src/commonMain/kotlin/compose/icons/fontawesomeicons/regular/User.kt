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

public val RegularGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.6f, 304.0f)
                curveToRelative(-28.7f, 0.0f, -42.5f, 16.0f, -89.6f, 16.0f)
                curveToRelative(-47.1f, 0.0f, -60.8f, -16.0f, -89.6f, -16.0f)
                curveTo(60.2f, 304.0f, 0.0f, 364.2f, 0.0f, 438.4f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-25.6f)
                curveToRelative(0.0f, -74.2f, -60.2f, -134.4f, -134.4f, -134.4f)
                close()
                moveTo(400.0f, 464.0f)
                lineTo(48.0f, 464.0f)
                verticalLineToRelative(-25.6f)
                curveToRelative(0.0f, -47.6f, 38.8f, -86.4f, 86.4f, -86.4f)
                curveToRelative(14.6f, 0.0f, 38.3f, 16.0f, 89.6f, 16.0f)
                curveToRelative(51.7f, 0.0f, 74.9f, -16.0f, 89.6f, -16.0f)
                curveToRelative(47.6f, 0.0f, 86.4f, 38.8f, 86.4f, 86.4f)
                lineTo(400.0f, 464.0f)
                close()
                moveTo(224.0f, 288.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                reflectiveCurveTo(303.5f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(80.0f, 64.5f, 80.0f, 144.0f)
                reflectiveCurveToRelative(64.5f, 144.0f, 144.0f, 144.0f)
                close()
                moveTo(224.0f, 48.0f)
                curveToRelative(52.9f, 0.0f, 96.0f, 43.1f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.1f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(-96.0f, -43.1f, -96.0f, -96.0f)
                reflectiveCurveToRelative(43.1f, -96.0f, 96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
