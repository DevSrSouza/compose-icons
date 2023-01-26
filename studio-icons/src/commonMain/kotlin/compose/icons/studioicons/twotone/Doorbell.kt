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

public val TwotoneGroup.Doorbell: ImageVector
    get() {
        if (_doorbell != null) {
            return _doorbell!!
        }
        _doorbell = Builder(name = "Doorbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-9.0f)
                lineToRelative(-6.0f, -4.5f)
                lineTo(6.0f, 10.0f)
                close()
                moveTo(12.0f, 17.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveTo(13.0f, 17.05f, 12.55f, 17.5f, 12.0f, 17.5f)
                close()
                moveTo(12.75f, 9.25f)
                verticalLineTo(9.5f)
                curveTo(14.19f, 9.84f, 15.0f, 11.12f, 15.0f, 12.66f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.34f)
                curveToRelative(0.0f, -1.54f, 0.82f, -2.82f, 2.25f, -3.16f)
                verticalLineTo(9.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveTo(12.75f, 8.84f, 12.75f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(18.0f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-9.0f)
                lineToRelative(6.0f, -4.5f)
                lineToRelative(6.0f, 4.5f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 9.25f)
                verticalLineTo(9.5f)
                curveTo(9.82f, 9.84f, 9.0f, 11.12f, 9.0f, 12.66f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.34f)
                curveToRelative(0.0f, -1.54f, -0.81f, -2.82f, -2.25f, -3.16f)
                verticalLineTo(9.25f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveTo(11.25f, 8.84f, 11.25f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.5f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(11.0f, 17.05f, 11.45f, 17.5f, 12.0f, 17.5f)
                close()
            }
        }
        .build()
        return _doorbell!!
    }

private var _doorbell: ImageVector? = null
