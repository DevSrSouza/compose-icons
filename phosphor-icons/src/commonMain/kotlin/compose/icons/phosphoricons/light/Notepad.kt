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

public val LightGroup.Notepad: ImageVector
    get() {
        if (_notepad != null) {
            return _notepad!!
        }
        _notepad = Builder(name = "Notepad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 128.0f)
                close()
                moveTo(160.0f, 154.0f)
                lineTo(96.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(214.0f, 48.0f)
                lineTo(214.0f, 200.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -30.0f, 30.0f)
                lineTo(72.0f, 230.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -30.0f, -30.0f)
                lineTo(42.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 34.0f)
                lineTo(74.0f, 34.0f)
                lineTo(74.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(86.0f, 34.0f)
                horizontalLineToRelative(36.0f)
                lineTo(122.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(134.0f, 34.0f)
                horizontalLineToRelative(36.0f)
                lineTo(170.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(182.0f, 34.0f)
                horizontalLineToRelative(18.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 214.0f, 48.0f)
                close()
                moveTo(202.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(182.0f, 46.0f)
                lineTo(182.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(170.0f, 46.0f)
                lineTo(134.0f, 46.0f)
                lineTo(134.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 46.0f)
                lineTo(86.0f, 46.0f)
                lineTo(86.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(74.0f, 46.0f)
                lineTo(56.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(54.0f, 200.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, 18.0f)
                lineTo(184.0f, 218.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, -18.0f)
                close()
            }
        }
        .build()
        return _notepad!!
    }

private var _notepad: ImageVector? = null
