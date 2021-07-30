package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tasmota: ImageVector
    get() {
        if (_tasmota != null) {
            return _tasmota!!
        }
        _tasmota = Builder(name = "Tasmota", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(0.0f, 12.0f)
                lineToRelative(1.371f, 1.372f)
                lineTo(12.0f, 2.743f)
                lineToRelative(10.629f, 10.629f)
                lineTo(24.0f, 12.0f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(12.0f, 8.463f)
                arcToRelative(7.41f, 7.41f, 0.0f, false, false, -2.64f, 14.334f)
                verticalLineToRelative(-2.133f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 1.671f, -10.17f)
                lineTo(11.031f, 24.0f)
                horizontalLineToRelative(1.94f)
                lineTo(12.971f, 10.494f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 1.669f, 10.171f)
                verticalLineToRelative(2.133f)
                arcTo(7.41f, 7.41f, 0.0f, false, false, 12.0f, 8.463f)
                close()
            }
        }
        .build()
        return _tasmota!!
    }

private var _tasmota: ImageVector? = null
