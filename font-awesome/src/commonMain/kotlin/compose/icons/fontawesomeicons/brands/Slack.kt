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

public val BrandsGroup.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.12f, 315.1f)
                curveToRelative(0.0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                reflectiveCurveTo(0.0f, 341.0f, 0.0f, 315.1f)
                curveToRelative(0.0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                horizontalLineToRelative(47.06f)
                verticalLineToRelative(47.06f)
                close()
                moveTo(117.84f, 315.1f)
                curveToRelative(0.0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                reflectiveCurveToRelative(47.06f, 21.16f, 47.06f, 47.06f)
                verticalLineToRelative(117.84f)
                curveToRelative(0.0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                reflectiveCurveToRelative(-47.06f, -21.16f, -47.06f, -47.06f)
                lineTo(117.84f, 315.1f)
                close()
                moveTo(164.9f, 126.12f)
                curveToRelative(-25.9f, 0.0f, -47.06f, -21.16f, -47.06f, -47.06f)
                reflectiveCurveTo(139.0f, 32.0f, 164.9f, 32.0f)
                reflectiveCurveToRelative(47.06f, 21.16f, 47.06f, 47.06f)
                verticalLineToRelative(47.06f)
                lineTo(164.9f, 126.12f)
                close()
                moveTo(164.9f, 149.84f)
                curveToRelative(25.9f, 0.0f, 47.06f, 21.16f, 47.06f, 47.06f)
                reflectiveCurveToRelative(-21.16f, 47.06f, -47.06f, 47.06f)
                lineTo(47.06f, 243.96f)
                curveTo(21.16f, 243.96f, 0.0f, 222.8f, 0.0f, 196.9f)
                reflectiveCurveToRelative(21.16f, -47.06f, 47.06f, -47.06f)
                lineTo(164.9f, 149.84f)
                close()
                moveTo(353.88f, 196.9f)
                curveToRelative(0.0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                curveToRelative(25.9f, 0.0f, 47.06f, 21.16f, 47.06f, 47.06f)
                reflectiveCurveToRelative(-21.16f, 47.06f, -47.06f, 47.06f)
                horizontalLineToRelative(-47.06f)
                lineTo(353.88f, 196.9f)
                close()
                moveTo(330.16f, 196.9f)
                curveToRelative(0.0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                curveToRelative(-25.9f, 0.0f, -47.06f, -21.16f, -47.06f, -47.06f)
                lineTo(236.04f, 79.06f)
                curveToRelative(0.0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                curveToRelative(25.9f, 0.0f, 47.06f, 21.16f, 47.06f, 47.06f)
                lineTo(330.16f, 196.9f)
                close()
                moveTo(283.1f, 385.88f)
                curveToRelative(25.9f, 0.0f, 47.06f, 21.16f, 47.06f, 47.06f)
                curveToRelative(0.0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                curveToRelative(-25.9f, 0.0f, -47.06f, -21.16f, -47.06f, -47.06f)
                verticalLineToRelative(-47.06f)
                horizontalLineToRelative(47.06f)
                close()
                moveTo(283.1f, 362.16f)
                curveToRelative(-25.9f, 0.0f, -47.06f, -21.16f, -47.06f, -47.06f)
                curveToRelative(0.0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                horizontalLineToRelative(117.84f)
                curveToRelative(25.9f, 0.0f, 47.06f, 21.16f, 47.06f, 47.06f)
                curveToRelative(0.0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                lineTo(283.1f, 362.16f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
