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

public val LineAwesomeIcons.UserAltSlashSolid: ImageVector
    get() {
        if (_userAltSlashSolid != null) {
            return _userAltSlashSolid!!
        }
        _userAltSlashSolid = Builder(name = "UserAltSlashSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.699f, 2.301f)
                lineTo(2.301f, 3.699f)
                lineTo(9.143f, 10.541f)
                curveTo(9.13f, 10.594f, 9.111f, 10.645f, 9.1f, 10.699f)
                lineTo(11.0f, 12.5f)
                lineTo(11.0f, 12.398f)
                lineTo(15.602f, 17.0f)
                lineTo(15.5f, 17.0f)
                lineTo(17.801f, 19.301f)
                curveTo(17.841f, 19.301f, 17.882f, 19.314f, 17.922f, 19.32f)
                lineTo(18.301f, 19.699f)
                lineTo(19.801f, 21.199f)
                lineTo(23.9f, 25.299f)
                curveTo(23.901f, 25.299f, 23.9f, 25.3f, 23.9f, 25.301f)
                lineTo(25.699f, 27.1f)
                lineTo(25.701f, 27.1f)
                lineTo(28.301f, 29.699f)
                lineTo(29.699f, 28.301f)
                lineTo(25.557f, 24.158f)
                curveTo(24.687f, 21.34f, 22.605f, 19.027f, 19.9f, 17.9f)
                curveTo(21.8f, 16.6f, 23.0f, 14.5f, 23.0f, 12.1f)
                curveTo(23.0f, 8.2f, 19.9f, 5.1f, 16.0f, 5.1f)
                curveTo(13.417f, 5.1f, 11.188f, 6.488f, 9.955f, 8.557f)
                lineTo(3.699f, 2.301f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.087f, 19.776f, 15.838f, 17.994f, 16.596f)
                lineTo(11.404f, 10.006f)
                curveTo(12.162f, 8.224f, 13.913f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(9.199f, 13.301f)
                curveTo(9.599f, 15.201f, 10.599f, 16.801f, 12.199f, 17.801f)
                curveTo(8.499f, 19.301f, 6.0f, 22.9f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 24.1f, 9.501f, 21.599f, 11.801f, 20.199f)
                curveTo(12.501f, 21.799f, 14.1f, 23.0f, 16.0f, 23.0f)
                curveTo(16.8f, 23.0f, 17.599f, 22.8f, 18.199f, 22.4f)
                lineTo(16.699f, 20.9f)
                curveTo(16.499f, 21.0f, 16.2f, 21.0f, 16.0f, 21.0f)
                curveTo(14.9f, 21.0f, 13.999f, 20.301f, 13.699f, 19.301f)
                lineTo(14.9f, 19.0f)
                lineTo(9.199f, 13.301f)
                close()
            }
        }
        .build()
        return _userAltSlashSolid!!
    }

private var _userAltSlashSolid: ImageVector? = null
