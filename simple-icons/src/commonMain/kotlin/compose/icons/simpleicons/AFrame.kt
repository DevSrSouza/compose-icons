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

public val SimpleIcons.Aframe: ImageVector
    get() {
        if (_aframe != null) {
            return _aframe!!
        }
        _aframe = Builder(name = "Aframe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.37f, 17.07f)
                lineTo(6.57f, 17.07f)
                lineTo(4.24f, 24.0f)
                lineTo(3.01f, 24.0f)
                lineToRelative(8.23f, -24.0f)
                horizontalLineToRelative(1.52f)
                lineToRelative(8.23f, 24.0f)
                horizontalLineToRelative(-1.3f)
                close()
                moveTo(16.98f, 15.94f)
                lineToRelative(-5.0f, -14.96f)
                lineToRelative(-5.03f, 14.98f)
                horizontalLineToRelative(10.03f)
                close()
            }
        }
        .build()
        return _aframe!!
    }

private var _aframe: ImageVector? = null
