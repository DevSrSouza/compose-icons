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

public val SimpleIcons.Internetcomputer: ImageVector
    get() {
        if (_internetcomputer != null) {
            return _internetcomputer!!
        }
        _internetcomputer = Builder(name = "Internetcomputer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.264f, 6.24f)
                curveToRelative(-2.52f, 0.0f, -5.376f, 3.024f, -6.264f, 3.984f)
                curveToRelative(-0.72f, -0.792f, -3.696f, -3.984f, -6.264f, -3.984f)
                curveTo(2.568f, 6.24f, 0.0f, 8.832f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.168f, 2.568f, 5.76f, 5.736f, 5.76f)
                curveToRelative(2.52f, 0.0f, 5.376f, -3.024f, 6.264f, -3.984f)
                curveToRelative(0.72f, 0.792f, 3.696f, 3.984f, 6.264f, 3.984f)
                curveTo(21.432f, 17.76f, 24.0f, 15.168f, 24.0f, 12.0f)
                curveToRelative(0.0f, -3.168f, -2.568f, -5.76f, -5.736f, -5.76f)
                close()
                moveTo(5.736f, 15.384f)
                arcTo(3.38f, 3.38f, 0.0f, false, true, 2.352f, 12.0f)
                arcToRelative(3.395f, 3.395f, 0.0f, false, true, 3.384f, -3.384f)
                curveToRelative(1.176f, 0.0f, 3.24f, 1.8f, 4.68f, 3.384f)
                curveToRelative(-0.408f, 0.456f, -3.144f, 3.384f, -4.68f, 3.384f)
                close()
                moveTo(18.264f, 15.384f)
                curveToRelative(-1.176f, 0.0f, -3.24f, -1.8f, -4.68f, -3.384f)
                curveToRelative(0.408f, -0.456f, 3.168f, -3.384f, 4.68f, -3.384f)
                arcTo(3.38f, 3.38f, 0.0f, false, true, 21.648f, 12.0f)
                curveToRelative(-0.024f, 1.872f, -1.536f, 3.384f, -3.384f, 3.384f)
                close()
            }
        }
        .build()
        return _internetcomputer!!
    }

private var _internetcomputer: ImageVector? = null
