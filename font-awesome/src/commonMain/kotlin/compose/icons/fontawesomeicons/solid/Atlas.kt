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

public val SolidGroup.Atlas: ImageVector
    get() {
        if (_atlas != null) {
            return _atlas!!
        }
        _atlas = Builder(name = "Atlas", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(318.38f, 208.0f)
                horizontalLineToRelative(-39.09f)
                curveToRelative(-1.49f, 27.03f, -6.54f, 51.35f, -14.21f, 70.41f)
                curveToRelative(27.71f, -13.24f, 48.02f, -39.19f, 53.3f, -70.41f)
                close()
                moveTo(318.38f, 176.0f)
                curveToRelative(-5.29f, -31.22f, -25.59f, -57.17f, -53.3f, -70.41f)
                curveToRelative(7.68f, 19.06f, 12.72f, 43.38f, 14.21f, 70.41f)
                horizontalLineToRelative(39.09f)
                close()
                moveTo(224.0f, 97.31f)
                curveToRelative(-7.69f, 7.45f, -20.77f, 34.42f, -23.43f, 78.69f)
                horizontalLineToRelative(46.87f)
                curveToRelative(-2.67f, -44.26f, -15.75f, -71.24f, -23.44f, -78.69f)
                close()
                moveTo(182.92f, 105.59f)
                curveToRelative(-27.71f, 13.24f, -48.02f, 39.19f, -53.3f, 70.41f)
                horizontalLineToRelative(39.09f)
                curveToRelative(1.49f, -27.03f, 6.53f, -51.35f, 14.21f, -70.41f)
                close()
                moveTo(182.92f, 278.41f)
                curveToRelative(-7.68f, -19.06f, -12.72f, -43.38f, -14.21f, -70.41f)
                horizontalLineToRelative(-39.09f)
                curveToRelative(5.28f, 31.22f, 25.59f, 57.17f, 53.3f, 70.41f)
                close()
                moveTo(247.43f, 208.0f)
                horizontalLineToRelative(-46.87f)
                curveToRelative(2.66f, 44.26f, 15.74f, 71.24f, 23.43f, 78.69f)
                curveToRelative(7.7f, -7.45f, 20.78f, -34.43f, 23.44f, -78.69f)
                close()
                moveTo(448.0f, 358.4f)
                lineTo(448.0f, 25.6f)
                curveToRelative(0.0f, -16.0f, -9.6f, -25.6f, -25.6f, -25.6f)
                lineTo(96.0f, 0.0f)
                curveTo(41.6f, 0.0f, 0.0f, 41.6f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 54.4f, 41.6f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(326.4f)
                curveToRelative(12.8f, 0.0f, 25.6f, -9.6f, 25.6f, -25.6f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -6.4f, -3.2f, -12.8f, -9.6f, -19.2f)
                curveToRelative(-3.2f, -16.0f, -3.2f, -60.8f, 0.0f, -73.6f)
                curveToRelative(6.4f, -3.2f, 9.6f, -9.6f, 9.6f, -19.2f)
                close()
                moveTo(224.0f, 64.0f)
                curveToRelative(70.69f, 0.0f, 128.0f, 57.31f, 128.0f, 128.0f)
                reflectiveCurveToRelative(-57.31f, 128.0f, -128.0f, 128.0f)
                reflectiveCurveTo(96.0f, 262.69f, 96.0f, 192.0f)
                reflectiveCurveTo(153.31f, 64.0f, 224.0f, 64.0f)
                close()
                moveTo(384.0f, 448.0f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-19.2f, 0.0f, -32.0f, -12.8f, -32.0f, -32.0f)
                reflectiveCurveToRelative(16.0f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(288.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _atlas!!
    }

private var _atlas: ImageVector? = null
