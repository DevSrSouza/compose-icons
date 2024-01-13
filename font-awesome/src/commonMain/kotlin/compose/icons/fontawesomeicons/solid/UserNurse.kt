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

public val SolidGroup.UserNurse: ImageVector
    get() {
        if (_userNurse != null) {
            return _userNurse!!
        }
        _userNurse = Builder(name = "UserNurse", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 128.0f)
                lineTo(96.0f, 70.2f)
                curveToRelative(0.0f, -13.3f, 8.3f, -25.3f, 20.8f, -30.0f)
                lineToRelative(96.0f, -36.0f)
                curveToRelative(7.2f, -2.7f, 15.2f, -2.7f, 22.5f, 0.0f)
                lineToRelative(96.0f, 36.0f)
                curveToRelative(12.5f, 4.7f, 20.8f, 16.6f, 20.8f, 30.0f)
                lineTo(352.1f, 128.0f)
                horizontalLineToRelative(-0.3f)
                curveToRelative(0.2f, 2.6f, 0.3f, 5.3f, 0.3f, 8.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                reflectiveCurveToRelative(-128.0f, -57.3f, -128.0f, -128.0f)
                lineTo(96.1f, 136.0f)
                curveToRelative(0.0f, -2.7f, 0.1f, -5.4f, 0.3f, -8.0f)
                lineTo(96.0f, 128.0f)
                close()
                moveTo(144.0f, 176.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                lineTo(304.0f, 160.0f)
                lineTo(144.0f, 160.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(111.9f, 327.7f)
                curveToRelative(10.5f, -3.4f, 21.8f, 0.4f, 29.4f, 8.5f)
                lineToRelative(71.0f, 75.5f)
                curveToRelative(6.3f, 6.7f, 17.0f, 6.7f, 23.3f, 0.0f)
                lineToRelative(71.0f, -75.5f)
                curveToRelative(7.6f, -8.1f, 18.9f, -11.9f, 29.4f, -8.5f)
                curveTo(401.0f, 348.6f, 448.0f, 409.4f, 448.0f, 481.3f)
                curveToRelative(0.0f, 17.0f, -13.8f, 30.7f, -30.7f, 30.7f)
                lineTo(30.7f, 512.0f)
                curveTo(13.8f, 512.0f, 0.0f, 498.2f, 0.0f, 481.3f)
                curveToRelative(0.0f, -71.9f, 47.0f, -132.7f, 111.9f, -153.6f)
                close()
                moveTo(208.0f, 48.0f)
                lineTo(208.0f, 64.0f)
                lineTo(192.0f, 64.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                lineTo(184.0f, 88.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                lineTo(240.0f, 96.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, -3.6f, 8.0f, -8.0f)
                lineTo(264.0f, 72.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineTo(240.0f, 64.0f)
                lineTo(240.0f, 48.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                lineTo(216.0f, 40.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _userNurse!!
    }

private var _userNurse: ImageVector? = null
