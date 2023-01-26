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

public val TwotoneGroup.MonetizationOn: ImageVector
    get() {
        if (_monetizationOn != null) {
            return _monetizationOn!!
        }
        _monetizationOn = Builder(name = "MonetizationOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(13.23f, 17.33f)
                lineTo(13.23f, 19.0f)
                lineTo(10.9f, 19.0f)
                verticalLineToRelative(-1.69f)
                curveToRelative(-1.5f, -0.31f, -2.77f, -1.28f, -2.86f, -2.97f)
                horizontalLineToRelative(1.71f)
                curveToRelative(0.09f, 0.92f, 0.72f, 1.64f, 2.32f, 1.64f)
                curveToRelative(1.71f, 0.0f, 2.1f, -0.86f, 2.1f, -1.39f)
                curveToRelative(0.0f, -0.73f, -0.39f, -1.41f, -2.34f, -1.87f)
                curveToRelative(-2.17f, -0.53f, -3.66f, -1.42f, -3.66f, -3.21f)
                curveToRelative(0.0f, -1.51f, 1.22f, -2.48f, 2.72f, -2.81f)
                lineTo(10.89f, 5.0f)
                horizontalLineToRelative(2.34f)
                verticalLineToRelative(1.71f)
                curveToRelative(1.63f, 0.39f, 2.44f, 1.63f, 2.49f, 2.97f)
                horizontalLineToRelative(-1.71f)
                curveToRelative(-0.04f, -0.97f, -0.56f, -1.64f, -1.94f, -1.64f)
                curveToRelative(-1.31f, 0.0f, -2.1f, 0.59f, -2.1f, 1.43f)
                curveToRelative(0.0f, 0.73f, 0.57f, 1.22f, 2.34f, 1.67f)
                curveToRelative(1.77f, 0.46f, 3.66f, 1.22f, 3.66f, 3.42f)
                curveToRelative(-0.01f, 1.6f, -1.21f, 2.48f, -2.74f, 2.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f)
                close()
                moveTo(12.31f, 11.14f)
                curveToRelative(-1.77f, -0.45f, -2.34f, -0.94f, -2.34f, -1.67f)
                curveToRelative(0.0f, -0.84f, 0.79f, -1.43f, 2.1f, -1.43f)
                curveToRelative(1.38f, 0.0f, 1.9f, 0.66f, 1.94f, 1.64f)
                horizontalLineToRelative(1.71f)
                curveToRelative(-0.05f, -1.34f, -0.87f, -2.57f, -2.49f, -2.97f)
                lineTo(13.23f, 5.0f)
                lineTo(10.9f, 5.0f)
                verticalLineToRelative(1.69f)
                curveToRelative(-1.51f, 0.32f, -2.72f, 1.3f, -2.72f, 2.81f)
                curveToRelative(0.0f, 1.79f, 1.49f, 2.69f, 3.66f, 3.21f)
                curveToRelative(1.95f, 0.46f, 2.34f, 1.15f, 2.34f, 1.87f)
                curveToRelative(0.0f, 0.53f, -0.39f, 1.39f, -2.1f, 1.39f)
                curveToRelative(-1.6f, 0.0f, -2.23f, -0.72f, -2.32f, -1.64f)
                lineTo(8.04f, 14.33f)
                curveToRelative(0.1f, 1.7f, 1.36f, 2.66f, 2.86f, 2.97f)
                lineTo(10.9f, 19.0f)
                horizontalLineToRelative(2.34f)
                verticalLineToRelative(-1.67f)
                curveToRelative(1.52f, -0.29f, 2.72f, -1.16f, 2.73f, -2.77f)
                curveToRelative(-0.01f, -2.2f, -1.9f, -2.96f, -3.66f, -3.42f)
                close()
            }
        }
        .build()
        return _monetizationOn!!
    }

private var _monetizationOn: ImageVector? = null
