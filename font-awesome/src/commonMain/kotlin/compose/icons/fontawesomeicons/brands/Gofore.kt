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

public val BrandsGroup.Gofore: ImageVector
    get() {
        if (_gofore != null) {
            return _gofore!!
        }
        _gofore = Builder(name = "Gofore", defaultWidth = 400.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 400.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(324.0f, 319.8f)
                horizontalLineToRelative(-13.2f)
                verticalLineToRelative(34.7f)
                curveToRelative(-24.5f, 23.1f, -56.3f, 35.8f, -89.9f, 35.8f)
                curveToRelative(-73.2f, 0.0f, -132.4f, -60.2f, -132.4f, -134.4f)
                curveToRelative(0.0f, -74.1f, 59.2f, -134.4f, 132.4f, -134.4f)
                curveToRelative(35.3f, 0.0f, 68.6f, 14.0f, 93.6f, 39.4f)
                lineToRelative(62.3f, -63.3f)
                curveTo(335.0f, 55.3f, 279.7f, 32.0f, 220.7f, 32.0f)
                curveTo(98.0f, 32.0f, 0.0f, 132.6f, 0.0f, 256.0f)
                curveToRelative(0.0f, 122.5f, 97.0f, 224.0f, 220.7f, 224.0f)
                curveToRelative(63.2f, 0.0f, 124.5f, -26.2f, 171.0f, -82.5f)
                curveToRelative(-2.0f, -27.6f, -13.4f, -77.7f, -67.7f, -77.7f)
                close()
                moveTo(311.9f, 207.3f)
                lineTo(205.6f, 207.3f)
                verticalLineToRelative(89.0f)
                lineTo(324.0f, 296.3f)
                curveToRelative(33.5f, 0.0f, 60.5f, 15.1f, 76.0f, 41.8f)
                verticalLineToRelative(-30.6f)
                curveToRelative(0.0f, -65.2f, -40.4f, -100.2f, -88.1f, -100.2f)
                close()
            }
        }
        .build()
        return _gofore!!
    }

private var _gofore: ImageVector? = null
