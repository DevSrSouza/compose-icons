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

public val MaterialDesignIcons.MapMarkerDistance: ImageVector
    get() {
        if (_mapMarkerDistance != null) {
            return _mapMarkerDistance!!
        }
        _mapMarkerDistance = Builder(name = "MapMarkerDistance", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 8.11f)
                curveTo(5.61f, 8.11f, 4.89f, 7.39f, 4.89f, 6.5f)
                arcTo(1.61f, 1.61f, 0.0f, false, true, 6.5f, 4.89f)
                curveTo(7.39f, 4.89f, 8.11f, 5.61f, 8.11f, 6.5f)
                verticalLineTo(6.5f)
                arcTo(1.61f, 1.61f, 0.0f, false, true, 6.5f, 8.11f)
                moveTo(6.5f, 2.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 6.5f)
                curveTo(2.0f, 9.87f, 6.5f, 14.86f, 6.5f, 14.86f)
                curveTo(6.5f, 14.86f, 11.0f, 9.87f, 11.0f, 6.5f)
                curveTo(11.0f, 4.0f, 9.0f, 2.0f, 6.5f, 2.0f)
                moveTo(17.5f, 8.11f)
                arcTo(1.61f, 1.61f, 0.0f, false, true, 15.89f, 6.5f)
                curveTo(15.89f, 5.61f, 16.61f, 4.89f, 17.5f, 4.89f)
                curveTo(18.39f, 4.89f, 19.11f, 5.61f, 19.11f, 6.5f)
                arcTo(1.61f, 1.61f, 0.0f, false, true, 17.5f, 8.11f)
                moveTo(17.5f, 2.0f)
                curveTo(15.0f, 2.0f, 13.0f, 4.0f, 13.0f, 6.5f)
                curveTo(13.0f, 9.87f, 17.5f, 14.86f, 17.5f, 14.86f)
                curveTo(17.5f, 14.86f, 22.0f, 9.87f, 22.0f, 6.5f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 17.5f, 2.0f)
                moveTo(17.5f, 16.0f)
                curveTo(16.23f, 16.0f, 15.1f, 16.8f, 14.68f, 18.0f)
                horizontalLineTo(9.32f)
                curveTo(8.77f, 16.44f, 7.05f, 15.62f, 5.5f, 16.17f)
                curveTo(3.93f, 16.72f, 3.11f, 18.44f, 3.66f, 20.0f)
                curveTo(4.22f, 21.56f, 5.93f, 22.38f, 7.5f, 21.83f)
                curveTo(8.35f, 21.53f, 9.0f, 20.85f, 9.32f, 20.0f)
                horizontalLineTo(14.69f)
                curveTo(15.24f, 21.56f, 16.96f, 22.38f, 18.5f, 21.83f)
                curveTo(20.08f, 21.28f, 20.9f, 19.56f, 20.35f, 18.0f)
                curveTo(19.92f, 16.8f, 18.78f, 16.0f, 17.5f, 16.0f)
                verticalLineTo(16.0f)
                moveTo(17.5f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 20.5f)
                close()
            }
        }
        .build()
        return _mapMarkerDistance!!
    }

private var _mapMarkerDistance: ImageVector? = null
