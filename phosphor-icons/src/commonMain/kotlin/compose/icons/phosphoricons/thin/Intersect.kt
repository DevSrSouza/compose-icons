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

public val ThinGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.2f, 84.8f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -86.4f, 86.4f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 86.4f, -86.4f)
                close()
                moveTo(28.0f, 96.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 162.9f, 84.1f)
                lineTo(160.0f, 84.1f)
                arcToRelative(75.2f, 75.2f, 0.0f, false, false, -39.3f, 11.0f)
                lineToRelative(-0.6f, 0.4f)
                arcToRelative(76.7f, 76.7f, 0.0f, false, false, -24.7f, 24.7f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.4f, 0.6f)
                arcTo(75.2f, 75.2f, 0.0f, false, false, 84.0f, 160.0f)
                arcToRelative(27.1f, 27.1f, 0.0f, false, false, 0.1f, 2.9f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 28.0f, 96.0f)
                close()
                moveTo(164.0f, 96.0f)
                arcToRelative(67.2f, 67.2f, 0.0f, false, true, -7.5f, 30.9f)
                lineTo(129.1f, 99.5f)
                arcTo(67.2f, 67.2f, 0.0f, false, true, 160.0f, 92.0f)
                horizontalLineToRelative(3.9f)
                curveTo(164.0f, 93.4f, 164.0f, 94.7f, 164.0f, 96.0f)
                close()
                moveTo(134.0f, 152.4f)
                lineTo(103.6f, 122.0f)
                arcTo(70.0f, 70.0f, 0.0f, false, true, 122.0f, 103.6f)
                lineTo(152.4f, 134.0f)
                arcTo(70.0f, 70.0f, 0.0f, false, true, 134.0f, 152.4f)
                close()
                moveTo(92.0f, 160.0f)
                arcToRelative(67.2f, 67.2f, 0.0f, false, true, 7.5f, -30.9f)
                lineToRelative(27.4f, 27.4f)
                arcTo(67.2f, 67.2f, 0.0f, false, true, 96.0f, 164.0f)
                lineTo(92.1f, 164.0f)
                curveTo(92.0f, 162.6f, 92.0f, 161.3f, 92.0f, 160.0f)
                close()
                moveTo(160.0f, 228.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -66.9f, -56.1f)
                lineTo(96.0f, 171.9f)
                arcToRelative(75.2f, 75.2f, 0.0f, false, false, 39.3f, -11.0f)
                lineToRelative(0.6f, -0.4f)
                arcToRelative(76.7f, 76.7f, 0.0f, false, false, 24.7f, -24.7f)
                lineToRelative(0.4f, -0.6f)
                arcTo(75.2f, 75.2f, 0.0f, false, false, 172.0f, 96.0f)
                arcToRelative(27.1f, 27.1f, 0.0f, false, false, -0.1f, -2.9f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 160.0f, 228.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null
