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

public val FillGroup.BellOff: ImageVector
    get() {
        if (_bellOff != null) {
            return _bellOff!!
        }
        _bellOff = Builder(name = "BellOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.88f, 18.71f)
                lineToRelative(-0.59f, -0.59f)
                lineTo(14.0f, 16.78f)
                lineToRelative(-0.07f, -0.07f)
                lineTo(6.58f, 9.4f)
                lineTo(5.31f, 8.14f)
                arcToRelative(5.68f, 5.68f, 0.0f, false, false, 0.0f, 0.59f)
                verticalLineTo(13.4f)
                lineToRelative(-1.8f, 1.81f)
                arcTo(1.64f, 1.64f, 0.0f, false, false, 4.64f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(0.34f)
                arcTo(3.84f, 3.84f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(3.88f, 3.88f, 0.0f, false, false, 16.0f, 18.78f)
                close()
                moveTo(14.0f, 18.34f)
                arcTo(1.88f, 1.88f, 0.0f, false, true, 12.0f, 20.0f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -2.0f, -1.66f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.13f, 4.3f)
                lineTo(8.59f, 5.76f)
                lineToRelative(9.53f, 9.53f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.31f, 0.3f)
                arcToRelative(1.58f, 1.58f, 0.0f, false, false, 0.45f, -0.6f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, false, -0.35f, -1.78f)
                lineToRelative(-1.8f, -1.81f)
                verticalLineTo(8.94f)
                arcTo(6.86f, 6.86f, 0.0f, false, false, 12.9f, 2.06f)
                arcTo(6.71f, 6.71f, 0.0f, false, false, 7.58f, 3.67f)
                arcTo(6.88f, 6.88f, 0.0f, false, false, 7.0f, 4.21f)
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
        return _bellOff!!
    }

private var _bellOff: ImageVector? = null
