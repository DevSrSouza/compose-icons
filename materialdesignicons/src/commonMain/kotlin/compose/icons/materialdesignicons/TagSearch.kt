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

public val MaterialDesignIcons.TagSearch: ImageVector
    get() {
        if (_tagSearch != null) {
            return _tagSearch!!
        }
        _tagSearch = Builder(name = "TagSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.55f, 2.22f, 12.05f, 2.59f, 12.41f)
                lineTo(11.58f, 21.41f)
                curveTo(11.95f, 21.77f, 12.45f, 22.0f, 13.0f, 22.0f)
                reflectiveCurveTo(14.05f, 21.77f, 14.41f, 21.41f)
                lineTo(14.83f, 21.0f)
                curveTo(11.6f, 20.9f, 9.0f, 18.26f, 9.0f, 15.0f)
                curveTo(9.0f, 11.69f, 11.69f, 9.0f, 15.0f, 9.0f)
                curveTo(18.26f, 9.0f, 20.9f, 11.6f, 21.0f, 14.83f)
                lineTo(21.41f, 14.41f)
                curveTo(21.78f, 14.05f, 22.0f, 13.55f, 22.0f, 13.0f)
                curveTo(22.0f, 12.44f, 21.77f, 11.94f, 21.41f, 11.58f)
                moveTo(5.5f, 7.0f)
                curveTo(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f)
                reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f)
                reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f)
                reflectiveCurveTo(6.33f, 7.0f, 5.5f, 7.0f)
                moveTo(15.11f, 10.61f)
                curveTo(17.61f, 10.61f, 19.61f, 12.61f, 19.61f, 15.11f)
                curveTo(19.61f, 16.0f, 19.36f, 16.82f, 18.92f, 17.5f)
                lineTo(22.0f, 20.61f)
                lineTo(20.61f, 22.0f)
                lineTo(17.5f, 18.93f)
                curveTo(16.8f, 19.36f, 16.0f, 19.61f, 15.11f, 19.61f)
                curveTo(12.61f, 19.61f, 10.61f, 17.61f, 10.61f, 15.11f)
                reflectiveCurveTo(12.61f, 10.61f, 15.11f, 10.61f)
                moveTo(15.11f, 12.61f)
                curveTo(13.73f, 12.61f, 12.61f, 13.73f, 12.61f, 15.11f)
                reflectiveCurveTo(13.73f, 17.61f, 15.11f, 17.61f)
                reflectiveCurveTo(17.61f, 16.5f, 17.61f, 15.11f)
                reflectiveCurveTo(16.5f, 12.61f, 15.11f, 12.61f)
            }
        }
        .build()
        return _tagSearch!!
    }

private var _tagSearch: ImageVector? = null
