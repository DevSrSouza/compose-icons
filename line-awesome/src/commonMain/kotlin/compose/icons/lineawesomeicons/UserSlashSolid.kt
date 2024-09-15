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

public val LineAwesomeIcons.UserSlashSolid: ImageVector
    get() {
        if (_userSlashSolid != null) {
            return _userSlashSolid!!
        }
        _userSlashSolid = Builder(name = "UserSlashSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.699f, 2.301f)
                lineTo(2.301f, 3.699f)
                lineTo(9.121f, 10.52f)
                curveTo(9.115f, 10.547f, 9.106f, 10.572f, 9.1f, 10.6f)
                lineTo(11.0f, 12.5f)
                lineTo(11.0f, 12.398f)
                lineTo(15.602f, 17.0f)
                lineTo(15.5f, 17.0f)
                lineTo(17.699f, 19.199f)
                curveTo(17.749f, 19.211f, 17.796f, 19.232f, 17.846f, 19.244f)
                lineTo(23.66f, 25.059f)
                curveTo(23.671f, 25.107f, 23.69f, 25.151f, 23.699f, 25.199f)
                lineTo(25.5f, 27.0f)
                lineTo(25.602f, 27.0f)
                lineTo(28.301f, 29.699f)
                lineTo(29.699f, 28.301f)
                lineTo(25.594f, 24.195f)
                curveTo(24.75f, 21.315f, 22.648f, 18.946f, 19.9f, 17.801f)
                curveTo(21.8f, 16.501f, 23.0f, 14.4f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                curveTo(13.391f, 5.0f, 11.147f, 6.42f, 9.922f, 8.523f)
                lineTo(3.699f, 2.301f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.087f, 19.776f, 15.838f, 17.994f, 16.596f)
                lineTo(11.404f, 10.006f)
                curveTo(12.162f, 8.224f, 13.913f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(9.1f, 13.301f)
                curveTo(9.5f, 15.201f, 10.5f, 16.801f, 12.1f, 17.801f)
                curveTo(8.5f, 19.301f, 6.0f, 22.9f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.9f, 11.0f, 19.6f, 14.9f, 19.1f)
                lineTo(9.1f, 13.301f)
                close()
            }
        }
        .build()
        return _userSlashSolid!!
    }

private var _userSlashSolid: ImageVector? = null
