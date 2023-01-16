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

public val MaterialDesignIcons.TelevisionOff: ImageVector
    get() {
        if (_televisionOff != null) {
            return _televisionOff!!
        }
        _televisionOff = Builder(name = "TelevisionOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 2.77f)
                lineTo(1.78f, 1.5f)
                lineTo(21.0f, 20.72f)
                lineTo(19.73f, 22.0f)
                lineTo(16.73f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 4.5f, 1.17f, 4.07f, 1.46f, 3.73f)
                lineTo(0.5f, 2.77f)
                moveTo(21.0f, 17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.82f)
                lineTo(5.82f, 3.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(23.0f, 17.85f, 22.45f, 18.59f, 21.7f, 18.87f)
                lineTo(19.82f, 17.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 17.0f)
                horizontalLineTo(14.73f)
                lineTo(3.0f, 5.27f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _televisionOff!!
    }

private var _televisionOff: ImageVector? = null
