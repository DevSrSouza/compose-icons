package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 136.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(88.0f)
                lineToRelative(64.0f, 48.0f)
                verticalLineTo(88.0f)
                lineToRelative(64.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(80.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 116.0f, 176.0f)
                close()
                moveTo(176.0f, 168.0f)
                lineTo(148.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(248.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(16.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(32.0f, 208.0f)
                lineTo(32.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineTo(96.0f, 120.0f)
                lineTo(96.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineToRelative(38.7f, 29.1f)
                lineToRelative(11.6f, -81.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 174.9f, 16.0f)
                horizontalLineToRelative(18.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.8f, 13.7f)
                lineToRelative(15.0f, 105.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.1f, 0.4f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 216.0f)
                close()
                moveTo(162.1f, 121.6f)
                lineTo(170.7f, 128.0f)
                horizontalLineToRelative(36.1f)
                lineTo(193.1f, 32.0f)
                lineTo(174.9f, 32.0f)
                close()
                moveTo(48.0f, 208.0f)
                lineTo(208.0f, 208.0f)
                lineTo(208.0f, 144.0f)
                lineTo(168.0f, 144.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -4.8f, -1.6f)
                lineToRelative(-14.4f, -10.8f)
                horizontalLineToRelative(0.0f)
                lineTo(112.0f, 104.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.8f, 6.4f)
                lineTo(48.0f, 104.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
