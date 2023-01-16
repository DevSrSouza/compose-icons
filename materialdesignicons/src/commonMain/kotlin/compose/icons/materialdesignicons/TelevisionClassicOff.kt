package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TelevisionClassicOff: ImageVector
    get() {
        if (_televisionClassicOff != null) {
            return _televisionClassicOff!!
        }
        _televisionClassicOff = Builder(name = "TelevisionClassicOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(21.0f, 21.72f)
                lineTo(19.73f, 23.0f)
                lineTo(17.73f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 21.0f, 2.0f, 20.11f, 2.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 8.0f, 2.76f, 7.14f, 3.75f, 7.0f)
                lineTo(2.0f, 5.27f)
                moveTo(8.16f, 3.0f)
                lineTo(12.0f, 6.84f)
                lineTo(15.84f, 3.0f)
                lineTo(17.25f, 4.41f)
                lineTo(14.66f, 7.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 7.0f, 22.0f, 7.89f, 22.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 19.34f, 21.92f, 19.66f, 21.77f, 19.94f)
                lineTo(17.0f, 15.18f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.82f)
                lineTo(8.82f, 7.0f)
                horizontalLineTo(9.34f)
                lineTo(6.75f, 4.41f)
                lineTo(8.16f, 3.0f)
                moveTo(4.0f, 9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.73f)
                lineTo(5.73f, 9.0f)
                horizontalLineTo(4.0f)
                moveTo(19.5f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.5f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.5f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.5f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.5f, 9.0f)
                moveTo(19.5f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.5f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.5f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.5f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.5f, 12.0f)
                close()
            }
        }
        .build()
        return _televisionClassicOff!!
    }

private var _televisionClassicOff: ImageVector? = null
