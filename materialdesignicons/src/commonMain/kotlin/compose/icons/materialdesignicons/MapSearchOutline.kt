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

public val MaterialDesignIcons.MapSearchOutline: ImageVector
    get() {
        if (_mapSearchOutline != null) {
            return _mapSearchOutline!!
        }
        _mapSearchOutline = Builder(name = "MapSearchOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 12.0f)
                curveTo(18.0f, 12.0f, 20.0f, 14.0f, 20.0f, 16.5f)
                curveTo(20.0f, 17.38f, 19.75f, 18.2f, 19.31f, 18.9f)
                lineTo(22.39f, 22.0f)
                lineTo(21.0f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21.0f, 15.5f, 21.0f)
                curveTo(13.0f, 21.0f, 11.0f, 19.0f, 11.0f, 16.5f)
                curveTo(11.0f, 14.0f, 13.0f, 12.0f, 15.5f, 12.0f)
                moveTo(15.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 14.0f)
                moveTo(19.5f, 2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.0f, 2.5f)
                verticalLineTo(11.81f)
                curveTo(19.42f, 11.26f, 18.75f, 10.81f, 18.0f, 10.5f)
                verticalLineTo(4.7f)
                lineTo(15.0f, 5.86f)
                verticalLineTo(10.0f)
                curveTo(14.3f, 10.07f, 13.62f, 10.24f, 13.0f, 10.5f)
                verticalLineTo(5.87f)
                lineTo(9.0f, 4.47f)
                verticalLineTo(16.13f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.5f)
                curveTo(9.0f, 17.14f, 9.09f, 17.76f, 9.26f, 18.34f)
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
                moveTo(4.0f, 5.46f)
                verticalLineTo(17.31f)
                lineTo(7.0f, 16.15f)
                verticalLineTo(4.45f)
                lineTo(4.0f, 5.46f)
                close()
            }
        }
        .build()
        return _mapSearchOutline!!
    }

private var _mapSearchOutline: ImageVector? = null
