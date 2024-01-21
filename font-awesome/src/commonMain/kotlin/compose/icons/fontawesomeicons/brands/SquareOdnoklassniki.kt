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

public val BrandsGroup.SquareOdnoklassniki: ImageVector
    get() {
        if (_squareOdnoklassniki != null) {
            return _squareOdnoklassniki!!
        }
        _squareOdnoklassniki = Builder(name = "SquareOdnoklassniki", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 137.1f)
                arcToRelative(39.9f, 39.9f, 0.0f, true, false, 0.0f, 79.7f)
                arcToRelative(39.9f, 39.9f, 0.0f, true, false, 0.0f, -79.7f)
                close()
                moveTo(384.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(224.0f, 95.9f)
                arcTo(81.0f, 81.0f, 0.0f, true, true, 224.0f, 258.0f)
                arcToRelative(81.0f, 81.0f, 0.0f, true, true, 0.0f, -162.1f)
                close()
                moveTo(283.3f, 264.2f)
                curveToRelative(16.8f, -13.2f, 29.5f, -5.5f, 34.1f, 3.6f)
                curveToRelative(7.8f, 16.0f, -1.1f, 23.7f, -21.5f, 37.0f)
                curveToRelative(-17.1f, 10.9f, -40.7f, 15.2f, -56.2f, 16.8f)
                lineToRelative(13.0f, 12.9f)
                lineToRelative(47.7f, 47.7f)
                curveToRelative(17.4f, 17.9f, -11.0f, 45.8f, -28.6f, 28.6f)
                curveToRelative(-12.0f, -12.2f, -29.5f, -29.7f, -47.7f, -47.9f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-47.7f, 47.9f)
                curveToRelative(-17.7f, 17.2f, -46.0f, -11.0f, -28.4f, -28.6f)
                curveToRelative(3.7f, -3.7f, 7.9f, -7.9f, 12.5f, -12.5f)
                curveToRelative(10.4f, -10.4f, 22.6f, -22.7f, 35.2f, -35.2f)
                lineToRelative(12.9f, -12.9f)
                curveToRelative(-15.4f, -1.6f, -39.3f, -5.7f, -56.6f, -16.8f)
                curveToRelative(-20.3f, -13.3f, -29.3f, -20.9f, -21.4f, -37.0f)
                curveToRelative(4.6f, -9.1f, 17.3f, -16.8f, 34.1f, -3.6f)
                curveToRelative(0.0f, 0.0f, 22.7f, 18.0f, 59.3f, 18.0f)
                reflectiveCurveToRelative(59.3f, -18.0f, 59.3f, -18.0f)
                close()
            }
        }
        .build()
        return _squareOdnoklassniki!!
    }

private var _squareOdnoklassniki: ImageVector? = null
