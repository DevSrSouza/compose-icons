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

public val MaterialDesignIcons.ArrowBottomLeftThin: ImageVector
    get() {
        if (_arrowBottomLeftThin != null) {
            return _arrowBottomLeftThin!!
        }
        _arrowBottomLeftThin = Builder(name = "ArrowBottomLeftThin", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.07f, 19.0f)
                lineTo(9.24f, 16.18f)
                lineTo(19.0f, 6.42f)
                lineTo(17.58f, 5.0f)
                lineTo(7.82f, 14.76f)
                lineTo(5.0f, 11.94f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _arrowBottomLeftThin!!
    }

private var _arrowBottomLeftThin: ImageVector? = null
