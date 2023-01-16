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

public val MaterialDesignIcons.LightbulbAutoOutline: ImageVector
    get() {
        if (_lightbulbAutoOutline != null) {
            return _lightbulbAutoOutline!!
        }
        _lightbulbAutoOutline = Builder(name = "LightbulbAutoOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(12.87f, 2.0f, 16.0f, 5.13f, 16.0f, 9.0f)
                curveTo(16.0f, 11.38f, 14.81f, 13.47f, 13.0f, 14.74f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 17.55f, 12.55f, 18.0f, 12.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(5.45f, 18.0f, 5.0f, 17.55f, 5.0f, 17.0f)
                verticalLineTo(14.74f)
                curveTo(3.19f, 13.47f, 2.0f, 11.38f, 2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.13f, 2.0f, 9.0f, 2.0f)
                moveTo(6.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                curveTo(12.0f, 21.55f, 11.55f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.45f, 22.0f, 6.0f, 21.55f, 6.0f, 21.0f)
                moveTo(9.0f, 4.0f)
                curveTo(6.24f, 4.0f, 4.0f, 6.24f, 4.0f, 9.0f)
                curveTo(4.0f, 11.05f, 5.23f, 12.81f, 7.0f, 13.58f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.58f)
                curveTo(12.77f, 12.81f, 14.0f, 11.05f, 14.0f, 9.0f)
                curveTo(14.0f, 6.24f, 11.76f, 4.0f, 9.0f, 4.0f)
                moveTo(19.0f, 13.0f)
                horizontalLineTo(17.0f)
                lineTo(13.8f, 22.0f)
                horizontalLineTo(15.7f)
                lineTo(16.4f, 20.0f)
                horizontalLineTo(19.6f)
                lineTo(20.3f, 22.0f)
                horizontalLineTo(22.2f)
                lineTo(19.0f, 13.0f)
                moveTo(16.85f, 18.65f)
                lineTo(18.0f, 15.0f)
                lineTo(19.15f, 18.65f)
                horizontalLineTo(16.85f)
                close()
            }
        }
        .build()
        return _lightbulbAutoOutline!!
    }

private var _lightbulbAutoOutline: ImageVector? = null
