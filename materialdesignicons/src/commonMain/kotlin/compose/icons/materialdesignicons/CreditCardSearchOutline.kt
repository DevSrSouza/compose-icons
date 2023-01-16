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

public val MaterialDesignIcons.CreditCardSearchOutline: ImageVector
    get() {
        if (_creditCardSearchOutline != null) {
            return _creditCardSearchOutline!!
        }
        _creditCardSearchOutline = Builder(name = "CreditCardSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.03f, 12.0f)
                curveTo(11.28f, 11.61f, 11.57f, 11.24f, 11.9f, 10.9f)
                curveTo(14.44f, 8.37f, 18.56f, 8.37f, 21.1f, 10.9f)
                curveTo(21.45f, 11.26f, 21.74f, 11.65f, 22.0f, 12.06f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(11.82f)
                curveTo(11.24f, 19.4f, 10.8f, 18.72f, 10.5f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.03f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(20.31f, 17.9f)
                curveTo(20.75f, 17.21f, 21.0f, 16.38f, 21.0f, 15.5f)
                curveTo(21.0f, 13.0f, 19.0f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(12.0f, 13.0f, 12.0f, 15.5f)
                reflectiveCurveTo(14.0f, 20.0f, 16.5f, 20.0f)
                curveTo(17.37f, 20.0f, 18.19f, 19.75f, 18.88f, 19.32f)
                lineTo(22.0f, 22.39f)
                lineTo(23.39f, 21.0f)
                lineTo(20.31f, 17.9f)
                moveTo(16.5f, 18.0f)
                curveTo(15.12f, 18.0f, 14.0f, 16.88f, 14.0f, 15.5f)
                reflectiveCurveTo(15.12f, 13.0f, 16.5f, 13.0f)
                reflectiveCurveTo(19.0f, 14.12f, 19.0f, 15.5f)
                reflectiveCurveTo(17.88f, 18.0f, 16.5f, 18.0f)
                close()
            }
        }
        .build()
        return _creditCardSearchOutline!!
    }

private var _creditCardSearchOutline: ImageVector? = null
