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

public val MaterialDesignIcons.MetronomeTick: ImageVector
    get() {
        if (_metronomeTick != null) {
            return _metronomeTick!!
        }
        _metronomeTick = Builder(name = "MetronomeTick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.75f)
                lineTo(8.57f, 2.67f)
                lineTo(4.07f, 19.5f)
                curveTo(4.06f, 19.5f, 4.0f, 19.84f, 4.0f, 20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                curveTo(20.0f, 19.84f, 19.94f, 19.5f, 19.93f, 19.5f)
                lineTo(15.43f, 2.67f)
                lineTo(12.0f, 1.75f)
                moveTo(10.29f, 4.0f)
                horizontalLineTo(13.71f)
                lineTo(17.2f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.8f)
                lineTo(10.29f, 4.0f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _metronomeTick!!
    }

private var _metronomeTick: ImageVector? = null
