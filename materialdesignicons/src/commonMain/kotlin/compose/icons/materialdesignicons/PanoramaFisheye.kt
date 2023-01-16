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

public val MaterialDesignIcons.PanoramaFisheye: ImageVector
    get() {
        if (_panoramaFisheye != null) {
            return _panoramaFisheye!!
        }
        _panoramaFisheye = Builder(name = "PanoramaFisheye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f)
                curveTo(4.0f, 7.59f, 7.59f, 4.0f, 12.0f, 4.0f)
                curveTo(16.41f, 4.0f, 20.0f, 7.59f, 20.0f, 12.0f)
                curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f)
                curveTo(2.0f, 17.53f, 6.47f, 22.0f, 12.0f, 22.0f)
                curveTo(17.53f, 22.0f, 22.0f, 17.53f, 22.0f, 12.0f)
                curveTo(22.0f, 6.47f, 17.53f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _panoramaFisheye!!
    }

private var _panoramaFisheye: ImageVector? = null
