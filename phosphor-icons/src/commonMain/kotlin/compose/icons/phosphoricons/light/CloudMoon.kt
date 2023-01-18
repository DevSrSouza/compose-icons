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

public val LightGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 74.0f)
                arcToRelative(74.3f, 74.3f, 0.0f, false, false, -14.2f, 1.4f)
                arcTo(69.9f, 69.9f, 0.0f, false, false, 87.7f, 11.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -5.6f, 1.6f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 80.5f, 19.0f)
                arcTo(56.4f, 56.4f, 0.0f, false, true, 82.0f, 32.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 24.0f, 90.0f)
                arcToRelative(56.4f, 56.4f, 0.0f, false, true, -13.0f, -1.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -5.6f, 1.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -1.6f, 5.6f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 33.3f, 45.0f)
                arcTo(49.9f, 49.9f, 0.0f, false, false, 76.0f, 222.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, -148.0f)
                close()
                moveTo(18.2f, 101.8f)
                lineToRelative(5.8f, 0.2f)
                arcTo(70.1f, 70.1f, 0.0f, false, false, 94.0f, 32.0f)
                curveToRelative(0.0f, -1.9f, -0.1f, -3.9f, -0.2f, -5.8f)
                arcTo(57.7f, 57.7f, 0.0f, false, true, 130.0f, 78.7f)
                arcToRelative(74.6f, 74.6f, 0.0f, false, false, -43.7f, 44.4f)
                arcTo(50.7f, 50.7f, 0.0f, false, false, 76.0f, 122.0f)
                arcToRelative(50.1f, 50.1f, 0.0f, false, false, -29.9f, 9.9f)
                arcTo(58.1f, 58.1f, 0.0f, false, true, 18.2f, 101.8f)
                close()
                moveTo(156.0f, 210.0f)
                horizontalLineTo(76.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 0.0f, -76.0f)
                arcToRelative(35.1f, 35.1f, 0.0f, false, true, 7.2f, 0.7f)
                arcTo(73.1f, 73.1f, 0.0f, false, false, 82.0f, 148.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, true, 62.0f, 62.0f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
