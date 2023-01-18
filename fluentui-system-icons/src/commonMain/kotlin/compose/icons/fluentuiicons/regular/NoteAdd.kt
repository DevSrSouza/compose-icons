package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.NoteAdd: ImageVector
    get() {
        if (_noteAdd != null) {
            return _noteAdd!!
        }
        _noteAdd = Builder(name = "NoteAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 9.5376f, 1.0f, 6.5f, 1.0f)
                curveTo(3.4624f, 1.0f, 1.0f, 3.4624f, 1.0f, 6.5f)
                curveTo(1.0f, 9.5376f, 3.4624f, 12.0f, 6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                close()
                moveTo(7.0006f, 7.0f)
                lineTo(7.0011f, 9.5035f)
                curveTo(7.0011f, 9.7797f, 6.7772f, 10.0035f, 6.5011f, 10.0035f)
                curveTo(6.225f, 10.0035f, 6.0011f, 9.7797f, 6.0011f, 9.5035f)
                lineTo(6.0006f, 7.0f)
                horizontalLineTo(3.4961f)
                curveTo(3.2199f, 7.0f, 2.9961f, 6.7762f, 2.9961f, 6.5f)
                curveTo(2.9961f, 6.2239f, 3.2199f, 6.0f, 3.4961f, 6.0f)
                horizontalLineTo(6.0005f)
                lineTo(6.0f, 3.4993f)
                curveTo(6.0f, 3.2231f, 6.2239f, 2.9993f, 6.5f, 2.9993f)
                curveTo(6.7761f, 2.9993f, 7.0f, 3.2231f, 7.0f, 3.4993f)
                lineTo(7.0005f, 6.0f)
                horizontalLineTo(9.503f)
                curveTo(9.7792f, 6.0f, 10.003f, 6.2239f, 10.003f, 6.5f)
                curveTo(10.003f, 6.7762f, 9.7792f, 7.0f, 9.503f, 7.0f)
                horizontalLineTo(7.0006f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(12.6865f)
                curveTo(12.5142f, 3.9665f, 12.2747f, 3.4632f, 11.9782f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(13.1287f)
                curveTo(21.0f, 13.7254f, 20.7629f, 14.2977f, 20.341f, 14.7197f)
                lineTo(14.7197f, 20.341f)
                curveTo(14.2977f, 20.7629f, 13.7254f, 21.0f, 13.1287f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(11.9782f)
                curveTo(3.4632f, 12.2747f, 3.9665f, 12.5142f, 4.5f, 12.6865f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.25f)
                curveTo(13.0f, 14.517f, 14.3565f, 13.1008f, 16.0656f, 13.0051f)
                lineTo(16.25f, 13.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(18.439f, 14.5f)
                horizontalLineTo(16.25f)
                curveTo(15.3318f, 14.5f, 14.5788f, 15.2071f, 14.5058f, 16.1065f)
                lineTo(14.5f, 16.25f)
                verticalLineTo(18.439f)
                lineTo(18.439f, 14.5f)
                close()
            }
        }
        .build()
        return _noteAdd!!
    }

private var _noteAdd: ImageVector? = null
