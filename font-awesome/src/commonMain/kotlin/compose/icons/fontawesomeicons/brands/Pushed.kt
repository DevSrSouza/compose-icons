package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Pushed: ImageVector
    get() {
        if (_pushed != null) {
            return _pushed!!
        }
        _pushed = Builder(name = "Pushed", defaultWidth = 432.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 432.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.0f, 111.9f)
                lineToRelative(-98.5f, -9.0f)
                lineToRelative(14.0f, -33.4f)
                curveToRelative(10.4f, -23.5f, -10.8f, -40.4f, -28.7f, -37.0f)
                lineTo(22.5f, 76.9f)
                curveToRelative(-15.1f, 2.7f, -26.0f, 18.3f, -21.4f, 36.6f)
                lineToRelative(105.1f, 348.3f)
                curveToRelative(6.5f, 21.3f, 36.7f, 24.2f, 47.7f, 7.0f)
                lineToRelative(35.3f, -80.8f)
                lineToRelative(235.2f, -231.3f)
                curveToRelative(16.4f, -16.8f, 4.3f, -42.9f, -17.4f, -44.8f)
                close()
                moveTo(297.6f, 53.6f)
                curveToRelative(5.1f, -0.7f, 7.5f, 2.5f, 5.2f, 7.4f)
                lineTo(286.0f, 100.9f)
                lineTo(108.6f, 84.6f)
                lineToRelative(189.0f, -31.0f)
                close()
                moveTo(22.7f, 107.9f)
                curveToRelative(-3.1f, -5.1f, 1.0f, -10.0f, 6.1f, -9.1f)
                lineToRelative(248.7f, 22.7f)
                lineToRelative(-96.9f, 230.7f)
                lineTo(22.7f, 107.9f)
                close()
                moveTo(136.0f, 456.4f)
                curveToRelative(-2.6f, 4.0f, -7.9f, 3.1f, -9.4f, -1.2f)
                lineTo(43.5f, 179.7f)
                lineToRelative(127.7f, 197.6f)
                curveToRelative(-7.0f, 15.0f, -35.2f, 79.1f, -35.2f, 79.1f)
                close()
                moveTo(408.8f, 141.9f)
                lineTo(210.1f, 337.3f)
                lineToRelative(89.7f, -213.7f)
                lineToRelative(106.4f, 9.7f)
                curveToRelative(4.0f, 1.1f, 5.7f, 5.3f, 2.6f, 8.6f)
                close()
            }
        }
        .build()
        return _pushed!!
    }

private var _pushed: ImageVector? = null
