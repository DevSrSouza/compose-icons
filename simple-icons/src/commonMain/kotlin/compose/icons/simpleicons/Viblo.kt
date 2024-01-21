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

public val SimpleIcons.Viblo: ImageVector
    get() {
        if (_viblo != null) {
            return _viblo!!
        }
        _viblo = Builder(name = "Viblo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.569f, 19.68f)
                horizontalLineToRelative(2.904f)
                lineTo(21.621f, 0.018f)
                lineTo(18.705f, 0.0f)
                lineToRelative(-4.428f, 10.668f)
                lineTo(9.705f, 10.668f)
                lineTo(5.295f, 0.0f)
                lineTo(2.379f, 0.0f)
                lineToRelative(8.19f, 19.68f)
                close()
                moveTo(3.549f, 21.534f)
                horizontalLineToRelative(16.908f)
                lineTo(20.457f, 24.0f)
                lineTo(3.549f, 24.0f)
                verticalLineToRelative(-2.466f)
                close()
            }
        }
        .build()
        return _viblo!!
    }

private var _viblo: ImageVector? = null
