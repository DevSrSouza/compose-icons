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

public val DuotoneGroup.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) {
            return _imageSquare!!
        }
        _imageSquare = Builder(name = "ImageSquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 176.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-42.3f, -42.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.4f, 0.0f)
                lineToRelative(-44.6f, 44.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(85.7f, 141.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.4f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 92.0f)
                close()
                moveTo(224.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(176.0f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(48.0f, 156.7f)
                lineTo(68.7f, 136.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.6f, 0.0f)
                lineTo(112.0f, 156.7f)
                lineTo(156.7f, 112.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.6f, 0.0f)
                lineTo(208.0f, 140.7f)
                verticalLineTo(48.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(208.0f, 208.0f)
                verticalLineTo(163.3f)
                lineToRelative(-40.0f, -40.0f)
                lineTo(123.3f, 168.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -22.6f, 0.0f)
                lineTo(80.0f, 147.3f)
                lineToRelative(-32.0f, 32.0f)
                verticalLineTo(208.0f)
                close()
            }
        }
        .build()
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
