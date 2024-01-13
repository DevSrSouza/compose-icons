package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ArrowLeft24: ImageVector
    get() {
        if (_arrowLeft24 != null) {
            return _arrowLeft24!!
        }
        _arrowLeft24 = Builder(name = "ArrowLeft24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.78f, 19.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-6.25f, -6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(6.25f, -6.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 1.275f, 0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.215f, 0.734f)
                lineTo(5.81f, 11.5f)
                horizontalLineToRelative(14.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(5.81f)
                lineToRelative(4.97f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                close()
            }
        }
        .build()
        return _arrowLeft24!!
    }

private var _arrowLeft24: ImageVector? = null
