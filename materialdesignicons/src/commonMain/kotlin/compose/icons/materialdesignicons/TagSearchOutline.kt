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

public val MaterialDesignIcons.TagSearchOutline: ImageVector
    get() {
        if (_tagSearchOutline != null) {
            return _tagSearchOutline!!
        }
        _tagSearchOutline = Builder(name = "TagSearchOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                curveTo(22.0f, 13.53f, 21.79f, 14.04f, 21.41f, 14.41f)
                lineTo(21.0f, 14.83f)
                curveTo(20.91f, 11.97f, 18.84f, 9.62f, 16.11f, 9.11f)
                lineTo(11.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                lineTo(9.11f, 16.11f)
                curveTo(9.62f, 18.84f, 11.97f, 20.91f, 14.83f, 21.0f)
                lineTo(14.41f, 21.41f)
                curveTo(14.04f, 21.79f, 13.53f, 22.0f, 13.0f, 22.0f)
                curveTo(12.47f, 22.0f, 11.97f, 21.79f, 11.59f, 21.42f)
                lineTo(2.59f, 12.42f)
                curveTo(2.21f, 12.04f, 2.0f, 11.53f, 2.0f, 11.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(11.53f, 2.0f, 12.04f, 2.21f, 12.41f, 2.58f)
                lineTo(21.41f, 11.58f)
                curveTo(21.79f, 11.96f, 22.0f, 12.47f, 22.0f, 13.0f)
                moveTo(5.0f, 6.5f)
                curveTo(5.0f, 7.33f, 5.67f, 8.0f, 6.5f, 8.0f)
                reflectiveCurveTo(8.0f, 7.33f, 8.0f, 6.5f)
                reflectiveCurveTo(7.33f, 5.0f, 6.5f, 5.0f)
                reflectiveCurveTo(5.0f, 5.67f, 5.0f, 6.5f)
                moveTo(15.11f, 10.61f)
                curveTo(12.61f, 10.61f, 10.61f, 12.61f, 10.61f, 15.11f)
                reflectiveCurveTo(12.61f, 19.61f, 15.11f, 19.61f)
                curveTo(16.0f, 19.61f, 16.8f, 19.36f, 17.5f, 18.93f)
                lineTo(20.61f, 22.0f)
                lineTo(22.0f, 20.61f)
                lineTo(18.92f, 17.5f)
                curveTo(19.36f, 16.82f, 19.61f, 16.0f, 19.61f, 15.11f)
                curveTo(19.61f, 12.61f, 17.61f, 10.61f, 15.11f, 10.61f)
                moveTo(15.11f, 12.61f)
                curveTo(16.5f, 12.61f, 17.61f, 13.73f, 17.61f, 15.11f)
                reflectiveCurveTo(16.5f, 17.61f, 15.11f, 17.61f)
                reflectiveCurveTo(12.61f, 16.5f, 12.61f, 15.11f)
                reflectiveCurveTo(13.73f, 12.61f, 15.11f, 12.61f)
            }
        }
        .build()
        return _tagSearchOutline!!
    }

private var _tagSearchOutline: ImageVector? = null
