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

public val SimpleIcons.Pkgsrc: ImageVector
    get() {
        if (_pkgsrc != null) {
            return _pkgsrc!!
        }
        _pkgsrc = Builder(name = "Pkgsrc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.908f, 8.763f)
                lineToRelative(9.157f, -5.132f)
                lineTo(11.25f, 0.0f)
                lineTo(1.62f, 4.42f)
                close()
                moveTo(14.408f, 11.053f)
                lineTo(23.408f, 5.685f)
                lineTo(22.46f, 17.525f)
                lineTo(14.269f, 23.907f)
                close()
                moveTo(0.593f, 6.712f)
                lineTo(1.619f, 18.79f)
                lineTo(11.922f, 24.0f)
                lineToRelative(-0.12f, -12.788f)
                close()
            }
        }
        .build()
        return _pkgsrc!!
    }

private var _pkgsrc: ImageVector? = null
