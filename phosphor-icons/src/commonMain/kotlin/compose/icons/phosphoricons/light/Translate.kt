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

public val LightGroup.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.4f, 213.3f)
                lineToRelative(-56.0f, -112.0f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 176.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.4f, 3.3f)
                lineToRelative(-22.3f, 44.6f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 97.0f, 127.2f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 125.8f, 62.0f)
                horizontalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(94.0f)
                verticalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(50.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(89.8f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 88.0f, 119.2f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 67.1f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.6f, -3.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 55.8f, 90.0f)
                arcTo(102.3f, 102.3f, 0.0f, false, false, 79.0f, 127.2f)
                arcTo(89.4f, 89.4f, 0.0f, false, true, 24.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(101.8f, 101.8f, 0.0f, false, false, 64.0f, -22.6f)
                arcToRelative(102.9f, 102.9f, 0.0f, false, false, 54.5f, 22.1f)
                lineToRelative(-27.9f, 55.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.7f, 8.1f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 8.1f, -2.7f)
                lineTo(139.7f, 190.0f)
                horizontalLineToRelative(72.6f)
                lineToRelative(14.3f, 28.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 232.0f, 222.0f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.7f, -0.6f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 237.4f, 213.3f)
                close()
                moveTo(145.7f, 178.0f)
                lineTo(176.0f, 117.4f)
                lineTo(206.3f, 178.0f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
