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

public val BrandsGroup.Lyft: ImageVector
    get() {
        if (_lyft != null) {
            return _lyft!!
        }
        _lyft = Builder(name = "Lyft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 81.1f)
                horizontalLineToRelative(77.8f)
                verticalLineToRelative(208.7f)
                curveToRelative(0.0f, 33.1f, 15.0f, 52.8f, 27.2f, 61.0f)
                curveToRelative(-12.7f, 11.1f, -51.2f, 20.9f, -80.2f, -2.8f)
                curveTo(7.8f, 334.0f, 0.0f, 310.7f, 0.0f, 289.0f)
                lineTo(0.0f, 81.1f)
                close()
                moveTo(485.9f, 254.6f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(23.8f)
                verticalLineToRelative(-76.8f)
                horizontalLineToRelative(-26.1f)
                curveToRelative(-10.1f, -46.3f, -51.2f, -80.7f, -100.3f, -80.7f)
                curveToRelative(-56.6f, 0.0f, -102.7f, 46.0f, -102.7f, 102.7f)
                lineTo(280.6f, 357.0f)
                curveToRelative(16.0f, 2.3f, 35.4f, -0.3f, 51.7f, -14.0f)
                curveToRelative(17.1f, -14.0f, 24.8f, -37.2f, 24.8f, -59.0f)
                verticalLineToRelative(-6.7f)
                horizontalLineToRelative(38.8f)
                verticalLineToRelative(-76.8f)
                horizontalLineToRelative(-38.8f)
                verticalLineToRelative(-23.3f)
                curveToRelative(0.0f, -34.6f, 52.2f, -34.6f, 52.2f, 0.0f)
                verticalLineToRelative(77.1f)
                curveToRelative(0.0f, 56.6f, 46.0f, 102.7f, 102.7f, 102.7f)
                verticalLineToRelative(-76.5f)
                curveToRelative(-14.5f, 0.0f, -26.1f, -11.7f, -26.1f, -25.9f)
                close()
                moveTo(191.6f, 155.6f)
                verticalLineToRelative(113.0f)
                curveToRelative(0.0f, 15.4f, -23.8f, 15.4f, -23.8f, 0.0f)
                verticalLineToRelative(-113.0f)
                lineTo(91.0f, 155.6f)
                verticalLineToRelative(132.7f)
                curveToRelative(0.0f, 23.8f, 8.0f, 54.0f, 45.0f, 63.9f)
                curveToRelative(37.0f, 9.8f, 58.2f, -10.6f, 58.2f, -10.6f)
                curveToRelative(-2.1f, 13.4f, -14.5f, 23.3f, -34.9f, 25.3f)
                curveToRelative(-15.5f, 1.6f, -35.2f, -3.6f, -45.0f, -7.8f)
                verticalLineToRelative(70.3f)
                curveToRelative(25.1f, 7.5f, 51.5f, 9.8f, 77.6f, 4.7f)
                curveToRelative(47.1f, -9.1f, 76.8f, -48.4f, 76.8f, -100.8f)
                lineTo(268.7f, 155.1f)
                horizontalLineToRelative(-77.1f)
                verticalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _lyft!!
    }

private var _lyft: ImageVector? = null
