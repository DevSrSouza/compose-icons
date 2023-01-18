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

public val DuotoneGroup.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) {
            return _toteSimple!!
        }
        _toteSimple = Builder(name = "ToteSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.8f, 216.0f)
                horizontalLineTo(47.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -8.0f, -7.1f)
                lineTo(25.0f, 80.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.9f, 72.0f)
                horizontalLineTo(223.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.9f, 8.9f)
                lineToRelative(-14.2f, 128.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 208.8f, 216.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.0f, 69.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 223.1f, 64.0f)
                lineTo(175.3f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -94.6f, 0.0f)
                lineTo(32.9f, 64.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 21.0f, 69.3f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -4.0f, 12.5f)
                lineToRelative(14.3f, 128.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 47.2f, 224.0f)
                lineTo(208.8f, 224.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.9f, -14.2f)
                lineTo(239.0f, 81.8f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 235.0f, 69.3f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 31.0f, 24.0f)
                lineTo(97.0f, 64.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(208.8f, 208.0f)
                lineTo(47.2f, 208.0f)
                lineTo(32.9f, 80.0f)
                lineTo(223.1f, 80.0f)
                close()
            }
        }
        .build()
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
