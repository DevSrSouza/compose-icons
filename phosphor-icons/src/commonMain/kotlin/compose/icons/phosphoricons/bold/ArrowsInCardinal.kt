package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) {
            return _arrowsInCardinal!!
        }
        _arrowsInCardinal = Builder(name = "ArrowsInCardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.8f, 179.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -3.5f)
                lineTo(140.0f, 189.0f)
                verticalLineToRelative(43.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 189.0f)
                lineToRelative(-7.8f, 7.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                close()
                moveTo(119.5f, 104.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(140.0f, 67.0f)
                lineTo(140.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 67.0f)
                lineToRelative(-7.8f, -7.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                close()
                moveTo(104.5f, 119.5f)
                lineTo(76.2f, 91.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(67.0f, 116.0f)
                lineTo(24.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(67.0f, 140.0f)
                lineToRelative(-7.8f, 7.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(28.3f, -28.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.5f, 119.5f)
                close()
                moveTo(232.0f, 116.0f)
                lineTo(189.0f, 116.0f)
                lineToRelative(7.8f, -7.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(28.3f, 28.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, 3.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.5f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(189.0f, 140.0f)
                horizontalLineToRelative(43.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
