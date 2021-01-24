package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(498.11f, 206.4f)
                lineTo(445.31f, 14.72f)
                lineTo(248.2f, 66.08f)
                lineTo(219.0f, 116.14f)
                lineToRelative(-59.2f, -0.43f)
                lineTo(15.54f, 256.0f)
                lineTo(159.82f, 396.32f)
                lineToRelative(59.17f, -0.43f)
                lineToRelative(29.24f, 50.0f)
                lineToRelative(197.08f, 51.36f)
                lineToRelative(52.8f, -191.62f)
                lineToRelative(-30.0f, -49.63f)
                close()
                moveTo(223.77f, 124.2f)
                lineTo(374.55f, 86.51f)
                lineTo(288.0f, 232.33f)
                lineTo(114.87f, 232.33f)
                close()
                moveTo(223.77f, 387.83f)
                lineTo(114.87f, 279.71f)
                lineTo(288.0f, 279.71f)
                lineToRelative(86.55f, 145.81f)
                close()
                moveTo(416.77f, 401.83f)
                lineTo(330.17f, 256.0f)
                lineToRelative(86.58f, -145.84f)
                lineTo(458.56f, 256.0f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
