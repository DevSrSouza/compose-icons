package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.6f, 214.2f)
                lineToRelative(-56.0f, -112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.2f, 0.0f)
                lineToRelative(-22.8f, 45.7f)
                arcTo(91.3f, 91.3f, 0.0f, false, true, 94.0f, 127.3f)
                arcTo(99.3f, 99.3f, 0.0f, false, false, 123.9f, 60.0f)
                horizontalLineTo(152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(92.0f)
                verticalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(91.9f)
                arcTo(91.2f, 91.2f, 0.0f, false, true, 88.0f, 122.0f)
                arcTo(91.6f, 91.6f, 0.0f, false, true, 65.2f, 86.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.1f, -2.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -2.4f, 5.1f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 82.0f, 127.4f)
                arcTo(91.4f, 91.4f, 0.0f, false, true, 24.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(99.6f, 99.6f, 0.0f, false, false, 64.0f, -23.2f)
                arcToRelative(99.6f, 99.6f, 0.0f, false, false, 57.7f, 22.9f)
                lineToRelative(-29.3f, 58.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.2f, 3.6f)
                lineTo(138.5f, 188.0f)
                horizontalLineToRelative(75.0f)
                lineToRelative(14.9f, 29.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 220.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, -0.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.6f, 214.2f)
                close()
                moveTo(142.5f, 180.0f)
                lineTo(176.0f, 112.9f)
                lineTo(209.5f, 180.0f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
