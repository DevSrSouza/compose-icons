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

public val DuotoneGroup.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) {
            return _filmStrip!!
        }
        _filmStrip = Builder(name = "FilmStrip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 176.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 80.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(40.0f, 88.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(80.0f)
                lineTo(40.0f, 168.0f)
                close()
                moveTo(136.0f, 72.0f)
                lineTo(136.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                lineTo(168.0f, 72.0f)
                close()
                moveTo(120.0f, 72.0f)
                lineTo(88.0f, 72.0f)
                lineTo(88.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(120.0f, 184.0f)
                verticalLineToRelative(16.0f)
                lineTo(88.0f, 200.0f)
                lineTo(88.0f, 184.0f)
                close()
                moveTo(136.0f, 184.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                lineTo(136.0f, 200.0f)
                close()
                moveTo(136.0f, 168.0f)
                lineTo(136.0f, 88.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(80.0f)
                close()
                moveTo(216.0f, 72.0f)
                lineTo(184.0f, 72.0f)
                lineTo(184.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(72.0f, 56.0f)
                lineTo(72.0f, 72.0f)
                lineTo(40.0f, 72.0f)
                lineTo(40.0f, 56.0f)
                close()
                moveTo(40.0f, 184.0f)
                lineTo(72.0f, 184.0f)
                verticalLineToRelative(16.0f)
                lineTo(40.0f, 200.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(184.0f, 200.0f)
                lineTo(184.0f, 184.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null
