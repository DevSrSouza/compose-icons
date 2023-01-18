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

public val LightGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(76.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(180.0f, 98.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 186.0f, 104.0f)
                close()
                moveTo(180.0f, 130.0f)
                lineTo(76.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(180.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(230.0f, 56.0f)
                lineTo(230.0f, 208.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -2.8f, 5.1f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -3.2f, 0.9f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, -2.7f, -0.6f)
                lineTo(192.0f, 198.7f)
                lineToRelative(-29.3f, 14.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -5.4f, 0.0f)
                lineTo(128.0f, 198.7f)
                lineTo(98.7f, 213.4f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -5.4f, 0.0f)
                lineTo(64.0f, 198.7f)
                lineTo(34.7f, 213.4f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -5.9f, -0.3f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 26.0f, 208.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(216.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 56.0f)
                close()
                moveTo(218.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 198.3f)
                lineToRelative(23.3f, -11.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 5.4f, 0.0f)
                lineTo(96.0f, 201.3f)
                lineToRelative(29.3f, -14.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 5.4f, 0.0f)
                lineTo(160.0f, 201.3f)
                lineToRelative(29.3f, -14.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 5.4f, 0.0f)
                lineTo(218.0f, 198.3f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
