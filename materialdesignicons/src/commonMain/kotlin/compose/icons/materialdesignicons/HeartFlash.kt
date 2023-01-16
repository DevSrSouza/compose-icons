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

public val MaterialDesignIcons.HeartFlash: ImageVector
    get() {
        if (_heartFlash != null) {
            return _heartFlash!!
        }
        _heartFlash = Builder(name = "HeartFlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 2.83f)
                curveTo(14.76f, 2.83f, 13.09f, 3.64f, 12.0f, 4.9f)
                curveTo(10.91f, 3.64f, 9.24f, 2.83f, 7.5f, 2.83f)
                curveTo(4.42f, 2.83f, 2.0f, 5.24f, 2.0f, 8.33f)
                curveTo(2.0f, 12.1f, 5.4f, 15.19f, 10.55f, 19.86f)
                lineTo(12.0f, 21.17f)
                lineTo(13.45f, 19.86f)
                curveTo(18.6f, 15.19f, 22.0f, 12.1f, 22.0f, 8.33f)
                curveTo(22.0f, 5.24f, 19.58f, 2.83f, 16.5f, 2.83f)
                moveTo(12.0f, 17.83f)
                verticalLineTo(13.83f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 6.83f)
                verticalLineTo(10.83f)
                horizontalLineTo(15.0f)
            }
        }
        .build()
        return _heartFlash!!
    }

private var _heartFlash: ImageVector? = null
