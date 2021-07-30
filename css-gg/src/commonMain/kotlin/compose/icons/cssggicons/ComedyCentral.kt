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

public val CssGgIcons.ComedyCentral: ImageVector
    get() {
        if (_comedyCentral != null) {
            return _comedyCentral!!
        }
        _comedyCentral = Builder(name = "ComedyCentral", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5445f, 19.0f)
                curveTo(14.4105f, 19.0f, 17.5445f, 15.866f, 17.5445f, 12.0f)
                curveTo(17.5445f, 8.134f, 14.4105f, 5.0f, 10.5445f, 5.0f)
                curveTo(8.6115f, 5.0f, 6.8615f, 5.7835f, 5.5947f, 7.0503f)
                lineTo(3.4734f, 4.929f)
                lineTo(3.4554f, 4.9469f)
                curveTo(5.2665f, 3.1267f, 7.7739f, 2.0f, 10.5445f, 2.0f)
                curveTo(16.0673f, 2.0f, 20.5445f, 6.4771f, 20.5445f, 12.0f)
                curveTo(20.5445f, 17.5228f, 16.0673f, 22.0f, 10.5445f, 22.0f)
                curveTo(7.7831f, 22.0f, 5.2831f, 20.8807f, 3.4734f, 19.0711f)
                lineTo(5.5947f, 16.9498f)
                curveTo(6.8615f, 18.2165f, 8.6115f, 19.0f, 10.5445f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5445f, 14.0f)
                curveTo(11.1376f, 14.0f, 11.6704f, 13.7418f, 12.0367f, 13.3317f)
                lineTo(14.1594f, 15.4544f)
                curveTo(13.249f, 16.4068f, 11.966f, 17.0f, 10.5445f, 17.0f)
                curveTo(7.7831f, 17.0f, 5.5445f, 14.7614f, 5.5445f, 12.0f)
                curveTo(5.5445f, 9.2386f, 7.7831f, 7.0f, 10.5445f, 7.0f)
                curveTo(11.966f, 7.0f, 13.249f, 7.5932f, 14.1594f, 8.5456f)
                lineTo(12.0367f, 10.6683f)
                curveTo(11.6704f, 10.2582f, 11.1376f, 10.0f, 10.5445f, 10.0f)
                curveTo(9.4399f, 10.0f, 8.5445f, 10.8954f, 8.5445f, 12.0f)
                curveTo(8.5445f, 13.1046f, 9.4399f, 14.0f, 10.5445f, 14.0f)
                close()
            }
        }
        .build()
        return _comedyCentral!!
    }

private var _comedyCentral: ImageVector? = null
