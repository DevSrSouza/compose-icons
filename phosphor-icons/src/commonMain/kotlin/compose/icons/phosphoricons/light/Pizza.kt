package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.6f, 78.9f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 233.9f, 60.0f)
                arcTo(181.9f, 181.9f, 0.0f, false, false, 22.1f, 60.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -3.7f, 18.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(97.8f, 153.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 23.6f, 0.0f)
                lineToRelative(58.4f, -91.8f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(29.1f, 69.7f)
                arcToRelative(170.1f, 170.1f, 0.0f, false, true, 197.8f, 0.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.6f, 2.8f)
                lineToRelative(-9.8f, 15.3f)
                arcToRelative(149.9f, 149.9f, 0.0f, false, false, -179.4f, 0.0f)
                lineTo(28.5f, 72.5f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 29.1f, 69.7f)
                close()
                moveTo(64.7f, 129.4f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 20.7f, 32.5f)
                close()
                moveTo(129.7f, 226.2f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -3.4f, 0.0f)
                lineTo(92.4f, 172.9f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.7f, -54.5f)
                lineTo(44.7f, 98.0f)
                arcToRelative(137.9f, 137.9f, 0.0f, false, true, 166.6f, 0.0f)
                lineToRelative(-19.4f, 30.4f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -36.5f, 57.3f)
                close()
                moveTo(161.9f, 175.5f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 172.0f, 134.0f)
                arcToRelative(21.5f, 21.5f, 0.0f, false, true, 13.4f, 4.6f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
