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

public val MaterialDesignIcons.DancePole: ImageVector
    get() {
        if (_dancePole != null) {
            return _dancePole!!
        }
        _dancePole = Builder(name = "DancePole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                verticalLineTo(2.0f)
                lineTo(11.23f, 1.36f)
                lineTo(7.76f, 5.5f)
                lineTo(11.0f, 7.5f)
                verticalLineTo(5.16f)
                lineTo(10.78f, 5.0f)
                lineTo(12.0f, 3.56f)
                verticalLineTo(23.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.24f)
                lineTo(15.93f, 11.31f)
                curveTo(18.5f, 11.71f, 21.13f, 10.36f, 22.66f, 8.83f)
                lineTo(21.24f, 7.41f)
                curveTo(20.1f, 8.56f, 17.7f, 9.61f, 16.0f, 9.26f)
                lineTo(14.0f, 7.24f)
                verticalLineTo(1.0f)
                moveTo(17.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 4.0f)
                moveTo(11.0f, 7.76f)
                lineTo(7.1f, 11.66f)
                curveTo(5.25f, 13.5f, 4.31f, 14.85f, 3.06f, 18.16f)
                lineTo(4.94f, 18.86f)
                curveTo(5.94f, 16.2f, 6.66f, 15.14f, 7.87f, 13.84f)
                lineTo(9.22f, 15.19f)
                lineTo(4.27f, 20.14f)
                lineTo(5.69f, 21.56f)
                lineTo(11.0f, 16.24f)
                close()
            }
        }
        .build()
        return _dancePole!!
    }

private var _dancePole: ImageVector? = null
