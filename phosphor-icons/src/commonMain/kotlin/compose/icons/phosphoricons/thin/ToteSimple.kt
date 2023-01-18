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

public val ThinGroup.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) {
            return _toteSimple!!
        }
        _toteSimple = Builder(name = "ToteSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 72.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -8.9f, -4.0f)
                lineTo(171.8f, 68.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -87.6f, 0.0f)
                lineTo(32.9f, 68.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 24.0f, 72.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -3.0f, 9.3f)
                lineToRelative(14.2f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 10.7f)
                lineTo(208.8f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -10.7f)
                lineTo(235.0f, 81.3f)
                arcTo(11.7f, 11.7f, 0.0f, false, false, 232.0f, 72.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, 35.8f, 32.0f)
                lineTo(92.2f, 68.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(227.0f, 80.4f)
                lineTo(212.8f, 208.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -4.0f, 3.6f)
                lineTo(47.2f, 212.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -4.0f, -3.6f)
                lineTo(29.0f, 80.4f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 1.0f, -3.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 32.9f, 76.0f)
                lineTo(223.1f, 76.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.9f, 1.3f)
                arcTo(3.7f, 3.7f, 0.0f, false, true, 227.0f, 80.4f)
                close()
            }
        }
        .build()
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
