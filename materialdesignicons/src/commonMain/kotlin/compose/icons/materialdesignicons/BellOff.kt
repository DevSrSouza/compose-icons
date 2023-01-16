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

public val MaterialDesignIcons.BellOff: ImageVector
    get() {
        if (_bellOff != null) {
            return _bellOff!!
        }
        _bellOff = Builder(name = "BellOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                lineTo(5.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 9.86f, 5.29f, 8.73f, 5.83f, 7.72f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(19.0f, 15.8f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.9f, 16.97f, 5.17f, 14.0f, 4.29f)
                curveTo(14.0f, 4.19f, 14.0f, 4.1f, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 4.0f)
                curveTo(10.0f, 4.1f, 10.0f, 4.19f, 10.0f, 4.29f)
                curveTo(9.39f, 4.47f, 8.8f, 4.74f, 8.26f, 5.09f)
                lineTo(19.0f, 15.8f)
                moveTo(12.0f, 23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 21.0f)
                horizontalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _bellOff!!
    }

private var _bellOff: ImageVector? = null
