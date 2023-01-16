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

public val MaterialDesignIcons.NetworkStrength3: ImageVector
    get() {
        if (_networkStrength3 != null) {
            return _networkStrength3!!
        }
        _networkStrength3 = Builder(name = "NetworkStrength3", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(1.0f)
                moveTo(19.0f, 5.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.83f)
            }
        }
        .build()
        return _networkStrength3!!
    }

private var _networkStrength3: ImageVector? = null
