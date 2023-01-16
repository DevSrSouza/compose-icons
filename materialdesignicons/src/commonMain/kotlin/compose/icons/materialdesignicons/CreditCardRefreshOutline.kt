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

public val MaterialDesignIcons.CreditCardRefreshOutline: ImageVector
    get() {
        if (_creditCardRefreshOutline != null) {
            return _creditCardRefreshOutline!!
        }
        _creditCardRefreshOutline = Builder(name = "CreditCardRefreshOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(11.68f)
                curveTo(11.57f, 19.5f, 11.5f, 19.0f, 11.5f, 18.5f)
                curveTo(11.5f, 18.33f, 11.5f, 18.17f, 11.53f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.32f)
                curveTo(20.74f, 12.56f, 21.41f, 12.93f, 22.0f, 13.4f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                moveTo(20.83f, 15.67f)
                lineTo(22.0f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.0f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16.0f, 18.0f, 16.0f)
                curveTo(16.62f, 16.0f, 15.5f, 17.12f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 21.0f, 18.0f, 21.0f)
                curveTo(18.82f, 21.0f, 19.54f, 20.61f, 20.0f, 20.0f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18.0f, 22.5f)
                curveTo(15.79f, 22.5f, 14.0f, 20.71f, 14.0f, 18.5f)
                reflectiveCurveTo(15.79f, 14.5f, 18.0f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                close()
            }
        }
        .build()
        return _creditCardRefreshOutline!!
    }

private var _creditCardRefreshOutline: ImageVector? = null
