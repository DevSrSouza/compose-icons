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

public val MaterialDesignIcons.PanoramaOutline: ImageVector
    get() {
        if (_panoramaOutline != null) {
            return _panoramaOutline!!
        }
        _panoramaOutline = Builder(name = "PanoramaOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.1f, 1.9f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 20.0f, 23.0f, 19.1f, 23.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(23.0f, 4.9f, 22.1f, 4.0f, 21.0f, 4.0f)
                moveTo(21.0f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                moveTo(14.5f, 11.0f)
                lineTo(11.0f, 15.5f)
                lineTo(8.5f, 12.5f)
                lineTo(5.0f, 17.0f)
                horizontalLineTo(19.0f)
                lineTo(14.5f, 11.0f)
                close()
            }
        }
        .build()
        return _panoramaOutline!!
    }

private var _panoramaOutline: ImageVector? = null
