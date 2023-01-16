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

public val MaterialDesignIcons.StarCheck: ImageVector
    get() {
        if (_starCheck != null) {
            return _starCheck!!
        }
        _starCheck = Builder(name = "StarCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8f, 21.0f)
                lineTo(7.4f, 14.0f)
                lineTo(2.0f, 9.2f)
                lineTo(9.2f, 8.6f)
                lineTo(12.0f, 2.0f)
                lineTo(14.8f, 8.6f)
                lineTo(22.0f, 9.2f)
                lineTo(18.8f, 12.0f)
                horizontalLineTo(18.0f)
                curveTo(14.9f, 12.0f, 12.4f, 14.3f, 12.0f, 17.3f)
                lineTo(5.8f, 21.0f)
                moveTo(17.8f, 21.2f)
                lineTo(22.6f, 16.4f)
                lineTo(21.3f, 15.0f)
                lineTo(17.7f, 18.6f)
                lineTo(16.2f, 17.0f)
                lineTo(15.0f, 18.2f)
                lineTo(17.8f, 21.2f)
            }
        }
        .build()
        return _starCheck!!
    }

private var _starCheck: ImageVector? = null
