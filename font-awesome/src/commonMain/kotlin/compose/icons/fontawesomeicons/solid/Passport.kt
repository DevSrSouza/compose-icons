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

public val SolidGroup.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(129.62f, 176.0f)
                horizontalLineToRelative(39.09f)
                curveToRelative(1.49f, -27.03f, 6.54f, -51.35f, 14.21f, -70.41f)
                curveToRelative(-27.71f, 13.24f, -48.02f, 39.19f, -53.3f, 70.41f)
                close()
                moveTo(129.62f, 208.0f)
                curveToRelative(5.29f, 31.22f, 25.59f, 57.17f, 53.3f, 70.41f)
                curveToRelative(-7.68f, -19.06f, -12.72f, -43.38f, -14.21f, -70.41f)
                horizontalLineToRelative(-39.09f)
                close()
                moveTo(224.0f, 286.69f)
                curveToRelative(7.69f, -7.45f, 20.77f, -34.42f, 23.43f, -78.69f)
                horizontalLineToRelative(-46.87f)
                curveToRelative(2.67f, 44.26f, 15.75f, 71.24f, 23.44f, 78.69f)
                close()
                moveTo(200.57f, 176.0f)
                horizontalLineToRelative(46.87f)
                curveToRelative(-2.66f, -44.26f, -15.74f, -71.24f, -23.43f, -78.69f)
                curveToRelative(-7.7f, 7.45f, -20.78f, 34.43f, -23.44f, 78.69f)
                close()
                moveTo(265.08f, 278.41f)
                curveToRelative(27.71f, -13.24f, 48.02f, -39.19f, 53.3f, -70.41f)
                horizontalLineToRelative(-39.09f)
                curveToRelative(-1.49f, 27.03f, -6.53f, 51.35f, -14.21f, 70.41f)
                close()
                moveTo(416.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                curveTo(28.65f, 0.0f, 0.0f, 28.65f, 0.0f, 64.0f)
                verticalLineToRelative(384.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(448.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(336.0f, 416.0f)
                lineTo(112.0f, 416.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(224.0f, 320.0f)
                curveToRelative(-70.69f, 0.0f, -128.0f, -57.31f, -128.0f, -128.0f)
                reflectiveCurveTo(153.31f, 64.0f, 224.0f, 64.0f)
                reflectiveCurveToRelative(128.0f, 57.31f, 128.0f, 128.0f)
                reflectiveCurveToRelative(-57.31f, 128.0f, -128.0f, 128.0f)
                close()
                moveTo(265.08f, 105.59f)
                curveToRelative(7.68f, 19.06f, 12.72f, 43.38f, 14.21f, 70.41f)
                horizontalLineToRelative(39.09f)
                curveToRelative(-5.28f, -31.22f, -25.59f, -57.17f, -53.3f, -70.41f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
