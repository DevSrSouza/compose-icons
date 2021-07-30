package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Tumblr: ImageVector
    get() {
        if (_tumblr != null) {
            return _tumblr!!
        }
        _tumblr = Builder(name = "Tumblr", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.8f, 480.3f)
                curveToRelative(-13.6f, 14.5f, -50.0f, 31.7f, -97.4f, 31.7f)
                curveToRelative(-120.8f, 0.0f, -147.0f, -88.8f, -147.0f, -140.6f)
                verticalLineToRelative(-144.0f)
                horizontalLineTo(17.9f)
                curveToRelative(-5.5f, 0.0f, -10.0f, -4.5f, -10.0f, -10.0f)
                verticalLineToRelative(-68.0f)
                curveToRelative(0.0f, -7.2f, 4.5f, -13.6f, 11.3f, -16.0f)
                curveToRelative(62.0f, -21.8f, 81.5f, -76.0f, 84.3f, -117.1f)
                curveToRelative(0.8f, -11.0f, 6.5f, -16.3f, 16.1f, -16.3f)
                horizontalLineToRelative(70.9f)
                curveToRelative(5.5f, 0.0f, 10.0f, 4.5f, 10.0f, 10.0f)
                verticalLineToRelative(115.2f)
                horizontalLineToRelative(83.0f)
                curveToRelative(5.5f, 0.0f, 10.0f, 4.4f, 10.0f, 9.9f)
                verticalLineToRelative(81.7f)
                curveToRelative(0.0f, 5.5f, -4.5f, 10.0f, -10.0f, 10.0f)
                horizontalLineToRelative(-83.4f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, 34.2f, 23.7f, 53.6f, 68.0f, 35.8f)
                curveToRelative(4.8f, -1.9f, 9.0f, -3.2f, 12.7f, -2.2f)
                curveToRelative(3.5f, 0.9f, 5.8f, 3.4f, 7.4f, 7.9f)
                lineToRelative(22.0f, 64.3f)
                curveToRelative(1.8f, 5.0f, 3.3f, 10.6f, -0.4f, 14.5f)
                close()
            }
        }
        .build()
        return _tumblr!!
    }

private var _tumblr: ImageVector? = null
