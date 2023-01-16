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

public val MaterialDesignIcons.FanOff: ImageVector
    get() {
        if (_fanOff != null) {
            return _fanOff!!
        }
        _fanOff = Builder(name = "FanOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                curveTo(9.64f, 2.0f, 8.57f, 4.55f, 9.29f, 7.47f)
                lineTo(15.0f, 13.16f)
                curveTo(15.87f, 13.37f, 16.81f, 13.81f, 17.28f, 14.73f)
                curveTo(18.46f, 17.1f, 22.03f, 17.0f, 22.03f, 12.5f)
                curveTo(22.03f, 8.92f, 18.05f, 8.13f, 14.35f, 10.13f)
                curveTo(14.03f, 9.73f, 13.61f, 9.42f, 13.13f, 9.22f)
                curveTo(13.32f, 8.29f, 13.76f, 7.24f, 14.75f, 6.75f)
                curveTo(17.11f, 5.57f, 17.0f, 2.0f, 12.5f, 2.0f)
                moveTo(3.28f, 4.0f)
                lineTo(2.0f, 5.27f)
                lineTo(4.47f, 7.73f)
                curveTo(3.22f, 7.74f, 2.0f, 8.87f, 2.0f, 11.5f)
                curveTo(2.0f, 15.07f, 5.96f, 15.85f, 9.65f, 13.87f)
                curveTo(9.97f, 14.27f, 10.4f, 14.59f, 10.89f, 14.79f)
                curveTo(10.69f, 15.71f, 10.25f, 16.75f, 9.27f, 17.24f)
                curveTo(6.91f, 18.42f, 7.0f, 22.0f, 11.5f, 22.0f)
                curveTo(13.8f, 22.0f, 14.94f, 20.36f, 14.94f, 18.21f)
                lineTo(18.73f, 22.0f)
                lineTo(20.0f, 20.72f)
                lineTo(3.28f, 4.0f)
                close()
            }
        }
        .build()
        return _fanOff!!
    }

private var _fanOff: ImageVector? = null
