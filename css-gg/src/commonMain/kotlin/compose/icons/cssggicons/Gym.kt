package compose.icons.cssggicons

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
import compose.icons.CssGgIcons

public val CssGgIcons.Gym: ImageVector
    get() {
        if (_gym != null) {
            return _gym!!
        }
        _gym = Builder(name = "Gym", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.274f, 9.869f)
                lineTo(16.833f, 4.954f)
                lineTo(18.471f, 3.807f)
                lineTo(21.912f, 8.722f)
                lineTo(20.274f, 9.869f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.39f, 12.409f)
                lineTo(16.669f, 9.951f)
                lineTo(8.478f, 15.687f)
                lineTo(10.198f, 18.144f)
                lineTo(8.56f, 19.292f)
                lineTo(3.972f, 12.738f)
                lineTo(5.61f, 11.591f)
                lineTo(7.331f, 14.049f)
                lineTo(15.522f, 8.313f)
                lineTo(13.802f, 5.855f)
                lineTo(15.44f, 4.708f)
                lineTo(20.028f, 11.262f)
                lineTo(18.39f, 12.409f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.765f, 7.083f)
                lineTo(22.403f, 5.936f)
                lineTo(21.256f, 4.298f)
                lineTo(19.618f, 5.445f)
                lineTo(20.765f, 7.083f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.168f, 19.046f)
                lineTo(3.726f, 14.131f)
                lineTo(2.088f, 15.278f)
                lineTo(5.529f, 20.193f)
                lineTo(7.168f, 19.046f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.382f, 18.555f)
                lineTo(2.744f, 19.702f)
                lineTo(1.597f, 18.064f)
                lineTo(3.235f, 16.917f)
                lineTo(4.382f, 18.555f)
                close()
            }
        }
        .build()
        return _gym!!
    }

private var _gym: ImageVector? = null
