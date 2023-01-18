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

public val BoldGroup.PushPin: ImageVector
    get() {
        if (_pushPin != null) {
            return _pushPin!!
        }
        _pushPin = Builder(name = "PushPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.7f, 96.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -5.9f, -14.1f)
                lineTo(174.1f, 21.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -28.2f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-57.1f, 57.0f)
                curveToRelative(-12.4f, -3.3f, -36.7f, -5.7f, -61.7f, 14.5f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -1.6f, 29.7f)
                lineTo(71.0f, 168.0f)
                lineTo(39.5f, 199.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(88.0f, 185.0f)
                lineToRelative(45.4f, 45.3f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 14.1f, 5.9f)
                horizontalLineToRelative(1.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 14.6f, -7.9f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 14.4f, -27.9f)
                curveToRelative(3.4f, -11.7f, 3.5f, -22.9f, 0.2f, -33.4f)
                lineToRelative(56.7f, -56.8f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 240.7f, 96.0f)
                close()
                moveTo(155.5f, 155.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -2.2f, 13.9f)
                curveToRelative(3.4f, 6.8f, 6.9f, 20.9f, -6.3f, 40.6f)
                lineTo(96.5f, 159.5f)
                horizontalLineToRelative(0.0f)
                lineTo(45.7f, 108.7f)
                curveToRelative(21.1f, -14.6f, 39.5f, -6.6f, 41.0f, -5.9f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 13.8f, -2.3f)
                lineTo(160.0f, 41.0f)
                lineToRelative(55.0f, 55.0f)
                close()
            }
        }
        .build()
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
