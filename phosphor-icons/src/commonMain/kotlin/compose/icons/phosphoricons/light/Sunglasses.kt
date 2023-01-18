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

public val LightGroup.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, 18.0f)
                verticalLineToRelative(62.0f)
                lineTo(38.0f, 134.0f)
                lineTo(38.0f, 72.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 56.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 26.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 84.0f, 0.0f)
                lineTo(110.0f, 146.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 84.0f, 0.0f)
                lineTo(230.0f, 72.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 200.0f, 42.0f)
                close()
                moveTo(214.5f, 178.0f)
                lineTo(182.5f, 146.0f)
                lineTo(218.0f, 146.0f)
                verticalLineToRelative(18.0f)
                arcTo(29.9f, 29.9f, 0.0f, false, true, 214.5f, 178.0f)
                close()
                moveTo(38.0f, 164.0f)
                lineTo(38.0f, 146.0f)
                horizontalLineToRelative(7.5f)
                lineToRelative(41.3f, 41.3f)
                arcTo(29.6f, 29.6f, 0.0f, false, true, 68.0f, 194.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 38.0f, 164.0f)
                close()
                moveTo(98.0f, 164.0f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, true, -3.5f, 14.0f)
                lineToRelative(-32.0f, -32.0f)
                lineTo(98.0f, 146.0f)
                close()
                moveTo(158.0f, 164.0f)
                lineTo(158.0f, 146.0f)
                horizontalLineToRelative(7.5f)
                lineToRelative(41.3f, 41.3f)
                arcTo(29.6f, 29.6f, 0.0f, false, true, 188.0f, 194.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 158.0f, 164.0f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
