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

public val BoldGroup.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 51.6f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 127.9f, 236.0f)
                horizontalLineToRelative(0.2f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 204.4f, 51.6f)
                close()
                moveTo(112.8f, 145.9f)
                lineTo(105.0f, 123.8f)
                lineToRelative(15.1f, -17.9f)
                lineToRelative(23.1f, 4.2f)
                lineToRelative(7.8f, 22.1f)
                lineToRelative(-15.1f, 17.9f)
                close()
                moveTo(51.5f, 93.4f)
                lineTo(92.9f, 101.0f)
                lineTo(48.1f, 153.7f)
                arcTo(84.3f, 84.3f, 0.0f, false, true, 51.5f, 93.4f)
                close()
                moveTo(207.9f, 102.3f)
                arcToRelative(84.3f, 84.3f, 0.0f, false, true, -3.4f, 60.3f)
                lineTo(163.1f, 155.0f)
                close()
                moveTo(196.2f, 79.0f)
                lineTo(169.0f, 111.1f)
                lineTo(145.7f, 45.9f)
                arcToRelative(83.0f, 83.0f, 0.0f, false, true, 41.7f, 22.7f)
                arcTo(85.1f, 85.1f, 0.0f, false, true, 196.2f, 79.0f)
                close()
                moveTo(119.7f, 44.4f)
                lineTo(133.8f, 84.0f)
                lineTo(65.7f, 71.6f)
                lineToRelative(2.9f, -3.0f)
                arcTo(83.5f, 83.5f, 0.0f, false, true, 119.7f, 44.4f)
                close()
                moveTo(59.8f, 177.0f)
                lineTo(87.0f, 144.9f)
                lineToRelative(23.3f, 65.2f)
                arcToRelative(83.0f, 83.0f, 0.0f, false, true, -41.7f, -22.7f)
                arcTo(85.1f, 85.1f, 0.0f, false, true, 59.8f, 177.0f)
                close()
                moveTo(136.3f, 211.6f)
                lineTo(122.2f, 172.0f)
                lineToRelative(16.2f, 2.9f)
                horizontalLineToRelative(0.1f)
                lineToRelative(51.8f, 9.5f)
                lineToRelative(-2.9f, 3.0f)
                arcTo(83.5f, 83.5f, 0.0f, false, true, 136.3f, 211.6f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
