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

public val BrandsGroup.Algolia: ImageVector
    get() {
        if (_algolia != null) {
            return _algolia!!
        }
        _algolia = Builder(name = "Algolia", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.3f, 182.6f)
                curveToRelative(-49.3f, 0.0f, -89.2f, 39.9f, -89.2f, 89.2f)
                curveToRelative(0.0f, 49.3f, 39.9f, 89.2f, 89.2f, 89.2f)
                reflectiveCurveToRelative(89.2f, -39.9f, 89.2f, -89.2f)
                curveToRelative(0.0f, -49.3f, -40.0f, -89.2f, -89.2f, -89.2f)
                close()
                moveTo(292.0f, 239.2f)
                lineToRelative(-58.9f, 30.6f)
                curveToRelative(-1.8f, 0.9f, -3.8f, -0.4f, -3.8f, -2.3f)
                lineTo(229.3f, 201.0f)
                curveToRelative(0.0f, -1.5f, 1.3f, -2.7f, 2.7f, -2.6f)
                curveToRelative(26.2f, 1.0f, 48.9f, 15.7f, 61.1f, 37.1f)
                curveToRelative(0.7f, 1.3f, 0.2f, 3.0f, -1.1f, 3.7f)
                close()
                moveTo(389.1f, 32.0f)
                lineTo(58.9f, 32.0f)
                curveTo(26.4f, 32.0f, 0.0f, 58.4f, 0.0f, 90.9f)
                lineTo(0.0f, 421.0f)
                curveToRelative(0.0f, 32.6f, 26.4f, 59.0f, 58.9f, 59.0f)
                lineTo(389.0f, 480.0f)
                curveToRelative(32.6f, 0.0f, 58.9f, -26.4f, 58.9f, -58.9f)
                lineTo(447.9f, 90.9f)
                curveTo(448.0f, 58.4f, 421.6f, 32.0f, 389.1f, 32.0f)
                close()
                moveTo(186.5f, 116.7f)
                curveToRelative(0.0f, -10.8f, 8.7f, -19.5f, 19.5f, -19.5f)
                horizontalLineToRelative(45.3f)
                curveToRelative(10.8f, 0.0f, 19.5f, 8.7f, 19.5f, 19.5f)
                verticalLineToRelative(15.4f)
                curveToRelative(0.0f, 1.8f, -1.7f, 3.0f, -3.3f, 2.5f)
                curveToRelative(-12.3f, -3.4f, -25.1f, -5.1f, -38.1f, -5.1f)
                curveToRelative(-13.5f, 0.0f, -26.7f, 1.8f, -39.4f, 5.5f)
                curveToRelative(-1.7f, 0.5f, -3.4f, -0.8f, -3.4f, -2.5f)
                verticalLineToRelative(-15.8f)
                close()
                moveTo(102.1f, 153.7f)
                lineToRelative(9.2f, -9.2f)
                curveToRelative(7.6f, -7.6f, 19.9f, -7.6f, 27.5f, 0.0f)
                lineToRelative(7.7f, 7.7f)
                curveToRelative(1.1f, 1.1f, 1.0f, 3.0f, -0.3f, 4.0f)
                curveToRelative(-6.2f, 4.5f, -12.1f, 9.4f, -17.6f, 14.9f)
                curveToRelative(-5.4f, 5.4f, -10.4f, 11.3f, -14.8f, 17.4f)
                curveToRelative(-1.0f, 1.3f, -2.9f, 1.5f, -4.0f, 0.3f)
                lineToRelative(-7.7f, -7.7f)
                curveToRelative(-7.6f, -7.5f, -7.6f, -19.8f, 0.0f, -27.4f)
                close()
                moveTo(229.3f, 398.5f)
                curveToRelative(-70.0f, 0.0f, -126.6f, -56.7f, -126.6f, -126.6f)
                reflectiveCurveToRelative(56.7f, -126.6f, 126.6f, -126.6f)
                curveToRelative(70.0f, 0.0f, 126.6f, 56.6f, 126.6f, 126.6f)
                curveToRelative(0.0f, 69.8f, -56.7f, 126.6f, -126.6f, 126.6f)
                close()
            }
        }
        .build()
        return _algolia!!
    }

private var _algolia: ImageVector? = null
