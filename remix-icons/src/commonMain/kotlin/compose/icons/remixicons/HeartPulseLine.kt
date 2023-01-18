package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.HeartPulseLine: ImageVector
    get() {
        if (_heartPulseLine != null) {
            return _heartPulseLine!!
        }
        _heartPulseLine = Builder(name = "HeartPulseLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveTo(19.538f, 3.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                curveToRelative(0.0f, 7.0f, -7.5f, 11.0f, -10.0f, 12.5f)
                curveToRelative(-1.977f, -1.186f, -7.083f, -3.937f, -9.131f, -8.499f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.21f)
                curveTo(2.074f, 10.364f, 2.0f, 9.698f, 2.0f, 9.0f)
                curveToRelative(0.0f, -3.5f, 2.5f, -6.0f, 5.5f, -6.0f)
                curveTo(9.36f, 3.0f, 11.0f, 4.0f, 12.0f, 5.0f)
                curveToRelative(1.0f, -1.0f, 2.64f, -2.0f, 4.5f, -2.0f)
                close()
                moveTo(16.5f, 5.0f)
                curveToRelative(-1.076f, 0.0f, -2.24f, 0.57f, -3.086f, 1.414f)
                lineTo(12.0f, 7.828f)
                lineToRelative(-1.414f, -1.414f)
                curveTo(9.74f, 5.57f, 8.576f, 5.0f, 7.5f, 5.0f)
                curveTo(5.56f, 5.0f, 4.0f, 6.656f, 4.0f, 9.0f)
                curveToRelative(0.0f, 0.685f, 0.09f, 1.352f, 0.267f, 2.0f)
                horizontalLineToRelative(2.167f)
                lineTo(8.5f, 7.556f)
                lineToRelative(3.0f, 5.0f)
                lineTo(12.434f, 11.0f)
                lineTo(17.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.434f)
                lineTo(11.5f, 16.444f)
                lineToRelative(-3.0f, -5.0f)
                lineTo(7.566f, 13.0f)
                lineTo(5.108f, 13.0f)
                curveToRelative(0.79f, 1.374f, 1.985f, 2.668f, 3.537f, 3.903f)
                curveToRelative(0.745f, 0.592f, 1.54f, 1.145f, 2.421f, 1.7f)
                curveToRelative(0.299f, 0.189f, 0.595f, 0.37f, 0.934f, 0.572f)
                curveToRelative(0.339f, -0.202f, 0.635f, -0.383f, 0.934f, -0.571f)
                curveToRelative(0.881f, -0.556f, 1.676f, -1.109f, 2.42f, -1.701f)
                curveTo(18.335f, 14.533f, 20.0f, 11.943f, 20.0f, 9.0f)
                curveToRelative(0.0f, -2.36f, -1.537f, -4.0f, -3.5f, -4.0f)
                close()
            }
        }
        .build()
        return _heartPulseLine!!
    }

private var _heartPulseLine: ImageVector? = null
