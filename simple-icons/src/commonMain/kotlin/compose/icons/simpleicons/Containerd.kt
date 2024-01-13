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

public val SimpleIcons.Containerd: ImageVector
    get() {
        if (_containerd != null) {
            return _containerd!!
        }
        _containerd = Builder(name = "Containerd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.629f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(20.37f, 24.0f)
                lineTo(20.37f, 0.0f)
                close()
                moveTo(17.59f, 21.208f)
                lineTo(6.421f, 21.208f)
                lineTo(6.421f, 10.604f)
                horizontalLineToRelative(7.812f)
                lineTo(14.233f, 6.692f)
                horizontalLineToRelative(3.346f)
                verticalLineToRelative(14.516f)
                close()
                moveTo(9.767f, 13.396f)
                horizontalLineToRelative(4.466f)
                verticalLineToRelative(5.02f)
                lineTo(9.767f, 18.416f)
                close()
            }
        }
        .build()
        return _containerd!!
    }

private var _containerd: ImageVector? = null
