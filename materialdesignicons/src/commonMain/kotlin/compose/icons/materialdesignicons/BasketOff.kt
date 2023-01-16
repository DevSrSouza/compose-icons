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

public val MaterialDesignIcons.BasketOff: ImageVector
    get() {
        if (_basketOff != null) {
            return _basketOff!!
        }
        _basketOff = Builder(name = "BasketOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                lineTo(22.96f, 10.29f)
                lineTo(20.9f, 17.7f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(15.0f)
                lineTo(12.0f, 4.74f)
                lineTo(10.32f, 7.12f)
                lineTo(8.89f, 5.69f)
                lineTo(11.18f, 2.43f)
                curveTo(11.36f, 2.17f, 11.66f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(12.65f, 2.17f, 12.83f, 2.44f)
                lineTo(17.42f, 9.0f)
                horizontalLineTo(22.0f)
                curveTo(22.55f, 9.0f, 23.0f, 9.45f, 23.0f, 10.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.03f, 20.92f)
                curveTo(18.86f, 20.97f, 18.68f, 21.0f, 18.5f, 21.0f)
                horizontalLineTo(5.5f)
                curveTo(4.72f, 21.0f, 4.04f, 20.55f, 3.71f, 19.9f)
                lineTo(1.1f, 10.44f)
                lineTo(1.0f, 10.0f)
                curveTo(1.0f, 9.45f, 1.45f, 9.0f, 2.0f, 9.0f)
                horizontalLineTo(6.58f)
                lineTo(6.8f, 8.69f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(13.85f, 15.74f)
                lineTo(11.26f, 13.15f)
                curveTo(10.5f, 13.44f, 10.0f, 14.16f, 10.0f, 15.0f)
                curveTo(10.0f, 16.11f, 10.9f, 17.0f, 12.0f, 17.0f)
                curveTo(12.84f, 17.0f, 13.56f, 16.5f, 13.85f, 15.74f)
                close()
            }
        }
        .build()
        return _basketOff!!
    }

private var _basketOff: ImageVector? = null
