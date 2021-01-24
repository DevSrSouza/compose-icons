package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.ViadeoSquare: ImageVector
    get() {
        if (_viadeoSquare != null) {
            return _viadeoSquare!!
        }
        _viadeoSquare = Builder(name = "ViadeoSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                horizontalLineTo(48.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(280.7f, 381.2f)
                curveToRelative(-42.4f, 46.2f, -120.0f, 46.6f, -162.4f, 0.0f)
                curveToRelative(-68.0f, -73.6f, -19.8f, -196.1f, 81.2f, -196.1f)
                curveToRelative(13.3f, 0.0f, 26.6f, 2.1f, 39.1f, 6.7f)
                curveToRelative(-4.3f, 8.4f, -7.3f, 17.6f, -8.4f, 27.1f)
                curveToRelative(-9.7f, -4.1f, -20.2f, -6.0f, -30.7f, -6.0f)
                curveToRelative(-48.8f, 0.0f, -84.6f, 41.7f, -84.6f, 88.9f)
                curveToRelative(0.0f, 43.0f, 28.5f, 78.7f, 69.5f, 85.9f)
                curveToRelative(61.5f, -24.0f, 72.9f, -117.6f, 72.9f, -175.0f)
                curveToRelative(0.0f, -7.3f, 0.0f, -14.8f, -0.6f, -22.1f)
                curveToRelative(-11.2f, -32.9f, -26.6f, -64.6f, -44.2f, -94.5f)
                curveToRelative(27.1f, 18.3f, 41.9f, 62.5f, 44.2f, 94.1f)
                verticalLineToRelative(0.4f)
                curveToRelative(7.7f, 22.5f, 11.8f, 46.2f, 11.8f, 70.0f)
                curveToRelative(0.0f, 54.1f, -21.9f, 99.0f, -68.3f, 128.2f)
                lineToRelative(-2.4f, 0.2f)
                curveToRelative(50.0f, 1.0f, 86.2f, -38.6f, 86.2f, -87.2f)
                curveToRelative(0.0f, -12.2f, -2.1f, -24.3f, -6.9f, -35.7f)
                curveToRelative(9.5f, -1.9f, 18.5f, -5.6f, 26.4f, -10.5f)
                curveToRelative(15.3f, 36.6f, 12.6f, 87.3f, -22.8f, 125.6f)
                close()
                moveTo(309.0f, 233.7f)
                curveToRelative(-13.3f, 0.0f, -25.1f, -7.1f, -34.4f, -16.1f)
                curveToRelative(21.9f, -12.0f, 49.6f, -30.7f, 62.3f, -53.0f)
                curveToRelative(1.5f, -3.0f, 4.1f, -8.6f, 4.5f, -12.0f)
                curveToRelative(-12.5f, 27.9f, -44.2f, 49.8f, -73.9f, 56.7f)
                curveToRelative(-4.7f, -7.3f, -7.5f, -15.5f, -7.5f, -24.3f)
                curveToRelative(0.0f, -10.3f, 5.2f, -24.1f, 12.9f, -31.6f)
                curveToRelative(21.6f, -20.5f, 53.0f, -8.5f, 72.4f, -50.0f)
                curveToRelative(32.5f, 46.2f, 13.1f, 130.3f, -36.3f, 130.3f)
                close()
            }
        }
        .build()
        return _viadeoSquare!!
    }

private var _viadeoSquare: ImageVector? = null
