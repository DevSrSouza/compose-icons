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

public val TwotoneGroup.NoFlash: ImageVector
    get() {
        if (_noFlash != null) {
            return _noFlash!!
        }
        _noFlash = Builder(name = "NoFlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.42f, 16.24f)
                lineToRelative(2.55f, 2.55f)
                lineTo(15.96f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-8.6f)
                horizontalLineToRelative(3.02f)
                lineToRelative(0.59f, -0.65f)
                lineToRelative(0.15f, -0.16f)
                lineToRelative(1.5f, 1.5f)
                curveTo(7.68f, 12.43f, 6.5f, 13.82f, 6.5f, 15.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveTo(11.68f, 19.0f, 13.07f, 17.82f, 13.42f, 16.24f)
                close()
                moveTo(16.0f, 13.17f)
                lineToRelative(0.0f, -1.77f)
                horizontalLineToRelative(-1.77f)
                lineTo(16.0f, 13.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4f, 5.6f)
                horizontalLineTo(22.0f)
                lineTo(19.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(20.4f, 5.6f)
                close()
                moveTo(16.0f, 11.4f)
                verticalLineToRelative(1.77f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f)
                horizontalLineToRelative(-2.54f)
                lineTo(12.58f, 8.0f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(3.4f, 3.4f)
                horizontalLineTo(16.0f)
                close()
                moveTo(17.97f, 17.97f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineToRelative(5.66f, 5.66f)
                lineTo(6.14f, 9.4f)
                horizontalLineTo(3.6f)
                curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f)
                verticalLineToRelative(9.4f)
                curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f)
                horizontalLineToRelative(12.8f)
                curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(1.41f, -1.41f)
                lineTo(17.97f, 17.97f)
                close()
                moveTo(11.5f, 15.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(9.17f, 14.0f, 10.0f, 14.0f)
                reflectiveCurveTo(11.5f, 14.67f, 11.5f, 15.5f)
                close()
                moveTo(15.96f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-8.6f)
                horizontalLineToRelative(2.14f)
                horizontalLineToRelative(0.88f)
                lineToRelative(0.59f, -0.65f)
                lineToRelative(0.15f, -0.16f)
                lineToRelative(1.5f, 1.5f)
                curveTo(7.68f, 12.43f, 6.5f, 13.82f, 6.5f, 15.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.68f, 0.0f, 3.07f, -1.18f, 3.42f, -2.76f)
                lineToRelative(2.55f, 2.55f)
                lineTo(15.96f, 20.0f)
                close()
            }
        }
        .build()
        return _noFlash!!
    }

private var _noFlash: ImageVector? = null
