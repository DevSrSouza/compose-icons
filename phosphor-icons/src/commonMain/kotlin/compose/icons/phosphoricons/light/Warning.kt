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

public val LightGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 144.0f)
                lineTo(122.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(235.0f, 211.0f)
                arcToRelative(21.6f, 21.6f, 0.0f, false, true, -19.0f, 11.0f)
                lineTo(40.0f, 222.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -19.0f, -33.0f)
                lineTo(109.0f, 37.0f)
                arcToRelative(21.9f, 21.9f, 0.0f, false, true, 38.0f, 0.0f)
                lineToRelative(88.0f, 152.0f)
                arcTo(21.7f, 21.7f, 0.0f, false, true, 235.0f, 211.0f)
                close()
                moveTo(224.6f, 195.0f)
                lineTo(136.7f, 43.0f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -17.4f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(31.4f, 195.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 40.0f, 210.0f)
                lineTo(216.0f, 210.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 8.6f, -15.0f)
                close()
                moveTo(128.0f, 170.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 170.0f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
