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

public val MaterialDesignIcons.ImageFilterDrama: ImageVector
    get() {
        if (_imageFilterDrama != null) {
            return _imageFilterDrama!!
        }
        _imageFilterDrama = Builder(name = "ImageFilterDrama", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 20.0f)
                horizontalLineTo(18.5f)
                quadTo(20.38f, 20.0f, 21.69f, 18.69f)
                quadTo(23.0f, 17.38f, 23.0f, 15.5f)
                quadTo(23.0f, 13.8f, 21.79f, 12.4f)
                quadTo(20.58f, 11.0f, 19.0f, 11.0f)
                quadTo(19.0f, 8.05f, 17.0f, 6.03f)
                quadTo(14.95f, 4.0f, 12.0f, 4.0f)
                quadTo(9.88f, 4.0f, 8.29f, 5.08f)
                quadTo(6.7f, 6.15f, 6.25f, 8.0f)
                quadTo(8.8f, 8.45f, 10.4f, 10.19f)
                quadTo(12.0f, 11.93f, 12.0f, 14.5f)
                horizontalLineTo(10.0f)
                quadTo(10.0f, 12.68f, 8.66f, 11.34f)
                quadTo(7.33f, 10.0f, 5.5f, 10.0f)
                reflectiveQuadTo(2.34f, 11.34f)
                quadTo(1.0f, 12.68f, 1.0f, 14.5f)
                quadTo(1.0f, 16.8f, 2.6f, 18.4f)
                reflectiveQuadTo(6.5f, 20.0f)
                close()
            }
        }
        .build()
        return _imageFilterDrama!!
    }

private var _imageFilterDrama: ImageVector? = null
