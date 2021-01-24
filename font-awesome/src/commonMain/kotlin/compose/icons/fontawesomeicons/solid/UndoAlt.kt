package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UndoAlt: ImageVector
    get() {
        if (_undoAlt != null) {
            return _undoAlt!!
        }
        _undoAlt = Builder(name = "UndoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.545f, 8.0f)
                curveToRelative(-66.269f, 0.119f, -126.438f, 26.233f, -170.86f, 68.685f)
                lineTo(48.971f, 40.971f)
                curveTo(33.851f, 25.851f, 8.0f, 36.559f, 8.0f, 57.941f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(134.059f)
                curveToRelative(21.382f, 0.0f, 32.09f, -25.851f, 16.971f, -40.971f)
                lineToRelative(-41.75f, -41.75f)
                curveToRelative(30.864f, -28.899f, 70.801f, -44.907f, 113.23f, -45.273f)
                curveToRelative(92.398f, -0.798f, 170.283f, 73.977f, 169.484f, 169.442f)
                curveTo(423.236f, 348.009f, 349.816f, 424.0f, 256.0f, 424.0f)
                curveToRelative(-41.127f, 0.0f, -79.997f, -14.678f, -110.63f, -41.556f)
                curveToRelative(-4.743f, -4.161f, -11.906f, -3.908f, -16.368f, 0.553f)
                lineTo(89.34f, 422.659f)
                curveToRelative(-4.872f, 4.872f, -4.631f, 12.815f, 0.482f, 17.433f)
                curveTo(133.798f, 479.813f, 192.074f, 504.0f, 256.0f, 504.0f)
                curveToRelative(136.966f, 0.0f, 247.999f, -111.033f, 248.0f, -247.998f)
                curveTo(504.001f, 119.193f, 392.354f, 7.755f, 255.545f, 8.0f)
                close()
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null
