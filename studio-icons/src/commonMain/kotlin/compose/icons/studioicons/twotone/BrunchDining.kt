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

public val TwotoneGroup.BrunchDining: ImageVector
    get() {
        if (_brunchDining != null) {
            return _brunchDining!!
        }
        _brunchDining = Builder(name = "BrunchDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.47f)
                curveToRelative(0.0f, 0.95f, 0.37f, 1.89f, 1.03f, 2.6f)
                curveToRelative(0.63f, -0.71f, 0.97f, -1.61f, 0.97f, -2.56f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 21.5f)
                curveTo(2.0f, 21.78f, 2.22f, 22.0f, 2.49f, 22.0f)
                horizontalLineToRelative(13.02f)
                curveToRelative(0.27f, 0.0f, 0.49f, -0.22f, 0.49f, -0.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.47f, 15.45f)
                curveToRelative(0.99f, -1.07f, 1.53f, -2.48f, 1.53f, -3.94f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(9.47f)
                curveToRelative(0.0f, 1.48f, 0.58f, 2.92f, 1.6f, 4.0f)
                lineToRelative(0.4f, 0.42f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.03f)
                lineTo(20.47f, 15.45f)
                close()
                moveTo(18.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(19.03f, 14.07f)
                curveToRelative(-0.65f, -0.71f, -1.03f, -1.65f, -1.03f, -2.6f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.51f)
                curveTo(20.0f, 12.46f, 19.66f, 13.36f, 19.03f, 14.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.5f)
                curveTo(2.22f, 16.0f, 2.0f, 16.22f, 2.0f, 16.5f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.5f)
                curveTo(16.0f, 16.22f, 15.78f, 16.0f, 15.5f, 16.0f)
                close()
            }
        }
        .build()
        return _brunchDining!!
    }

private var _brunchDining: ImageVector? = null
