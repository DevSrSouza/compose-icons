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

public val MaterialDesignIcons.TagTextOutline: ImageVector
    get() {
        if (_tagTextOutline != null) {
            return _tagTextOutline!!
        }
        _tagTextOutline = Builder(name = "TagTextOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4f, 11.6f)
                lineTo(12.4f, 2.6f)
                curveTo(12.0f, 2.2f, 11.5f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.5f, 2.2f, 12.0f, 2.6f, 12.4f)
                lineTo(11.6f, 21.4f)
                curveTo(12.0f, 21.8f, 12.5f, 22.0f, 13.0f, 22.0f)
                curveTo(13.5f, 22.0f, 14.0f, 21.8f, 14.4f, 21.4f)
                lineTo(21.4f, 14.4f)
                curveTo(21.8f, 14.0f, 22.0f, 13.5f, 22.0f, 13.0f)
                curveTo(22.0f, 12.5f, 21.8f, 12.0f, 21.4f, 11.6f)
                moveTo(13.0f, 20.0f)
                lineTo(4.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                lineTo(20.0f, 13.0f)
                moveTo(6.5f, 5.0f)
                curveTo(7.3f, 5.0f, 8.0f, 5.7f, 8.0f, 6.5f)
                reflectiveCurveTo(7.3f, 8.0f, 6.5f, 8.0f)
                reflectiveCurveTo(5.0f, 7.3f, 5.0f, 6.5f)
                reflectiveCurveTo(5.7f, 5.0f, 6.5f, 5.0f)
                moveTo(10.1f, 8.9f)
                lineTo(11.5f, 7.5f)
                lineTo(17.0f, 13.0f)
                lineTo(15.6f, 14.4f)
                lineTo(10.1f, 8.9f)
                moveTo(7.6f, 11.4f)
                lineTo(9.0f, 10.0f)
                lineTo(13.0f, 14.0f)
                lineTo(11.6f, 15.4f)
                lineTo(7.6f, 11.4f)
                close()
            }
        }
        .build()
        return _tagTextOutline!!
    }

private var _tagTextOutline: ImageVector? = null
