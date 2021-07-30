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
                curveTo(10.9844f, 7.0f, 6.457f, 9.082f, 3.1875f, 12.4063f)
                lineTo(4.5938f, 13.8125f)
                curveTo(7.5f, 10.8516f, 11.5352f, 9.0f, 16.0f, 9.0f)
                curveTo(20.4648f, 9.0f, 24.5f, 10.8516f, 27.4063f, 13.8125f)
                lineTo(28.8125f, 12.4063f)
                curveTo(25.543f, 9.082f, 21.0156f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(12.3594f, 12.0f, 9.082f, 13.5195f, 6.7188f, 15.9375f)
                lineTo(8.125f, 17.3438f)
                curveTo(10.125f, 15.2891f, 12.9141f, 14.0f, 16.0f, 14.0f)
                curveTo(19.0859f, 14.0f, 21.875f, 15.2891f, 23.875f, 17.3438f)
                lineTo(25.2813f, 15.9375f)
                curveTo(22.918f, 13.5195f, 19.6406f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(13.7383f, 17.0f, 11.707f, 17.957f, 10.25f, 19.4688f)
                lineTo(11.6563f, 20.875f)
                curveTo(12.75f, 19.7266f, 14.2891f, 19.0f, 16.0f, 19.0f)
                curveTo(17.7109f, 19.0f, 19.25f, 19.7266f, 20.3438f, 20.875f)
                lineTo(21.75f, 19.4688f)
                curveTo(20.2969f, 17.957f, 18.2617f, 17.0f, 16.0f, 17.0f)
                close()
                moveTo(16.0f, 22.0f)
                curveTo(15.1172f, 22.0f, 14.332f, 22.3906f, 13.7813f, 23.0f)
                lineTo(16.0f, 25.2188f)
                lineTo(18.2188f, 23.0f)
                curveTo(17.668f, 22.3906f, 16.8828f, 22.0f, 16.0f, 22.0f)
                close()
            }
        }
        .build()
        return _wifiSolid!!
    }

private var _wifiSolid: ImageVector? = null
