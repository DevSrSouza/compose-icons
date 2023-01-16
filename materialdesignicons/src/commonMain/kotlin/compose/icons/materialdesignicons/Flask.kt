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

public val MaterialDesignIcons.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 19.0f)
                curveTo(3.0f, 18.4f, 3.18f, 17.84f, 3.5f, 17.37f)
                lineTo(9.0f, 7.81f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 5.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 4.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 6.0f)
                verticalLineTo(7.81f)
                lineTo(20.5f, 17.37f)
                curveTo(20.82f, 17.84f, 21.0f, 18.4f, 21.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                moveTo(5.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 19.0f)
                curveTo(19.0f, 18.79f, 18.93f, 18.59f, 18.82f, 18.43f)
                lineTo(16.53f, 14.47f)
                lineTo(14.0f, 17.0f)
                lineTo(8.93f, 11.93f)
                lineTo(5.18f, 18.43f)
                curveTo(5.07f, 18.59f, 5.0f, 18.79f, 5.0f, 19.0f)
                moveTo(13.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 10.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
