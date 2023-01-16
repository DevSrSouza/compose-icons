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

public val MaterialDesignIcons.DivingScubaFlag: ImageVector
    get() {
        if (_divingScubaFlag != null) {
            return _divingScubaFlag!!
        }
        _divingScubaFlag = Builder(name = "DivingScubaFlag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineTo(19.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                moveTo(5.0f, 4.0f)
                lineTo(22.0f, 18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _divingScubaFlag!!
    }

private var _divingScubaFlag: ImageVector? = null
