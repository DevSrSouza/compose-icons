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

public val BrandsGroup.CreativeCommonsRemix: ImageVector
    get() {
        if (_creativeCommonsRemix != null) {
            return _creativeCommonsRemix!!
        }
        _creativeCommonsRemix = Builder(name = "CreativeCommonsRemix", defaultWidth = 496.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.6f, 8.0f)
                curveTo(389.4f, 8.0f, 496.0f, 118.1f, 496.0f, 256.0f)
                curveToRelative(0.0f, 147.1f, -118.5f, 248.0f, -248.4f, 248.0f)
                curveTo(113.6f, 504.0f, 0.0f, 394.5f, 0.0f, 256.0f)
                curveTo(0.0f, 123.1f, 104.7f, 8.0f, 247.6f, 8.0f)
                close()
                moveTo(248.4f, 52.7f)
                curveTo(130.2f, 52.7f, 44.7f, 150.6f, 44.7f, 256.0f)
                curveToRelative(0.0f, 109.8f, 91.2f, 202.8f, 203.7f, 202.8f)
                curveToRelative(103.2f, 0.0f, 202.8f, -81.1f, 202.8f, -202.8f)
                curveToRelative(0.1f, -113.8f, -90.2f, -203.3f, -202.8f, -203.3f)
                close()
                moveTo(410.1f, 260.4f)
                lineToRelative(4.9f, 2.2f)
                verticalLineToRelative(70.0f)
                curveToRelative(-7.2f, 3.6f, -63.4f, 27.5f, -67.3f, 28.8f)
                curveToRelative(-6.5f, -1.8f, -113.7f, -46.8f, -137.3f, -56.2f)
                lineToRelative(-64.2f, 26.6f)
                lineToRelative(-63.3f, -27.5f)
                verticalLineToRelative(-63.8f)
                lineToRelative(59.3f, -24.8f)
                curveToRelative(-0.7f, -0.7f, -0.4f, 5.0f, -0.4f, -70.4f)
                lineToRelative(67.3f, -29.7f)
                lineTo(361.0f, 178.5f)
                verticalLineToRelative(61.6f)
                lineToRelative(49.1f, 20.3f)
                close()
                moveTo(339.7f, 341.9f)
                verticalLineToRelative(-43.8f)
                horizontalLineToRelative(-0.4f)
                verticalLineToRelative(-1.8f)
                lineToRelative(-113.8f, -46.5f)
                lineTo(225.5f, 295.0f)
                lineToRelative(113.8f, 46.9f)
                verticalLineToRelative(-0.4f)
                lineToRelative(0.4f, 0.4f)
                close()
                moveTo(347.2f, 284.3f)
                lineToRelative(39.9f, -16.4f)
                lineToRelative(-36.8f, -15.5f)
                lineToRelative(-39.0f, 16.4f)
                lineToRelative(35.9f, 15.5f)
                close()
                moveTo(399.5f, 322.4f)
                verticalLineToRelative(-43.0f)
                lineTo(355.2f, 298.0f)
                verticalLineToRelative(43.4f)
                lineToRelative(44.3f, -19.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsRemix!!
    }

private var _creativeCommonsRemix: ImageVector? = null
