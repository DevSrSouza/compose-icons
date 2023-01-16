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

public val MaterialDesignIcons.ArrowUpThin: ImageVector
    get() {
        if (_arrowUpThin != null) {
            return _arrowUpThin!!
        }
        _arrowUpThin = Builder(name = "ArrowUpThin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.03f, 9.97f)
                horizontalLineTo(11.03f)
                verticalLineTo(18.89f)
                lineTo(13.04f, 18.92f)
                verticalLineTo(9.97f)
                horizontalLineTo(17.03f)
                lineTo(12.03f, 4.97f)
                close()
            }
        }
        .build()
        return _arrowUpThin!!
    }

private var _arrowUpThin: ImageVector? = null
