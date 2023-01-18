package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) {
            return _lightningSlash!!
        }
        _lightningSlash = Builder(name = "LightningSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.9f, 210.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.5f, 11.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineToRelative(-38.4f, -42.2f)
                lineToRelative(-61.9f, 66.2f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 96.0f, 248.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -3.7f, -0.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.1f, -8.7f)
                lineToRelative(14.6f, -73.3f)
                lineTo(45.2f, 143.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.0f, -5.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 2.0f, -7.3f)
                lineTo(81.3f, 88.6f)
                lineTo(42.1f, 45.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.5f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 0.5f)
                close()
                moveTo(179.8f, 149.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.8f, 2.6f)
                horizontalLineToRelative(0.1f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 5.8f, -2.6f)
                lineToRelative(22.3f, -23.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.0f, -12.9f)
                lineTo(153.2f, 90.9f)
                lineToRelative(14.6f, -73.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.6f, -7.0f)
                lineTo(108.3f, 59.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -0.1f, 10.8f)
                close()
            }
        }
        .build()
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
