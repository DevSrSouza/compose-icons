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

public val TwotoneGroup.Handyman: ImageVector
    get() {
        if (_handyman != null) {
            return _handyman!!
        }
        _handyman = Builder(name = "Handyman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.66f, 14.64f)
                lineToRelative(-4.25f, 4.24f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(4.24f, -4.25f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-0.7f, -0.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5955f, 15.3453f)
                lineToRelative(0.7071f, -0.7071f)
                lineToRelative(4.2426f, 4.2426f)
                lineToRelative(-0.7071f, 0.7071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.67f, 18.17f)
                lineToRelative(-5.3f, -5.3f)
                horizontalLineToRelative(-0.99f)
                lineToRelative(-2.54f, 2.54f)
                verticalLineToRelative(0.99f)
                lineToRelative(5.3f, 5.3f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(2.12f, -2.12f)
                curveTo(22.06f, 19.2f, 22.06f, 18.56f, 21.67f, 18.17f)
                close()
                moveTo(18.84f, 19.59f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.24f, 4.24f)
                lineTo(18.84f, 19.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.34f, 10.19f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-1.41f, 1.41f)
                verticalLineTo(1.71f)
                lineTo(15.22f, 1.0f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(0.71f, 0.71f)
                horizontalLineToRelative(2.83f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-2.89f, 2.89f)
                lineTo(7.85f, 6.48f)
                verticalLineTo(5.06f)
                lineTo(4.83f, 2.04f)
                lineTo(2.0f, 4.87f)
                lineToRelative(3.03f, 3.03f)
                horizontalLineToRelative(1.41f)
                lineToRelative(4.13f, 4.13f)
                lineToRelative(-0.85f, 0.85f)
                horizontalLineTo(7.6f)
                lineToRelative(-5.3f, 5.3f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(5.3f, -5.3f)
                verticalLineToRelative(-2.12f)
                lineToRelative(5.15f, -5.15f)
                lineTo(17.34f, 10.19f)
                close()
                moveTo(9.36f, 15.34f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(0.0f, 0.0f)
                lineTo(9.36f, 15.34f)
                lineTo(9.36f, 15.34f)
                close()
            }
        }
        .build()
        return _handyman!!
    }

private var _handyman: ImageVector? = null
