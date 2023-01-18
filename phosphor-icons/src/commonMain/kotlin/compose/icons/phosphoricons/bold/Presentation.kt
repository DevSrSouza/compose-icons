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

public val BoldGroup.Presentation: ImageVector
    get() {
        if (_presentation != null) {
            return _presentation!!
        }
        _presentation = Builder(name = "Presentation", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(140.0f, 36.0f)
                lineTo(140.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 176.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(71.0f, 196.0f)
                lineTo(54.6f, 216.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 1.9f, 16.9f)
                arcTo(12.4f, 12.4f, 0.0f, false, false, 64.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.4f, -4.5f)
                lineTo(101.8f, 196.0f)
                horizontalLineToRelative(52.4f)
                lineToRelative(28.4f, 35.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 236.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 7.5f, -2.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 1.9f, -16.9f)
                lineTo(185.0f, 196.0f)
                horizontalLineToRelative(31.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 172.0f)
                lineTo(44.0f, 172.0f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
            }
        }
        .build()
        return _presentation!!
    }

private var _presentation: ImageVector? = null
