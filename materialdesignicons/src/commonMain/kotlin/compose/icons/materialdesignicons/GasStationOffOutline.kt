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

public val MaterialDesignIcons.GasStationOffOutline: ImageVector
    get() {
        if (_gasStationOffOutline != null) {
            return _gasStationOffOutline!!
        }
        _gasStationOffOutline = Builder(name = "GasStationOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(6.0f, 6.72f)
                lineTo(21.0f, 21.72f)
                lineTo(19.73f, 23.0f)
                lineTo(17.72f, 21.0f)
                curveTo(16.56f, 20.85f, 15.65f, 19.94f, 15.5f, 18.78f)
                lineTo(14.0f, 17.27f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.27f)
                lineTo(1.0f, 4.27f)
                moveTo(19.77f, 7.23f)
                curveTo(20.22f, 7.68f, 20.5f, 8.31f, 20.5f, 9.0f)
                lineTo(20.5f, 18.67f)
                lineTo(19.0f, 17.18f)
                verticalLineTo(11.29f)
                curveTo(18.69f, 11.42f, 18.36f, 11.5f, 18.0f, 11.5f)
                curveTo(16.62f, 11.5f, 15.5f, 10.38f, 15.5f, 9.0f)
                curveTo(15.5f, 7.93f, 16.17f, 7.03f, 17.11f, 6.67f)
                lineTo(15.0f, 4.56f)
                lineTo(16.06f, 3.5f)
                lineTo(19.78f, 7.22f)
                lineTo(19.77f, 7.23f)
                moveTo(11.82f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.82f)
                lineTo(5.06f, 3.24f)
                curveTo(5.34f, 3.09f, 5.66f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(12.0f)
                curveTo(13.1f, 3.0f, 14.0f, 3.9f, 14.0f, 5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1f, 12.0f, 17.0f, 12.9f, 17.0f, 14.0f)
                verticalLineTo(15.18f)
                lineTo(11.82f, 10.0f)
                moveTo(6.0f, 10.0f)
                horizontalLineTo(6.73f)
                lineTo(6.0f, 9.27f)
                verticalLineTo(10.0f)
                moveTo(6.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.27f)
                lineTo(8.73f, 12.0f)
                horizontalLineTo(6.0f)
                moveTo(18.0f, 10.0f)
                curveTo(18.55f, 10.0f, 19.0f, 9.55f, 19.0f, 9.0f)
                curveTo(19.0f, 8.45f, 18.55f, 8.0f, 18.0f, 8.0f)
                curveTo(17.45f, 8.0f, 17.0f, 8.45f, 17.0f, 9.0f)
                curveTo(17.0f, 9.55f, 17.45f, 10.0f, 18.0f, 10.0f)
                close()
            }
        }
        .build()
        return _gasStationOffOutline!!
    }

private var _gasStationOffOutline: ImageVector? = null
