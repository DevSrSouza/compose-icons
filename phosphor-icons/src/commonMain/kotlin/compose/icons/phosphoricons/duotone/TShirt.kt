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

public val DuotoneGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(name = "TShirt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(244.6f, 78.8f)
                lineToRelative(-18.4f, 36.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -7.1f, 4.4f)
                lineTo(192.0f, 120.0f)
                lineTo(192.0f, 40.0f)
                lineToRelative(49.4f, 28.2f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 244.6f, 78.8f)
                close()
                moveTo(11.4f, 78.8f)
                lineTo(29.8f, 115.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.1f, 4.4f)
                lineTo(64.0f, 120.0f)
                lineTo(64.0f, 40.0f)
                lineTo(14.6f, 68.2f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 11.4f, 78.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.4f, 61.3f)
                lineTo(196.0f, 33.1f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.5f, -0.2f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.5f, -0.2f)
                lineTo(160.0f, 32.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(61.3f, 32.7f)
                lineToRelative(-0.5f, 0.2f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.5f, 0.2f)
                lineTo(60.0f, 33.1f)
                lineTo(10.6f, 61.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -6.4f, 21.0f)
                lineToRelative(18.4f, 36.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 36.9f, 128.0f)
                lineTo(56.0f, 128.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(200.0f, 128.0f)
                horizontalLineToRelative(19.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.3f, -8.8f)
                lineToRelative(18.4f, -36.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 245.4f, 61.3f)
                close()
                moveTo(36.9f, 112.0f)
                lineTo(18.5f, 75.2f)
                lineTo(56.0f, 53.8f)
                lineTo(56.0f, 112.0f)
                close()
                moveTo(184.0f, 208.0f)
                lineTo(72.0f, 208.0f)
                lineTo(72.0f, 48.0f)
                lineTo(88.8f, 48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.4f, 0.0f)
                lineTo(184.0f, 48.0f)
                close()
                moveTo(219.1f, 112.0f)
                lineTo(200.0f, 112.0f)
                lineTo(200.0f, 53.8f)
                lineToRelative(37.5f, 21.4f)
                close()
            }
        }
        .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
