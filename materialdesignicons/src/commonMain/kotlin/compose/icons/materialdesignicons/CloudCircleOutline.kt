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

public val MaterialDesignIcons.CloudCircleOutline: ImageVector
    get() {
        if (_cloudCircleOutline != null) {
            return _cloudCircleOutline!!
        }
        _cloudCircleOutline = Builder(name = "CloudCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 16.0f)
                horizontalLineTo(16.0f)
                quadTo(17.25f, 16.0f, 18.13f, 15.13f)
                reflectiveQuadTo(19.0f, 13.0f)
                quadTo(19.0f, 11.75f, 18.13f, 10.88f)
                reflectiveQuadTo(16.0f, 10.0f)
                quadTo(15.8f, 8.55f, 14.68f, 7.53f)
                quadTo(13.55f, 6.5f, 12.15f, 6.5f)
                quadTo(10.88f, 6.5f, 9.84f, 7.15f)
                quadTo(8.8f, 7.8f, 8.3f, 9.0f)
                quadTo(6.88f, 9.13f, 5.94f, 10.09f)
                quadTo(5.0f, 11.05f, 5.0f, 12.5f)
                quadTo(5.0f, 13.95f, 6.03f, 15.0f)
                quadTo(7.05f, 16.0f, 8.5f, 16.0f)
                moveTo(12.0f, 22.0f)
                quadTo(9.93f, 22.0f, 8.1f, 21.21f)
                quadTo(6.28f, 20.43f, 4.93f, 19.08f)
                quadTo(3.58f, 17.73f, 2.79f, 15.9f)
                quadTo(2.0f, 14.08f, 2.0f, 12.0f)
                reflectiveQuadTo(2.79f, 8.1f)
                quadTo(3.58f, 6.28f, 4.93f, 4.93f)
                quadTo(6.28f, 3.58f, 8.1f, 2.79f)
                quadTo(9.93f, 2.0f, 12.0f, 2.0f)
                reflectiveQuadTo(15.9f, 2.79f)
                quadTo(17.73f, 3.58f, 19.08f, 4.93f)
                quadTo(20.43f, 6.28f, 21.21f, 8.1f)
                quadTo(22.0f, 9.93f, 22.0f, 12.0f)
                reflectiveQuadTo(21.21f, 15.9f)
                quadTo(20.43f, 17.73f, 19.08f, 19.08f)
                quadTo(17.73f, 20.43f, 15.9f, 21.21f)
                quadTo(14.08f, 22.0f, 12.0f, 22.0f)
                moveTo(12.0f, 20.0f)
                quadTo(15.33f, 20.0f, 17.66f, 17.66f)
                quadTo(20.0f, 15.33f, 20.0f, 12.0f)
                reflectiveQuadTo(17.66f, 6.34f)
                quadTo(15.33f, 4.0f, 12.0f, 4.0f)
                reflectiveQuadTo(6.34f, 6.34f)
                quadTo(4.0f, 8.68f, 4.0f, 12.0f)
                reflectiveQuadTo(6.34f, 17.66f)
                quadTo(8.68f, 20.0f, 12.0f, 20.0f)
                moveTo(8.5f, 14.0f)
                quadTo(7.88f, 14.0f, 7.44f, 13.56f)
                quadTo(7.0f, 13.13f, 7.0f, 12.5f)
                reflectiveQuadTo(7.44f, 11.44f)
                quadTo(7.88f, 11.0f, 8.5f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.5f)
                quadTo(10.0f, 9.68f, 10.59f, 9.09f)
                quadTo(11.18f, 8.5f, 12.0f, 8.5f)
                reflectiveQuadTo(13.41f, 9.09f)
                quadTo(14.0f, 9.68f, 14.0f, 10.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                quadTo(16.43f, 12.0f, 16.71f, 12.29f)
                quadTo(17.0f, 12.58f, 17.0f, 13.0f)
                reflectiveQuadTo(16.71f, 13.71f)
                quadTo(16.43f, 14.0f, 16.0f, 14.0f)
                moveTo(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cloudCircleOutline!!
    }

private var _cloudCircleOutline: ImageVector? = null
