package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 96.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, false, 72.0f, 163.8f)
                lineTo(72.0f, 240.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.8f, 6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.8f, 0.4f)
                lineTo(128.0f, 224.9f)
                lineToRelative(44.4f, 22.3f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, 3.6f, 0.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(184.0f, 163.8f)
                arcTo(87.8f, 87.8f, 0.0f, false, false, 216.0f, 96.0f)
                close()
                moveTo(56.0f, 96.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, 72.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 56.0f, 96.0f)
                close()
                moveTo(168.0f, 227.1f)
                lineToRelative(-36.4f, -18.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -7.2f, 0.0f)
                lineTo(88.0f, 227.1f)
                lineTo(88.0f, 174.4f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 80.0f, 0.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, false, 72.0f, 96.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(128.0f, 56.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 88.0f, 96.0f)
                arcTo(40.1f, 40.1f, 0.0f, false, true, 128.0f, 56.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
