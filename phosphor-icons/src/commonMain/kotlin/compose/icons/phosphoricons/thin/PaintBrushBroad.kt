package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) {
            return _paintBrushBroad!!
        }
        _paintBrushBroad = Builder(name = "PaintBrushBroad", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 28.0f)
                horizontalLineTo(72.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 36.0f, 64.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(46.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.0f, 1.4f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 0.9f, 3.2f)
                lineTo(100.0f, 207.4f)
                verticalLineToRelative(0.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                verticalLineToRelative(-0.6f)
                lineToRelative(-6.7f, -46.8f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 0.9f, -3.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.0f, -1.4f)
                horizontalLineTo(200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 28.0f)
                close()
                moveTo(72.0f, 36.0f)
                horizontalLineTo(180.0f)
                verticalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(72.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(64.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 72.0f, 36.0f)
                close()
                moveTo(200.0f, 148.0f)
                horizontalLineTo(153.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -9.0f, 4.1f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -2.9f, 9.6f)
                lineToRelative(6.7f, 46.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineToRelative(6.7f, -46.6f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -2.9f, -9.6f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -9.0f, -4.1f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(116.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 148.0f)
                close()
            }
        }
        .build()
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
