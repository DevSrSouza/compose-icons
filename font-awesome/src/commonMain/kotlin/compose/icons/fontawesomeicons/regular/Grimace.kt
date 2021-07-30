package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Grimace: ImageVector
    get() {
        if (_grimace != null) {
            return _grimace!!
        }
        _grimace = Builder(name = "Grimace", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 456.0f)
                curveToRelative(-110.3f, 0.0f, -200.0f, -89.7f, -200.0f, -200.0f)
                reflectiveCurveTo(137.7f, 56.0f, 248.0f, 56.0f)
                reflectiveCurveToRelative(200.0f, 89.7f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.7f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(168.0f, 240.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(328.0f, 240.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(344.0f, 256.0f)
                lineTo(152.0f, 256.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(176.0f, 352.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(176.0f, 312.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(240.0f, 352.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-24.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(240.0f, 312.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-24.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(304.0f, 352.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-24.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(304.0f, 312.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-24.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(360.0f, 336.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-24.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(360.0f, 312.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(-24.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _grimace!!
    }

private var _grimace: ImageVector? = null
