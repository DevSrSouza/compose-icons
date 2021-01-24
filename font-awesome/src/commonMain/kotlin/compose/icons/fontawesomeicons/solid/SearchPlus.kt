package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SearchPlus: ImageVector
    get() {
        if (_searchPlus != null) {
            return _searchPlus!!
        }
        _searchPlus = Builder(name = "SearchPlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 192.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                close()
                moveTo(505.0f, 476.7f)
                lineTo(476.7f, 505.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(343.0f, 405.3f)
                curveToRelative(-4.5f, -4.5f, -7.0f, -10.6f, -7.0f, -17.0f)
                lineTo(336.0f, 372.0f)
                curveToRelative(-35.3f, 27.6f, -79.7f, 44.0f, -128.0f, 44.0f)
                curveTo(93.1f, 416.0f, 0.0f, 322.9f, 0.0f, 208.0f)
                reflectiveCurveTo(93.1f, 0.0f, 208.0f, 0.0f)
                reflectiveCurveToRelative(208.0f, 93.1f, 208.0f, 208.0f)
                curveToRelative(0.0f, 48.3f, -16.4f, 92.7f, -44.0f, 128.0f)
                horizontalLineToRelative(16.3f)
                curveToRelative(6.4f, 0.0f, 12.5f, 2.5f, 17.0f, 7.0f)
                lineToRelative(99.7f, 99.7f)
                curveToRelative(9.3f, 9.4f, 9.3f, 24.6f, 0.0f, 34.0f)
                close()
                moveTo(344.0f, 208.0f)
                curveToRelative(0.0f, -75.2f, -60.8f, -136.0f, -136.0f, -136.0f)
                reflectiveCurveTo(72.0f, 132.8f, 72.0f, 208.0f)
                reflectiveCurveToRelative(60.8f, 136.0f, 136.0f, 136.0f)
                reflectiveCurveToRelative(136.0f, -60.8f, 136.0f, -136.0f)
                close()
            }
        }
        .build()
        return _searchPlus!!
    }

private var _searchPlus: ImageVector? = null
