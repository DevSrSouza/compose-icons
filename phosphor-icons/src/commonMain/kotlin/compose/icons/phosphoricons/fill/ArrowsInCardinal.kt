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

public val FillGroup.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) {
            return _arrowsInCardinal!!
        }
        _arrowsInCardinal = Builder(name = "ArrowsInCardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.9f, 182.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, 13.7f)
                lineTo(136.0f, 196.3f)
                lineTo(136.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 196.3f)
                lineTo(99.7f, 196.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, -13.7f)
                lineToRelative(28.2f, -28.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                close()
                moveTo(122.3f, 101.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(28.2f, -28.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.6f, -13.7f)
                lineTo(136.0f, 59.7f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 59.7f)
                lineTo(99.7f, 59.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.6f, 13.7f)
                close()
                moveTo(101.7f, 122.3f)
                lineTo(73.4f, 94.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.7f, 5.6f)
                lineTo(59.7f, 120.0f)
                lineTo(24.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(59.7f, 136.0f)
                verticalLineToRelative(20.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.0f, 7.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 3.0f, 0.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, -2.4f)
                lineToRelative(28.3f, -28.2f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 101.7f, 122.3f)
                close()
                moveTo(232.0f, 120.0f)
                lineTo(196.3f, 120.0f)
                lineTo(196.3f, 99.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.7f, -5.6f)
                lineToRelative(-28.3f, 28.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                lineToRelative(28.3f, 28.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, 2.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 3.0f, -0.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.0f, -7.4f)
                lineTo(196.3f, 136.0f)
                lineTo(232.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
