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

public val MaterialDesignIcons.NetworkStrengthOutline: ImageVector
    get() {
        if (_networkStrengthOutline != null) {
            return _networkStrengthOutline!!
        }
        _networkStrengthOutline = Builder(name = "NetworkStrengthOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(1.0f)
                moveTo(19.0f, 5.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
            }
        }
        .build()
        return _networkStrengthOutline!!
    }

private var _networkStrengthOutline: ImageVector? = null
