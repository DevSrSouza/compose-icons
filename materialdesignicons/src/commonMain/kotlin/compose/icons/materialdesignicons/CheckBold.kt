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

public val MaterialDesignIcons.CheckBold: ImageVector
    get() {
        if (_checkBold != null) {
            return _checkBold!!
        }
        _checkBold = Builder(name = "CheckBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.42f)
                lineTo(2.79f, 14.21f)
                lineTo(5.62f, 11.38f)
                lineTo(9.0f, 14.77f)
                lineTo(18.88f, 4.88f)
                lineTo(21.71f, 7.71f)
                lineTo(9.0f, 20.42f)
                close()
            }
        }
        .build()
        return _checkBold!!
    }

private var _checkBold: ImageVector? = null
