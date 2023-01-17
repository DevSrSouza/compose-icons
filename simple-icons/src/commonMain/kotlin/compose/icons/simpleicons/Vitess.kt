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

public val SimpleIcons.Vitess: ImageVector
    get() {
        if (_vitess != null) {
            return _vitess!!
        }
        _vitess = Builder(name = "Vitess", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.206f, 1.045f)
                lineToRelative(-7.217f, 13.186f)
                lineTo(4.817f, 1.045f)
                horizontalLineTo(0.0f)
                lineToRelative(11.904f, 21.91f)
                lineTo(24.0f, 1.045f)
                horizontalLineToRelative(-4.794f)
                close()
            }
        }
        .build()
        return _vitess!!
    }

private var _vitess: ImageVector? = null
