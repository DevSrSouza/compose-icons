package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) {
            return _stackSimple!!
        }
        _stackSimple = Builder(name = "StackSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 110.4f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 12.0f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.8f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(10.0f, 89.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 20.8f)
                close()
                moveTo(128.0f, 49.8f)
                lineTo(215.8f, 100.0f)
                lineTo(128.0f, 150.2f)
                lineTo(40.2f, 100.0f)
                close()
                moveTo(250.4f, 142.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.4f, 16.4f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -20.8f)
                lineToRelative(106.0f, 60.6f)
                lineToRelative(106.0f, -60.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 250.4f, 142.0f)
                close()
            }
        }
        .build()
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
