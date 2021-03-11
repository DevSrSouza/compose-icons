package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Alitalia: ImageVector
    get() {
        if (_alitalia != null) {
            return _alitalia!!
        }
        _alitalia = Builder(name = "Alitalia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.429f, 20.551f)
                horizontalLineTo(0.0f)
                lineToRelative(14.257f, -14.87f)
                curveToRelative(1.622f, -1.765f, 2.878f, -2.232f, 4.686f, -2.232f)
                horizontalLineTo(24.0f)
                lineTo(21.602f, 20.55f)
                horizontalLineToRelative(-4.17f)
                lineTo(19.49f, 5.907f)
                moveTo(15.7f, 20.551f)
                lineToRelative(1.384f, -9.842f)
                lineToRelative(-9.457f, 9.842f)
                close()
            }
        }
        .build()
        return _alitalia!!
    }

private var _alitalia: ImageVector? = null
