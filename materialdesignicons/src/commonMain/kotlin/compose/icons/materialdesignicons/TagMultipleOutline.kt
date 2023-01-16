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

public val MaterialDesignIcons.TagMultipleOutline: ImageVector
    get() {
        if (_tagMultipleOutline != null) {
            return _tagMultipleOutline!!
        }
        _tagMultipleOutline = Builder(name = "TagMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 10.0f)
                curveTo(7.3f, 10.0f, 8.0f, 9.3f, 8.0f, 8.5f)
                reflectiveCurveTo(7.3f, 7.0f, 6.5f, 7.0f)
                reflectiveCurveTo(5.0f, 7.7f, 5.0f, 8.5f)
                reflectiveCurveTo(5.7f, 10.0f, 6.5f, 10.0f)
                moveTo(9.0f, 6.0f)
                lineTo(16.0f, 13.0f)
                lineTo(11.0f, 18.0f)
                lineTo(4.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.6f, 2.2f, 12.1f, 2.6f, 12.4f)
                lineTo(9.6f, 19.4f)
                curveTo(9.9f, 19.8f, 10.4f, 20.0f, 11.0f, 20.0f)
                reflectiveCurveTo(12.1f, 19.8f, 12.4f, 19.4f)
                lineTo(17.4f, 14.4f)
                curveTo(17.8f, 14.0f, 18.0f, 13.5f, 18.0f, 13.0f)
                curveTo(18.0f, 12.4f, 17.8f, 11.9f, 17.4f, 11.6f)
                lineTo(10.4f, 4.6f)
                curveTo(10.1f, 4.2f, 9.6f, 4.0f, 9.0f, 4.0f)
                moveTo(13.5f, 5.7f)
                lineTo(14.5f, 4.7f)
                lineTo(21.4f, 11.6f)
                curveTo(21.8f, 12.0f, 22.0f, 12.5f, 22.0f, 13.0f)
                reflectiveCurveTo(21.8f, 14.1f, 21.4f, 14.4f)
                lineTo(16.0f, 19.8f)
                lineTo(15.0f, 18.8f)
                lineTo(20.7f, 13.0f)
                lineTo(13.5f, 5.7f)
                close()
            }
        }
        .build()
        return _tagMultipleOutline!!
    }

private var _tagMultipleOutline: ImageVector? = null
