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

public val RegularGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 72.0f)
                lineTo(24.0f, 72.0f)
                lineTo(24.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 48.0f)
                lineTo(8.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(24.0f, 176.0f)
                lineTo(232.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(248.0f, 112.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 208.0f, 72.0f)
                close()
                moveTo(24.0f, 88.0f)
                lineTo(96.0f, 88.0f)
                verticalLineToRelative(72.0f)
                lineTo(24.0f, 160.0f)
                close()
                moveTo(112.0f, 160.0f)
                lineTo(112.0f, 88.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
