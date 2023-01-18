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

public val LightGroup.Files: ImageVector
    get() {
        if (_files != null) {
            return _files!!
        }
        _files = Builder(name = "Files", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.2f, 67.8f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 168.0f, 26.0f)
                lineTo(88.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 74.0f, 40.0f)
                lineTo(74.0f, 58.0f)
                lineTo(56.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 72.0f)
                lineTo(42.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(168.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(182.0f, 198.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 72.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 212.2f, 67.8f)
                close()
                moveTo(170.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(77.5f)
                lineTo(170.0f, 106.5f)
                close()
                moveTo(202.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(182.0f, 186.0f)
                lineTo(182.0f, 104.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -1.8f, -4.2f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 136.0f, 58.0f)
                lineTo(86.0f, 58.0f)
                lineTo(86.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(77.5f)
                lineTo(202.0f, 74.5f)
                close()
                moveTo(142.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 142.0f, 152.0f)
                close()
                moveTo(142.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 142.0f, 184.0f)
                close()
            }
        }
        .build()
        return _files!!
    }

private var _files: ImageVector? = null
