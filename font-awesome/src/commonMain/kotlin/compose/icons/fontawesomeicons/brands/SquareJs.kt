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

public val BrandsGroup.SquareJs: ImageVector
    get() {
        if (_squareJs != null) {
            return _squareJs!!
        }
        _squareJs = Builder(name = "SquareJs", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                close()
                moveTo(180.9f, 444.9f)
                curveToRelative(-33.7f, 0.0f, -53.2f, -17.4f, -63.2f, -38.5f)
                lineTo(152.0f, 385.7f)
                curveToRelative(6.6f, 11.7f, 12.6f, 21.6f, 27.1f, 21.6f)
                curveToRelative(13.8f, 0.0f, 22.6f, -5.4f, 22.6f, -26.5f)
                lineTo(201.7f, 237.7f)
                horizontalLineToRelative(42.1f)
                lineTo(243.8f, 381.4f)
                curveToRelative(0.0f, 43.6f, -25.6f, 63.5f, -62.9f, 63.5f)
                close()
                moveTo(266.7f, 401.9f)
                lineTo(301.0f, 382.1f)
                curveToRelative(9.0f, 14.7f, 20.8f, 25.6f, 41.5f, 25.6f)
                curveToRelative(17.4f, 0.0f, 28.6f, -8.7f, 28.6f, -20.8f)
                curveToRelative(0.0f, -14.4f, -11.4f, -19.5f, -30.7f, -28.0f)
                lineToRelative(-10.5f, -4.5f)
                curveToRelative(-30.4f, -12.9f, -50.5f, -29.2f, -50.5f, -63.5f)
                curveToRelative(0.0f, -31.6f, 24.1f, -55.6f, 61.6f, -55.6f)
                curveToRelative(26.8f, 0.0f, 46.0f, 9.3f, 59.8f, 33.7f)
                lineTo(368.0f, 290.0f)
                curveToRelative(-7.2f, -12.9f, -15.0f, -18.0f, -27.1f, -18.0f)
                curveToRelative(-12.3f, 0.0f, -20.1f, 7.8f, -20.1f, 18.0f)
                curveToRelative(0.0f, 12.6f, 7.8f, 17.7f, 25.9f, 25.6f)
                lineToRelative(10.5f, 4.5f)
                curveToRelative(35.8f, 15.3f, 55.9f, 31.0f, 55.9f, 66.2f)
                curveToRelative(0.0f, 37.8f, -29.8f, 58.6f, -69.7f, 58.6f)
                curveToRelative(-39.1f, 0.0f, -64.4f, -18.6f, -76.7f, -43.0f)
                close()
            }
        }
        .build()
        return _squareJs!!
    }

private var _squareJs: ImageVector? = null
