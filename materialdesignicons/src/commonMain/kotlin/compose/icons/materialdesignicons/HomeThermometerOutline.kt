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

public val MaterialDesignIcons.HomeThermometerOutline: ImageVector
    get() {
        if (_homeThermometerOutline != null) {
            return _homeThermometerOutline!!
        }
        _homeThermometerOutline = Builder(name = "HomeThermometerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                curveTo(20.11f, 8.0f, 21.0f, 8.9f, 21.0f, 10.0f)
                verticalLineTo(16.76f)
                curveTo(21.61f, 17.31f, 22.0f, 18.11f, 22.0f, 19.0f)
                curveTo(22.0f, 20.66f, 20.66f, 22.0f, 19.0f, 22.0f)
                curveTo(17.34f, 22.0f, 16.0f, 20.66f, 16.0f, 19.0f)
                curveTo(16.0f, 18.11f, 16.39f, 17.31f, 17.0f, 16.76f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 8.9f, 17.9f, 8.0f, 19.0f, 8.0f)
                moveTo(19.0f, 9.0f)
                curveTo(18.45f, 9.0f, 18.0f, 9.45f, 18.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 9.45f, 19.55f, 9.0f, 19.0f, 9.0f)
                moveTo(12.0f, 5.69f)
                lineTo(7.0f, 10.19f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.1f)
                lineTo(14.0f, 19.0f)
                lineTo(14.1f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 3.0f)
                lineTo(16.4f, 6.96f)
                curveTo(15.89f, 7.4f, 15.5f, 7.97f, 15.25f, 8.61f)
                lineTo(12.0f, 5.69f)
                close()
            }
        }
        .build()
        return _homeThermometerOutline!!
    }

private var _homeThermometerOutline: ImageVector? = null
