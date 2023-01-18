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

public val DuotoneGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(227.9f, 152.0f)
                horizontalLineTo(28.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.3f, -11.2f)
                lineToRelative(41.1f, -96.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 69.3f, 40.0f)
                horizontalLineTo(186.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 7.4f, 4.8f)
                lineToRelative(41.1f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 227.9f, 152.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.6f, 137.7f)
                lineToRelative(-41.2f, -96.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 186.7f, 32.0f)
                horizontalLineTo(69.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -14.7f, 9.7f)
                lineToRelative(-41.2f, 96.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 28.1f, 160.0f)
                horizontalLineTo(120.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(19.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 14.7f, -22.3f)
                close()
                moveTo(28.1f, 144.0f)
                lineTo(69.3f, 48.0f)
                horizontalLineTo(186.7f)
                lineToRelative(41.2f, 96.0f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
