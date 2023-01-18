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

public val DuotoneGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(61.7f, 204.1f)
                lineTo(16.0f, 128.0f)
                lineTo(61.7f, 51.9f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 68.5f, 48.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(68.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 61.7f, 204.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(68.5f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -13.7f, 7.8f)
                lineTo(9.2f, 123.9f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 0.0f, 8.2f)
                lineToRelative(45.6f, 76.1f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 68.5f, 216.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(61.7f, 204.1f)
                lineToRelative(6.8f, -4.1f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(216.0f, 200.0f)
                horizontalLineTo(68.5f)
                lineTo(25.3f, 128.0f)
                lineTo(68.5f, 56.0f)
                horizontalLineTo(216.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.4f, 157.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 160.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineTo(136.0f, 139.3f)
                lineToRelative(18.4f, 18.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 160.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(147.3f, 128.0f)
                lineToRelative(18.4f, -18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.0f)
                lineTo(136.0f, 116.7f)
                lineTo(117.7f, 98.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 11.4f)
                lineTo(124.7f, 128.0f)
                lineToRelative(-18.3f, 18.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 106.4f, 157.7f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
