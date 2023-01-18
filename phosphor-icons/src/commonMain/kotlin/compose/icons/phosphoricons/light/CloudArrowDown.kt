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

public val LightGroup.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) {
            return _cloudArrowDown!!
        }
        _cloudArrowDown = Builder(name = "CloudArrowDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.2f, 169.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineToRelative(-34.0f, -33.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -8.5f)
                lineTo(146.0f, 193.5f)
                verticalLineTo(128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(65.5f)
                lineToRelative(23.7f, -23.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 190.2f, 169.8f)
                close()
                moveTo(160.0f, 42.0f)
                arcTo(86.2f, 86.2f, 0.0f, false, false, 82.4f, 90.9f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 72.0f, 90.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 0.0f, 124.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(72.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, -100.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, true, 5.9f, 0.4f)
                arcTo(86.7f, 86.7f, 0.0f, false, false, 74.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f)
                arcToRelative(73.2f, 73.2f, 0.0f, false, true, -14.8f, 44.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.6f, 7.2f)
                arcTo(85.0f, 85.0f, 0.0f, false, false, 246.0f, 128.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 160.0f, 42.0f)
                close()
            }
        }
        .build()
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
