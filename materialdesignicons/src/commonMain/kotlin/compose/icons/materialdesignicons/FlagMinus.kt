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

public val MaterialDesignIcons.FlagMinus: ImageVector
    get() {
        if (_flagMinus != null) {
            return _flagMinus!!
        }
        _flagMinus = Builder(name = "FlagMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                lineTo(10.6f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                lineTo(12.4f, 5.0f)
                moveTo(14.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _flagMinus!!
    }

private var _flagMinus: ImageVector? = null
