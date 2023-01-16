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

public val MaterialDesignIcons.GhostOff: ImageVector
    get() {
        if (_ghostOff != null) {
            return _ghostOff!!
        }
        _ghostOff = Builder(name = "GhostOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.27f)
                lineTo(3.28f, 2.0f)
                lineTo(22.0f, 20.72f)
                lineTo(20.73f, 22.0f)
                lineTo(17.87f, 19.13f)
                lineTo(15.0f, 22.0f)
                lineTo(12.0f, 19.0f)
                lineTo(9.0f, 22.0f)
                lineTo(6.0f, 19.0f)
                lineTo(3.0f, 22.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 9.09f, 3.59f, 7.33f, 4.6f, 5.87f)
                lineTo(2.0f, 3.27f)
                moveTo(12.0f, 2.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 21.0f, 11.0f)
                verticalLineTo(17.18f)
                lineTo(15.7f, 11.88f)
                curveTo(16.46f, 11.59f, 17.0f, 10.86f, 17.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 8.0f)
                curveTo(14.14f, 8.0f, 13.41f, 8.54f, 13.13f, 9.3f)
                lineTo(7.2f, 3.38f)
                curveTo(8.59f, 2.5f, 10.24f, 2.0f, 12.0f, 2.0f)
                moveTo(7.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 12.0f)
                curveTo(9.5f, 12.0f, 9.93f, 11.83f, 10.27f, 11.54f)
                lineTo(7.46f, 8.73f)
                curveTo(7.17f, 9.07f, 7.0f, 9.5f, 7.0f, 10.0f)
                close()
            }
        }
        .build()
        return _ghostOff!!
    }

private var _ghostOff: ImageVector? = null
