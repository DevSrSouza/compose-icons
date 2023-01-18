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

public val LightGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.5f, 68.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.5f, -3.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -4.8f, 0.2f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -1.5f, 1.2f)
                lineTo(175.0f, 106.5f)
                lineToRelative(-21.2f, -4.3f)
                lineTo(149.5f, 81.0f)
                lineToRelative(39.7f, -39.7f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, 1.2f, -1.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.2f, -4.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.3f, -3.5f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, -90.8f, 94.0f)
                lineToRelative(-61.4f, 53.0f)
                lineToRelative(-0.3f, 0.3f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.4f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 42.4f, 0.0f)
                lineToRelative(0.3f, -0.3f)
                lineToRelative(53.0f, -61.4f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 94.0f, -90.8f)
                close()
                moveTo(201.0f, 137.0f)
                arcToRelative(58.3f, 58.3f, 0.0f, false, true, -68.9f, 9.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.6f, 1.2f)
                lineTo(68.6f, 212.9f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.5f, -25.5f)
                lineToRelative(64.8f, -55.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.3f, -7.5f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 64.7f, -84.3f)
                lineTo(138.8f, 74.8f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -1.7f, 5.4f)
                lineToRelative(5.7f, 28.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.7f, 4.7f)
                lineToRelative(28.3f, 5.7f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 5.4f, -1.7f)
                lineToRelative(35.1f, -35.1f)
                arcTo(57.6f, 57.6f, 0.0f, false, true, 201.0f, 137.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
