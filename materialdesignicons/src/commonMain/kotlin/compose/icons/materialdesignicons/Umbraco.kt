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

public val MaterialDesignIcons.Umbraco: ImageVector
    get() {
        if (_umbraco != null) {
            return _umbraco!!
        }
        _umbraco = Builder(name = "Umbraco", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6f, 8.6f)
                lineTo(7.17f, 8.38f)
                curveTo(6.5f, 11.67f, 6.46f, 14.24f, 7.61f, 15.5f)
                curveTo(8.6f, 16.61f, 11.89f, 16.61f, 11.89f, 16.61f)
                curveTo(11.89f, 16.61f, 15.29f, 16.61f, 16.28f, 15.5f)
                curveTo(17.43f, 14.24f, 17.38f, 11.67f, 16.72f, 8.38f)
                lineTo(15.29f, 8.6f)
                curveTo(15.29f, 8.6f, 16.54f, 13.88f, 14.69f, 14.69f)
                curveTo(13.81f, 15.07f, 11.89f, 15.07f, 11.89f, 15.07f)
                curveTo(11.89f, 15.07f, 10.08f, 15.07f, 9.2f, 14.69f)
                curveTo(7.35f, 13.88f, 8.6f, 8.6f, 8.6f, 8.6f)
                moveTo(12.0f, 3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 21.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _umbraco!!
    }

private var _umbraco: ImageVector? = null
