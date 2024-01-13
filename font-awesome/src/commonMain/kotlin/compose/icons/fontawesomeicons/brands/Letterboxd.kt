package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Letterboxd: ImageVector
    get() {
        if (_letterboxd != null) {
            return _letterboxd!!
        }
        _letterboxd = Builder(name = "Letterboxd", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(521.3f, 128.0f)
                curveTo(586.9f, 128.0f, 640.0f, 181.1f, 640.0f, 246.6f)
                reflectiveCurveToRelative(-53.1f, 118.6f, -118.7f, 118.6f)
                curveToRelative(-42.5f, 0.0f, -79.7f, -22.3f, -100.7f, -55.8f)
                curveToRelative(11.4f, -18.2f, 18.0f, -39.7f, 18.0f, -62.8f)
                reflectiveCurveToRelative(-6.6f, -44.6f, -18.0f, -62.8f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.8f, -1.2f)
                curveToRelative(20.8f, -32.3f, 56.8f, -53.9f, 97.9f, -54.6f)
                lineToRelative(2.0f, 0.0f)
                close()
                moveTo(320.0f, 128.0f)
                curveToRelative(42.5f, 0.0f, 79.7f, 22.3f, 100.7f, 55.8f)
                curveToRelative(-11.4f, 18.2f, -18.0f, 39.7f, -18.0f, 62.8f)
                reflectiveCurveToRelative(6.6f, 44.6f, 18.0f, 62.8f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-0.8f, 1.2f)
                curveToRelative(-20.8f, 32.3f, -56.8f, 53.9f, -97.9f, 54.6f)
                lineToRelative(-2.0f, 0.0f)
                curveToRelative(-42.5f, 0.0f, -79.7f, -22.3f, -100.7f, -55.8f)
                curveToRelative(11.4f, -18.2f, 18.0f, -39.7f, 18.0f, -62.8f)
                reflectiveCurveToRelative(-6.6f, -44.6f, -18.0f, -62.8f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.8f, -1.2f)
                curveToRelative(20.8f, -32.3f, 56.8f, -53.9f, 97.9f, -54.6f)
                lineToRelative(2.0f, 0.0f)
                close()
                moveTo(118.7f, 128.0f)
                curveToRelative(42.5f, 0.0f, 79.7f, 22.3f, 100.7f, 55.8f)
                curveToRelative(-11.4f, 18.2f, -18.0f, 39.7f, -18.0f, 62.8f)
                reflectiveCurveToRelative(6.6f, 44.6f, 18.0f, 62.8f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-0.8f, 1.2f)
                curveToRelative(-20.8f, 32.3f, -56.8f, 53.9f, -97.9f, 54.6f)
                lineToRelative(-2.0f, 0.0f)
                curveTo(53.1f, 365.1f, 0.0f, 312.1f, 0.0f, 246.6f)
                reflectiveCurveTo(53.1f, 128.0f, 118.7f, 128.0f)
                close()
            }
        }
        .build()
        return _letterboxd!!
    }

private var _letterboxd: ImageVector? = null
