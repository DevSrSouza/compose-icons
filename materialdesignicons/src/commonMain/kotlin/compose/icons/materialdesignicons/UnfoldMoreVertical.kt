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

public val MaterialDesignIcons.UnfoldMoreVertical: ImageVector
    get() {
        if (_unfoldMoreVertical != null) {
            return _unfoldMoreVertical!!
        }
        _unfoldMoreVertical = Builder(name = "UnfoldMoreVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.17f, 12.0f)
                lineTo(15.0f, 8.83f)
                lineTo(16.41f, 7.41f)
                lineTo(21.0f, 12.0f)
                lineTo(16.41f, 16.58f)
                lineTo(15.0f, 15.17f)
                lineTo(18.17f, 12.0f)
                moveTo(5.83f, 12.0f)
                lineTo(9.0f, 15.17f)
                lineTo(7.59f, 16.59f)
                lineTo(3.0f, 12.0f)
                lineTo(7.59f, 7.42f)
                lineTo(9.0f, 8.83f)
                lineTo(5.83f, 12.0f)
                close()
            }
        }
        .build()
        return _unfoldMoreVertical!!
    }

private var _unfoldMoreVertical: ImageVector? = null
