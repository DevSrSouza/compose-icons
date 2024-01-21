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

public val BrandsGroup.SquareTwitter: ImageVector
    get() {
        if (_squareTwitter != null) {
            return _squareTwitter!!
        }
        _squareTwitter = Builder(name = "SquareTwitter", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(351.3f, 199.3f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 86.7f, -66.0f, 186.6f, -186.6f, 186.6f)
                curveToRelative(-37.2f, 0.0f, -71.7f, -10.8f, -100.7f, -29.4f)
                curveToRelative(5.3f, 0.6f, 10.4f, 0.8f, 15.8f, 0.8f)
                curveToRelative(30.7f, 0.0f, 58.9f, -10.4f, 81.4f, -28.0f)
                curveToRelative(-28.8f, -0.6f, -53.0f, -19.5f, -61.3f, -45.5f)
                curveToRelative(10.1f, 1.5f, 19.2f, 1.5f, 29.6f, -1.2f)
                curveToRelative(-30.0f, -6.1f, -52.5f, -32.5f, -52.5f, -64.4f)
                verticalLineToRelative(-0.8f)
                curveToRelative(8.7f, 4.9f, 18.9f, 7.9f, 29.6f, 8.3f)
                curveToRelative(-9.0f, -6.0f, -16.4f, -14.1f, -21.5f, -23.6f)
                reflectiveCurveToRelative(-7.8f, -20.2f, -7.7f, -31.0f)
                curveToRelative(0.0f, -12.2f, 3.2f, -23.4f, 8.9f, -33.1f)
                curveToRelative(32.3f, 39.8f, 80.8f, 65.8f, 135.2f, 68.6f)
                curveToRelative(-9.3f, -44.5f, 24.0f, -80.6f, 64.0f, -80.6f)
                curveToRelative(18.9f, 0.0f, 35.9f, 7.9f, 47.9f, 20.7f)
                curveToRelative(14.8f, -2.8f, 29.0f, -8.3f, 41.6f, -15.8f)
                curveToRelative(-4.9f, 15.2f, -15.2f, 28.0f, -28.8f, 36.1f)
                curveToRelative(13.2f, -1.4f, 26.0f, -5.1f, 37.8f, -10.2f)
                curveToRelative(-8.9f, 13.1f, -20.1f, 24.7f, -32.9f, 34.0f)
                curveToRelative(0.2f, 2.8f, 0.2f, 5.7f, 0.2f, 8.5f)
                close()
            }
        }
        .build()
        return _squareTwitter!!
    }

private var _squareTwitter: ImageVector? = null
