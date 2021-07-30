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

public val SimpleIcons.Faceit: ImageVector
    get() {
        if (_faceit != null) {
            return _faceit!!
        }
        _faceit = Builder(name = "Faceit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.999f, 2.705f)
                arcToRelative(0.167f, 0.167f, 0.0f, false, false, -0.312f, -0.1f)
                arcToRelative(1141.27f, 1141.27f, 0.0f, false, false, -6.053f, 9.375f)
                horizontalLineTo(0.218f)
                curveToRelative(-0.221f, 0.0f, -0.301f, 0.282f, -0.11f, 0.352f)
                curveToRelative(7.227f, 2.73f, 17.667f, 6.836f, 23.5f, 9.134f)
                curveToRelative(0.15f, 0.06f, 0.39f, -0.08f, 0.39f, -0.18f)
                close()
            }
        }
        .build()
        return _faceit!!
    }

private var _faceit: ImageVector? = null
