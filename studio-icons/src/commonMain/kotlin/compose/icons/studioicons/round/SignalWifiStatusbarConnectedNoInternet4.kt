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

public val RoundGroup.SignalWifiStatusbarConnectedNoInternet4: ImageVector
    get() {
        if (_signalWifiStatusbarConnectedNoInternet4 != null) {
            return _signalWifiStatusbarConnectedNoInternet4!!
        }
        _signalWifiStatusbarConnectedNoInternet4 = Builder(name =
                "SignalWifiStatusbarConnectedNoInternet4", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.92f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(7.99f)
                lineToRelative(-4.29f, 4.3f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f)
                lineTo(0.73f, 9.71f)
                curveTo(0.32f, 9.3f, 0.35f, 8.63f, 0.79f, 8.24f)
                curveTo(3.78f, 5.6f, 7.7f, 4.0f, 12.0f, 4.0f)
                curveTo(16.16f, 4.0f, 19.97f, 5.51f, 22.92f, 8.0f)
                close()
                moveTo(20.0f, 18.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(20.55f, 18.0f, 20.0f, 18.0f)
                close()
                moveTo(20.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveTo(21.0f, 10.45f, 20.55f, 10.0f, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _signalWifiStatusbarConnectedNoInternet4!!
    }

private var _signalWifiStatusbarConnectedNoInternet4: ImageVector? = null
