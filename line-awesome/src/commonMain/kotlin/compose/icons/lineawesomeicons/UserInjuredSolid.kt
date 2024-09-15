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
                curveTo(9.0f, 14.435f, 10.207f, 16.557f, 12.064f, 17.809f)
                curveTo(8.838f, 19.182f, 6.463f, 22.194f, 6.1f, 25.9f)
                curveTo(6.0f, 26.4f, 6.2f, 27.0f, 6.6f, 27.4f)
                curveTo(6.9f, 27.8f, 7.5f, 28.0f, 8.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                curveTo(18.7f, 28.0f, 20.0f, 26.7f, 20.0f, 25.0f)
                curveTo(20.0f, 23.3f, 18.7f, 22.0f, 17.0f, 22.0f)
                lineTo(13.191f, 22.0f)
                lineTo(12.395f, 19.875f)
                curveTo(13.483f, 19.317f, 14.709f, 19.0f, 16.0f, 19.0f)
                curveTo(20.4f, 19.0f, 24.0f, 22.6f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 22.893f, 23.49f, 19.345f, 19.93f, 17.811f)
                curveTo(21.789f, 16.559f, 23.0f, 14.437f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.419f, 7.0f, 16.818f, 7.063f, 17.205f, 7.156f)
                lineTo(13.65f, 10.0f)
                lineTo(11.406f, 10.0f)
                curveTo(12.165f, 8.221f, 13.915f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(19.176f, 8.141f)
                curveTo(19.783f, 8.638f, 20.28f, 9.264f, 20.594f, 10.0f)
                lineTo(16.852f, 10.0f)
                lineTo(19.176f, 8.141f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                curveTo(21.0f, 14.8f, 18.8f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2f, 17.0f, 11.0f, 14.8f, 11.0f, 12.0f)
                close()
                moveTo(10.695f, 21.041f)
                lineTo(12.555f, 26.0f)
                lineTo(8.1f, 26.0f)
                curveTo(8.347f, 24.021f, 9.307f, 22.288f, 10.695f, 21.041f)
                close()
                moveTo(13.941f, 24.0f)
                lineTo(17.0f, 24.0f)
                curveTo(17.6f, 24.0f, 18.0f, 24.4f, 18.0f, 25.0f)
                curveTo(18.0f, 25.6f, 17.6f, 26.0f, 17.0f, 26.0f)
                lineTo(14.691f, 26.0f)
                lineTo(13.941f, 24.0f)
                close()
            }
        }
        .build()
        return _userInjuredSolid!!
    }

private var _userInjuredSolid: ImageVector? = null
