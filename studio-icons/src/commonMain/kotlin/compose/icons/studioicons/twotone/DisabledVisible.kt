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

public val TwotoneGroup.DisabledVisible: ImageVector
    get() {
        if (_disabledVisible != null) {
            return _disabledVisible!!
        }
        _disabledVisible = Builder(name = "DisabledVisible", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 15.0f)
                curveToRelative(-1.95f, 0.0f, -3.76f, 0.98f, -4.75f, 2.5f)
                curveTo(13.24f, 19.02f, 15.05f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveToRelative(3.76f, -0.98f, 4.75f, -2.5f)
                curveTo(20.76f, 15.98f, 18.95f, 15.0f, 17.0f, 15.0f)
                close()
                moveTo(17.0f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveTo(18.5f, 18.33f, 17.83f, 19.0f, 17.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.0f)
                curveToRelative(1.95f, 0.0f, 3.76f, 0.98f, 4.75f, 2.5f)
                curveTo(20.76f, 19.02f, 18.95f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveToRelative(-3.76f, -0.98f, -4.75f, -2.5f)
                curveTo(13.24f, 15.98f, 15.05f, 15.0f, 17.0f, 15.0f)
                close()
                moveTo(17.0f, 13.0f)
                curveToRelative(-3.18f, 0.0f, -5.9f, 1.87f, -7.0f, 4.5f)
                curveToRelative(1.1f, 2.63f, 3.82f, 4.5f, 7.0f, 4.5f)
                reflectiveCurveToRelative(5.9f, -1.87f, 7.0f, -4.5f)
                curveTo(22.9f, 14.87f, 20.18f, 13.0f, 17.0f, 13.0f)
                close()
                moveTo(17.0f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(16.17f, 16.0f, 17.0f, 16.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.83f, 19.0f, 17.0f, 19.0f)
                close()
                moveTo(21.99f, 12.34f)
                curveTo(22.0f, 12.23f, 22.0f, 12.11f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.17f, 3.93f, 9.43f, 8.96f, 9.95f)
                curveToRelative(-0.93f, -0.73f, -1.72f, -1.64f, -2.32f, -2.68f)
                curveTo(5.9f, 18.0f, 4.0f, 15.22f, 4.0f, 12.0f)
                curveToRelative(0.0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f)
                lineToRelative(5.66f, 5.66f)
                curveToRelative(0.56f, -0.4f, 1.17f, -0.73f, 1.82f, -1.0f)
                lineTo(7.1f, 5.69f)
                curveTo(8.45f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f)
                curveToRelative(4.24f, 0.0f, 7.7f, 3.29f, 7.98f, 7.45f)
                curveTo(20.69f, 11.67f, 21.37f, 11.97f, 21.99f, 12.34f)
                close()
            }
        }
        .build()
        return _disabledVisible!!
    }

private var _disabledVisible: ImageVector? = null
