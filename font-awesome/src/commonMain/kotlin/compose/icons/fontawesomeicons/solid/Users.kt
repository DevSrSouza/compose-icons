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

public val SolidGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 224.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(544.0f, 224.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(576.0f, 256.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-17.6f, 0.0f, -33.5f, 7.1f, -45.1f, 18.6f)
                curveToRelative(40.3f, 22.1f, 68.9f, 62.0f, 75.1f, 109.4f)
                horizontalLineToRelative(66.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(320.0f, 256.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveTo(381.9f, 32.0f, 320.0f, 32.0f)
                reflectiveCurveTo(208.0f, 82.1f, 208.0f, 144.0f)
                reflectiveCurveToRelative(50.1f, 112.0f, 112.0f, 112.0f)
                close()
                moveTo(396.8f, 288.0f)
                horizontalLineToRelative(-8.3f)
                curveToRelative(-20.8f, 10.0f, -43.9f, 16.0f, -68.5f, 16.0f)
                reflectiveCurveToRelative(-47.6f, -6.0f, -68.5f, -16.0f)
                horizontalLineToRelative(-8.3f)
                curveTo(179.6f, 288.0f, 128.0f, 339.6f, 128.0f, 403.2f)
                lineTo(128.0f, 432.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-28.8f)
                curveToRelative(0.0f, -63.6f, -51.6f, -115.2f, -115.2f, -115.2f)
                close()
                moveTo(173.1f, 274.6f)
                curveTo(161.5f, 263.1f, 145.6f, 256.0f, 128.0f, 256.0f)
                lineTo(64.0f, 256.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(65.9f)
                curveToRelative(6.3f, -47.4f, 34.9f, -87.3f, 75.2f, -109.4f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
