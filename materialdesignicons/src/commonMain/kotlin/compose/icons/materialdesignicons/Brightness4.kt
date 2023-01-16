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

public val MaterialDesignIcons.Brightness4: ImageVector
    get() {
        if (_brightness4 != null) {
            return _brightness4!!
        }
        _brightness4 = Builder(name = "Brightness4", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(11.11f, 18.0f, 10.26f, 17.8f, 9.5f, 17.45f)
                curveTo(11.56f, 16.5f, 13.0f, 14.42f, 13.0f, 12.0f)
                curveTo(13.0f, 9.58f, 11.56f, 7.5f, 9.5f, 6.55f)
                curveTo(10.26f, 6.2f, 11.11f, 6.0f, 12.0f, 6.0f)
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
        return _brightness4!!
    }

private var _brightness4: ImageVector? = null
