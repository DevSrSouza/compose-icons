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

public val MaterialDesignIcons.SignYield: ImageVector
    get() {
        if (_signYield != null) {
            return _signYield!!
        }
        _signYield = Builder(name = "SignYield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 3.0f)
                horizontalLineTo(3.5f)
                curveTo(2.4f, 3.0f, 1.6f, 4.3f, 2.2f, 5.3f)
                lineTo(10.7f, 20.2f)
                curveTo(11.0f, 20.7f, 11.5f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveTo(13.0f, 20.7f, 13.3f, 20.2f)
                lineTo(21.8f, 5.3f)
                curveTo(22.4f, 4.3f, 21.6f, 3.0f, 20.5f, 3.0f)
                moveTo(12.0f, 18.5f)
                lineTo(4.3f, 5.0f)
                horizontalLineTo(19.6f)
                lineTo(12.0f, 18.5f)
                moveTo(6.9f, 6.5f)
                horizontalLineTo(17.1f)
                lineTo(12.0f, 15.5f)
                lineTo(6.9f, 6.5f)
                close()
            }
        }
        .build()
        return _signYield!!
    }

private var _signYield: ImageVector? = null
