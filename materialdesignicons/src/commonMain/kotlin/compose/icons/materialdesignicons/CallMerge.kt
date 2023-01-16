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

public val MaterialDesignIcons.CallMerge: ImageVector
    get() {
        if (_callMerge != null) {
            return _callMerge!!
        }
        _callMerge = Builder(name = "CallMerge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.41f)
                lineTo(18.41f, 19.0f)
                lineTo(15.0f, 15.59f)
                lineTo(13.59f, 17.0f)
                moveTo(7.5f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.59f)
                lineTo(5.59f, 19.0f)
                lineTo(7.0f, 20.41f)
                lineTo(13.0f, 14.41f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.5f)
                lineTo(12.0f, 3.5f)
            }
        }
        .build()
        return _callMerge!!
    }

private var _callMerge: ImageVector? = null