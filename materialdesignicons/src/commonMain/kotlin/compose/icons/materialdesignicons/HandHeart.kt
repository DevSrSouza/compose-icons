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

public val MaterialDesignIcons.HandHeart: ImageVector
    get() {
        if (_handHeart != null) {
            return _handHeart!!
        }
        _handHeart = Builder(name = "HandHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                quadTo(20.86f, 17.0f, 21.45f, 17.6f)
                reflectiveQuadTo(22.03f, 19.0f)
                lineTo(14.0f, 22.0f)
                lineTo(7.0f, 20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.95f)
                lineTo(16.22f, 13.69f)
                quadTo(17.0f, 14.0f, 17.0f, 14.81f)
                quadTo(17.0f, 15.28f, 16.66f, 15.63f)
                reflectiveQuadTo(15.8f, 16.0f)
                horizontalLineTo(13.0f)
                lineTo(11.25f, 15.33f)
                lineTo(10.92f, 16.27f)
                lineTo(13.0f, 17.0f)
                horizontalLineTo(20.0f)
                moveTo(16.0f, 3.23f)
                quadTo(17.06f, 2.0f, 18.7f, 2.0f)
                quadTo(20.06f, 2.0f, 21.0f, 3.0f)
                reflectiveQuadTo(22.0f, 5.3f)
                quadTo(22.0f, 6.33f, 21.0f, 7.76f)
                reflectiveQuadTo(19.03f, 10.15f)
                reflectiveQuadTo(16.0f, 13.0f)
                quadTo(13.92f, 11.11f, 12.94f, 10.15f)
                reflectiveQuadTo(10.97f, 7.76f)
                reflectiveQuadTo(10.0f, 5.3f)
                quadTo(10.0f, 3.94f, 10.97f, 3.0f)
                reflectiveQuadTo(13.31f, 2.0f)
                quadTo(14.91f, 2.0f, 16.0f, 3.23f)
                moveTo(0.984f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(0.984f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
