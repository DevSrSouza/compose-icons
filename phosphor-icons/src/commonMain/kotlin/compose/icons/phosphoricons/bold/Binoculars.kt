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

public val BoldGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 150.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(61.4f, 61.4f, 0.0f, false, false, -2.5f, -5.9f)
                lineTo(196.9f, 50.2f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, -2.5f, -3.7f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -50.9f, 0.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 140.0f, 55.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(55.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -3.5f, -8.5f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -50.9f, 0.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, -2.5f, 3.7f)
                lineTo(17.5f, 144.7f)
                arcToRelative(61.4f, 61.4f, 0.0f, false, false, -2.5f, 5.9f)
                horizontalLineToRelative(0.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 116.0f, 168.0f)
                verticalLineTo(104.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 101.0f, -17.3f)
                close()
                moveTo(80.0f, 62.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 12.0f, -1.2f)
                verticalLineToRelative(63.1f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -35.9f, -7.6f)
                close()
                moveTo(64.0f, 196.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, 1.6f, -9.3f)
                lineToRelative(1.7f, -3.8f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 64.0f, 196.0f)
                close()
                moveTo(164.0f, 61.1f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 12.0f, 1.2f)
                lineToRelative(23.9f, 54.3f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -35.9f, 7.6f)
                close()
                moveTo(192.0f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 24.7f, -41.1f)
                lineToRelative(1.7f, 3.8f)
                arcTo(28.4f, 28.4f, 0.0f, false, true, 220.0f, 168.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 192.0f, 196.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
