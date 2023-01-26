package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WifiPassword: ImageVector
    get() {
        if (_wifiPassword != null) {
            return _wifiPassword!!
        }
        _wifiPassword = Builder(name = "WifiPassword", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.49f, 12.13f)
                curveTo(16.67f, 10.79f, 14.43f, 10.0f, 12.0f, 10.0f)
                curveToRelative(-2.43f, 0.0f, -4.67f, 0.79f, -6.49f, 2.13f)
                curveToRelative(-0.72f, 0.53f, -0.76f, 1.6f, -0.13f, 2.24f)
                curveToRelative(0.53f, 0.54f, 1.37f, 0.57f, 1.98f, 0.12f)
                curveTo(8.67f, 13.55f, 10.27f, 13.0f, 12.0f, 13.0f)
                curveToRelative(1.73f, 0.0f, 3.33f, 0.55f, 4.64f, 1.49f)
                curveToRelative(0.62f, 0.44f, 1.45f, 0.41f, 1.98f, -0.12f)
                curveTo(19.26f, 13.73f, 19.22f, 12.66f, 18.49f, 12.13f)
                close()
                moveTo(22.8f, 7.89f)
                curveTo(19.86f, 5.46f, 16.1f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(4.14f, 5.46f, 1.2f, 7.89f)
                curveTo(0.53f, 8.44f, 0.49f, 9.47f, 1.11f, 10.1f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.55f, 0.55f, 1.42f, 0.58f, 2.02f, 0.09f)
                curveTo(5.55f, 8.2f, 8.64f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(6.45f, 1.2f, 8.87f, 3.19f)
                curveToRelative(0.6f, 0.49f, 1.47f, 0.46f, 2.02f, -0.09f)
                lineToRelative(0.0f, 0.0f)
                curveTo(23.51f, 9.47f, 23.47f, 8.44f, 22.8f, 7.89f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(13.1f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(23.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveTo(24.0f, 19.45f, 23.55f, 19.0f, 23.0f, 19.0f)
                close()
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _wifiPassword!!
    }

private var _wifiPassword: ImageVector? = null
