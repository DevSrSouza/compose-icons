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

public val LineAwesomeIcons.UserNinjaSolid: ImageVector
    get() {
        if (_userNinjaSolid != null) {
            return _userNinjaSolid!!
        }
        _userNinjaSolid = Builder(name = "UserNinjaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(13.179f, 5.0f, 10.783f, 6.627f, 9.67f, 9.0f)
                lineTo(9.6f, 9.0f)
                lineTo(9.451f, 9.523f)
                curveTo(9.385f, 9.7f, 9.325f, 9.879f, 9.273f, 10.063f)
                curveTo(9.267f, 10.082f, 9.258f, 10.101f, 9.252f, 10.121f)
                lineTo(5.6f, 7.199f)
                lineTo(4.4f, 8.801f)
                lineTo(7.1f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 13.0f)
                lineTo(9.066f, 13.0f)
                curveTo(9.108f, 13.319f, 9.174f, 13.63f, 9.27f, 13.928f)
                curveTo(9.322f, 14.115f, 9.384f, 14.297f, 9.451f, 14.477f)
                lineTo(9.6f, 15.0f)
                lineTo(9.67f, 15.0f)
                curveTo(10.206f, 16.143f, 11.033f, 17.115f, 12.07f, 17.813f)
                curveTo(8.51f, 19.347f, 6.0f, 22.894f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.6f, 11.6f, 19.0f, 16.0f, 19.0f)
                curveTo(20.4f, 19.0f, 24.0f, 22.6f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 22.893f, 23.49f, 19.345f, 19.93f, 17.811f)
                curveTo(20.965f, 17.113f, 21.794f, 16.142f, 22.33f, 15.0f)
                lineTo(22.4f, 15.0f)
                lineTo(22.43f, 14.791f)
                curveTo(22.796f, 13.938f, 23.0f, 12.996f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(17.661f, 7.0f, 19.097f, 7.786f, 20.002f, 9.0f)
                lineTo(11.998f, 9.0f)
                curveTo(12.903f, 7.786f, 14.339f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(11.1f, 11.0f)
                lineTo(20.9f, 11.0f)
                curveTo(20.911f, 11.031f, 20.91f, 11.071f, 20.918f, 11.104f)
                curveTo(20.969f, 11.394f, 21.0f, 11.693f, 21.0f, 12.0f)
                curveTo(21.0f, 12.307f, 20.969f, 12.606f, 20.918f, 12.896f)
                curveTo(20.91f, 12.929f, 20.911f, 12.969f, 20.9f, 13.0f)
                lineTo(11.1f, 13.0f)
                curveTo(11.089f, 12.969f, 11.09f, 12.929f, 11.082f, 12.896f)
                curveTo(11.031f, 12.606f, 11.0f, 12.307f, 11.0f, 12.0f)
                curveTo(11.0f, 11.693f, 11.031f, 11.394f, 11.082f, 11.104f)
                curveTo(11.09f, 11.071f, 11.089f, 11.031f, 11.1f, 11.0f)
                close()
                moveTo(11.998f, 15.0f)
                lineTo(20.002f, 15.0f)
                curveTo(19.097f, 16.214f, 17.661f, 17.0f, 16.0f, 17.0f)
                curveTo(14.339f, 17.0f, 12.903f, 16.214f, 11.998f, 15.0f)
                close()
            }
        }
        .build()
        return _userNinjaSolid!!
    }

private var _userNinjaSolid: ImageVector? = null
