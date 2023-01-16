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

public val MaterialDesignIcons.CheckboxMarkedCirclePlusOutline: ImageVector
    get() {
        if (_checkboxMarkedCirclePlusOutline != null) {
            return _checkboxMarkedCirclePlusOutline!!
        }
        _checkboxMarkedCirclePlusOutline = Builder(name = "CheckboxMarkedCirclePlusOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3f, 21.7f)
                curveTo(13.6f, 21.9f, 12.8f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                curveTo(13.3f, 2.0f, 14.6f, 2.3f, 15.8f, 2.7f)
                lineTo(14.2f, 4.3f)
                curveTo(13.5f, 4.1f, 12.8f, 4.0f, 12.0f, 4.0f)
                curveTo(7.6f, 4.0f, 4.0f, 7.6f, 4.0f, 12.0f)
                reflectiveCurveTo(7.6f, 20.0f, 12.0f, 20.0f)
                curveTo(12.4f, 20.0f, 12.9f, 20.0f, 13.3f, 19.9f)
                curveTo(13.5f, 20.6f, 13.9f, 21.2f, 14.3f, 21.7f)
                moveTo(7.9f, 10.1f)
                lineTo(6.5f, 11.5f)
                lineTo(11.0f, 16.0f)
                lineTo(21.0f, 6.0f)
                lineTo(19.6f, 4.6f)
                lineTo(11.0f, 13.2f)
                lineTo(7.9f, 10.1f)
                moveTo(18.0f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _checkboxMarkedCirclePlusOutline!!
    }

private var _checkboxMarkedCirclePlusOutline: ImageVector? = null
