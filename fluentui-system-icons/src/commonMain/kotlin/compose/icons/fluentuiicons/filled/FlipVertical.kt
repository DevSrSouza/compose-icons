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

public val FilledGroup.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = Builder(name = "FlipVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5474f, 2.1631f)
                curveTo(19.8299f, 2.3478f, 20.0001f, 2.6625f, 20.0001f, 3.0f)
                verticalLineTo(10.0f)
                curveTo(20.0001f, 10.5523f, 19.5524f, 11.0f, 19.0001f, 11.0f)
                horizontalLineTo(3.0001f)
                curveTo(2.5267f, 11.0f, 2.1182f, 10.6681f, 2.0213f, 10.2048f)
                curveTo(1.9244f, 9.7414f, 2.1656f, 9.2736f, 2.5993f, 9.0838f)
                lineTo(18.5993f, 2.0838f)
                curveTo(18.9085f, 1.9486f, 19.265f, 1.9784f, 19.5474f, 2.1631f)
                close()
                moveTo(7.7807f, 9.0f)
                horizontalLineTo(18.0001f)
                verticalLineTo(4.529f)
                lineTo(7.7807f, 9.0f)
                close()
                moveTo(20.0f, 21.5f)
                curveTo(20.0f, 21.6712f, 19.9125f, 21.8304f, 19.768f, 21.9222f)
                curveTo(19.6234f, 22.0139f, 19.442f, 22.0253f, 19.2872f, 21.9524f)
                lineTo(2.2871f, 13.9524f)
                curveTo(2.0753f, 13.8527f, 1.961f, 13.6194f, 2.0121f, 13.3909f)
                curveTo(2.0632f, 13.1624f, 2.2659f, 13.0f, 2.5001f, 13.0f)
                horizontalLineTo(19.5f)
                curveTo(19.7762f, 13.0f, 20.0f, 13.2239f, 20.0f, 13.5f)
                verticalLineTo(21.5f)
                close()
            }
        }
        .build()
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
