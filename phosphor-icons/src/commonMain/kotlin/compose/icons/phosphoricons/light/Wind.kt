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

public val LightGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 184.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -58.1f, 10.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.2f, -4.2f)
                arcTo(18.0f, 18.0f, 0.0f, true, false, 152.0f, 166.0f)
                lineTo(40.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(152.0f, 154.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 182.0f, 184.0f)
                close()
                moveTo(150.0f, 72.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 91.9f, 61.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.2f, 4.2f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 120.0f, 90.0f)
                lineTo(24.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 150.0f, 72.0f)
                close()
                moveTo(208.0f, 74.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, -28.1f, 19.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.2f, 4.2f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 208.0f, 122.0f)
                lineTo(32.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(208.0f, 134.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -60.0f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
