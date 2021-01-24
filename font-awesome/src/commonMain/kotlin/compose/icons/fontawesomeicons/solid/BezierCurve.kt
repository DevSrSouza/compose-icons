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

public val SolidGroup.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) {
            return _bezierCurve!!
        }
        _bezierCurve = Builder(name = "BezierCurve", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 32.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(400.0f, 64.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(208.0f, 88.0f)
                horizontalLineToRelative(-84.75f)
                curveTo(113.75f, 64.56f, 90.84f, 48.0f, 64.0f, 48.0f)
                curveTo(28.66f, 48.0f, 0.0f, 76.65f, 0.0f, 112.0f)
                reflectiveCurveToRelative(28.66f, 64.0f, 64.0f, 64.0f)
                curveToRelative(26.84f, 0.0f, 49.75f, -16.56f, 59.25f, -40.0f)
                horizontalLineToRelative(79.73f)
                curveToRelative(-55.37f, 32.52f, -95.86f, 87.32f, -109.54f, 152.0f)
                horizontalLineToRelative(49.4f)
                curveToRelative(11.3f, -41.61f, 36.77f, -77.21f, 71.04f, -101.56f)
                curveToRelative(-3.7f, -8.08f, -5.88f, -16.99f, -5.88f, -26.44f)
                lineTo(208.0f, 88.0f)
                close()
                moveTo(160.0f, 320.0f)
                lineTo(64.0f, 320.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(576.0f, 48.0f)
                curveToRelative(-26.84f, 0.0f, -49.75f, 16.56f, -59.25f, 40.0f)
                lineTo(432.0f, 88.0f)
                verticalLineToRelative(72.0f)
                curveToRelative(0.0f, 9.45f, -2.19f, 18.36f, -5.88f, 26.44f)
                curveToRelative(34.27f, 24.35f, 59.74f, 59.95f, 71.04f, 101.56f)
                horizontalLineToRelative(49.4f)
                curveToRelative(-13.68f, -64.68f, -54.17f, -119.48f, -109.54f, -152.0f)
                horizontalLineToRelative(79.73f)
                curveToRelative(9.5f, 23.44f, 32.41f, 40.0f, 59.25f, 40.0f)
                curveToRelative(35.34f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.66f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(576.0f, 320.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
