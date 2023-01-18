package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LockOpenOutline: ImageVector
    get() {
        if (_lockOpenOutline != null) {
            return _lockOpenOutline!!
        }
        _lockOpenOutline = Builder(name = "LockOpenOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 112.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -160.0f, 0.0f)
                verticalLineToRelative(96.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 208.0f)
                lineTo(368.0f, 208.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 416.0f, 256.0f)
                lineTo(416.0f, 432.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 368.0f, 480.0f)
                lineTo(144.0f, 480.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 96.0f, 432.0f)
                lineTo(96.0f, 256.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 144.0f, 208.0f)
                close()
            }
        }
        .build()
        return _lockOpenOutline!!
    }

private var _lockOpenOutline: ImageVector? = null
