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

public val DuotoneGroup.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) {
            return _mapTrifold!!
        }
        _mapTrifold = Builder(name = "MapTrifold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.1f, 216.0f)
                lineToRelative(-64.0f, -32.0f)
                lineToRelative(0.0f, -144.0f)
                lineToRelative(64.0f, 32.0f)
                lineToRelative(0.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 49.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -6.8f, -1.5f)
                lineTo(161.0f, 63.5f)
                lineTo(99.7f, 32.8f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.8f, -0.3f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.7f, -0.2f)
                horizontalLineToRelative(-0.3f)
                lineToRelative(-0.7f, -0.2f)
                lineTo(94.2f, 32.1f)
                lineToRelative(-64.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.1f, 56.0f)
                lineTo(24.1f, 200.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 3.1f, 6.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.9f, 1.7f)
                lineToRelative(2.0f, -0.2f)
                lineToRelative(61.1f, -15.3f)
                lineToRelative(61.3f, 30.7f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.7f, 0.3f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.8f, 0.3f)
                horizontalLineToRelative(3.9f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, -7.8f)
                lineTo(232.1f, 56.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 229.0f, 49.7f)
                close()
                moveTo(40.1f, 62.2f)
                lineToRelative(48.0f, -12.0f)
                lineTo(88.1f, 177.8f)
                lineToRelative(-48.0f, 12.0f)
                close()
                moveTo(152.1f, 203.1f)
                lineTo(104.1f, 179.1f)
                lineTo(104.1f, 52.9f)
                lineToRelative(48.0f, 24.0f)
                close()
                moveTo(216.1f, 193.8f)
                lineTo(168.1f, 205.8f)
                lineTo(168.1f, 78.2f)
                lineToRelative(48.0f, -12.0f)
                close()
            }
        }
        .build()
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
