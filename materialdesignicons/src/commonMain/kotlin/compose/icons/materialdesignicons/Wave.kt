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

public val MaterialDesignIcons.Wave: ImageVector
    get() {
        if (_wave != null) {
            return _wave!!
        }
        _wave = Builder(name = "Wave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(18.61f, 12.0f, 17.22f, 11.53f, 16.0f, 10.67f)
                curveTo(13.56f, 12.38f, 10.44f, 12.38f, 8.0f, 10.67f)
                curveTo(6.78f, 11.53f, 5.39f, 12.0f, 4.0f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                curveTo(5.37f, 14.0f, 6.74f, 13.65f, 8.0f, 13.0f)
                curveTo(10.5f, 14.3f, 13.5f, 14.3f, 16.0f, 13.0f)
                curveTo(17.26f, 13.65f, 18.62f, 14.0f, 20.0f, 14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
            }
        }
        .build()
        return _wave!!
    }

private var _wave: ImageVector? = null
