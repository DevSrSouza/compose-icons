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

public val MaterialDesignIcons.CallSplit: ImageVector
    get() {
        if (_callSplit != null) {
            return _callSplit!!
        }
        _callSplit = Builder(name = "CallSplit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                lineTo(16.29f, 6.29f)
                lineTo(13.41f, 9.17f)
                lineTo(14.83f, 10.59f)
                lineTo(17.71f, 7.71f)
                lineTo(20.0f, 10.0f)
                verticalLineTo(4.0f)
                moveTo(10.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                lineTo(6.29f, 7.71f)
                lineTo(11.0f, 12.41f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.59f)
                lineTo(7.71f, 6.29f)
            }
        }
        .build()
        return _callSplit!!
    }

private var _callSplit: ImageVector? = null
