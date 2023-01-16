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

public val MaterialDesignIcons.Valve: ImageVector
    get() {
        if (_valve != null) {
            return _valve!!
        }
        _valve = Builder(name = "Valve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                moveTo(22.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                moveTo(17.24f, 5.34f)
                lineTo(13.24f, 9.34f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.24f, 13.34f)
                lineTo(5.24f, 17.34f)
                lineTo(6.66f, 18.76f)
                lineTo(10.66f, 14.76f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.66f, 10.76f)
                lineTo(18.66f, 6.76f)
                close()
            }
        }
        .build()
        return _valve!!
    }

private var _valve: ImageVector? = null
