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

public val MaterialDesignIcons.Oil: ImageVector
    get() {
        if (_oil != null) {
            return _oil!!
        }
        _oil = Builder(name = "Oil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.5f)
                curveTo(22.0f, 12.5f, 24.0f, 14.67f, 24.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 16.0f)
                curveTo(20.0f, 14.67f, 22.0f, 12.5f, 22.0f, 12.5f)
                moveTo(6.0f, 6.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                curveTo(11.74f, 10.0f, 12.39f, 10.4f, 12.73f, 11.0f)
                lineTo(19.24f, 7.24f)
                lineTo(22.5f, 9.13f)
                curveTo(23.0f, 9.4f, 23.14f, 10.0f, 22.87f, 10.5f)
                curveTo(22.59f, 10.97f, 22.0f, 11.14f, 21.5f, 10.86f)
                lineTo(19.4f, 9.65f)
                lineTo(15.75f, 15.97f)
                curveTo(15.41f, 16.58f, 14.75f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 15.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 6.0f)
                moveTo(5.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                lineTo(16.06f, 11.43f)
                lineTo(12.6f, 13.43f)
                lineTo(11.69f, 12.0f)
                horizontalLineTo(5.0f)
                moveTo(0.38f, 9.21f)
                lineTo(2.09f, 7.5f)
                curveTo(2.5f, 7.11f, 3.11f, 7.11f, 3.5f, 7.5f)
                curveTo(3.89f, 7.89f, 3.89f, 8.5f, 3.5f, 8.91f)
                lineTo(1.79f, 10.62f)
                curveTo(1.4f, 11.0f, 0.77f, 11.0f, 0.38f, 10.62f)
                curveTo(0.0f, 10.23f, 0.0f, 9.6f, 0.38f, 9.21f)
                close()
            }
        }
        .build()
        return _oil!!
    }

private var _oil: ImageVector? = null
