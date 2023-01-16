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

public val MaterialDesignIcons.BasketMinus: ImageVector
    get() {
        if (_basketMinus != null) {
            return _basketMinus!!
        }
        _basketMinus = Builder(name = "BasketMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                moveTo(23.0f, 10.0f)
                lineTo(22.96f, 10.29f)
                lineTo(22.0f, 13.8f)
                curveTo(21.11f, 13.29f, 20.09f, 13.0f, 19.0f, 13.0f)
                curveTo(15.69f, 13.0f, 13.0f, 15.69f, 13.0f, 19.0f)
                curveTo(13.0f, 19.7f, 13.13f, 20.37f, 13.35f, 21.0f)
                horizontalLineTo(5.5f)
                curveTo(4.72f, 21.0f, 4.04f, 20.55f, 3.71f, 19.9f)
                lineTo(1.1f, 10.44f)
                lineTo(1.0f, 10.0f)
                curveTo(1.0f, 9.45f, 1.45f, 9.0f, 2.0f, 9.0f)
                horizontalLineTo(6.58f)
                lineTo(11.18f, 2.43f)
                curveTo(11.36f, 2.17f, 11.66f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(12.65f, 2.17f, 12.83f, 2.44f)
                lineTo(17.42f, 9.0f)
                horizontalLineTo(22.0f)
                curveTo(22.55f, 9.0f, 23.0f, 9.45f, 23.0f, 10.0f)
                moveTo(14.0f, 15.0f)
                curveTo(14.0f, 13.9f, 13.11f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(10.0f, 13.9f, 10.0f, 15.0f)
                reflectiveCurveTo(10.9f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(14.0f, 16.11f, 14.0f, 15.0f)
                moveTo(15.0f, 9.0f)
                lineTo(12.0f, 4.74f)
                lineTo(9.0f, 9.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _basketMinus!!
    }

private var _basketMinus: ImageVector? = null
