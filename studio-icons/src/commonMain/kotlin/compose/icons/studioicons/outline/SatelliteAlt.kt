package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SatelliteAlt: ImageVector
    get() {
        if (_satelliteAlt != null) {
            return _satelliteAlt!!
        }
        _satelliteAlt = Builder(name = "SatelliteAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 14.0f)
                lineToRelative(2.0f, 0.0f)
                curveToRelative(0.0f, 4.97f, -4.03f, 9.0f, -9.0f, 9.0f)
                lineToRelative(0.0f, -2.0f)
                curveTo(17.87f, 21.0f, 21.0f, 17.87f, 21.0f, 14.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineToRelative(0.0f, 2.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineToRelative(-2.0f, 0.0f)
                curveTo(17.0f, 15.66f, 15.66f, 17.0f, 14.0f, 17.0f)
                close()
                moveTo(18.26f, 0.59f)
                lineToRelative(3.54f, 3.54f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(-3.18f, 3.18f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f)
                lineToRelative(-1.24f, -1.24f)
                lineTo(13.84f, 9.6f)
                lineToRelative(1.24f, 1.24f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f)
                lineTo(9.6f, 13.84f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.24f, 1.24f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                lineTo(6.95f, 21.8f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f)
                lineToRelative(-3.54f, -3.54f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(3.18f, -3.18f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f)
                lineToRelative(1.24f, 1.24f)
                lineToRelative(0.71f, -0.71f)
                lineTo(7.3f, 11.55f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(8.72f, 7.3f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f)
                lineToRelative(1.24f, 1.24f)
                lineToRelative(0.71f, -0.71f)
                lineTo(12.25f, 6.6f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(3.18f, -3.18f)
                curveTo(16.22f, -0.2f, 17.48f, -0.2f, 18.26f, 0.59f)
                close()
                moveTo(3.06f, 15.79f)
                lineTo(2.0f, 16.85f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.06f, -1.06f)
                lineTo(3.06f, 15.79f)
                close()
                moveTo(5.18f, 13.67f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.06f, -1.06f)
                lineTo(5.18f, 13.67f)
                close()
                moveTo(10.13f, 8.72f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.41f, -1.41f)
                lineTo(10.13f, 8.72f)
                close()
                moveTo(14.73f, 4.12f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.06f, -1.06f)
                lineTo(14.73f, 4.12f)
                close()
                moveTo(16.85f, 2.0f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.06f, -1.06f)
                lineTo(16.85f, 2.0f)
                close()
            }
        }
        .build()
        return _satelliteAlt!!
    }

private var _satelliteAlt: ImageVector? = null
