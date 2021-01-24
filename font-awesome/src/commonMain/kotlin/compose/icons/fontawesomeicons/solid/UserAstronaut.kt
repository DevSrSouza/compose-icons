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

public val SolidGroup.UserAstronaut: ImageVector
    get() {
        if (_userAstronaut != null) {
            return _userAstronaut!!
        }
        _userAstronaut = Builder(name = "UserAstronaut", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 224.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(24.7f, 56.5f, 80.9f, 96.0f, 146.5f, 96.0f)
                reflectiveCurveToRelative(121.8f, -39.5f, 146.5f, -96.0f)
                lineTo(384.0f, 224.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-13.5f)
                curveTo(345.8f, 39.5f, 289.6f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(102.2f, 39.5f, 77.5f, 96.0f)
                lineTo(64.0f, 96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(104.0f, 136.0f)
                curveToRelative(0.0f, -22.1f, 21.5f, -40.0f, 48.0f, -40.0f)
                horizontalLineToRelative(144.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 17.9f, 48.0f, 40.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                verticalLineToRelative(-24.0f)
                close()
                moveTo(176.0f, 208.0f)
                lineToRelative(12.0f, -36.0f)
                lineToRelative(36.0f, -12.0f)
                lineToRelative(-36.0f, -12.0f)
                lineToRelative(-12.0f, -36.0f)
                lineToRelative(-12.0f, 36.0f)
                lineToRelative(-36.0f, 12.0f)
                lineToRelative(36.0f, 12.0f)
                lineToRelative(12.0f, 36.0f)
                close()
                moveTo(327.6f, 321.4f)
                curveTo(297.7f, 340.7f, 262.2f, 352.0f, 224.0f, 352.0f)
                reflectiveCurveToRelative(-73.7f, -11.3f, -103.6f, -30.6f)
                curveTo(52.9f, 328.5f, 0.0f, 385.0f, 0.0f, 454.4f)
                verticalLineToRelative(9.6f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-9.6f)
                curveToRelative(0.0f, -69.4f, -52.9f, -125.9f, -120.4f, -133.0f)
                close()
                moveTo(272.0f, 448.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(176.0f, 448.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _userAstronaut!!
    }

private var _userAstronaut: ImageVector? = null
