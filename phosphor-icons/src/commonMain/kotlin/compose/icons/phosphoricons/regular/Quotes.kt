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

public val RegularGroup.Quotes: ImageVector
    get() {
        if (_quotes != null) {
            return _quotes!!
        }
        _quotes = Builder(name = "Quotes", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 72.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(116.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 100.0f, 56.0f)
                close()
                moveTo(100.0f, 136.0f)
                lineTo(40.0f, 136.0f)
                lineTo(40.0f, 72.0f)
                horizontalLineToRelative(60.0f)
                close()
                moveTo(216.0f, 56.0f)
                lineTo(156.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(232.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 56.0f)
                close()
                moveTo(216.0f, 136.0f)
                lineTo(156.0f, 136.0f)
                lineTo(156.0f, 72.0f)
                horizontalLineToRelative(60.0f)
                close()
            }
        }
        .build()
        return _quotes!!
    }

private var _quotes: ImageVector? = null
