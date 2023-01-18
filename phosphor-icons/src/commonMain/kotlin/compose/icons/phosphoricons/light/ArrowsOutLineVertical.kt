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

public val LightGroup.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) {
            return _arrowsOutLineVertical!!
        }
        _arrowsOutLineVertical = Builder(name = "ArrowsOutLineVertical", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 122.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 128.0f)
                close()
                moveTo(100.2f, 52.2f)
                lineTo(122.0f, 30.5f)
                lineTo(122.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 30.5f)
                lineToRelative(21.8f, 21.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, 8.4f)
                close()
                moveTo(155.8f, 203.8f)
                lineTo(134.0f, 225.5f)
                lineTo(134.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(65.5f)
                lineToRelative(-21.8f, -21.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 8.4f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                close()
            }
        }
        .build()
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
