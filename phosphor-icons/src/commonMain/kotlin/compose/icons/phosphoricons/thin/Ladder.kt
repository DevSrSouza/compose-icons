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

public val ThinGroup.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.8f, 214.6f)
                lineTo(160.3f, 73.0f)
                lineToRelative(10.5f, -29.0f)
                lineTo(184.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(88.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(98.3f, 44.0f)
                lineTo(36.2f, 214.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.4f, 5.2f)
                lineToRelative(1.4f, 0.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.8f, -2.6f)
                lineTo(54.4f, 188.0f)
                horizontalLineToRelative(55.5f)
                lineToRelative(-9.7f, 26.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.4f, 5.2f)
                lineToRelative(1.4f, 0.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.8f, -2.6f)
                lineTo(127.2f, 164.0f)
                horizontalLineToRelative(57.6f)
                lineToRelative(19.4f, 53.4f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 208.0f, 220.0f)
                lineToRelative(1.4f, -0.2f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 211.8f, 214.6f)
                close()
                moveTo(130.3f, 132.0f)
                lineTo(74.8f, 132.0f)
                lineTo(89.3f, 92.0f)
                horizontalLineToRelative(55.5f)
                close()
                moveTo(162.3f, 44.0f)
                lineTo(147.7f, 84.0f)
                lineTo(92.3f, 84.0f)
                lineToRelative(14.5f, -40.0f)
                close()
                moveTo(57.3f, 180.0f)
                lineToRelative(14.6f, -40.0f)
                horizontalLineToRelative(55.5f)
                lineToRelative(-14.6f, 40.0f)
                close()
                moveTo(130.1f, 156.0f)
                lineTo(156.0f, 84.7f)
                lineTo(181.9f, 156.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
