package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SatelliteAlt: ImageVector
    get() {
        if (_satelliteAlt != null) {
            return _satelliteAlt!!
        }
        _satelliteAlt = Builder(name = "SatelliteAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.44f, 0.59f)
                lineToRelative(-3.18f, 3.18f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(1.24f, 1.24f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.65f, -2.65f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(6.6f, 12.25f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineToRelative(-3.18f, 3.18f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(3.54f, 3.54f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(3.18f, -3.18f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-1.24f, -1.24f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(4.24f, -4.24f)
                lineTo(13.84f, 9.6f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(1.24f, 1.24f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(3.18f, -3.18f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-3.54f, -3.54f)
                curveTo(17.48f, -0.2f, 16.22f, -0.2f, 15.44f, 0.59f)
                close()
                moveTo(6.6f, 19.32f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(2.0f, 16.85f)
                lineToRelative(1.06f, -1.06f)
                lineTo(6.6f, 19.32f)
                close()
                moveTo(8.72f, 17.2f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(1.06f, -1.06f)
                lineTo(8.72f, 17.2f)
                close()
                moveTo(18.26f, 7.66f)
                lineTo(17.2f, 8.72f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(1.06f, -1.06f)
                lineTo(18.26f, 7.66f)
                close()
                moveTo(20.38f, 5.54f)
                lineTo(19.32f, 6.6f)
                lineToRelative(-3.54f, -3.54f)
                lineTo(16.85f, 2.0f)
                lineTo(20.38f, 5.54f)
                close()
                moveTo(21.0f, 14.0f)
                lineToRelative(2.0f, 0.0f)
                curveToRelative(0.0f, 4.97f, -4.03f, 9.0f, -9.0f, 9.0f)
                lineToRelative(0.0f, -2.0f)
                curveTo(17.87f, 21.0f, 21.0f, 17.87f, 21.0f, 14.0f)
                close()
                moveTo(17.0f, 14.0f)
                lineToRelative(2.0f, 0.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineToRelative(0.0f, -2.0f)
                curveTo(15.66f, 17.0f, 17.0f, 15.66f, 17.0f, 14.0f)
                close()
            }
        }
        .build()
        return _satelliteAlt!!
    }

private var _satelliteAlt: ImageVector? = null
