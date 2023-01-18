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

public val LightGroup.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) {
            return _mapTrifold!!
        }
        _mapTrifold = Builder(name = "MapTrifold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.8f, 51.3f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -5.1f, -1.1f)
                lineTo(160.8f, 65.6f)
                lineToRelative(-62.0f, -31.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.6f, -0.3f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.1f, -0.2f, -0.1f)
                lineTo(94.7f, 34.2f)
                lineToRelative(-64.0f, 16.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 26.1f, 56.0f)
                lineTo(26.1f, 200.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.3f, 4.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.7f, 1.3f)
                lineToRelative(1.5f, -0.2f)
                lineToRelative(61.8f, -15.4f)
                lineToRelative(62.0f, 31.0f)
                lineToRelative(0.7f, 0.3f)
                horizontalLineToRelative(0.2f)
                lineToRelative(0.7f, 0.2f)
                horizontalLineToRelative(2.6f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.5f, -5.8f)
                lineTo(230.1f, 56.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 227.8f, 51.3f)
                close()
                moveTo(38.1f, 60.7f)
                lineToRelative(52.0f, -13.0f)
                lineTo(90.1f, 179.3f)
                lineToRelative(-52.0f, 13.0f)
                close()
                moveTo(154.1f, 206.3f)
                lineTo(102.1f, 180.3f)
                lineTo(102.1f, 49.7f)
                lineToRelative(52.0f, 26.0f)
                close()
                moveTo(218.1f, 195.3f)
                lineTo(166.1f, 208.3f)
                lineTo(166.1f, 76.7f)
                lineToRelative(52.0f, -13.0f)
                close()
            }
        }
        .build()
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
