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

public val BrandsGroup.Quora: ImageVector
    get() {
        if (_quora != null) {
            return _quora!!
        }
        _quora = Builder(name = "Quora", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.5f, 386.7f)
                horizontalLineToRelative(-29.3f)
                curveToRelative(-1.5f, 13.5f, -10.5f, 30.8f, -33.0f, 30.8f)
                curveToRelative(-20.5f, 0.0f, -35.3f, -14.2f, -49.5f, -35.8f)
                curveToRelative(44.2f, -34.2f, 74.7f, -87.5f, 74.7f, -153.0f)
                curveTo(403.5f, 111.2f, 306.8f, 32.0f, 205.0f, 32.0f)
                curveTo(105.3f, 32.0f, 7.3f, 111.7f, 7.3f, 228.7f)
                curveToRelative(0.0f, 134.1f, 131.3f, 221.6f, 249.0f, 189.0f)
                curveTo(276.0f, 451.3f, 302.0f, 480.0f, 351.5f, 480.0f)
                curveToRelative(81.8f, 0.0f, 90.8f, -75.3f, 89.0f, -93.3f)
                close()
                moveTo(297.0f, 329.2f)
                curveTo(277.5f, 300.0f, 253.3f, 277.0f, 205.5f, 277.0f)
                curveToRelative(-30.5f, 0.0f, -54.3f, 10.0f, -69.0f, 22.8f)
                lineToRelative(12.2f, 24.3f)
                curveToRelative(6.2f, -3.0f, 13.0f, -4.0f, 19.8f, -4.0f)
                curveToRelative(35.5f, 0.0f, 53.7f, 30.8f, 69.2f, 61.3f)
                curveToRelative(-10.0f, 3.0f, -20.7f, 4.2f, -32.7f, 4.2f)
                curveToRelative(-75.0f, 0.0f, -107.5f, -53.0f, -107.5f, -156.7f)
                curveTo(97.5f, 124.5f, 130.0f, 71.0f, 205.0f, 71.0f)
                curveToRelative(76.2f, 0.0f, 108.7f, 53.5f, 108.7f, 157.7f)
                curveToRelative(0.1f, 41.8f, -5.4f, 75.6f, -16.7f, 100.5f)
                close()
            }
        }
        .build()
        return _quora!!
    }

private var _quora: ImageVector? = null
