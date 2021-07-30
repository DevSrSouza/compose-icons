package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.71f, 3.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.29f, 4.71f)
                lineToRelative(5.63f, 5.63f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.74f, 4.74f)
                lineToRelative(5.63f, 5.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
                moveTo(12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 12.0f)
                reflectiveCurveToRelative(0.0f, -0.05f, 0.0f, -0.07f)
                lineToRelative(1.56f, 1.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.22f, 17.0f)
                curveToRelative(-4.3f, 0.1f, -7.12f, -3.59f, -8.0f, -5.0f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 6.46f, 9.28f)
                lineTo(5.0f, 7.87f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 2.13f, 11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.0f)
                curveToRelative(0.63f, 1.09f, 4.0f, 6.5f, 9.89f, 6.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, false, 3.23f, -0.67f)
                lineToRelative(-1.58f, -1.58f)
                arcTo(7.74f, 7.74f, 0.0f, false, true, 12.22f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.87f, 11.5f)
                curveTo(21.23f, 10.39f, 17.7f, 4.82f, 11.73f, 5.0f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, false, -3.23f, 0.67f)
                lineToRelative(1.58f, 1.58f)
                arcTo(7.74f, 7.74f, 0.0f, false, true, 11.78f, 7.0f)
                curveToRelative(4.29f, -0.11f, 7.11f, 3.59f, 8.0f, 5.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -2.29f, 2.72f)
                lineTo(19.0f, 16.13f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, 2.91f, -3.63f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.87f, 11.5f)
                close()
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
