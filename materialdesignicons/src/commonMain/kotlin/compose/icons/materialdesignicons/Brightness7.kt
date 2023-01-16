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

public val MaterialDesignIcons.Brightness7: ImageVector
    get() {
        if (_brightness7 != null) {
            return _brightness7!!
        }
        _brightness7 = Builder(name = "Brightness7", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.0f)
                moveTo(12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 18.0f)
                moveTo(20.0f, 8.69f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.31f)
                lineTo(12.0f, 0.69f)
                lineTo(8.69f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.69f)
                lineTo(0.69f, 12.0f)
                lineTo(4.0f, 15.31f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.69f)
                lineTo(12.0f, 23.31f)
                lineTo(15.31f, 20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.31f)
                lineTo(23.31f, 12.0f)
                lineTo(20.0f, 8.69f)
                close()
            }
        }
        .build()
        return _brightness7!!
    }

private var _brightness7: ImageVector? = null
