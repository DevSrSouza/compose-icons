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

public val TwotoneGroup.FmdBad: ImageVector
    get() {
        if (_fmdBad != null) {
            return _fmdBad!!
        }
        _fmdBad = Builder(name = "FmdBad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f)
                curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f)
                curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 19.33f)
                curveToRelative(-4.05f, -3.7f, -6.0f, -6.79f, -6.0f, -9.14f)
                curveTo(6.0f, 6.57f, 8.65f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(6.0f, 2.57f, 6.0f, 6.2f)
                curveTo(18.0f, 12.54f, 16.05f, 15.64f, 12.0f, 19.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 19.33f)
                curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f)
                curveTo(18.0f, 6.57f, 15.35f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-6.0f, 2.57f, -6.0f, 6.2f)
                curveTo(6.0f, 12.54f, 7.95f, 15.64f, 12.0f, 19.33f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _fmdBad!!
    }

private var _fmdBad: ImageVector? = null
