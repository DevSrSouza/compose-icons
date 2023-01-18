package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) {
            return _paintBrushBroad!!
        }
        _paintBrushBroad = Builder(name = "PaintBrushBroad", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 26.0f)
                horizontalLineTo(72.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 34.0f, 64.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(46.8f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.5f, 0.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.5f, 1.6f)
                lineToRelative(-6.7f, 46.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.1f, 0.8f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.1f, -0.8f)
                lineToRelative(-6.7f, -46.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.5f, -1.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.5f, -0.7f)
                horizontalLineTo(200.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineTo(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 26.0f)
                close()
                moveTo(72.0f, 38.0f)
                horizontalLineTo(178.0f)
                verticalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(38.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(68.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(64.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 72.0f, 38.0f)
                close()
                moveTo(200.0f, 146.0f)
                horizontalLineTo(153.2f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -10.6f, 4.8f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, -3.2f, 11.2f)
                lineToRelative(6.6f, 46.4f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineToRelative(6.6f, -46.4f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, -3.2f, -11.2f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -10.6f, -4.8f)
                horizontalLineTo(56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                verticalLineTo(118.0f)
                horizontalLineTo(210.0f)
                verticalLineToRelative(18.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 200.0f, 146.0f)
                close()
            }
        }
        .build()
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
