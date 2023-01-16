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

public val MaterialDesignIcons.CityVariant: ImageVector
    get() {
        if (_cityVariant != null) {
            return _cityVariant!!
        }
        _cityVariant = Builder(name = "CityVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 7.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 9.0f)
                moveTo(8.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                moveTo(14.0f, 18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                moveTo(14.0f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                moveTo(18.0f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                moveTo(18.0f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _cityVariant!!
    }

private var _cityVariant: ImageVector? = null
