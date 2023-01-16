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

public val MaterialDesignIcons.Gymnastics: ImageVector
    get() {
        if (_gymnastics != null) {
            return _gymnastics!!
        }
        _gymnastics = Builder(name = "Gymnastics", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(4.0f, 4.9f, 4.9f, 4.0f, 6.0f, 4.0f)
                reflectiveCurveTo(8.0f, 4.9f, 8.0f, 6.0f)
                reflectiveCurveTo(7.1f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveTo(4.0f, 7.1f, 4.0f, 6.0f)
                moveTo(1.0f, 9.0f)
                horizontalLineTo(7.0f)
                lineTo(14.0f, 4.0f)
                lineTo(15.31f, 5.5f)
                lineTo(11.14f, 8.5f)
                horizontalLineTo(14.0f)
                lineTo(21.8f, 4.0f)
                lineTo(23.0f, 5.4f)
                lineTo(14.5f, 12.0f)
                lineTo(14.0f, 22.0f)
                horizontalLineTo(12.0f)
                lineTo(11.5f, 12.0f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _gymnastics!!
    }

private var _gymnastics: ImageVector? = null
