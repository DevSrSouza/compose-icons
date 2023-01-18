package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BlazeFill: ImageVector
    get() {
        if (_blazeFill != null) {
            return _blazeFill!!
        }
        _blazeFill = Builder(name = "BlazeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 9.0f)
                curveToRelative(1.0f, 1.06f, 1.5f, 2.394f, 1.5f, 4.0f)
                curveToRelative(0.0f, 3.466f, -3.7f, 4.276f, -5.5f, 9.0f)
                curveToRelative(-0.667f, -0.575f, -1.0f, -1.408f, -1.0f, -2.5f)
                curveToRelative(0.0f, -3.482f, 5.0f, -5.29f, 5.0f, -10.5f)
                close()
                moveTo(14.5f, 5.0f)
                curveToRelative(1.2f, 1.238f, 1.8f, 2.572f, 1.8f, 4.0f)
                curveToRelative(0.0f, 4.951f, -6.045f, 5.692f, -4.8f, 13.0f)
                curveTo(9.833f, 20.84f, 9.0f, 19.173f, 9.0f, 17.0f)
                curveToRelative(0.0f, -3.325f, 5.5f, -6.0f, 5.5f, -12.0f)
                close()
                moveTo(10.0f, 1.0f)
                curveToRelative(1.333f, 1.667f, 2.0f, 3.167f, 2.0f, 4.5f)
                curveToRelative(0.0f, 6.25f, -8.5f, 8.222f, -4.0f, 16.5f)
                curveToRelative(-2.616f, -0.58f, -4.5f, -3.0f, -4.5f, -6.0f)
                curveTo(3.5f, 9.5f, 10.0f, 8.5f, 10.0f, 1.0f)
                close()
            }
        }
        .build()
        return _blazeFill!!
    }

private var _blazeFill: ImageVector? = null
