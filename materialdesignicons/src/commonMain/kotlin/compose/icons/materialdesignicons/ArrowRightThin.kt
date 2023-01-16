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

public val MaterialDesignIcons.ArrowRightThin: ImageVector
    get() {
        if (_arrowRightThin != null) {
            return _arrowRightThin!!
        }
        _arrowRightThin = Builder(name = "ArrowRightThin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.94f)
                verticalLineTo(12.94f)
                horizontalLineTo(5.08f)
                lineTo(5.05f, 10.93f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.94f)
                lineTo(19.0f, 11.94f)
                close()
            }
        }
        .build()
        return _arrowRightThin!!
    }

private var _arrowRightThin: ImageVector? = null
