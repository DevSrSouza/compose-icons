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

public val BoldGroup.Wall: ImageVector
    get() {
        if (_wall != null) {
            return _wall!!
        }
        _wall = Builder(name = "Wall", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(92.0f, 140.0f)
                lineTo(92.0f, 116.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(44.0f, 140.0f)
                lineTo(44.0f, 116.0f)
                lineTo(68.0f, 116.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(188.0f, 116.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(188.0f, 140.0f)
                close()
                moveTo(212.0f, 92.0f)
                lineTo(140.0f, 92.0f)
                lineTo(140.0f, 68.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(116.0f, 68.0f)
                lineTo(116.0f, 92.0f)
                lineTo(44.0f, 92.0f)
                lineTo(44.0f, 68.0f)
                close()
                moveTo(44.0f, 164.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 188.0f)
                close()
                moveTo(140.0f, 188.0f)
                lineTo(140.0f, 164.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _wall!!
    }

private var _wall: ImageVector? = null
