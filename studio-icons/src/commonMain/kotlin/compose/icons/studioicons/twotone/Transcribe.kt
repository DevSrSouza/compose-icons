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

public val TwotoneGroup.Transcribe: ImageVector
    get() {
        if (_transcribe != null) {
            return _transcribe!!
        }
        _transcribe = Builder(name = "Transcribe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.48f, 17.34f)
                curveTo(13.29f, 16.73f, 11.37f, 16.0f, 9.0f, 16.0f)
                curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f)
                curveTo(3.2f, 17.5f, 3.0f, 17.84f, 3.0f, 18.22f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.78f)
                curveTo(15.0f, 17.84f, 14.8f, 17.5f, 14.48f, 17.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.93f, 2.0f)
                curveToRelative(-3.9f, 3.89f, -3.91f, 9.95f, 0.0f, 14.0f)
                lineToRelative(1.63f, -1.63f)
                curveToRelative(-2.77f, -3.02f, -2.77f, -7.56f, 0.0f, -10.74f)
                lineTo(17.93f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(5.0f, 6.79f, 5.0f, 9.0f)
                curveTo(5.0f, 11.21f, 6.79f, 13.0f, 9.0f, 13.0f)
                close()
                moveTo(9.0f, 7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveTo(7.0f, 7.9f, 7.9f, 7.0f, 9.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.39f, 15.56f)
                curveTo(13.71f, 14.7f, 11.53f, 14.0f, 9.0f, 14.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(1.61f, 16.07f, 1.0f, 17.1f, 1.0f, 18.22f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.78f)
                curveTo(17.0f, 17.1f, 16.39f, 16.07f, 15.39f, 15.56f)
                close()
                moveTo(15.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-0.78f)
                curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f)
                curveTo(4.71f, 16.73f, 6.63f, 16.0f, 9.0f, 16.0f)
                curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f)
                curveTo(14.8f, 17.5f, 15.0f, 17.84f, 15.0f, 18.22f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.92f, 7.06f)
                lineToRelative(-1.68f, -1.69f)
                curveToRelative(-2.02f, 2.02f, -2.02f, 5.07f, 0.0f, 7.27f)
                lineToRelative(1.68f, -1.69f)
                curveTo(22.08f, 9.77f, 22.08f, 8.24f, 22.92f, 7.06f)
                close()
            }
        }
        .build()
        return _transcribe!!
    }

private var _transcribe: ImageVector? = null
