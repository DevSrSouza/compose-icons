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

public val MaterialDesignIcons.SeedPlusOutline: ImageVector
    get() {
        if (_seedPlusOutline != null) {
            return _seedPlusOutline!!
        }
        _seedPlusOutline = Builder(name = "SeedPlusOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 5.0f)
                curveTo(17.8f, 5.0f, 18.4f, 5.0f, 18.9f, 5.1f)
                curveTo(19.04f, 6.7f, 19.08f, 9.42f, 18.18f, 12.0f)
                curveTo(18.89f, 12.0f, 19.56f, 12.17f, 20.18f, 12.41f)
                curveTo(21.64f, 7.9f, 20.7f, 3.3f, 20.7f, 3.3f)
                reflectiveCurveTo(19.3f, 3.0f, 17.2f, 3.0f)
                curveTo(11.7f, 3.0f, 1.6f, 5.1f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21.0f, 6.4f, 21.0f)
                curveTo(8.75f, 21.0f, 10.74f, 20.69f, 12.4f, 20.16f)
                curveTo(12.16f, 19.54f, 12.0f, 18.87f, 12.0f, 18.17f)
                curveTo(10.41f, 18.72f, 8.53f, 19.0f, 6.4f, 19.0f)
                horizontalLineTo(5.1f)
                curveTo(4.9f, 14.4f, 5.8f, 10.8f, 7.9f, 8.5f)
                curveTo(10.4f, 5.6f, 14.4f, 5.0f, 17.2f, 5.0f)
                moveTo(17.0f, 7.0f)
                curveTo(7.0f, 7.0f, 7.0f, 17.0f, 7.0f, 17.0f)
                curveTo(11.0f, 9.0f, 17.0f, 7.0f, 17.0f, 7.0f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _seedPlusOutline!!
    }

private var _seedPlusOutline: ImageVector? = null
