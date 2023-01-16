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

public val MaterialDesignIcons.EarbudsOff: ImageVector
    get() {
        if (_earbudsOff != null) {
            return _earbudsOff!!
        }
        _earbudsOff = Builder(name = "EarbudsOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.34f)
                verticalLineTo(9.34f)
                lineTo(11.56f, 10.91f)
                lineTo(11.56f, 10.9f)
                lineTo(14.1f, 13.45f)
                lineTo(14.09f, 13.44f)
                lineTo(15.58f, 14.93f)
                lineTo(15.59f, 14.93f)
                lineTo(18.5f, 17.84f)
                verticalLineTo(17.85f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.43f, 20.33f)
                curveTo(18.3f, 20.72f, 17.94f, 21.0f, 17.5f, 21.0f)
                horizontalLineTo(15.5f)
                curveTo(14.95f, 21.0f, 14.5f, 20.55f, 14.5f, 20.0f)
                verticalLineTo(16.39f)
                lineTo(10.0f, 11.89f)
                verticalLineTo(20.0f)
                curveTo(10.0f, 20.55f, 9.55f, 21.0f, 9.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 21.0f, 7.0f, 20.55f, 7.0f, 20.0f)
                verticalLineTo(13.27f)
                curveTo(6.32f, 13.72f, 5.61f, 14.0f, 5.0f, 14.0f)
                curveTo(3.0f, 14.0f, 2.0f, 12.0f, 2.0f, 11.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.58f, 2.19f, 5.0f, 2.55f, 4.43f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(6.1f, 5.44f)
                moveTo(22.0f, 8.5f)
                curveTo(22.0f, 5.46f, 19.54f, 3.0f, 16.5f, 3.0f)
                curveTo(13.69f, 3.0f, 11.37f, 5.12f, 11.04f, 7.84f)
                lineTo(17.16f, 13.96f)
                curveTo(19.89f, 13.63f, 22.0f, 11.32f, 22.0f, 8.5f)
                close()
            }
        }
        .build()
        return _earbudsOff!!
    }

private var _earbudsOff: ImageVector? = null
