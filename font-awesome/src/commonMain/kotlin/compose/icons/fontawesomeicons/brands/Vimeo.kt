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

public val BrandsGroup.Vimeo: ImageVector
    get() {
        if (_vimeo != null) {
            return _vimeo!!
        }
        _vimeo = Builder(name = "Vimeo", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.2f, 32.0f)
                horizontalLineTo(44.8f)
                curveTo(20.1f, 32.0f, 0.0f, 52.1f, 0.0f, 76.8f)
                verticalLineToRelative(358.4f)
                curveTo(0.0f, 459.9f, 20.1f, 480.0f, 44.8f, 480.0f)
                horizontalLineToRelative(358.4f)
                curveToRelative(24.7f, 0.0f, 44.8f, -20.1f, 44.8f, -44.8f)
                verticalLineTo(76.8f)
                curveToRelative(0.0f, -24.7f, -20.1f, -44.8f, -44.8f, -44.8f)
                close()
                moveTo(377.0f, 180.8f)
                curveToRelative(-1.4f, 31.5f, -23.4f, 74.7f, -66.0f, 129.4f)
                curveToRelative(-44.0f, 57.2f, -81.3f, 85.8f, -111.7f, 85.8f)
                curveToRelative(-18.9f, 0.0f, -34.8f, -17.4f, -47.9f, -52.3f)
                curveToRelative(-25.5f, -93.3f, -36.4f, -148.0f, -57.4f, -148.0f)
                curveToRelative(-2.4f, 0.0f, -10.9f, 5.1f, -25.4f, 15.2f)
                lineToRelative(-15.2f, -19.6f)
                curveToRelative(37.3f, -32.8f, 72.9f, -69.2f, 95.2f, -71.2f)
                curveToRelative(25.2f, -2.4f, 40.7f, 14.8f, 46.5f, 51.7f)
                curveToRelative(20.7f, 131.2f, 29.9f, 151.0f, 67.6f, 91.6f)
                curveToRelative(13.5f, -21.4f, 20.8f, -37.7f, 21.8f, -48.9f)
                curveToRelative(3.5f, -33.2f, -25.9f, -30.9f, -45.8f, -22.4f)
                curveToRelative(15.9f, -52.1f, 46.3f, -77.4f, 91.2f, -76.0f)
                curveToRelative(33.3f, 0.9f, 49.0f, 22.5f, 47.1f, 64.7f)
                close()
            }
        }
        .build()
        return _vimeo!!
    }

private var _vimeo: ImageVector? = null
