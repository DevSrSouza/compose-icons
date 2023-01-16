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

public val MaterialDesignIcons.MapClockOutline: ImageVector
    get() {
        if (_mapClockOutline != null) {
            return _mapClockOutline!!
        }
        _mapClockOutline = Builder(name = "MapClockOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                moveTo(16.0f, 9.0f)
                curveTo(16.69f, 9.0f, 17.37f, 9.1f, 18.0f, 9.29f)
                verticalLineTo(4.7f)
                lineTo(15.0f, 5.86f)
                verticalLineTo(9.07f)
                curveTo(15.33f, 9.0f, 15.66f, 9.0f, 16.0f, 9.0f)
                moveTo(23.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 23.0f)
                curveTo(13.0f, 23.0f, 10.4f, 21.08f, 9.42f, 18.4f)
                lineTo(8.0f, 17.9f)
                lineTo(2.66f, 19.97f)
                lineTo(2.5f, 20.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 19.5f)
                verticalLineTo(4.38f)
                curveTo(2.0f, 4.15f, 2.15f, 3.97f, 2.36f, 3.9f)
                lineTo(8.0f, 2.0f)
                lineTo(14.0f, 4.1f)
                lineTo(19.34f, 2.03f)
                lineTo(19.5f, 2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.0f, 2.5f)
                verticalLineTo(10.25f)
                curveTo(21.81f, 11.5f, 23.0f, 13.62f, 23.0f, 16.0f)
                moveTo(9.0f, 16.0f)
                curveTo(9.0f, 13.21f, 10.63f, 10.8f, 13.0f, 9.67f)
                verticalLineTo(5.87f)
                lineTo(9.0f, 4.47f)
                verticalLineTo(16.13f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 16.09f, 9.0f, 16.04f, 9.0f, 16.0f)
                moveTo(16.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.0f, 21.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.0f, 11.0f)
                moveTo(4.0f, 5.46f)
                verticalLineTo(17.31f)
                lineTo(7.0f, 16.15f)
                verticalLineTo(4.45f)
                lineTo(4.0f, 5.46f)
                close()
            }
        }
        .build()
        return _mapClockOutline!!
    }

private var _mapClockOutline: ImageVector? = null
