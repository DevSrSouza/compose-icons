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

public val TwotoneGroup.AddLocationAlt: ImageVector
    get() {
        if (_addLocationAlt != null) {
            return _addLocationAlt!!
        }
        _addLocationAlt = Builder(name = "AddLocationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.8f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.41f)
                curveToRelative(0.06f, 0.39f, 0.09f, 0.79f, 0.09f, 1.2f)
                curveToRelative(0.0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f)
                lineTo(12.0f, 21.01f)
                lineToRelative(-0.34f, -0.31f)
                curveTo(7.6f, 16.99f, 5.5f, 13.77f, 5.5f, 11.2f)
                curveToRelative(0.0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f)
                curveTo(12.7f, 4.5f, 13.37f, 4.6f, 14.0f, 4.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(13.1f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(14.0f, 3.25f)
                verticalLineToRelative(2.08f)
                curveTo(13.38f, 5.11f, 12.7f, 5.0f, 12.0f, 5.0f)
                curveToRelative(-3.35f, 0.0f, -6.0f, 2.57f, -6.0f, 6.2f)
                curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f)
                curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f)
                curveToRelative(0.0f, -0.41f, -0.03f, -0.81f, -0.1f, -1.2f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.05f, 0.39f, 0.08f, 0.79f, 0.08f, 1.2f)
                curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f)
                curveTo(4.0f, 6.22f, 7.8f, 3.0f, 12.0f, 3.0f)
                curveTo(12.68f, 3.0f, 13.35f, 3.08f, 14.0f, 3.25f)
                close()
            }
        }
        .build()
        return _addLocationAlt!!
    }

private var _addLocationAlt: ImageVector? = null
