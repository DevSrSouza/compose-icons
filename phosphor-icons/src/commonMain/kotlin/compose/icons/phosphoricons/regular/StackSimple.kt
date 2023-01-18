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

public val RegularGroup.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) {
            return _stackSimple!!
        }
        _stackSimple = Builder(name = "StackSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 110.9f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 8.0f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.8f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(12.0f, 97.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.8f)
                close()
                moveTo(128.0f, 49.2f)
                lineTo(223.9f, 104.0f)
                lineTo(128.0f, 158.8f)
                lineTo(32.1f, 104.0f)
                close()
                moveTo(246.9f, 140.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.9f, 10.9f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -8.0f, 0.0f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -13.8f)
                lineToRelative(108.0f, 61.7f)
                lineToRelative(108.0f, -61.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 246.9f, 140.0f)
                close()
            }
        }
        .build()
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
