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

public val MaterialDesignIcons.PanoramaVariantOutline: ImageVector
    get() {
        if (_panoramaVariantOutline != null) {
            return _panoramaVariantOutline!!
        }
        _panoramaVariantOutline = Builder(name = "PanoramaVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(20.4f, 4.0f, 17.4f, 5.5f, 12.0f, 5.5f)
                curveTo(6.7f, 5.5f, 3.5f, 4.0f, 3.0f, 4.0f)
                curveTo(2.5f, 4.0f, 2.0f, 4.4f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.6f, 2.5f, 20.0f, 3.0f, 20.0f)
                curveTo(3.6f, 20.0f, 6.5f, 18.5f, 12.0f, 18.5f)
                curveTo(17.4f, 18.5f, 20.4f, 20.0f, 21.0f, 20.0f)
                curveTo(21.5f, 20.0f, 22.0f, 19.6f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 4.4f, 21.5f, 4.0f, 21.0f, 4.0f)
                moveTo(20.0f, 17.6f)
                curveTo(18.0f, 17.0f, 15.4f, 16.5f, 12.0f, 16.5f)
                curveTo(8.6f, 16.5f, 6.0f, 17.0f, 4.0f, 17.6f)
                verticalLineTo(6.4f)
                curveTo(6.6f, 7.1f, 9.3f, 7.5f, 12.0f, 7.5f)
                curveTo(15.4f, 7.5f, 18.0f, 7.0f, 20.0f, 6.4f)
                verticalLineTo(17.6f)
                moveTo(9.2f, 11.0f)
                lineTo(5.5f, 15.4f)
                curveTo(7.5f, 15.1f, 9.7f, 15.0f, 12.0f, 15.0f)
                curveTo(14.3f, 15.0f, 16.5f, 15.1f, 18.5f, 15.4f)
                lineTo(14.0f, 10.0f)
                lineTo(11.2f, 13.4f)
                lineTo(9.2f, 11.0f)
                close()
            }
        }
        .build()
        return _panoramaVariantOutline!!
    }

private var _panoramaVariantOutline: ImageVector? = null
