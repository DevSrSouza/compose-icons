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

public val FillGroup.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = Builder(name = "FlashOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(17.33f, 14.5f)
                lineToRelative(2.5f, -3.74f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 9.2f)
                horizontalLineTo(13.11f)
                lineToRelative(0.77f, -7.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.65f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.17f, 0.38f)
                lineTo(8.94f, 6.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.67f, 9.5f)
                lineToRelative(-2.5f, 3.74f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 14.8f)
                horizontalLineToRelative(5.89f)
                lineToRelative(-0.77f, 7.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.65f, 1.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.34f, 0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.83f, -0.44f)
                lineToRelative(3.12f, -4.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 19.29f)
                lineToRelative(-16.0f, -16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.29f, 4.71f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.71f, 19.29f)
                close()
            }
        }
        .build()
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
