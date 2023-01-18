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

public val BoldGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                lineTo(180.0f, 56.0f)
                lineTo(180.0f, 48.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(104.0f, 20.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 76.0f, 48.0f)
                verticalLineToRelative(8.0f)
                lineTo(40.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 76.0f)
                lineTo(20.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 56.0f)
                close()
                moveTo(100.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                lineTo(100.0f, 56.0f)
                close()
                moveTo(212.0f, 80.0f)
                verticalLineToRelative(35.2f)
                arcTo(180.1f, 180.1f, 0.0f, false, true, 128.0f, 136.0f)
                arcToRelative(180.4f, 180.4f, 0.0f, false, true, -84.0f, -20.8f)
                lineTo(44.0f, 80.0f)
                close()
                moveTo(44.0f, 200.0f)
                lineTo(44.0f, 141.9f)
                arcTo(203.7f, 203.7f, 0.0f, false, false, 128.0f, 160.0f)
                arcToRelative(203.7f, 203.7f, 0.0f, false, false, 84.0f, -18.1f)
                lineTo(212.0f, 200.0f)
                close()
                moveTo(104.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(116.0f, 124.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 112.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
