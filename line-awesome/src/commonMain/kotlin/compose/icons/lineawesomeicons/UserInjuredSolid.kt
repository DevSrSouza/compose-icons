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

public val LineAwesomeIcons.UserInjuredSolid: ImageVector
    get() {
        if (_userInjuredSolid != null) {
            return _userInjuredSolid!!
        }
        _userInjuredSolid = Builder(name = "UserInjuredSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.1f, 5.0f, 9.0f, 8.1f, 9.0f, 12.0f)
                curveTo(9.0f, 14.4349f, 10.2074f, 16.5571f, 12.0645f, 17.8086f)
                curveTo(8.8382f, 19.182f, 6.463f, 22.1937f, 6.0996f, 25.9004f)
                curveTo(5.9996f, 26.4004f, 6.1996f, 27.0004f, 6.5996f, 27.4004f)
                curveTo(6.8996f, 27.8004f, 7.5f, 28.0f, 8.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                curveTo(18.7f, 28.0f, 20.0f, 26.7f, 20.0f, 25.0f)
                curveTo(20.0f, 23.3f, 18.7f, 22.0f, 17.0f, 22.0f)
                lineTo(13.1914f, 22.0f)
                lineTo(12.3945f, 19.875f)
                curveTo(13.4832f, 19.3172f, 14.709f, 19.0f, 16.0f, 19.0f)
                curveTo(20.4f, 19.0f, 24.0f, 22.6f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 22.8933f, 23.4904f, 19.3452f, 19.9297f, 17.8105f)
                curveTo(21.7888f, 16.5594f, 23.0f, 14.4365f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.4189f, 7.0f, 16.8184f, 7.0631f, 17.2051f, 7.1563f)
                lineTo(13.6504f, 10.0f)
                lineTo(11.4063f, 10.0f)
                curveTo(12.1653f, 8.2212f, 13.9152f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(19.1758f, 8.1406f)
                curveTo(19.7833f, 8.6384f, 20.2796f, 9.2638f, 20.5938f, 10.0f)
                lineTo(16.8516f, 10.0f)
                lineTo(19.1758f, 8.1406f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                curveTo(21.0f, 14.8f, 18.8f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2f, 17.0f, 11.0f, 14.8f, 11.0f, 12.0f)
                close()
                moveTo(10.6953f, 21.041f)
                lineTo(12.5547f, 26.0f)
                lineTo(8.0996f, 26.0f)
                curveTo(8.347f, 24.021f, 9.3067f, 22.2883f, 10.6953f, 21.041f)
                close()
                moveTo(13.9414f, 24.0f)
                lineTo(17.0f, 24.0f)
                curveTo(17.6f, 24.0f, 18.0f, 24.4f, 18.0f, 25.0f)
                curveTo(18.0f, 25.6f, 17.6f, 26.0f, 17.0f, 26.0f)
                lineTo(14.6914f, 26.0f)
                lineTo(13.9414f, 24.0f)
                close()
            }
        }
        .build()
        return _userInjuredSolid!!
    }

private var _userInjuredSolid: ImageVector? = null
