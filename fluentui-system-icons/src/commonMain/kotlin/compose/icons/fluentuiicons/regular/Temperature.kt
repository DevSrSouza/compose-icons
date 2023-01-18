package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Temperature: ImageVector
    get() {
        if (_temperature != null) {
            return _temperature!!
        }
        _temperature = Builder(name = "Temperature", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.733f, 2.0f, 15.1492f, 3.3565f, 15.2449f, 5.0655f)
                lineTo(15.25f, 5.2499f)
                lineTo(15.251f, 13.202f)
                lineTo(15.331f, 13.2709f)
                curveTo(16.2565f, 14.0975f, 16.8482f, 15.2418f, 16.9746f, 16.4939f)
                lineTo(16.9936f, 16.7457f)
                lineTo(17.0f, 17.0f)
                curveTo(17.0f, 19.7614f, 14.7614f, 22.0f, 12.0f, 22.0f)
                curveTo(9.2386f, 22.0f, 7.0f, 19.7614f, 7.0f, 17.0f)
                curveTo(7.0f, 15.6373f, 7.5496f, 14.3655f, 8.4892f, 13.4396f)
                lineTo(8.6699f, 13.2701f)
                lineTo(8.749f, 13.202f)
                lineTo(8.75f, 5.25f)
                curveTo(8.75f, 3.5789f, 10.0113f, 2.2023f, 11.6339f, 2.0204f)
                lineTo(11.8156f, 2.0051f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(11.0818f, 3.5f, 10.3288f, 4.2071f, 10.2558f, 5.1065f)
                lineTo(10.25f, 5.25f)
                lineTo(10.2495f, 13.9445f)
                lineTo(9.9413f, 14.1691f)
                curveTo(9.0419f, 14.8246f, 8.5f, 15.8664f, 8.5f, 17.0f)
                curveTo(8.5f, 18.933f, 10.067f, 20.5f, 12.0f, 20.5f)
                curveTo(13.933f, 20.5f, 15.5f, 18.933f, 15.5f, 17.0f)
                curveTo(15.5f, 15.9376f, 15.0241f, 14.9558f, 14.2239f, 14.2971f)
                lineTo(14.0595f, 14.1697f)
                lineTo(13.7515f, 13.9451f)
                lineTo(13.75f, 5.25f)
                curveTo(13.75f, 4.2835f, 12.9665f, 3.5f, 12.0f, 3.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.4142f, 8.0f, 12.75f, 8.3358f, 12.75f, 8.75f)
                lineTo(12.7506f, 14.6146f)
                curveTo(13.7646f, 14.9334f, 14.5f, 15.8808f, 14.5f, 17.0f)
                curveTo(14.5f, 18.3807f, 13.3807f, 19.5f, 12.0f, 19.5f)
                curveTo(10.6193f, 19.5f, 9.5f, 18.3807f, 9.5f, 17.0f)
                curveTo(9.5f, 15.8804f, 10.2359f, 14.9328f, 11.2504f, 14.6143f)
                lineTo(11.25f, 8.75f)
                curveTo(11.25f, 8.3358f, 11.5858f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _temperature!!
    }

private var _temperature: ImageVector? = null
