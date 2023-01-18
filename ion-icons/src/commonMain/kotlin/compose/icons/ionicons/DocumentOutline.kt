package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.DocumentOutline: ImageVector
    get() {
        if (_documentOutline != null) {
            return _documentOutline!!
        }
        _documentOutline = Builder(name = "DocumentOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 221.25f)
                verticalLineTo(416.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                horizontalLineTo(144.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                verticalLineTo(96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, -48.0f)
                horizontalLineToRelative(98.75f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 22.62f, 9.37f)
                lineTo(406.63f, 198.63f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 416.0f, 221.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                verticalLineTo(176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(408.0f)
            }
        }
        .build()
        return _documentOutline!!
    }

private var _documentOutline: ImageVector? = null
