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

public val MaterialDesignIcons.DirectionsFork: ImageVector
    get() {
        if (_directionsFork != null) {
            return _directionsFork!!
        }
        _directionsFork = Builder(name = "DirectionsFork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineTo(12.5f)
                lineTo(6.0f, 9.5f)
                lineTo(9.0f, 13.0f)
                curveTo(10.0f, 14.0f, 10.0f, 15.0f, 10.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 14.0f, 14.0f, 13.0f, 13.47f, 12.0f)
                curveTo(12.94f, 11.0f, 12.0f, 10.0f, 12.0f, 10.0f)
                lineTo(9.0f, 6.58f)
                lineTo(11.5f, 4.0f)
                moveTo(18.0f, 4.0f)
                lineTo(13.54f, 8.47f)
                lineTo(14.0f, 9.0f)
                curveTo(14.0f, 9.0f, 14.93f, 10.0f, 15.47f, 11.0f)
                curveTo(15.68f, 11.4f, 15.8f, 11.79f, 15.87f, 12.13f)
                lineTo(21.0f, 7.0f)
            }
        }
        .build()
        return _directionsFork!!
    }

private var _directionsFork: ImageVector? = null
