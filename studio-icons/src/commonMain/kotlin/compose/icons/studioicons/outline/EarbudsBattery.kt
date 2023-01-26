package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.EarbudsBattery: ImageVector
    get() {
        if (_earbudsBattery != null) {
            return _earbudsBattery!!
        }
        _earbudsBattery = Builder(name = "EarbudsBattery", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 7.45f, 21.55f, 7.0f, 21.0f, 7.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(14.0f, 9.38f)
                curveTo(14.0f, 7.51f, 12.49f, 6.0f, 10.62f, 6.0f)
                reflectiveCurveTo(7.25f, 7.51f, 7.25f, 9.38f)
                verticalLineToRelative(5.25f)
                curveToRelative(0.0f, 1.04f, -0.84f, 1.88f, -1.88f, 1.88f)
                reflectiveCurveTo(3.5f, 15.66f, 3.5f, 14.62f)
                verticalLineToRelative(-4.7f)
                curveTo(3.66f, 9.97f, 3.83f, 10.0f, 4.0f, 10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(5.1f, 6.0f, 4.0f, 6.0f)
                reflectiveCurveTo(2.0f, 6.9f, 2.0f, 8.0f)
                curveToRelative(0.0f, 0.04f, 0.0f, 6.62f, 0.0f, 6.62f)
                curveTo(2.0f, 16.49f, 3.51f, 18.0f, 5.38f, 18.0f)
                reflectiveCurveToRelative(3.38f, -1.51f, 3.38f, -3.38f)
                verticalLineTo(9.38f)
                curveToRelative(0.0f, -1.04f, 0.84f, -1.88f, 1.88f, -1.88f)
                reflectiveCurveToRelative(1.88f, 0.84f, 1.88f, 1.88f)
                verticalLineToRelative(4.7f)
                curveTo(12.34f, 14.03f, 12.17f, 14.0f, 12.0f, 14.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                curveTo(14.0f, 15.96f, 14.0f, 9.38f, 14.0f, 9.38f)
                close()
            }
        }
        .build()
        return _earbudsBattery!!
    }

private var _earbudsBattery: ImageVector? = null
