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

public val MaterialDesignIcons.BellMinusOutline: ImageVector
    get() {
        if (_bellMinusOutline != null) {
            return _bellMinusOutline!!
        }
        _bellMinusOutline = Builder(name = "BellMinusOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(10.9f, 2.0f, 10.0f, 2.9f, 10.0f, 4.0f)
                verticalLineTo(4.29f)
                curveTo(7.12f, 5.14f, 5.0f, 7.82f, 5.0f, 11.0f)
                verticalLineTo(17.0f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.35f)
                curveTo(12.12f, 19.36f, 12.0f, 18.68f, 12.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 8.24f, 9.24f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(17.0f, 8.24f, 17.0f, 11.0f)
                verticalLineTo(12.09f)
                curveTo(17.33f, 12.03f, 17.67f, 12.0f, 18.0f, 12.0f)
                curveTo(18.34f, 12.0f, 18.67f, 12.03f, 19.0f, 12.09f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.82f, 16.88f, 5.14f, 14.0f, 4.29f)
                verticalLineTo(4.0f)
                curveTo(14.0f, 2.9f, 13.11f, 2.0f, 12.0f, 2.0f)
                moveTo(14.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                moveTo(10.0f, 21.0f)
                curveTo(10.0f, 22.11f, 10.9f, 23.0f, 12.0f, 23.0f)
                curveTo(12.66f, 23.0f, 13.28f, 22.67f, 13.65f, 22.13f)
                curveTo(13.33f, 21.79f, 13.05f, 21.41f, 12.81f, 21.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _bellMinusOutline!!
    }

private var _bellMinusOutline: ImageVector? = null
