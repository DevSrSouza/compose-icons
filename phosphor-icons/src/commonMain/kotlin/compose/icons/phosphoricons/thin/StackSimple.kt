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

public val ThinGroup.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) {
            return _stackSimple!!
        }
        _stackSimple = Builder(name = "StackSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 107.5f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 4.0f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.0f, -7.0f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.0f, 0.0f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.0f, 7.0f)
                close()
                moveTo(128.0f, 44.6f)
                lineTo(231.9f, 104.0f)
                lineTo(128.0f, 163.4f)
                lineTo(24.1f, 104.0f)
                close()
                moveTo(243.5f, 142.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -1.5f, 5.5f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -4.0f, 0.0f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -7.0f)
                lineToRelative(110.0f, 62.9f)
                lineToRelative(110.0f, -62.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 243.5f, 142.0f)
                close()
            }
        }
        .build()
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
