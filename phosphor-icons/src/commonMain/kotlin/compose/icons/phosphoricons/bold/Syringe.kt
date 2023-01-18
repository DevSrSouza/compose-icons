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

public val BoldGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.5f, 63.5f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(191.0f, 48.0f)
                lineTo(168.0f, 71.0f)
                lineTo(136.5f, 39.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(123.0f, 60.0f)
                lineTo(41.9f, 141.2f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 36.0f, 155.3f)
                verticalLineTo(203.0f)
                lineTo(15.5f, 223.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(53.0f, 220.0f)
                horizontalLineToRelative(47.7f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 14.1f, -5.9f)
                lineTo(196.0f, 133.0f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(185.0f, 88.0f)
                lineToRelative(23.0f, -23.0f)
                lineToRelative(15.5f, 15.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.5f, 63.5f)
                close()
                moveTo(99.0f, 196.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(157.0f)
                lineToRelative(14.0f, -14.0f)
                lineToRelative(17.5f, 17.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(91.0f, 126.0f)
                lineToRelative(11.0f, -11.0f)
                lineToRelative(17.5f, 17.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(119.0f, 98.0f)
                lineToRelative(21.0f, -21.0f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
