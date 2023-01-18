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

public val RemixIcons.ThermometerFill: ImageVector
    get() {
        if (_thermometerFill != null) {
            return _thermometerFill!!
        }
        _thermometerFill = Builder(name = "ThermometerFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.556f, 3.444f)
                curveToRelative(1.562f, 1.562f, 1.562f, 4.094f, 0.0f, 5.657f)
                lineToRelative(-8.2f, 8.2f)
                curveToRelative(-0.642f, 0.642f, -1.484f, 1.047f, -2.387f, 1.147f)
                lineToRelative(-3.378f, 0.374f)
                lineToRelative(-2.298f, 2.3f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                curveToRelative(-0.39f, -0.391f, -0.39f, -1.024f, 0.0f, -1.415f)
                lineToRelative(2.298f, -2.299f)
                lineToRelative(0.375f, -3.377f)
                curveToRelative(0.1f, -0.903f, 0.505f, -1.745f, 1.147f, -2.387f)
                lineToRelative(8.2f, -8.2f)
                curveToRelative(1.563f, -1.562f, 4.095f, -1.562f, 5.657f, 0.0f)
                close()
                moveTo(11.364f, 12.636f)
                lineTo(9.95f, 14.05f)
                lineToRelative(2.121f, 2.122f)
                lineToRelative(1.414f, -1.415f)
                lineToRelative(-2.121f, -2.121f)
                close()
                moveTo(14.192f, 9.808f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(-2.122f, -2.121f)
                close()
                moveTo(17.021f, 6.979f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.12f, 2.122f)
                lineTo(19.143f, 9.1f)
                lineToRelative(-2.121f, -2.122f)
                close()
            }
        }
        .build()
        return _thermometerFill!!
    }

private var _thermometerFill: ImageVector? = null
