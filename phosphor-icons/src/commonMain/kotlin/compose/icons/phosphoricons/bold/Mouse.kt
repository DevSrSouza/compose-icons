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

public val BoldGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 20.0f)
                lineTo(108.0f, 20.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 40.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, -68.0f)
                lineTo(216.0f, 88.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 148.0f, 20.0f)
                close()
                moveTo(192.0f, 88.0f)
                verticalLineToRelative(12.0f)
                lineTo(140.0f, 100.0f)
                lineTo(140.0f, 44.0f)
                horizontalLineToRelative(8.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 192.0f, 88.0f)
                close()
                moveTo(108.0f, 44.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(56.0f)
                lineTo(64.0f, 100.0f)
                lineTo(64.0f, 88.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 108.0f, 44.0f)
                close()
                moveTo(148.0f, 212.0f)
                lineTo(108.0f, 212.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(64.0f, 124.0f)
                lineTo(192.0f, 124.0f)
                verticalLineToRelative(44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 148.0f, 212.0f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
