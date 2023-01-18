package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BrowsersOutline: ImageVector
    get() {
        if (_browsersOutline != null) {
            return _browsersOutline!!
        }
        _browsersOutline = Builder(name = "BrowsersOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 64.0f)
                lineTo(416.0f, 64.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 464.0f, 112.0f)
                lineTo(464.0f, 400.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 416.0f, 448.0f)
                lineTo(96.0f, 448.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 48.0f, 400.0f)
                lineTo(48.0f, 112.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 96.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(397.82f, 64.0f)
                horizontalLineTo(114.18f)
                curveTo(77.69f, 64.0f, 48.0f, 94.15f, 48.0f, 131.2f)
                verticalLineTo(176.0f)
                horizontalLineTo(64.0f)
                curveToRelative(0.0f, -16.0f, 16.0f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(416.0f)
                curveToRelative(16.0f, 0.0f, 32.0f, 16.0f, 32.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(131.2f)
                curveTo(464.0f, 94.15f, 434.31f, 64.0f, 397.82f, 64.0f)
                close()
            }
        }
        .build()
        return _browsersOutline!!
    }

private var _browsersOutline: ImageVector? = null
