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

public val ThinGroup.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) {
            return _arrowBendDoubleUpRight!!
        }
        _arrowBendDoubleUpRight = Builder(name = "ArrowBendDoubleUpRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.8f, 106.8f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(218.3f, 104.0f)
                lineTo(173.2f, 58.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineToRelative(48.0f, 48.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 226.8f, 106.8f)
                close()
                moveTo(178.8f, 101.2f)
                lineTo(130.8f, 53.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, 5.6f)
                lineTo(166.3f, 100.0f)
                lineTo(128.0f, 100.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 28.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, 92.0f, -92.0f)
                horizontalLineToRelative(38.3f)
                lineToRelative(-41.1f, 41.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 178.8f, 101.2f)
                close()
            }
        }
        .build()
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
