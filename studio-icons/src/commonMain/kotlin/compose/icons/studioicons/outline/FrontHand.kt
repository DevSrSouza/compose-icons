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

public val OutlineGroup.FrontHand: ImageVector
    get() {
        if (_frontHand != null) {
            return _frontHand!!
        }
        _frontHand = Builder(name = "FrontHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 8.0f)
                curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f)
                verticalLineTo(4.5f)
                curveTo(18.0f, 3.12f, 16.88f, 2.0f, 15.5f, 2.0f)
                curveToRelative(-0.19f, 0.0f, -0.37f, 0.02f, -0.54f, 0.06f)
                curveTo(14.75f, 0.89f, 13.73f, 0.0f, 12.5f, 0.0f)
                curveToRelative(-1.06f, 0.0f, -1.96f, 0.66f, -2.33f, 1.59f)
                curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f)
                curveTo(8.12f, 1.5f, 7.0f, 2.62f, 7.0f, 4.0f)
                verticalLineToRelative(0.55f)
                curveTo(6.84f, 4.52f, 6.67f, 4.5f, 6.5f, 4.5f)
                curveTo(5.12f, 4.5f, 4.0f, 5.62f, 4.0f, 7.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                verticalLineToRelative(-5.0f)
                curveTo(21.0f, 9.12f, 19.88f, 8.0f, 18.5f, 8.0f)
                close()
                moveTo(19.0f, 15.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveTo(6.0f, 19.09f, 6.0f, 15.5f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(7.0f, 6.72f, 7.0f, 7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(10.0f, 3.72f, 10.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f)
                reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f)
                reflectiveCurveTo(16.0f, 4.22f, 16.0f, 4.5f)
                verticalLineToRelative(8.92f)
                curveToRelative(-1.77f, 0.77f, -3.0f, 2.53f, -3.0f, 4.58f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _frontHand!!
    }

private var _frontHand: ImageVector? = null
