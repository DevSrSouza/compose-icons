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

public val TwotoneGroup.NestCamWiredStand: ImageVector
    get() {
        if (_nestCamWiredStand != null) {
            return _nestCamWiredStand!!
        }
        _nestCamWiredStand = Builder(name = "NestCamWiredStand", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                curveTo(15.0f, 18.35f, 13.65f, 17.0f, 12.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                lineToRelative(-4.08f, 0.41f)
                curveTo(9.69f, 3.64f, 8.0f, 5.5f, 8.0f, 7.75f)
                reflectiveCurveToRelative(1.69f, 4.11f, 3.92f, 4.34f)
                lineToRelative(4.11f, 0.42f)
                lineTo(16.0f, 3.0f)
                lineTo(16.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.0f)
                curveToRelative(-0.15f, 0.0f, 0.11f, -0.02f, -4.28f, 0.42f)
                curveTo(8.47f, 1.75f, 6.0f, 4.48f, 6.0f, 7.75f)
                reflectiveCurveToRelative(2.47f, 6.0f, 5.72f, 6.33f)
                lineToRelative(1.9f, 0.19f)
                lineToRelative(-0.56f, 0.85f)
                curveTo(12.71f, 15.04f, 12.36f, 15.0f, 12.0f, 15.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.67f, -0.83f, -3.15f, -2.09f, -4.06f)
                lineToRelative(0.97f, -1.45f)
                curveToRelative(0.04f, 0.0f, 0.09f, 0.01f, 0.13f, 0.01f)
                curveToRelative(1.09f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(18.0f, 1.89f, 17.09f, 1.0f, 16.0f, 1.0f)
                close()
                moveTo(15.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                curveTo(13.65f, 17.0f, 15.0f, 18.35f, 15.0f, 20.0f)
                close()
                moveTo(11.92f, 12.09f)
                curveTo(9.69f, 11.86f, 8.0f, 10.0f, 8.0f, 7.75f)
                reflectiveCurveToRelative(1.69f, -4.11f, 3.92f, -4.34f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.03f, 9.5f)
                lineTo(11.92f, 12.09f)
                close()
            }
        }
        .build()
        return _nestCamWiredStand!!
    }

private var _nestCamWiredStand: ImageVector? = null
