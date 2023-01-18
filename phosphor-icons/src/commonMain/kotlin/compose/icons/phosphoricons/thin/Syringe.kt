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

public val ThinGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 69.2f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineTo(202.3f, 48.0f)
                lineTo(168.0f, 82.3f)
                lineTo(130.8f, 45.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, 5.6f)
                lineToRelative(9.1f, 9.2f)
                lineTo(47.5f, 146.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -3.5f, 8.5f)
                verticalLineToRelative(51.0f)
                lineTo(21.2f, 229.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(49.7f, 212.0f)
                horizontalLineToRelative(51.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.5f, -3.5f)
                lineTo(196.0f, 121.7f)
                lineToRelative(9.2f, 9.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(173.7f, 88.0f)
                lineTo(208.0f, 53.7f)
                lineToRelative(21.2f, 21.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 234.8f, 69.2f)
                close()
                moveTo(103.5f, 202.8f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -2.8f, 1.2f)
                horizontalLineTo(52.0f)
                verticalLineTo(155.3f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 1.2f, -2.8f)
                lineTo(74.0f, 131.7f)
                lineToRelative(23.2f, 23.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(79.7f, 126.0f)
                lineTo(102.0f, 103.7f)
                lineToRelative(23.2f, 23.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(107.7f, 98.0f)
                lineTo(140.0f, 65.7f)
                lineToRelative(25.2f, 25.1f)
                horizontalLineToRelative(0.0f)
                lineTo(190.3f, 116.0f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
