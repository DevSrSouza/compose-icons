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

public val MaterialDesignIcons.Cached: ImageVector
    get() {
        if (_cached != null) {
            return _cached!!
        }
        _cached = Builder(name = "Cached", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                lineTo(15.0f, 12.0f)
                horizontalLineTo(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 18.0f)
                curveTo(11.0f, 18.0f, 10.03f, 17.75f, 9.2f, 17.3f)
                lineTo(7.74f, 18.76f)
                curveTo(8.97f, 19.54f, 10.43f, 20.0f, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                horizontalLineTo(23.0f)
                moveTo(6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                curveTo(13.0f, 6.0f, 13.97f, 6.25f, 14.8f, 6.7f)
                lineTo(16.26f, 5.24f)
                curveTo(15.03f, 4.46f, 13.57f, 4.0f, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                horizontalLineTo(1.0f)
                lineTo(5.0f, 16.0f)
                lineTo(9.0f, 12.0f)
            }
        }
        .build()
        return _cached!!
    }

private var _cached: ImageVector? = null
