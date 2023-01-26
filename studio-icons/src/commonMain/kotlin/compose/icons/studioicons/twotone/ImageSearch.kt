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

public val TwotoneGroup.ImageSearch: ImageVector
    get() {
        if (_imageSearch != null) {
            return _imageSearch!!
        }
        _imageSearch = Builder(name = "ImageSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.7f, 11.53f)
                curveToRelative(-0.7f, 0.31f, -1.45f, 0.47f, -2.21f, 0.47f)
                curveTo(12.46f, 12.0f, 10.0f, 9.53f, 10.0f, 6.5f)
                curveToRelative(0.0f, -0.17f, 0.01f, -0.34f, 0.03f, -0.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-8.17f)
                lineToRelative(-0.3f, -0.3f)
                close()
                moveTo(5.5f, 18.0f)
                lineToRelative(2.75f, -3.53f)
                lineToRelative(1.96f, 2.36f)
                lineToRelative(2.75f, -3.54f)
                lineTo(16.5f, 18.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.21f, 16.83f)
                lineToRelative(-1.96f, -2.36f)
                lineTo(5.5f, 18.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-3.54f, -4.71f)
                close()
                moveTo(20.0f, 6.5f)
                curveTo(20.0f, 4.01f, 17.99f, 2.0f, 15.5f, 2.0f)
                reflectiveCurveTo(11.0f, 4.01f, 11.0f, 6.5f)
                reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f)
                curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineTo(21.0f, 13.42f)
                lineTo(22.42f, 12.0f)
                lineTo(19.3f, 8.89f)
                curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f)
                close()
                moveTo(15.5f, 9.0f)
                curveTo(14.12f, 9.0f, 13.0f, 7.88f, 13.0f, 6.5f)
                reflectiveCurveTo(14.12f, 4.0f, 15.5f, 4.0f)
                reflectiveCurveTo(18.0f, 5.12f, 18.0f, 6.5f)
                reflectiveCurveTo(16.88f, 9.0f, 15.5f, 9.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(6.03f)
                curveToRelative(0.06f, -0.72f, 0.27f, -1.39f, 0.58f, -2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-6.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _imageSearch!!
    }

private var _imageSearch: ImageVector? = null
