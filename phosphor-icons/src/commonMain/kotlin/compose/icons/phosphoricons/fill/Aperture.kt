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

public val FillGroup.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 128.0f, 24.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 24.0f, 128.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 128.0f, 232.0f)
                horizontalLineToRelative(0.1f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 232.0f, 128.0f)
                close()
                moveTo(49.2f, 88.9f)
                lineToRelative(51.2f, 9.4f)
                lineTo(46.7f, 161.5f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 49.2f, 88.9f)
                close()
                moveTo(209.3f, 94.5f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -2.5f, 72.6f)
                lineToRelative(-51.2f, -9.4f)
                close()
                moveTo(201.3f, 79.3f)
                lineTo(167.6f, 119.0f)
                lineToRelative(-28.0f, -78.2f)
                arcToRelative(86.8f, 86.8f, 0.0f, false, true, 50.6f, 25.0f)
                arcTo(88.5f, 88.5f, 0.0f, false, true, 201.3f, 79.3f)
                close()
                moveTo(122.4f, 40.2f)
                lineToRelative(17.5f, 49.0f)
                lineTo(58.3f, 74.3f)
                arcToRelative(99.2f, 99.2f, 0.0f, false, true, 7.5f, -8.5f)
                arcTo(87.1f, 87.1f, 0.0f, false, true, 122.4f, 40.2f)
                close()
                moveTo(54.7f, 176.7f)
                lineTo(88.4f, 137.0f)
                lineToRelative(28.0f, 78.2f)
                arcToRelative(86.8f, 86.8f, 0.0f, false, true, -50.6f, -25.0f)
                arcTo(88.5f, 88.5f, 0.0f, false, true, 54.7f, 176.7f)
                close()
                moveTo(133.6f, 215.8f)
                lineTo(116.1f, 166.8f)
                lineTo(139.1f, 171.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(58.5f, 10.7f)
                arcToRelative(99.2f, 99.2f, 0.0f, false, true, -7.5f, 8.5f)
                arcTo(87.1f, 87.1f, 0.0f, false, true, 133.6f, 215.8f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
