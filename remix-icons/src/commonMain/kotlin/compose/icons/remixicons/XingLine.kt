package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.XingLine: ImageVector
    get() {
        if (_xingLine != null) {
            return _xingLine!!
        }
        _xingLine = Builder(name = "XingLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.444f, 3.5f)
                lineTo(13.81f, 14.99f)
                lineTo(17.857f, 22.0f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(-4.045f, -7.009f)
                horizontalLineTo(11.5f)
                lineTo(18.134f, 3.5f)
                horizontalLineToRelative(2.31f)
                close()
                moveTo(8.31f, 7.0f)
                lineToRelative(2.422f, 4.196f)
                lineToRelative(-0.002f, 0.001f)
                lineTo(7.67f, 16.5f)
                horizontalLineTo(5.361f)
                lineToRelative(3.06f, -5.305f)
                lineTo(6.002f, 7.0f)
                horizontalLineTo(8.31f)
                close()
            }
        }
        .build()
        return _xingLine!!
    }

private var _xingLine: ImageVector? = null
