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

public val MaterialDesignIcons.ButterflyOutline: ImageVector
    get() {
        if (_butterflyOutline != null) {
            return _butterflyOutline!!
        }
        _butterflyOutline = Builder(name = "ButterflyOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                lineTo(9.03f, 3.97f)
                lineTo(10.0f, 3.0f)
                lineTo(12.0f, 5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(15.0f, 4.0f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(21.0f)
                moveTo(14.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                curveTo(14.84f, 6.37f, 15.88f, 6.0f, 17.0f, 6.0f)
                curveTo(19.76f, 6.0f, 22.0f, 8.24f, 22.0f, 11.0f)
                curveTo(22.0f, 12.64f, 21.21f, 14.09f, 20.0f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 19.21f, 18.21f, 21.0f, 16.0f, 21.0f)
                curveTo(15.27f, 21.0f, 14.59f, 20.81f, 14.0f, 20.46f)
                verticalLineTo(18.46f)
                curveTo(14.59f, 18.81f, 15.27f, 19.0f, 16.0f, 19.0f)
                curveTo(17.1f, 19.0f, 18.0f, 18.1f, 18.0f, 17.0f)
                verticalLineTo(13.83f)
                curveTo(19.17f, 13.42f, 20.0f, 12.31f, 20.0f, 11.0f)
                curveTo(20.0f, 9.35f, 18.67f, 8.0f, 17.0f, 8.0f)
                horizontalLineTo(17.0f)
                curveTo(15.88f, 8.0f, 14.84f, 8.37f, 14.0f, 9.0f)
                moveTo(10.0f, 9.0f)
                horizontalLineTo(10.0f)
                curveTo(9.16f, 8.37f, 8.13f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(7.0f)
                curveTo(5.33f, 8.0f, 4.0f, 9.35f, 4.0f, 11.0f)
                curveTo(4.0f, 12.31f, 4.84f, 13.42f, 6.0f, 13.83f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 18.1f, 6.9f, 19.0f, 8.0f, 19.0f)
                curveTo(8.73f, 19.0f, 9.41f, 18.81f, 10.0f, 18.46f)
                verticalLineTo(20.46f)
                curveTo(9.41f, 20.81f, 8.73f, 21.0f, 8.0f, 21.0f)
                curveTo(5.79f, 21.0f, 4.0f, 19.21f, 4.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                curveTo(2.79f, 14.09f, 2.0f, 12.64f, 2.0f, 11.0f)
                curveTo(2.0f, 8.24f, 4.24f, 6.0f, 7.0f, 6.0f)
                curveTo(8.13f, 6.0f, 9.16f, 6.37f, 10.0f, 7.0f)
                verticalLineTo(9.0f)
                moveTo(9.0f, 11.0f)
                lineTo(7.5f, 9.5f)
                lineTo(6.0f, 11.0f)
                lineTo(7.5f, 12.5f)
                lineTo(9.0f, 11.0f)
                moveTo(18.0f, 11.0f)
                lineTo(16.5f, 9.5f)
                lineTo(15.0f, 11.0f)
                lineTo(16.5f, 12.5f)
                lineTo(18.0f, 11.0f)
                close()
            }
        }
        .build()
        return _butterflyOutline!!
    }

private var _butterflyOutline: ImageVector? = null
