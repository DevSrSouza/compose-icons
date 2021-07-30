package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.RedoAlt: ImageVector
    get() {
        if (_redoAlt != null) {
            return _redoAlt!!
        }
        _redoAlt = Builder(name = "RedoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.455f, 8.0f)
                curveToRelative(66.269f, 0.119f, 126.437f, 26.233f, 170.859f, 68.685f)
                lineToRelative(35.715f, -35.715f)
                curveTo(478.149f, 25.851f, 504.0f, 36.559f, 504.0f, 57.941f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(345.941f)
                curveToRelative(-21.382f, 0.0f, -32.09f, -25.851f, -16.971f, -40.971f)
                lineToRelative(41.75f, -41.75f)
                curveToRelative(-30.864f, -28.899f, -70.801f, -44.907f, -113.23f, -45.273f)
                curveToRelative(-92.398f, -0.798f, -170.283f, 73.977f, -169.484f, 169.442f)
                curveTo(88.764f, 348.009f, 162.184f, 424.0f, 256.0f, 424.0f)
                curveToRelative(41.127f, 0.0f, 79.997f, -14.678f, 110.629f, -41.556f)
                curveToRelative(4.743f, -4.161f, 11.906f, -3.908f, 16.368f, 0.553f)
                lineToRelative(39.662f, 39.662f)
                curveToRelative(4.872f, 4.872f, 4.631f, 12.815f, -0.482f, 17.433f)
                curveTo(378.202f, 479.813f, 319.926f, 504.0f, 256.0f, 504.0f)
                curveTo(119.034f, 504.0f, 8.001f, 392.967f, 8.0f, 256.002f)
                curveTo(7.999f, 119.193f, 119.646f, 7.755f, 256.455f, 8.0f)
                close()
            }
        }
        .build()
        return _redoAlt!!
    }

private var _redoAlt: ImageVector? = null
