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

public val MaterialDesignIcons.ImageFilterDramaOutline: ImageVector
    get() {
        if (_imageFilterDramaOutline != null) {
            return _imageFilterDramaOutline!!
        }
        _imageFilterDramaOutline = Builder(name = "ImageFilterDramaOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 20.0f)
                quadTo(4.2f, 20.0f, 2.6f, 18.4f)
                reflectiveQuadTo(1.0f, 14.5f)
                quadTo(1.0f, 12.55f, 2.21f, 11.06f)
                quadTo(3.43f, 9.57f, 5.25f, 9.15f)
                quadTo(5.88f, 6.9f, 7.73f, 5.45f)
                quadTo(9.57f, 4.0f, 12.0f, 4.0f)
                quadTo(15.0f, 4.0f, 17.0f, 6.06f)
                quadTo(19.0f, 8.13f, 19.0f, 11.0f)
                quadTo(20.88f, 11.2f, 21.94f, 12.55f)
                quadTo(23.0f, 13.9f, 23.0f, 15.5f)
                quadTo(23.0f, 17.35f, 21.69f, 18.68f)
                quadTo(20.38f, 20.0f, 18.5f, 20.0f)
                moveTo(6.5f, 18.0f)
                horizontalLineTo(18.5f)
                quadTo(19.55f, 18.0f, 20.27f, 17.27f)
                quadTo(21.0f, 16.55f, 21.0f, 15.5f)
                quadTo(21.0f, 14.45f, 20.27f, 13.73f)
                quadTo(19.55f, 13.0f, 18.5f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                quadTo(17.0f, 8.93f, 15.54f, 7.46f)
                quadTo(14.08f, 6.0f, 12.0f, 6.0f)
                quadTo(10.43f, 6.0f, 9.2f, 6.86f)
                quadTo(8.0f, 7.73f, 7.4f, 9.07f)
                quadTo(9.35f, 9.4f, 10.68f, 10.91f)
                quadTo(12.0f, 12.43f, 12.0f, 14.5f)
                horizontalLineTo(10.0f)
                quadTo(10.0f, 13.05f, 9.0f, 12.03f)
                quadTo(7.95f, 11.0f, 6.5f, 11.0f)
                quadTo(5.05f, 11.0f, 4.03f, 12.03f)
                quadTo(3.0f, 13.05f, 3.0f, 14.5f)
                quadTo(3.0f, 15.95f, 4.03f, 17.0f)
                quadTo(5.05f, 18.0f, 6.5f, 18.0f)
                close()
            }
        }
        .build()
        return _imageFilterDramaOutline!!
    }

private var _imageFilterDramaOutline: ImageVector? = null
