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

public val TwotoneGroup.Recommend: ImageVector
    get() {
        if (_recommend != null) {
            return _recommend!!
        }
        _recommend = Builder(name = "Recommend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f)
                reflectiveCurveTo(16.41f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(17.9f, 12.3f)
                lineToRelative(-2.1f, 4.9f)
                curveToRelative(-0.22f, 0.51f, -0.74f, 0.83f, -1.3f, 0.8f)
                horizontalLineTo(9.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(-0.02f, -0.38f, 0.13f, -0.74f, 0.4f, -1.0f)
                lineTo(12.0f, 5.0f)
                lineToRelative(0.69f, 0.69f)
                curveToRelative(0.18f, 0.19f, 0.29f, 0.44f, 0.3f, 0.7f)
                verticalLineToRelative(0.2f)
                lineTo(12.41f, 10.0f)
                horizontalLineTo(17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.8f)
                curveTo(18.02f, 11.97f, 17.98f, 12.15f, 17.9f, 12.3f)
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
                reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(0.58f, -3.41f)
                verticalLineToRelative(-0.2f)
                curveToRelative(-0.01f, -0.26f, -0.12f, -0.51f, -0.3f, -0.7f)
                lineTo(12.0f, 5.0f)
                lineToRelative(-4.6f, 5.0f)
                curveToRelative(-0.27f, 0.26f, -0.42f, 0.62f, -0.4f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.56f, 0.03f, 1.08f, -0.29f, 1.3f, -0.8f)
                lineToRelative(2.1f, -4.9f)
                curveToRelative(0.08f, -0.15f, 0.12f, -0.33f, 0.1f, -0.5f)
                verticalLineTo(11.0f)
                curveTo(18.0f, 10.45f, 17.55f, 10.0f, 17.0f, 10.0f)
                close()
            }
        }
        .build()
        return _recommend!!
    }

private var _recommend: ImageVector? = null
