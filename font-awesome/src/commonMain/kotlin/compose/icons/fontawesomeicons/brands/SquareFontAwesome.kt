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

public val BrandsGroup.SquareFontAwesome: ImageVector
    get() {
        if (_squareFontAwesome != null) {
            return _squareFontAwesome!!
        }
        _squareFontAwesome = Builder(name = "SquareFontAwesome", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.5f, 32.5f)
                horizontalLineToRelative(-320.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineToRelative(-320.0f)
                curveTo(448.5f, 61.2f, 419.8f, 32.5f, 384.5f, 32.5f)
                close()
                moveTo(336.5f, 312.5f)
                curveToRelative(-31.6f, 11.2f, -41.2f, 16.0f, -59.8f, 16.0f)
                curveToRelative(-31.4f, 0.0f, -43.2f, -16.0f, -74.6f, -16.0f)
                curveToRelative(-10.2f, 0.0f, -18.2f, 1.6f, -25.6f, 4.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(7.4f, -2.2f, 15.4f, -4.0f, 25.6f, -4.0f)
                curveToRelative(31.2f, 0.0f, 43.2f, 16.0f, 74.6f, 16.0f)
                curveToRelative(10.2f, 0.0f, 17.8f, -1.4f, 27.8f, -4.6f)
                verticalLineToRelative(-96.0f)
                curveToRelative(-10.0f, 3.2f, -17.6f, 4.6f, -27.8f, 4.6f)
                curveToRelative(-31.4f, 0.0f, -43.2f, -16.0f, -74.6f, -16.0f)
                curveToRelative(-25.4f, 0.0f, -37.4f, 10.4f, -57.6f, 14.4f)
                verticalLineToRelative(153.6f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineToRelative(-192.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(6.4f)
                curveToRelative(20.2f, -4.0f, 32.2f, -14.4f, 57.6f, -14.4f)
                curveToRelative(31.2f, 0.0f, 43.2f, 16.0f, 74.6f, 16.0f)
                curveToRelative(18.6f, 0.0f, 28.2f, -4.8f, 59.8f, -16.0f)
                verticalLineTo(312.5f)
                close()
            }
        }
        .build()
        return _squareFontAwesome!!
    }

private var _squareFontAwesome: ImageVector? = null
