package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.PrivateConnectivity: ImageVector
    get() {
        if (_privateConnectivity != null) {
            return _privateConnectivity!!
        }
        _privateConnectivity = Builder(name = "PrivateConnectivity", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(14.76f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(15.0f, 14.5f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.21f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveTo(13.32f, 7.69f, 14.0f, 8.61f, 14.0f, 9.61f)
                verticalLineToRelative(0.89f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.75f, 13.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveTo(12.75f, 12.59f, 12.75f, 13.0f)
                close()
                moveTo(13.0f, 9.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveTo(13.0f, 8.95f, 13.0f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveTo(9.24f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(5.07f, 13.0f)
                curveToRelative(0.49f, 3.39f, 3.4f, 6.0f, 6.93f, 6.0f)
                curveToRelative(3.53f, 0.0f, 6.44f, -2.61f, 6.93f, -6.0f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-3.07f, 0.0f)
                curveToRelative(-0.49f, -3.39f, -3.4f, -6.0f, -6.93f, -6.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-3.53f, 0.0f, -6.44f, 2.61f, -6.93f, 6.0f)
                curveToRelative(0.0f, 0.0f, -3.07f, 0.0f, -3.07f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.07f, 13.0f)
                close()
                moveTo(14.0f, 10.5f)
                verticalLineTo(9.61f)
                curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveTo(11.08f, 7.32f, 10.0f, 8.29f, 10.0f, 9.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveTo(15.0f, 10.95f, 14.55f, 10.5f, 14.0f, 10.5f)
                close()
                moveTo(12.0f, 13.75f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12.0f, 13.75f)
                close()
                moveTo(13.0f, 10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _privateConnectivity!!
    }

private var _privateConnectivity: ImageVector? = null
