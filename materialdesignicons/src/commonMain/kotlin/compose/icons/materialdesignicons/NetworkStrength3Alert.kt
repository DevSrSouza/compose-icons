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

public val MaterialDesignIcons.NetworkStrength3Alert: ImageVector
    get() {
        if (_networkStrength3Alert != null) {
            return _networkStrength3Alert!!
        }
        _networkStrength3Alert = Builder(name = "NetworkStrength3Alert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                lineTo(1.0f, 21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.8f)
                lineTo(19.0f, 5.8f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                moveTo(19.0f, 11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                moveTo(19.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
            }
        }
        .build()
        return _networkStrength3Alert!!
    }

private var _networkStrength3Alert: ImageVector? = null
