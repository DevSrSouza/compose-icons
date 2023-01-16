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

public val MaterialDesignIcons.ArrowBottomRightThin: ImageVector
    get() {
        if (_arrowBottomRightThin != null) {
            return _arrowBottomRightThin!!
        }
        _arrowBottomRightThin = Builder(name = "ArrowBottomRightThin", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.93f, 19.0f)
                lineTo(14.76f, 16.18f)
                lineTo(5.0f, 6.42f)
                lineTo(6.42f, 5.0f)
                lineTo(16.18f, 14.76f)
                lineTo(19.0f, 11.94f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _arrowBottomRightThin!!
    }

private var _arrowBottomRightThin: ImageVector? = null
