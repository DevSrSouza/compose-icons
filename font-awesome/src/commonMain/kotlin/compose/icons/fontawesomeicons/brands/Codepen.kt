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

public val BrandsGroup.Codepen: ImageVector
    get() {
        if (_codepen != null) {
            return _codepen!!
        }
        _codepen = Builder(name = "Codepen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.29f, 159.7f)
                lineToRelative(-234.0f, -156.0f)
                curveToRelative(-7.99f, -4.91f, -16.51f, -4.96f, -24.57f, 0.0f)
                lineToRelative(-234.0f, 156.0f)
                curveTo(3.71f, 163.7f, 0.0f, 170.85f, 0.0f, 177.99f)
                verticalLineToRelative(156.0f)
                curveToRelative(0.0f, 7.14f, 3.71f, 14.29f, 9.72f, 18.29f)
                lineToRelative(234.0f, 156.02f)
                curveToRelative(7.99f, 4.91f, 16.51f, 4.96f, 24.57f, 0.0f)
                lineToRelative(234.0f, -156.02f)
                curveToRelative(6.0f, -4.0f, 9.72f, -11.14f, 9.72f, -18.29f)
                lineTo(512.0f, 177.99f)
                curveToRelative(-0.0f, -7.14f, -3.71f, -14.29f, -9.72f, -18.28f)
                close()
                moveTo(278.0f, 63.13f)
                lineToRelative(172.29f, 114.86f)
                lineToRelative(-76.86f, 51.43f)
                lineTo(278.0f, 165.7f)
                lineTo(278.0f, 63.13f)
                close()
                moveTo(234.0f, 63.13f)
                verticalLineToRelative(102.57f)
                lineToRelative(-95.43f, 63.72f)
                lineToRelative(-76.86f, -51.43f)
                lineTo(234.0f, 63.13f)
                close()
                moveTo(44.0f, 219.13f)
                lineToRelative(55.14f, 36.86f)
                lineTo(44.0f, 292.85f)
                verticalLineToRelative(-73.71f)
                close()
                moveTo(234.0f, 448.85f)
                lineTo(61.71f, 333.99f)
                lineToRelative(76.86f, -51.43f)
                lineTo(234.0f, 346.27f)
                verticalLineToRelative(102.57f)
                close()
                moveTo(256.0f, 307.99f)
                lineToRelative(-77.71f, -52.0f)
                lineToRelative(77.71f, -52.0f)
                lineToRelative(77.71f, 52.0f)
                lineToRelative(-77.71f, 52.0f)
                close()
                moveTo(278.0f, 448.85f)
                lineTo(278.0f, 346.27f)
                lineToRelative(95.43f, -63.72f)
                lineToRelative(76.86f, 51.43f)
                lineTo(278.0f, 448.85f)
                close()
                moveTo(468.0f, 292.85f)
                lineToRelative(-55.14f, -36.86f)
                lineTo(468.0f, 219.13f)
                verticalLineToRelative(73.71f)
                close()
            }
        }
        .build()
        return _codepen!!
    }

private var _codepen: ImageVector? = null
