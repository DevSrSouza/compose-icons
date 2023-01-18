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

public val LightGroup.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) {
            return _cloudLightning!!
        }
        _cloudLightning = Builder(name = "CloudLightning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 166.0f)
                arcTo(74.0f, 74.0f, 0.0f, true, false, 86.3f, 67.1f)
                arcTo(50.7f, 50.7f, 0.0f, false, false, 76.0f, 66.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, 100.0f)
                horizontalLineToRelative(43.1f)
                lineTo(99.0f, 196.7f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -0.3f, 6.2f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 104.0f, 206.0f)
                horizontalLineToRelative(39.1f)
                lineTo(123.0f, 236.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.7f, 8.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.3f, 1.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.0f, -2.7f)
                lineToRelative(26.3f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.2f, -6.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -5.3f, -3.1f)
                horizontalLineTo(115.1f)
                lineToRelative(18.4f, -28.0f)
                close()
                moveTo(38.0f, 116.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 76.0f, 78.0f)
                arcToRelative(35.1f, 35.1f, 0.0f, false, true, 7.2f, 0.7f)
                arcTo(73.1f, 73.1f, 0.0f, false, false, 82.0f, 92.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, true, 62.0f, 62.0f)
                horizontalLineTo(76.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 38.0f, 116.0f)
                close()
            }
        }
        .build()
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
