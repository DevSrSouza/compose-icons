package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Grimace: ImageVector
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
                moveTo(144.0f, 400.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(144.0f, 344.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(136.0f, 208.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(208.0f, 400.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(208.0f, 344.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(272.0f, 400.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(272.0f, 344.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(336.0f, 400.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(336.0f, 344.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(328.0f, 240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(392.0f, 368.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(392.0f, 344.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _grimace!!
    }

private var _grimace: ImageVector? = null
