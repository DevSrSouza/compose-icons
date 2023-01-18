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

public val FilledGroup.ArrowParagraph: ImageVector
    get() {
        if (_arrowParagraph != null) {
            return _arrowParagraph!!
        }
        _arrowParagraph = Builder(name = "ArrowParagraph", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                curveTo(21.5523f, 2.0f, 22.0f, 2.4477f, 22.0f, 3.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 8.6568f, 20.6569f, 10.0f, 19.0f, 10.0f)
                horizontalLineTo(14.4142f)
                lineTo(16.7071f, 12.2929f)
                curveTo(17.0976f, 12.6834f, 17.0976f, 13.3166f, 16.7071f, 13.7071f)
                curveTo(16.3166f, 14.0976f, 15.6834f, 14.0976f, 15.2929f, 13.7071f)
                lineTo(11.2929f, 9.7071f)
                curveTo(10.9024f, 9.3166f, 10.9024f, 8.6834f, 11.2929f, 8.2929f)
                lineTo(15.2929f, 4.2929f)
                curveTo(15.6834f, 3.9024f, 16.3166f, 3.9024f, 16.7071f, 4.2929f)
                curveTo(17.0976f, 4.6834f, 17.0976f, 5.3166f, 16.7071f, 5.7071f)
                lineTo(14.4142f, 8.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 8.0f, 20.0f, 7.5523f, 20.0f, 7.0f)
                verticalLineTo(3.0f)
                curveTo(20.0f, 2.4477f, 20.4477f, 2.0f, 21.0f, 2.0f)
                close()
                moveTo(7.2929f, 11.2929f)
                curveTo(6.9024f, 11.6834f, 6.9024f, 12.3166f, 7.2929f, 12.7071f)
                lineTo(9.5858f, 15.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 15.0f, 2.0f, 15.4477f, 2.0f, 16.0f)
                curveTo(2.0f, 16.5523f, 2.4477f, 17.0f, 3.0f, 17.0f)
                horizontalLineTo(9.5858f)
                lineTo(7.2929f, 19.2929f)
                curveTo(6.9024f, 19.6834f, 6.9024f, 20.3166f, 7.2929f, 20.7071f)
                curveTo(7.6834f, 21.0976f, 8.3166f, 21.0976f, 8.7071f, 20.7071f)
                lineTo(12.7071f, 16.7071f)
                curveTo(12.8037f, 16.6105f, 12.8765f, 16.499f, 12.9253f, 16.38f)
                curveTo(12.9731f, 16.2637f, 12.9996f, 16.1364f, 13.0f, 16.003f)
                lineTo(13.0f, 16.0f)
                curveTo(13.0f, 15.7339f, 12.8961f, 15.4921f, 12.7266f, 15.3129f)
                curveTo(12.7194f, 15.3053f, 12.7121f, 15.2978f, 12.7047f, 15.2905f)
                lineTo(8.7071f, 11.2929f)
                curveTo(8.3166f, 10.9024f, 7.6834f, 10.9024f, 7.2929f, 11.2929f)
                close()
            }
        }
        .build()
        return _arrowParagraph!!
    }

private var _arrowParagraph: ImageVector? = null
