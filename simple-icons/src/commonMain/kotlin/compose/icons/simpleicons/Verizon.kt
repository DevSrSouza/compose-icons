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

public val SimpleIcons.Verizon: ImageVector
    get() {
        if (_verizon != null) {
            return _verizon!!
        }
        _verizon = Builder(name = "Verizon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.302f, 0.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(0.003f)
                lineTo(10.674f, 24.0f)
                horizontalLineTo(7.662f)
                lineTo(2.0f, 12.0f)
                horizontalLineToRelative(3.727f)
                lineToRelative(3.449f, 7.337f)
                close()
            }
        }
        .build()
        return _verizon!!
    }

private var _verizon: ImageVector? = null
