package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 240.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.5f, -3.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.1f, -7.2f)
                lineToRelative(10.9f, -32.7f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 20.0f, 140.0f)
                curveToRelative(0.0f, -23.9f, 17.7f, -52.0f, 52.6f, -83.4f)
                arcToRelative(420.5f, 420.5f, 0.0f, false, true, 51.1f, -39.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 8.6f, 0.0f)
                arcToRelative(420.5f, 420.5f, 0.0f, false, true, 51.1f, 39.3f)
                curveTo(218.3f, 88.0f, 236.0f, 116.1f, 236.0f, 140.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -79.3f, 56.8f)
                lineToRelative(10.9f, 32.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.1f, 7.2f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 160.0f, 240.0f)
                close()
                moveTo(107.1f, 224.0f)
                horizontalLineToRelative(41.8f)
                lineTo(135.0f, 182.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 3.1f, -9.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.7f, 0.4f)
                arcTo(43.6f, 43.6f, 0.0f, false, false, 176.0f, 184.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, -44.0f)
                curveToRelative(0.0f, -37.1f, -62.8f, -86.8f, -92.0f, -106.4f)
                curveTo(98.8f, 53.2f, 36.0f, 102.9f, 36.0f, 140.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, 44.0f)
                arcToRelative(43.6f, 43.6f, 0.0f, false, false, 28.2f, -10.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 12.8f, 8.7f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
