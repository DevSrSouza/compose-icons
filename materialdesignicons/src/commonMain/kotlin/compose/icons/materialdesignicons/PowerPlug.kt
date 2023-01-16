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

public val MaterialDesignIcons.PowerPlug: ImageVector
    get() {
        if (_powerPlug != null) {
            return _powerPlug!!
        }
        _powerPlug = Builder(name = "PowerPlug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                curveTo(7.0f, 7.0f, 6.0f, 8.0f, 6.0f, 9.0f)
                verticalLineTo(14.5f)
                lineTo(9.5f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(18.0f)
                lineTo(18.0f, 14.5f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 8.0f, 17.0f, 7.0f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _powerPlug!!
    }

private var _powerPlug: ImageVector? = null
