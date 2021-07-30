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

public val BrandsGroup.CreativeCommonsShare: ImageVector
    get() {
        if (_creativeCommonsShare != null) {
            return _creativeCommonsShare!!
        }
        _creativeCommonsShare = Builder(name = "CreativeCommonsShare", defaultWidth = 496.0.dp,
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
                moveTo(349.4f, 185.1f)
                curveToRelative(7.8f, 0.0f, 13.7f, 6.1f, 13.7f, 13.7f)
                verticalLineToRelative(182.5f)
                curveToRelative(0.0f, 7.7f, -6.1f, 13.7f, -13.7f, 13.7f)
                lineTo(214.3f, 395.0f)
                curveToRelative(-7.7f, 0.0f, -13.7f, -6.0f, -13.7f, -13.7f)
                verticalLineToRelative(-54.0f)
                horizontalLineToRelative(-54.0f)
                curveToRelative(-7.8f, 0.0f, -13.7f, -6.0f, -13.7f, -13.7f)
                lineTo(132.9f, 131.1f)
                curveToRelative(0.0f, -8.2f, 6.6f, -12.7f, 12.4f, -13.7f)
                horizontalLineToRelative(136.4f)
                curveToRelative(7.7f, 0.0f, 13.7f, 6.0f, 13.7f, 13.7f)
                verticalLineToRelative(54.0f)
                horizontalLineToRelative(54.0f)
                close()
                moveTo(159.9f, 300.3f)
                horizontalLineToRelative(40.7f)
                lineTo(200.6f, 198.9f)
                curveToRelative(0.0f, -7.4f, 5.8f, -12.6f, 12.0f, -13.7f)
                horizontalLineToRelative(55.8f)
                verticalLineToRelative(-40.3f)
                lineTo(159.9f, 144.9f)
                verticalLineToRelative(155.4f)
                close()
                moveTo(336.1f, 212.2f)
                lineTo(227.6f, 212.2f)
                verticalLineToRelative(155.4f)
                horizontalLineToRelative(108.5f)
                lineTo(336.1f, 212.2f)
                close()
            }
        }
        .build()
        return _creativeCommonsShare!!
    }

private var _creativeCommonsShare: ImageVector? = null
