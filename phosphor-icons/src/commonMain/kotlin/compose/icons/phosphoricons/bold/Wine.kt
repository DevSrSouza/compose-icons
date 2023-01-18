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

public val BoldGroup.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.6f, 108.9f)
                lineTo(187.5f, 20.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 12.0f)
                lineTo(80.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.5f, 8.6f)
                lineTo(42.4f, 108.9f)
                arcToRelative(36.5f, 36.5f, 0.0f, false, false, 1.7f, 25.0f)
                arcTo(92.4f, 92.4f, 0.0f, false, false, 116.0f, 187.2f)
                lineTo(116.0f, 220.0f)
                lineTo(88.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 220.0f)
                lineTo(140.0f, 187.2f)
                arcToRelative(92.4f, 92.4f, 0.0f, false, false, 71.9f, -53.3f)
                arcTo(36.5f, 36.5f, 0.0f, false, false, 213.6f, 108.9f)
                close()
                moveTo(89.0f, 36.0f)
                horizontalLineToRelative(78.0f)
                lineToRelative(18.9f, 64.1f)
                curveToRelative(-10.6f, 3.5f, -28.4f, 5.2f, -52.5f, -6.8f)
                reflectiveCurveToRelative(-43.2f, -13.4f, -58.0f, -11.2f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, -62.0f, -40.0f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -0.5f, -8.3f)
                lineToRelative(2.0f, -6.8f)
                curveToRelative(10.6f, -4.3f, 29.2f, -7.1f, 55.1f, 5.8f)
                curveToRelative(17.9f, 9.0f, 33.5f, 12.0f, 46.5f, 12.0f)
                arcToRelative(78.9f, 78.9f, 0.0f, false, false, 20.9f, -2.8f)
                horizontalLineToRelative(0.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
