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

public val MaterialDesignIcons.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) {
            return _currencyBtc!!
        }
        _currencyBtc = Builder(name = "CurrencyBtc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.06f, 11.57f)
                curveTo(17.65f, 10.88f, 18.0f, 10.0f, 18.0f, 9.0f)
                curveTo(18.0f, 7.14f, 16.73f, 5.57f, 15.0f, 5.13f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                curveTo(17.21f, 19.0f, 19.0f, 17.21f, 19.0f, 15.0f)
                curveTo(19.0f, 13.55f, 18.22f, 12.27f, 17.06f, 11.57f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1f, 7.0f, 16.0f, 7.9f, 16.0f, 9.0f)
                reflectiveCurveTo(15.1f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1f, 13.0f, 17.0f, 13.9f, 17.0f, 15.0f)
                reflectiveCurveTo(16.1f, 17.0f, 15.0f, 17.0f)
                close()
            }
        }
        .build()
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
