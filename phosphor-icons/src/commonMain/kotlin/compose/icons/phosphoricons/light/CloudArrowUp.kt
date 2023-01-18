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

public val LightGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(85.0f, 85.0f, 0.0f, false, true, -17.2f, 51.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.6f, -7.2f)
                arcTo(73.2f, 73.2f, 0.0f, false, false, 234.0f, 128.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -148.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(86.7f, 86.7f, 0.0f, false, true, 3.9f, -25.6f)
                arcTo(38.1f, 38.1f, 0.0f, false, false, 72.0f, 102.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, 100.0f)
                lineTo(96.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(72.0f, 214.0f)
                arcTo(62.0f, 62.0f, 0.0f, false, true, 72.0f, 90.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 10.4f, 0.9f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 246.0f, 128.0f)
                close()
                moveTo(156.2f, 123.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.5f, 8.5f)
                lineTo(146.0f, 142.5f)
                lineTo(146.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(158.0f, 142.5f)
                lineToRelative(23.7f, 23.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, 1.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.3f, -1.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, -8.5f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
