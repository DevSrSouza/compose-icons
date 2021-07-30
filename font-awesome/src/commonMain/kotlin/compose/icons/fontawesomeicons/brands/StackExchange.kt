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

public val BrandsGroup.StackExchange: ImageVector
    get() {
        if (_stackExchange != null) {
            return _stackExchange!!
        }
        _stackExchange = Builder(name = "StackExchange", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7f, 332.3f)
                horizontalLineToRelative(412.7f)
                verticalLineToRelative(22.0f)
                curveToRelative(0.0f, 37.7f, -29.3f, 68.0f, -65.3f, 68.0f)
                horizontalLineToRelative(-19.0f)
                lineTo(259.3f, 512.0f)
                verticalLineToRelative(-89.7f)
                lineTo(83.0f, 422.3f)
                curveToRelative(-36.0f, 0.0f, -65.3f, -30.3f, -65.3f, -68.0f)
                verticalLineToRelative(-22.0f)
                close()
                moveTo(17.7f, 308.7f)
                horizontalLineToRelative(412.7f)
                verticalLineToRelative(-85.0f)
                lineTo(17.7f, 223.7f)
                verticalLineToRelative(85.0f)
                close()
                moveTo(17.7f, 199.3f)
                horizontalLineToRelative(412.7f)
                verticalLineToRelative(-85.0f)
                lineTo(17.7f, 114.3f)
                verticalLineToRelative(85.0f)
                close()
                moveTo(365.0f, 0.0f)
                lineTo(83.0f, 0.0f)
                curveTo(47.0f, 0.0f, 17.7f, 30.3f, 17.7f, 67.7f)
                lineTo(17.7f, 90.0f)
                horizontalLineToRelative(412.7f)
                lineTo(430.4f, 67.7f)
                curveTo(430.3f, 30.3f, 401.0f, 0.0f, 365.0f, 0.0f)
                close()
            }
        }
        .build()
        return _stackExchange!!
    }

private var _stackExchange: ImageVector? = null
