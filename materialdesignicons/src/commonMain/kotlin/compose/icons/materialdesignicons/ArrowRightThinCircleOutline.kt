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

public val MaterialDesignIcons.ArrowRightThinCircleOutline: ImageVector
    get() {
        if (_arrowRightThinCircleOutline != null) {
            return _arrowRightThinCircleOutline!!
        }
        _arrowRightThinCircleOutline = Builder(name = "ArrowRightThinCircleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.03f, 12.0f)
                curveTo(20.03f, 7.59f, 16.41f, 3.97f, 12.0f, 3.97f)
                curveTo(7.59f, 3.97f, 3.97f, 7.59f, 3.97f, 12.0f)
                curveTo(3.97f, 16.41f, 7.59f, 20.03f, 12.0f, 20.03f)
                curveTo(16.41f, 20.03f, 20.03f, 16.41f, 20.03f, 12.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.54f, 17.54f, 22.0f, 12.0f, 22.0f)
                curveTo(6.46f, 22.0f, 2.0f, 17.54f, 2.0f, 12.0f)
                curveTo(2.0f, 6.46f, 6.46f, 2.0f, 12.0f, 2.0f)
                curveTo(17.54f, 2.0f, 22.0f, 6.46f, 22.0f, 12.0f)
                moveTo(13.54f, 13.0f)
                verticalLineTo(16.0f)
                lineTo(17.5f, 12.0f)
                lineTo(13.54f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(13.0f)
            }
        }
        .build()
        return _arrowRightThinCircleOutline!!
    }

private var _arrowRightThinCircleOutline: ImageVector? = null
