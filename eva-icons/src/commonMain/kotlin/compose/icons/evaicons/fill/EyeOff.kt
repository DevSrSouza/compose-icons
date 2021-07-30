package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.EyeOff: ImageVector
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
                moveTo(12.0f, 12.0f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.29f, 18.12f)
                lineTo(14.0f, 16.78f)
                lineToRelative(-0.07f, -0.07f)
                lineToRelative(-1.27f, -1.27f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -0.61f, 0.06f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.5f, 12.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, 0.06f, -0.61f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(5.0f, 7.87f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 2.13f, 11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.0f)
                curveToRelative(0.63f, 1.09f, 4.0f, 6.5f, 9.89f, 6.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, false, 3.23f, -0.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.59f, 5.76f)
                lineToRelative(2.8f, 2.8f)
                arcTo(4.07f, 4.07f, 0.0f, false, true, 12.0f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.5f, 12.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -0.06f, 0.61f)
                lineToRelative(2.68f, 2.68f)
                lineToRelative(0.84f, 0.84f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, 2.91f, -3.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.0f)
                curveToRelative(-0.64f, -1.11f, -4.16f, -6.68f, -10.14f, -6.5f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, false, -3.23f, 0.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 19.29f)
                lineTo(19.41f, 18.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(7.89f, 6.47f)
                lineTo(6.42f, 5.0f)
                lineTo(4.71f, 3.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.29f, 4.71f)
                lineTo(5.53f, 7.0f)
                lineTo(7.28f, 8.7f)
                lineTo(14.59f, 16.0f)
                lineToRelative(0.07f, 0.07f)
                lineTo(16.0f, 17.41f)
                lineToRelative(0.59f, 0.59f)
                lineToRelative(2.7f, 2.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.71f, 19.29f)
                close()
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
