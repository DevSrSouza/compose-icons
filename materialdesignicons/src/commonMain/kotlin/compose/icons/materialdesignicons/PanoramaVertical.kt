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

public val MaterialDesignIcons.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) {
            return _panoramaVertical!!
        }
        _panoramaVertical = Builder(name = "PanoramaVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                curveTo(18.5f, 8.1f, 19.3f, 5.1f, 19.9f, 3.3f)
                curveTo(20.1f, 2.7f, 19.7f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(5.0f)
                curveTo(4.3f, 2.0f, 3.8f, 2.7f, 4.1f, 3.3f)
                curveTo(4.7f, 5.4f, 5.5f, 8.1f, 5.5f, 12.0f)
                curveTo(5.5f, 15.9f, 4.7f, 18.7f, 4.1f, 20.7f)
                curveTo(3.8f, 21.3f, 4.3f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(19.7f, 22.0f, 20.2f, 21.3f, 20.0f, 20.7f)
                curveTo(19.3f, 18.7f, 18.5f, 15.9f, 18.5f, 12.0f)
                close()
            }
        }
        .build()
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
