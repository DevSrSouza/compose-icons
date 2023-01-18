package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Toggle: ImageVector
    get() {
        if (_toggle != null) {
            return _toggle!!
        }
        _toggle = Builder(name = "Toggle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 112.0f)
                lineTo(144.0f, 112.0f)
                curveTo(64.6f, 112.0f, 0.0f, 176.6f, 0.0f, 256.0f)
                reflectiveCurveTo(64.6f, 400.0f, 144.0f, 400.0f)
                lineTo(368.0f, 400.0f)
                curveToRelative(79.4f, 0.0f, 144.0f, -64.6f, 144.0f, -144.0f)
                reflectiveCurveTo(447.4f, 112.0f, 368.0f, 112.0f)
                close()
                moveTo(368.0f, 368.0f)
                arcTo(112.0f, 112.0f, 0.0f, true, true, 480.0f, 256.0f)
                arcTo(112.12f, 112.12f, 0.0f, false, true, 368.0f, 368.0f)
                close()
            }
        }
        .build()
        return _toggle!!
    }

private var _toggle: ImageVector? = null
