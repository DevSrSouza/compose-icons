package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(293.3f, 0.612f)
                curveTo(304.2f, 3.118f, 311.9f, 12.82f, 311.9f, 24.0f)
                verticalLineTo(408.7f)
                curveTo(311.9f, 417.5f, 307.1f, 425.7f, 299.2f, 429.8f)
                lineTo(150.1f, 509.1f)
                curveTo(142.9f, 513.4f, 133.1f, 512.7f, 125.6f, 507.4f)
                curveTo(118.2f, 502.1f, 114.5f, 492.1f, 115.1f, 483.9f)
                lineTo(142.2f, 328.4f)
                lineTo(31.11f, 218.3f)
                curveTo(24.65f, 211.9f, 22.36f, 202.4f, 25.2f, 193.7f)
                curveTo(28.03f, 185.1f, 35.5f, 178.8f, 44.49f, 177.5f)
                lineTo(197.7f, 154.8f)
                lineTo(266.3f, 13.52f)
                curveTo(271.2f, 3.46f, 282.4f, -1.893f, 293.3f, 0.613f)
                lineTo(293.3f, 0.612f)
                close()
                moveTo(263.9f, 128.4f)
                lineTo(235.4f, 187.2f)
                curveTo(231.9f, 194.3f, 225.1f, 199.3f, 217.3f, 200.5f)
                lineTo(98.98f, 217.9f)
                lineTo(184.9f, 303.0f)
                curveTo(190.4f, 308.5f, 192.9f, 316.4f, 191.6f, 324.1f)
                lineTo(171.4f, 443.7f)
                lineTo(263.9f, 394.3f)
                lineTo(263.9f, 128.4f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
