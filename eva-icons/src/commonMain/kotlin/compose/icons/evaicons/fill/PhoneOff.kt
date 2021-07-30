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

public val FillGroup.PhoneOff: ImageVector
    get() {
        if (_phoneOff != null) {
            return _phoneOff!!
        }
        _phoneOff = Builder(name = "PhoneOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.27f, 12.06f)
                arcToRelative(10.37f, 10.37f, 0.0f, false, true, -0.8f, -1.42f)
                curveTo(9.71f, 10.0f, 9.72f, 10.0f, 9.85f, 9.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.26f, -0.92f)
                lineTo(8.74f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.65f, -0.72f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, false, -0.72f, -0.18f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 6.6f, 2.0f)
                arcTo(4.6f, 4.6f, 0.0f, false, false, 2.0f, 6.6f)
                arcToRelative(15.33f, 15.33f, 0.0f, false, false, 3.27f, 9.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.94f, 16.64f)
                arcToRelative(4.34f, 4.34f, 0.0f, false, false, -0.19f, -0.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.72f, -0.65f)
                lineToRelative(-6.0f, -1.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.92f, 0.26f)
                curveToRelative(-0.14f, 0.13f, -0.15f, 0.14f, -0.8f, 1.38f)
                arcToRelative(10.88f, 10.88f, 0.0f, false, true, -1.41f, -0.8f)
                lineToRelative(-4.0f, 4.0f)
                arcTo(15.33f, 15.33f, 0.0f, false, false, 17.4f, 22.0f)
                arcTo(4.6f, 4.6f, 0.0f, false, false, 22.0f, 17.4f)
                arcTo(4.77f, 4.77f, 0.0f, false, false, 21.94f, 16.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.74f, 4.26f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, -1.26f, 0.0f)
                lineTo(4.26f, 18.48f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, -0.26f, 0.63f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 1.52f, 0.63f)
                lineTo(19.74f, 5.52f)
                arcTo(0.89f, 0.89f, 0.0f, false, false, 19.74f, 4.26f)
                close()
            }
        }
        .build()
        return _phoneOff!!
    }

private var _phoneOff: ImageVector? = null
