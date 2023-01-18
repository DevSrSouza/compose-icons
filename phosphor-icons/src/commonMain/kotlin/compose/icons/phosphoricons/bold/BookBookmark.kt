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

public val BoldGroup.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(name = "BookBookmark", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 36.0f, 56.0f)
                lineTo(36.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(60.0f, 212.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(208.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 20.0f)
                close()
                moveTo(120.0f, 44.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(60.0f)
                lineToRelative(-12.8f, -9.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.4f, 0.0f)
                lineTo(120.0f, 104.0f)
                close()
                moveTo(196.0f, 172.0f)
                lineTo(72.0f, 172.0f)
                arcToRelative(34.4f, 34.4f, 0.0f, false, false, -12.0f, 2.1f)
                lineTo(60.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 44.0f)
                lineTo(96.0f, 44.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.6f, 10.7f)
                arcTo(11.6f, 11.6f, 0.0f, false, false, 108.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.2f, -2.4f)
                lineTo(140.0f, 119.0f)
                lineToRelative(24.8f, 18.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 128.0f)
                lineTo(184.0f, 44.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
