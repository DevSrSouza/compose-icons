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

public val SolidGroup.UserMd: ImageVector
    get() {
        if (_userMd != null) {
            return _userMd!!
        }
        _userMd = Builder(name = "UserMd", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveTo(294.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(96.0f, 57.3f, 96.0f, 128.0f)
                reflectiveCurveToRelative(57.3f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(104.0f, 424.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                close()
                moveTo(320.0f, 288.6f)
                verticalLineToRelative(49.0f)
                curveToRelative(36.5f, 7.4f, 64.0f, 39.8f, 64.0f, 78.4f)
                verticalLineToRelative(41.7f)
                curveToRelative(0.0f, 7.6f, -5.4f, 14.2f, -12.9f, 15.7f)
                lineToRelative(-32.2f, 6.4f)
                curveToRelative(-4.3f, 0.9f, -8.5f, -1.9f, -9.4f, -6.3f)
                lineToRelative(-3.1f, -15.7f)
                curveToRelative(-0.9f, -4.3f, 1.9f, -8.6f, 6.3f, -9.4f)
                lineToRelative(19.3f, -3.9f)
                lineTo(352.0f, 416.0f)
                curveToRelative(0.0f, -62.8f, -96.0f, -65.1f, -96.0f, 1.9f)
                verticalLineToRelative(26.7f)
                lineToRelative(19.3f, 3.9f)
                curveToRelative(4.3f, 0.9f, 7.1f, 5.1f, 6.3f, 9.4f)
                lineToRelative(-3.1f, 15.7f)
                curveToRelative(-0.9f, 4.3f, -5.1f, 7.1f, -9.4f, 6.3f)
                lineToRelative(-31.2f, -4.2f)
                curveToRelative(-7.9f, -1.1f, -13.8f, -7.8f, -13.8f, -15.9f)
                lineTo(224.1f, 416.0f)
                curveToRelative(0.0f, -38.6f, 27.5f, -70.9f, 64.0f, -78.4f)
                verticalLineToRelative(-45.2f)
                curveToRelative(-2.2f, 0.7f, -4.4f, 1.1f, -6.6f, 1.9f)
                curveToRelative(-18.0f, 6.3f, -37.3f, 9.8f, -57.4f, 9.8f)
                reflectiveCurveToRelative(-39.4f, -3.5f, -57.4f, -9.8f)
                curveToRelative(-7.4f, -2.6f, -14.9f, -4.2f, -22.6f, -5.2f)
                verticalLineToRelative(81.6f)
                curveToRelative(23.1f, 6.9f, 40.0f, 28.1f, 40.0f, 53.4f)
                curveToRelative(0.0f, 30.9f, -25.1f, 56.0f, -56.0f, 56.0f)
                reflectiveCurveToRelative(-56.0f, -25.1f, -56.0f, -56.0f)
                curveToRelative(0.0f, -25.3f, 16.9f, -46.5f, 40.0f, -53.4f)
                verticalLineToRelative(-80.4f)
                curveTo(48.5f, 301.0f, 0.0f, 355.8f, 0.0f, 422.4f)
                verticalLineToRelative(44.8f)
                curveTo(0.0f, 491.9f, 20.1f, 512.0f, 44.8f, 512.0f)
                horizontalLineToRelative(358.4f)
                curveToRelative(24.7f, 0.0f, 44.8f, -20.1f, 44.8f, -44.8f)
                verticalLineToRelative(-44.8f)
                curveToRelative(0.0f, -72.0f, -56.8f, -130.3f, -128.0f, -133.8f)
                close()
            }
        }
        .build()
        return _userMd!!
    }

private var _userMd: ImageVector? = null
