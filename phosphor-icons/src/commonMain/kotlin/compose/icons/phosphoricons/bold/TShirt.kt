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

public val BoldGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(name = "TShirt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.5f, 58.2f)
                lineTo(198.3f, 29.8f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.7f, -0.4f)
                lineToRelative(-0.4f, -0.2f)
                lineToRelative(-0.7f, -0.3f)
                lineToRelative(-0.4f, -0.2f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.6f, -0.2f)
                lineTo(160.0f, 28.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 28.0f)
                lineTo(61.3f, 28.0f)
                lineToRelative(-0.6f, 0.2f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-0.6f, 0.2f)
                lineToRelative(-0.6f, 0.3f)
                lineToRelative(-0.4f, 0.2f)
                lineToRelative(-0.7f, 0.4f)
                horizontalLineToRelative(-0.2f)
                lineTo(11.5f, 58.2f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 3.6f, 82.9f)
                lineToRelative(15.3f, 36.8f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 37.3f, 132.0f)
                lineTo(52.0f, 132.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(184.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(204.0f, 132.0f)
                horizontalLineToRelative(14.7f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 18.4f, -12.3f)
                lineToRelative(15.3f, -36.8f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 244.5f, 58.2f)
                close()
                moveTo(40.0f, 108.0f)
                lineTo(27.0f, 76.8f)
                lineTo(52.0f, 61.5f)
                lineTo(52.0f, 108.0f)
                close()
                moveTo(180.0f, 204.0f)
                lineTo(76.0f, 204.0f)
                lineTo(76.0f, 52.0f)
                horizontalLineToRelative(9.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 84.6f, 0.0f)
                lineTo(180.0f, 52.0f)
                close()
                moveTo(216.0f, 108.0f)
                lineTo(204.0f, 108.0f)
                lineTo(204.0f, 61.5f)
                lineToRelative(25.0f, 15.3f)
                close()
            }
        }
        .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
