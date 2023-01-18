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

public val LightGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 67.8f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineTo(199.5f, 48.0f)
                lineTo(168.0f, 79.5f)
                lineTo(132.2f, 43.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineToRelative(7.7f, 7.8f)
                lineTo(46.1f, 145.4f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, -4.1f, 9.9f)
                verticalLineToRelative(50.2f)
                lineTo(19.8f, 227.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineTo(50.5f, 214.0f)
                horizontalLineToRelative(50.2f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 9.9f, -4.1f)
                lineTo(196.0f, 124.5f)
                lineToRelative(7.8f, 7.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                lineTo(176.5f, 88.0f)
                lineTo(208.0f, 56.5f)
                lineToRelative(19.8f, 19.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                close()
                moveTo(102.1f, 201.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, 0.6f)
                horizontalLineTo(54.0f)
                verticalLineTo(155.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.6f, -1.4f)
                lineTo(74.0f, 134.5f)
                lineToRelative(21.8f, 21.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                lineTo(82.5f, 126.0f)
                lineTo(102.0f, 106.5f)
                lineToRelative(21.8f, 21.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                lineTo(110.5f, 98.0f)
                lineTo(140.0f, 68.5f)
                lineTo(187.5f, 116.0f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
