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

public val MaterialDesignIcons.Excavator: ImageVector
    get() {
        if (_excavator != null) {
            return _excavator!!
        }
        _excavator = Builder(name = "Excavator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 18.5f)
                curveTo(19.04f, 18.5f, 19.5f, 18.96f, 19.5f, 19.5f)
                reflectiveCurveTo(19.04f, 20.5f, 18.5f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.96f, 20.5f, 5.5f, 20.04f, 5.5f, 19.5f)
                reflectiveCurveTo(5.96f, 18.5f, 6.5f, 18.5f)
                horizontalLineTo(18.5f)
                moveTo(18.5f, 17.0f)
                horizontalLineTo(6.5f)
                curveTo(5.13f, 17.0f, 4.0f, 18.13f, 4.0f, 19.5f)
                reflectiveCurveTo(5.13f, 22.0f, 6.5f, 22.0f)
                horizontalLineTo(18.5f)
                curveTo(19.88f, 22.0f, 21.0f, 20.88f, 21.0f, 19.5f)
                reflectiveCurveTo(19.88f, 17.0f, 18.5f, 17.0f)
                moveTo(21.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                lineTo(10.0f, 11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                lineTo(21.0f, 11.0f)
                moveTo(11.54f, 11.0f)
                lineTo(13.5f, 8.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.54f)
                moveTo(9.76f, 3.41f)
                lineTo(4.76f, 2.0f)
                lineTo(2.0f, 11.83f)
                curveTo(1.66f, 13.11f, 2.41f, 14.44f, 3.7f, 14.8f)
                lineTo(4.86f, 15.12f)
                lineTo(8.15f, 12.29f)
                lineTo(4.27f, 11.21f)
                lineTo(6.15f, 4.46f)
                lineTo(8.94f, 5.24f)
                curveTo(9.5f, 5.53f, 10.71f, 6.34f, 11.47f, 7.37f)
                lineTo(12.5f, 6.0f)
                horizontalLineTo(12.94f)
                curveTo(11.68f, 4.41f, 9.85f, 3.46f, 9.76f, 3.41f)
                close()
            }
        }
        .build()
        return _excavator!!
    }

private var _excavator: ImageVector? = null
