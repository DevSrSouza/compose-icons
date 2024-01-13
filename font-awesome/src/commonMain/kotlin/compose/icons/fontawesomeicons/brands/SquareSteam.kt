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

public val BrandsGroup.SquareSteam: ImageVector
    get() {
        if (_squareSteam != null) {
            return _squareSteam!!
        }
        _squareSteam = Builder(name = "SquareSteam", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.6f, 309.1f)
                curveToRelative(18.6f, 7.7f, 27.3f, 28.9f, 19.6f, 47.4f)
                reflectiveCurveToRelative(-29.0f, 27.2f, -47.6f, 19.4f)
                lineToRelative(-28.5f, -11.8f)
                curveToRelative(5.0f, 10.6f, 13.8f, 19.4f, 25.4f, 24.2f)
                curveToRelative(25.2f, 10.5f, 54.1f, -1.4f, 64.6f, -26.5f)
                curveToRelative(5.1f, -12.1f, 5.1f, -25.5f, 0.1f, -37.7f)
                curveToRelative(-5.1f, -12.1f, -14.5f, -21.6f, -26.7f, -26.7f)
                curveToRelative(-12.1f, -5.0f, -25.0f, -4.8f, -36.4f, -0.5f)
                lineToRelative(29.5f, 12.2f)
                close()
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 240.7f)
                lineToRelative(116.6f, 48.1f)
                curveToRelative(12.0f, -8.2f, 26.2f, -12.1f, 40.7f, -11.3f)
                lineToRelative(55.4f, -80.2f)
                verticalLineToRelative(-1.1f)
                curveToRelative(0.0f, -48.2f, 39.3f, -87.5f, 87.6f, -87.5f)
                reflectiveCurveToRelative(87.6f, 39.3f, 87.6f, 87.5f)
                curveToRelative(0.0f, 49.2f, -40.9f, 88.7f, -89.6f, 87.5f)
                lineToRelative(-79.0f, 56.3f)
                curveToRelative(1.6f, 38.5f, -29.1f, 68.8f, -65.7f, 68.8f)
                curveToRelative(-31.8f, 0.0f, -58.5f, -22.7f, -64.5f, -52.7f)
                lineTo(0.0f, 319.2f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                close()
                moveTo(241.9f, 196.2f)
                arcToRelative(58.4f, 58.4f, 0.0f, true, false, 116.8f, 0.0f)
                arcToRelative(58.4f, 58.4f, 0.0f, true, false, -116.8f, 0.0f)
                close()
                moveTo(256.5f, 196.1f)
                arcToRelative(43.9f, 43.9f, 0.0f, true, true, 87.8f, 0.0f)
                arcToRelative(43.9f, 43.9f, 0.0f, true, true, -87.8f, 0.0f)
                close()
            }
        }
        .build()
        return _squareSteam!!
    }

private var _squareSteam: ImageVector? = null
