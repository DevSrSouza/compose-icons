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

public val MaterialDesignIcons.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) {
            return _panoramaHorizontal!!
        }
        _panoramaHorizontal = Builder(name = "PanoramaHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                curveTo(8.1f, 5.5f, 5.1f, 4.7f, 3.3f, 4.1f)
                curveTo(2.7f, 3.8f, 2.0f, 4.3f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.7f, 2.7f, 20.2f, 3.3f, 20.0f)
                curveTo(5.4f, 19.3f, 8.1f, 18.5f, 12.0f, 18.5f)
                curveTo(15.9f, 18.5f, 18.7f, 19.3f, 20.7f, 20.0f)
                curveTo(21.4f, 20.2f, 22.0f, 19.7f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 4.3f, 21.3f, 3.8f, 20.7f, 4.1f)
                curveTo(18.7f, 4.7f, 15.9f, 5.5f, 12.0f, 5.5f)
                close()
            }
        }
        .build()
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
