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

public val IonIcons.HourglassSharp: ImageVector
    get() {
        if (_hourglassSharp != null) {
            return _hourglassSharp!!
        }
        _hourglassSharp = Builder(name = "HourglassSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 32.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(144.0f)
                lineTo(204.0f, 256.0f)
                lineTo(96.0f, 368.0f)
                verticalLineTo(480.0f)
                horizontalLineTo(416.0f)
                verticalLineTo(368.0f)
                lineTo(308.0f, 256.0f)
                lineTo(416.0f, 144.0f)
                close()
                moveTo(272.0f, 224.0f)
                verticalLineTo(336.0f)
                lineToRelative(91.0f, 96.0f)
                horizontalLineTo(148.0f)
                lineToRelative(92.0f, -96.0f)
                verticalLineTo(224.0f)
                lineToRelative(-80.0f, -80.0f)
                horizontalLineTo(352.0f)
                close()
            }
        }
        .build()
        return _hourglassSharp!!
    }

private var _hourglassSharp: ImageVector? = null
