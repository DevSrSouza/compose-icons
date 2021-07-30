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

public val BrandsGroup.Css3Alt: ImageVector
    get() {
        if (_css3Alt != null) {
            return _css3Alt!!
        }
        _css3Alt = Builder(name = "Css3Alt", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineToRelative(34.9f, 395.8f)
                lineTo(192.0f, 480.0f)
                lineToRelative(157.1f, -52.2f)
                lineTo(384.0f, 32.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(313.1f, 112.0f)
                lineToRelative(-4.8f, 47.3f)
                lineTo(193.0f, 208.6f)
                lineToRelative(-0.3f, 0.1f)
                horizontalLineToRelative(111.5f)
                lineToRelative(-12.8f, 146.6f)
                lineToRelative(-98.2f, 28.7f)
                lineToRelative(-98.8f, -29.2f)
                lineToRelative(-6.4f, -73.9f)
                horizontalLineToRelative(48.9f)
                lineToRelative(3.2f, 38.3f)
                lineToRelative(52.6f, 13.3f)
                lineToRelative(54.7f, -15.4f)
                lineToRelative(3.7f, -61.6f)
                lineToRelative(-166.3f, -0.5f)
                verticalLineToRelative(-0.1f)
                lineToRelative(-0.2f, 0.1f)
                lineToRelative(-3.6f, -46.3f)
                lineTo(193.1f, 162.0f)
                lineToRelative(6.5f, -2.7f)
                lineTo(76.7f, 159.3f)
                lineTo(70.9f, 112.0f)
                horizontalLineToRelative(242.2f)
                close()
            }
        }
        .build()
        return _css3Alt!!
    }

private var _css3Alt: ImageVector? = null
