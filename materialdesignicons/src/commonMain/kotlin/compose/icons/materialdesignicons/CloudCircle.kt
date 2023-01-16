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

public val MaterialDesignIcons.CloudCircle: ImageVector
    get() {
        if (_cloudCircle != null) {
            return _cloudCircle!!
        }
        _cloudCircle = Builder(name = "CloudCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                close()
            }
        }
        .build()
        return _cloudCircle!!
    }

private var _cloudCircle: ImageVector? = null
