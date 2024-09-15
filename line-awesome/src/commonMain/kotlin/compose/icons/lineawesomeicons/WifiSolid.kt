package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.WifiSolid: ImageVector
    get() {
        if (_wifiSolid != null) {
            return _wifiSolid!!
        }
        _wifiSolid = Builder(name = "WifiSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(10.984f, 7.0f, 6.457f, 9.082f, 3.188f, 12.406f)
                lineTo(4.594f, 13.813f)
                curveTo(7.5f, 10.852f, 11.535f, 9.0f, 16.0f, 9.0f)
                curveTo(20.465f, 9.0f, 24.5f, 10.852f, 27.406f, 13.813f)
                lineTo(28.813f, 12.406f)
                curveTo(25.543f, 9.082f, 21.016f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(12.359f, 12.0f, 9.082f, 13.52f, 6.719f, 15.938f)
                lineTo(8.125f, 17.344f)
                curveTo(10.125f, 15.289f, 12.914f, 14.0f, 16.0f, 14.0f)
                curveTo(19.086f, 14.0f, 21.875f, 15.289f, 23.875f, 17.344f)
                lineTo(25.281f, 15.938f)
                curveTo(22.918f, 13.52f, 19.641f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(13.738f, 17.0f, 11.707f, 17.957f, 10.25f, 19.469f)
                lineTo(11.656f, 20.875f)
                curveTo(12.75f, 19.727f, 14.289f, 19.0f, 16.0f, 19.0f)
                curveTo(17.711f, 19.0f, 19.25f, 19.727f, 20.344f, 20.875f)
                lineTo(21.75f, 19.469f)
                curveTo(20.297f, 17.957f, 18.262f, 17.0f, 16.0f, 17.0f)
                close()
                moveTo(16.0f, 22.0f)
                curveTo(15.117f, 22.0f, 14.332f, 22.391f, 13.781f, 23.0f)
                lineTo(16.0f, 25.219f)
                lineTo(18.219f, 23.0f)
                curveTo(17.668f, 22.391f, 16.883f, 22.0f, 16.0f, 22.0f)
                close()
            }
        }
        .build()
        return _wifiSolid!!
    }

private var _wifiSolid: ImageVector? = null
