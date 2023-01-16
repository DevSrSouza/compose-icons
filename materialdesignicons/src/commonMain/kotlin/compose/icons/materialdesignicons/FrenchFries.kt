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

public val MaterialDesignIcons.FrenchFries: ImageVector
    get() {
        if (_frenchFries != null) {
            return _frenchFries!!
        }
        _frenchFries = Builder(name = "FrenchFries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(19.0f, 11.0f)
                horizontalLineTo(18.0f)
                moveTo(15.86f, 11.0f)
                curveTo(15.7f, 11.61f, 15.4f, 12.16f, 15.0f, 12.62f)
                verticalLineTo(8.62f)
                lineTo(17.0f, 9.62f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.86f)
                moveTo(17.0f, 7.0f)
                verticalLineTo(8.5f)
                lineTo(15.0f, 7.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                moveTo(12.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.5f)
                lineTo(12.0f, 9.5f)
                verticalLineTo(5.0f)
                moveTo(12.0f, 10.62f)
                lineTo(14.0f, 9.62f)
                verticalLineTo(13.45f)
                curveTo(13.41f, 13.8f, 12.73f, 14.0f, 12.0f, 14.0f)
                verticalLineTo(10.62f)
                moveTo(11.0f, 13.86f)
                curveTo(10.21f, 13.65f, 9.5f, 13.22f, 9.0f, 12.62f)
                verticalLineTo(9.62f)
                lineTo(11.0f, 8.62f)
                verticalLineTo(13.86f)
                moveTo(9.0f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.5f)
                lineTo(10.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                moveTo(7.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.5f)
                lineTo(8.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _frenchFries!!
    }

private var _frenchFries: ImageVector? = null
