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

public val ThinGroup.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) {
            return _arrowsInCardinal!!
        }
        _arrowsInCardinal = Builder(name = "ArrowsInCardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.1f, 185.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.2f)
                lineTo(132.0f, 169.7f)
                verticalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(169.7f)
                lineToRelative(-21.5f, 21.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.6f, -5.6f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                close()
                moveTo(125.2f, 98.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, -5.6f)
                lineTo(132.0f, 86.3f)
                verticalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(86.3f)
                lineTo(102.5f, 64.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                close()
                moveTo(98.8f, 125.2f)
                lineTo(70.5f, 96.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineTo(86.3f, 124.0f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(86.3f)
                lineTo(64.9f, 153.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, -1.2f)
                lineToRelative(28.3f, -28.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 98.8f, 125.2f)
                close()
                moveTo(232.0f, 124.0f)
                horizontalLineTo(169.7f)
                lineToRelative(21.4f, -21.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, -5.6f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                lineToRelative(28.3f, 28.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(169.7f, 132.0f)
                horizontalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
