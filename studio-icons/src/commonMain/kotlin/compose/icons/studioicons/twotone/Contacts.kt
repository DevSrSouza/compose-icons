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

public val TwotoneGroup.Contacts: ImageVector
    get() {
        if (_contacts != null) {
            return _contacts!!
        }
        _contacts = Builder(name = "Contacts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(13.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveTo(10.62f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-1.01f)
                curveTo(7.0f, 13.9f, 10.31f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveToRelative(5.0f, 0.9f, 5.0f, 2.99f)
                lineTo(17.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 2.0f)
                close()
                moveTo(4.0f, 22.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 24.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(13.38f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(9.5f, 8.12f, 9.5f, 9.5f)
                reflectiveCurveTo(10.62f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 8.5f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.69f, 0.0f, -5.0f, 0.9f, -5.0f, 2.99f)
                lineTo(7.0f, 17.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.01f)
                curveTo(17.0f, 13.9f, 13.69f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(8.81f, 15.5f)
                curveToRelative(0.61f, -0.52f, 2.03f, -1.0f, 3.19f, -1.0f)
                curveToRelative(1.17f, 0.0f, 2.59f, 0.48f, 3.2f, 1.0f)
                lineTo(8.81f, 15.5f)
                close()
            }
        }
        .build()
        return _contacts!!
    }

private var _contacts: ImageVector? = null
