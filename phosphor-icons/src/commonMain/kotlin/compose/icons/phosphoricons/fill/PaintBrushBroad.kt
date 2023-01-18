package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) {
            return _paintBrushBroad!!
        }
        _paintBrushBroad = Builder(name = "PaintBrushBroad", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 24.0f)
                lineTo(72.0f, 24.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 32.0f, 64.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(46.8f)
                lineToRelative(-6.7f, 46.9f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 96.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -0.1f, -1.1f)
                lineTo(153.2f, 160.0f)
                lineTo(200.0f, 160.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(224.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 24.0f)
                close()
                moveTo(208.0f, 104.0f)
                lineTo(48.0f, 104.0f)
                lineTo(48.0f, 64.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 72.0f, 40.0f)
                lineTo(176.0f, 40.0f)
                lineTo(176.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(192.0f, 40.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
