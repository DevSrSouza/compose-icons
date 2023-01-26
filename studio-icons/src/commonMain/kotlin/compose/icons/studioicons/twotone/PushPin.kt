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

public val TwotoneGroup.PushPin: ImageVector
    get() {
        if (_pushPin != null) {
            return _pushPin!!
        }
        _pushPin = Builder(name = "PushPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, -0.35f, 2.14f, -1.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(-0.63f, -0.84f, -1.0f, -1.88f, -1.0f, -3.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                verticalLineTo(4.0f)
                lineToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(7.0f)
                curveTo(6.45f, 2.0f, 6.0f, 2.45f, 6.0f, 3.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.97f)
                verticalLineToRelative(7.0f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 12.0f)
                curveTo(19.0f, 12.0f, 19.0f, 12.0f, 19.0f, 12.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.65f, -0.86f, 1.0f, -1.9f, 1.0f, -3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.12f, 0.37f, 2.16f, 1.0f, 3.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
