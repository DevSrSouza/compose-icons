package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FoodFish: ImageVector
    get() {
        if (_foodFish != null) {
            return _foodFish!!
        }
        _foodFish = Builder(name = "FoodFish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3574f, 4.1026f)
                curveTo(9.3558f, 5.1042f, 8.7769f, 6.4379f, 8.4451f, 7.7762f)
                curveTo(8.112f, 9.1195f, 8.014f, 10.5229f, 8.0148f, 11.725f)
                curveTo(8.0149f, 11.902f, 7.8678f, 12.0486f, 7.6933f, 12.0493f)
                curveTo(5.9219f, 12.056f, 3.6769f, 12.2684f, 1.8611f, 13.1357f)
                curveTo(1.1786f, 13.4617f, 0.8939f, 14.1336f, 1.0353f, 14.7705f)
                curveTo(1.1676f, 15.3667f, 1.6502f, 15.8563f, 2.302f, 16.0153f)
                curveTo(3.0968f, 16.2092f, 4.019f, 16.4601f, 4.8209f, 16.7443f)
                curveTo(5.222f, 16.8865f, 5.5806f, 17.0328f, 5.8725f, 17.1789f)
                curveTo(6.1749f, 17.3302f, 6.3595f, 17.459f, 6.451f, 17.5503f)
                curveTo(6.5423f, 17.6417f, 6.6709f, 17.8261f, 6.8221f, 18.1281f)
                curveTo(6.9681f, 18.4198f, 7.1141f, 18.778f, 7.2561f, 19.1788f)
                curveTo(7.54f, 19.9799f, 7.7904f, 20.9013f, 7.984f, 21.6958f)
                curveTo(8.1428f, 22.3477f, 8.6325f, 22.8305f, 9.2287f, 22.9629f)
                curveTo(9.8656f, 23.1044f, 10.5377f, 22.82f, 10.8639f, 22.1376f)
                curveTo(11.7306f, 20.3244f, 11.9449f, 18.0839f, 11.9533f, 16.315f)
                curveTo(11.9541f, 16.1405f, 12.1006f, 15.9937f, 12.2774f, 15.9938f)
                curveTo(13.4793f, 15.9942f, 14.8833f, 15.8959f, 16.2272f, 15.5625f)
                curveTo(17.5663f, 15.2303f, 18.901f, 14.6509f, 19.9033f, 13.6485f)
                curveTo(21.0225f, 12.5293f, 21.5711f, 11.0398f, 21.8198f, 9.5927f)
                curveTo(22.0692f, 8.1414f, 22.0286f, 6.6672f, 21.9145f, 5.5003f)
                curveTo(21.7365f, 3.68f, 20.3259f, 2.2694f, 18.5056f, 2.0914f)
                curveTo(17.3387f, 1.9773f, 15.8645f, 1.9367f, 14.4132f, 2.1861f)
                curveTo(12.9661f, 2.4348f, 11.4766f, 2.9834f, 10.3574f, 4.1026f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.5523f, 5.0f, 17.0f, 5.4477f, 17.0f, 6.0f)
                curveTo(17.0f, 6.5523f, 16.5523f, 7.0f, 16.0f, 7.0f)
                curveTo(15.4477f, 7.0f, 15.0f, 6.5523f, 15.0f, 6.0f)
                curveTo(15.0f, 5.4477f, 15.4477f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _foodFish!!
    }

private var _foodFish: ImageVector? = null
