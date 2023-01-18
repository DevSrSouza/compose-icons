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

public val ThinGroup.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) {
            return _arrowsOutCardinal!!
        }
        _arrowsOutCardinal = Builder(name = "ArrowsOutCardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.1f, 200.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(96.9f, 206.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, -5.6f)
                lineTo(124.0f, 222.3f)
                lineTo(124.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(62.3f)
                lineToRelative(21.5f, -21.4f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 159.1f, 200.9f)
                close()
                moveTo(102.5f, 55.1f)
                lineTo(124.0f, 33.7f)
                lineTo(124.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 33.7f)
                lineToRelative(21.5f, 21.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(130.8f, 21.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineTo(96.9f, 49.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.6f, 5.6f)
                close()
                moveTo(33.7f, 132.0f)
                lineTo(96.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(33.7f, 124.0f)
                lineToRelative(21.4f, -21.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, -5.6f)
                lineTo(21.2f, 125.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                lineToRelative(28.3f, 28.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                close()
                moveTo(234.8f, 125.2f)
                lineTo(206.5f, 96.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, 5.6f)
                lineTo(222.3f, 124.0f)
                lineTo(160.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(62.3f)
                lineToRelative(-21.4f, 21.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, -1.2f)
                lineToRelative(28.3f, -28.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 234.8f, 125.2f)
                close()
            }
        }
        .build()
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
