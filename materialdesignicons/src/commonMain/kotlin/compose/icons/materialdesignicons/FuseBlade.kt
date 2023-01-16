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

public val MaterialDesignIcons.FuseBlade: ImageVector
    get() {
        if (_fuseBlade != null) {
            return _fuseBlade!!
        }
        _fuseBlade = Builder(name = "FuseBlade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                horizontalLineTo(8.0f)
                lineTo(6.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                moveTo(18.0f, 16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                lineTo(18.0f, 19.0f)
                verticalLineTo(16.0f)
                moveTo(3.0f, 3.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 5.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 15.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                moveTo(11.83f, 13.0f)
                verticalLineTo(9.73f)
                horizontalLineTo(10.0f)
                lineTo(12.61f, 4.66f)
                verticalLineTo(7.93f)
                horizontalLineTo(14.36f)
                lineTo(11.83f, 13.0f)
                close()
            }
        }
        .build()
        return _fuseBlade!!
    }

private var _fuseBlade: ImageVector? = null
