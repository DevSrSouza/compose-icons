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

public val BrandsGroup.SquareReddit: ImageVector
    get() {
        if (_squareReddit != null) {
            return _squareReddit!!
        }
        _squareReddit = Builder(name = "SquareReddit", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                close()
                moveTo(305.9f, 166.4f)
                curveToRelative(20.6f, 0.0f, 37.3f, -16.7f, 37.3f, -37.3f)
                reflectiveCurveToRelative(-16.7f, -37.3f, -37.3f, -37.3f)
                curveToRelative(-18.0f, 0.0f, -33.1f, 12.8f, -36.6f, 29.8f)
                curveToRelative(-30.2f, 3.2f, -53.8f, 28.8f, -53.8f, 59.9f)
                lineToRelative(0.0f, 0.2f)
                curveToRelative(-32.8f, 1.4f, -62.8f, 10.7f, -86.6f, 25.5f)
                curveToRelative(-8.8f, -6.8f, -19.9f, -10.9f, -32.0f, -10.9f)
                curveToRelative(-28.9f, 0.0f, -52.3f, 23.4f, -52.3f, 52.3f)
                curveToRelative(0.0f, 21.0f, 12.3f, 39.0f, 30.1f, 47.4f)
                curveToRelative(1.7f, 60.7f, 67.9f, 109.6f, 149.3f, 109.6f)
                reflectiveCurveToRelative(147.6f, -48.9f, 149.3f, -109.7f)
                curveToRelative(17.7f, -8.4f, 29.9f, -26.4f, 29.9f, -47.3f)
                curveToRelative(0.0f, -28.9f, -23.4f, -52.3f, -52.3f, -52.3f)
                curveToRelative(-12.0f, 0.0f, -23.0f, 4.0f, -31.9f, 10.8f)
                curveToRelative(-24.0f, -14.9f, -54.3f, -24.2f, -87.5f, -25.4f)
                lineToRelative(0.0f, -0.1f)
                curveToRelative(0.0f, -22.2f, 16.5f, -40.7f, 37.9f, -43.7f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(3.9f, 16.5f, 18.7f, 28.7f, 36.3f, 28.7f)
                close()
                moveTo(155.0f, 248.1f)
                curveToRelative(14.6f, 0.0f, 25.8f, 15.4f, 25.0f, 34.4f)
                reflectiveCurveToRelative(-11.8f, 25.9f, -26.5f, 25.9f)
                reflectiveCurveToRelative(-27.5f, -7.7f, -26.6f, -26.7f)
                reflectiveCurveToRelative(13.5f, -33.5f, 28.1f, -33.5f)
                close()
                moveTo(321.4f, 281.6f)
                curveToRelative(0.9f, 19.0f, -12.0f, 26.7f, -26.6f, 26.7f)
                reflectiveCurveToRelative(-25.6f, -6.9f, -26.5f, -25.9f)
                curveToRelative(-0.9f, -19.0f, 10.3f, -34.4f, 25.0f, -34.4f)
                reflectiveCurveToRelative(27.3f, 14.6f, 28.1f, 33.5f)
                close()
                moveTo(279.3f, 331.2f)
                curveToRelative(-9.0f, 21.5f, -30.3f, 36.7f, -55.1f, 36.7f)
                reflectiveCurveToRelative(-46.1f, -15.1f, -55.1f, -36.7f)
                curveToRelative(-1.1f, -2.6f, 0.7f, -5.4f, 3.4f, -5.7f)
                curveToRelative(16.1f, -1.6f, 33.5f, -2.5f, 51.7f, -2.5f)
                reflectiveCurveToRelative(35.6f, 0.9f, 51.7f, 2.5f)
                curveToRelative(2.7f, 0.3f, 4.5f, 3.1f, 3.4f, 5.7f)
                close()
            }
        }
        .build()
        return _squareReddit!!
    }

private var _squareReddit: ImageVector? = null
