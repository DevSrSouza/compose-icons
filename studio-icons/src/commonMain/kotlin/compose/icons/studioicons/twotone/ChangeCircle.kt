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

public val TwotoneGroup.ChangeCircle: ImageVector
    get() {
        if (_changeCircle != null) {
            return _changeCircle!!
        }
        _changeCircle = Builder(name = "ChangeCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                moveTo(12.06f, 13.34f)
                verticalLineToRelative(2.14f)
                curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f)
                curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f)
                curveTo(9.44f, 16.51f, 10.72f, 17.0f, 12.0f, 17.0f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                verticalLineTo(19.0f)
                lineToRelative(2.83f, -2.83f)
                lineTo(12.06f, 13.34f)
                close()
                moveTo(15.54f, 8.46f)
                curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f)
                verticalLineTo(5.0f)
                lineTo(9.11f, 7.83f)
                lineToRelative(2.83f, 2.83f)
                verticalLineTo(8.51f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                curveToRelative(0.9f, 0.0f, 1.79f, 0.34f, 2.48f, 1.02f)
                curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f)
                lineToRelative(1.1f, 1.1f)
                curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.06f, 13.34f)
                verticalLineToRelative(2.14f)
                curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f)
                curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f)
                curveTo(9.44f, 16.51f, 10.72f, 17.0f, 12.0f, 17.0f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                verticalLineTo(19.0f)
                lineToRelative(2.83f, -2.83f)
                lineTo(12.06f, 13.34f)
                close()
                moveTo(15.54f, 8.46f)
                curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f)
                verticalLineTo(5.0f)
                lineTo(9.11f, 7.83f)
                lineToRelative(2.83f, 2.83f)
                verticalLineTo(8.51f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                curveToRelative(0.9f, 0.0f, 1.79f, 0.34f, 2.48f, 1.02f)
                curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f)
                lineToRelative(1.1f, 1.1f)
                curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f)
                close()
            }
        }
        .build()
        return _changeCircle!!
    }

private var _changeCircle: ImageVector? = null
