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

public val BoldGroup.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) {
            return _smileyNervous!!
        }
        _smileyNervous = Builder(name = "SmileyNervous", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(76.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 108.0f)
                close()
                moveTo(148.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 148.0f, 108.0f)
                close()
                moveTo(179.6f, 157.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.8f, 15.0f)
                lineToRelative(-0.8f, -1.1f)
                lineToRelative(-6.6f, 8.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -18.8f, 0.0f)
                lineToRelative(-6.6f, -8.3f)
                lineToRelative(-6.6f, 8.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -18.8f, 0.0f)
                lineTo(96.0f, 171.2f)
                lineToRelative(-0.8f, 1.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.8f, -15.0f)
                lineToRelative(10.2f, -12.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 18.8f, 0.0f)
                lineToRelative(6.6f, 8.3f)
                lineToRelative(6.6f, -8.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 18.8f, 0.0f)
                lineToRelative(6.6f, 8.3f)
                lineToRelative(6.6f, -8.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 18.8f, 0.0f)
                close()
            }
        }
        .build()
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
