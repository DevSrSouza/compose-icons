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

public val SimpleIcons.Playcanvas: ImageVector
    get() {
        if (_playcanvas != null) {
            return _playcanvas!!
        }
        _playcanvas = Builder(name = "Playcanvas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.115f, 0.0f)
                lineToRelative(-0.002f, 3.414f)
                lineToRelative(5.823f, 3.41f)
                lineToRelative(-5.82f, 3.414f)
                lineToRelative(-0.003f, 3.412f)
                lineToRelative(11.774f, -6.826f)
                close()
                moveTo(17.885f, 10.35f)
                lineTo(6.113f, 17.174f)
                lineTo(17.887f, 24.0f)
                lineToRelative(-0.002f, -3.414f)
                lineToRelative(-5.82f, -3.412f)
                lineToRelative(5.822f, -3.412f)
                close()
            }
        }
        .build()
        return _playcanvas!!
    }

private var _playcanvas: ImageVector? = null
