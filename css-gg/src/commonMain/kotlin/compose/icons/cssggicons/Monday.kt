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

public val CssGgIcons.Monday: ImageVector
    get() {
        if (_monday != null) {
            return _monday!!
        }
        _monday = Builder(name = "Monday", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.779f, 6.139f)
                curveTo(7.729f, 4.782f, 9.6f, 4.452f, 10.957f, 5.402f)
                curveTo(12.314f, 6.353f, 12.644f, 8.223f, 11.693f, 9.581f)
                lineTo(5.958f, 17.772f)
                curveTo(5.007f, 19.129f, 3.137f, 19.459f, 1.78f, 18.509f)
                curveTo(0.422f, 17.559f, 0.092f, 15.688f, 1.043f, 14.331f)
                lineTo(6.779f, 6.139f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.268f, 6.228f)
                curveTo(16.218f, 4.871f, 18.089f, 4.541f, 19.446f, 5.491f)
                curveTo(20.803f, 6.442f, 21.133f, 8.312f, 20.183f, 9.67f)
                lineTo(14.447f, 17.861f)
                curveTo(13.497f, 19.218f, 11.626f, 19.548f, 10.269f, 18.598f)
                curveTo(8.912f, 17.647f, 8.582f, 15.777f, 9.532f, 14.42f)
                lineTo(15.268f, 6.228f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 18.86f)
                curveTo(22.157f, 18.86f, 23.5f, 17.517f, 23.5f, 15.86f)
                curveTo(23.5f, 14.203f, 22.157f, 12.86f, 20.5f, 12.86f)
                curveTo(18.843f, 12.86f, 17.5f, 14.203f, 17.5f, 15.86f)
                curveTo(17.5f, 17.517f, 18.843f, 18.86f, 20.5f, 18.86f)
                close()
            }
        }
        .build()
        return _monday!!
    }

private var _monday: ImageVector? = null
