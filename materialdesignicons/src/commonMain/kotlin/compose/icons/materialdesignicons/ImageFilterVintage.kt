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

public val MaterialDesignIcons.ImageFilterVintage: ImageVector
    get() {
        if (_imageFilterVintage != null) {
            return _imageFilterVintage!!
        }
        _imageFilterVintage = Builder(name = "ImageFilterVintage", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                moveTo(18.7f, 12.4f)
                curveTo(18.42f, 12.24f, 18.13f, 12.11f, 17.84f, 12.0f)
                curveTo(18.13f, 11.89f, 18.42f, 11.76f, 18.7f, 11.6f)
                curveTo(20.62f, 10.5f, 21.69f, 8.5f, 21.7f, 6.41f)
                curveTo(19.91f, 5.38f, 17.63f, 5.3f, 15.7f, 6.41f)
                curveTo(15.42f, 6.57f, 15.16f, 6.76f, 14.92f, 6.95f)
                curveTo(14.97f, 6.64f, 15.0f, 6.32f, 15.0f, 6.0f)
                curveTo(15.0f, 3.78f, 13.79f, 1.85f, 12.0f, 0.81f)
                curveTo(10.21f, 1.85f, 9.0f, 3.78f, 9.0f, 6.0f)
                curveTo(9.0f, 6.32f, 9.03f, 6.64f, 9.08f, 6.95f)
                curveTo(8.84f, 6.75f, 8.58f, 6.56f, 8.3f, 6.4f)
                curveTo(6.38f, 5.29f, 4.1f, 5.37f, 2.3f, 6.4f)
                curveTo(2.3f, 8.47f, 3.37f, 10.5f, 5.3f, 11.59f)
                curveTo(5.58f, 11.75f, 5.87f, 11.88f, 6.16f, 12.0f)
                curveTo(5.87f, 12.1f, 5.58f, 12.23f, 5.3f, 12.39f)
                curveTo(3.38f, 13.5f, 2.31f, 15.5f, 2.3f, 17.58f)
                curveTo(4.09f, 18.61f, 6.37f, 18.69f, 8.3f, 17.58f)
                curveTo(8.58f, 17.42f, 8.84f, 17.23f, 9.08f, 17.04f)
                curveTo(9.03f, 17.36f, 9.0f, 17.68f, 9.0f, 18.0f)
                curveTo(9.0f, 20.22f, 10.21f, 22.15f, 12.0f, 23.19f)
                curveTo(13.79f, 22.15f, 15.0f, 20.22f, 15.0f, 18.0f)
                curveTo(15.0f, 17.68f, 14.97f, 17.36f, 14.92f, 17.05f)
                curveTo(15.16f, 17.25f, 15.42f, 17.43f, 15.7f, 17.59f)
                curveTo(17.62f, 18.7f, 19.9f, 18.62f, 21.7f, 17.59f)
                curveTo(21.69f, 15.5f, 20.62f, 13.5f, 18.7f, 12.4f)
                close()
            }
        }
        .build()
        return _imageFilterVintage!!
    }

private var _imageFilterVintage: ImageVector? = null
