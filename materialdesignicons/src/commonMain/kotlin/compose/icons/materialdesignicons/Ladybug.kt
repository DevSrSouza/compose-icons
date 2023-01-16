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

public val MaterialDesignIcons.Ladybug: ImageVector
    get() {
        if (_ladybug != null) {
            return _ladybug!!
        }
        _ladybug = Builder(name = "Ladybug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(12.74f, 5.0f, 13.47f, 5.1f, 14.15f, 5.29f)
                lineTo(15.78f, 2.46f)
                curveTo(16.06f, 2.0f, 16.67f, 1.82f, 17.15f, 2.1f)
                curveTo(17.63f, 2.37f, 17.79f, 3.0f, 17.5f, 3.46f)
                lineTo(16.0f, 6.07f)
                curveTo(17.22f, 6.78f, 18.23f, 7.79f, 18.93f, 9.0f)
                horizontalLineTo(5.07f)
                curveTo(5.77f, 7.79f, 6.78f, 6.78f, 8.0f, 6.07f)
                lineTo(6.5f, 3.46f)
                curveTo(6.21f, 3.0f, 6.37f, 2.37f, 6.85f, 2.1f)
                curveTo(7.33f, 1.82f, 7.94f, 2.0f, 8.22f, 2.46f)
                lineTo(9.85f, 5.29f)
                curveTo(10.53f, 5.1f, 11.26f, 5.0f, 12.0f, 5.0f)
                moveTo(20.0f, 13.0f)
                curveTo(20.0f, 17.17f, 16.82f, 20.59f, 12.75f, 20.97f)
                verticalLineTo(10.5f)
                horizontalLineTo(19.6f)
                curveTo(19.86f, 11.29f, 20.0f, 12.13f, 20.0f, 13.0f)
                moveTo(4.0f, 13.0f)
                curveTo(4.0f, 12.13f, 4.14f, 11.29f, 4.4f, 10.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.97f)
                curveTo(7.18f, 20.59f, 4.0f, 17.17f, 4.0f, 13.0f)
                close()
            }
        }
        .build()
        return _ladybug!!
    }

private var _ladybug: ImageVector? = null
