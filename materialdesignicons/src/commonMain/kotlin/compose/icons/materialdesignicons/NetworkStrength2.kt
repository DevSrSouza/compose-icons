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

public val MaterialDesignIcons.NetworkStrength2: ImageVector
    get() {
        if (_networkStrength2 != null) {
            return _networkStrength2!!
        }
        _networkStrength2 = Builder(name = "NetworkStrength2", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(1.0f)
                moveTo(19.0f, 5.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.83f)
            }
        }
        .build()
        return _networkStrength2!!
    }

private var _networkStrength2: ImageVector? = null
