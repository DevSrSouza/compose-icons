package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.WifiPassword: ImageVector
    get() {
        if (_wifiPassword != null) {
            return _wifiPassword!!
        }
        _wifiPassword = Builder(name = "WifiPassword", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.98f)
                lineToRelative(-2.12f, 2.13f)
                curveTo(19.35f, 8.57f, 15.85f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(-7.35f, 1.57f, -9.88f, 4.11f)
                lineTo(0.0f, 8.98f)
                curveTo(3.07f, 5.9f, 7.31f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(20.93f, 5.9f, 24.0f, 8.98f)
                close()
                moveTo(4.24f, 13.22f)
                lineToRelative(2.12f, 2.12f)
                curveTo(7.8f, 13.9f, 9.8f, 13.0f, 12.0f, 13.0f)
                curveToRelative(2.2f, 0.0f, 4.2f, 0.9f, 5.64f, 2.35f)
                lineToRelative(2.12f, -2.12f)
                curveTo(17.78f, 11.23f, 15.03f, 10.0f, 12.0f, 10.0f)
                curveTo(8.97f, 10.0f, 6.22f, 11.23f, 4.24f, 13.22f)
                close()
                moveTo(24.0f, 20.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveTo(23.55f, 19.0f, 24.0f, 19.45f, 24.0f, 20.0f)
                close()
                moveTo(22.0f, 18.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.38f, 0.0f, -2.63f, 0.56f, -3.53f, 1.46f)
                lineTo(12.0f, 21.0f)
                lineToRelative(3.53f, -3.54f)
                curveTo(14.63f, 16.56f, 13.38f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _wifiPassword!!
    }

private var _wifiPassword: ImageVector? = null
