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

public val MaterialDesignIcons.CarLightFog: ImageVector
    get() {
        if (_carLightFog != null) {
            return _carLightFog!!
        }
        _carLightFog = Builder(name = "CarLightFog", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.8f)
                curveTo(9.0f, 4.8f, 9.0f, 19.2f, 13.0f, 19.2f)
                curveTo(17.0f, 19.2f, 22.0f, 16.5f, 22.0f, 12.0f)
                curveTo(22.0f, 7.5f, 17.0f, 4.8f, 13.0f, 4.8f)
                moveTo(13.1f, 17.2f)
                curveTo(12.7f, 16.8f, 12.0f, 15.0f, 12.0f, 12.0f)
                curveTo(12.0f, 9.0f, 12.7f, 7.2f, 13.1f, 6.8f)
                curveTo(16.0f, 6.9f, 20.0f, 8.7f, 20.0f, 12.0f)
                curveTo(20.0f, 15.3f, 16.0f, 17.1f, 13.1f, 17.2f)
                moveTo(6.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 11.3f, 8.0f, 11.7f, 8.0f, 12.0f)
                curveTo(8.0f, 12.3f, 8.0f, 12.7f, 8.0f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.4f)
                curveTo(8.6f, 16.7f, 8.8f, 17.4f, 9.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 6.1f, 8.9f, 6.2f, 8.9f, 6.4f)
                curveTo(8.7f, 6.9f, 8.5f, 7.4f, 8.4f, 8.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _carLightFog!!
    }

private var _carLightFog: ImageVector? = null
