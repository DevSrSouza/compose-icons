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

public val MaterialDesignIcons.PanoramaWideAngle: ImageVector
    get() {
        if (_panoramaWideAngle != null) {
            return _panoramaWideAngle!!
        }
        _panoramaWideAngle = Builder(name = "PanoramaWideAngle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(8.0f, 4.0f, 5.2f, 4.6f, 3.0f, 5.0f)
                curveTo(2.5f, 7.0f, 2.0f, 8.9f, 2.0f, 12.0f)
                curveTo(2.0f, 15.0f, 2.5f, 17.0f, 3.0f, 19.0f)
                curveTo(5.2f, 19.4f, 8.0f, 20.0f, 12.0f, 20.0f)
                curveTo(16.0f, 20.0f, 18.9f, 19.4f, 21.0f, 19.0f)
                curveTo(21.6f, 17.0f, 22.0f, 15.0f, 22.0f, 12.0f)
                curveTo(22.0f, 9.0f, 21.5f, 6.9f, 21.0f, 5.0f)
                curveTo(18.9f, 4.6f, 16.0f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _panoramaWideAngle!!
    }

private var _panoramaWideAngle: ImageVector? = null
