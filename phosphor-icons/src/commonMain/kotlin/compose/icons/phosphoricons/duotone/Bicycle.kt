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

public val DuotoneGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(248.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 160.0f)
                close()
                moveTo(48.0f, 120.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 48.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 112.0f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, false, -16.9f, 3.1f)
                lineTo(165.9f, 72.0f)
                lineTo(192.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(152.0f, 56.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -6.9f, 4.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 0.0f, 8.0f)
                lineToRelative(11.6f, 20.0f)
                lineTo(99.3f, 88.0f)
                lineTo(82.9f, 60.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 76.0f, 56.0f)
                lineTo(48.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(71.4f, 72.0f)
                lineTo(85.1f, 95.5f)
                lineTo(69.4f, 117.1f)
                arcTo(46.6f, 46.6f, 0.0f, false, false, 48.0f, 112.0f)
                arcToRelative(48.1f, 48.1f, 0.0f, true, false, 34.3f, 14.5f)
                lineToRelative(11.6f, -15.9f)
                lineTo(125.1f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.8f, -8.0f)
                lineToRelative(-30.3f, -52.0f)
                horizontalLineToRelative(57.5f)
                lineToRelative(11.2f, 19.2f)
                arcTo(47.9f, 47.9f, 0.0f, true, false, 208.0f, 112.0f)
                close()
                moveTo(48.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, true, 11.8f, 2.3f)
                lineToRelative(-18.3f, 25.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.8f, 11.2f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 48.0f, 168.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.5f, -3.3f)
                lineToRelative(18.2f, -25.0f)
                arcTo(31.5f, 31.5f, 0.0f, false, true, 80.0f, 160.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 48.0f, 192.0f)
                close()
                moveTo(208.0f, 192.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, true, 9.5f, -22.7f)
                lineTo(201.1f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.8f, -8.0f)
                lineToRelative(-15.6f, -26.8f)
                arcTo(31.5f, 31.5f, 0.0f, false, true, 208.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
