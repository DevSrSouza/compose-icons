package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AttachSharp: ImageVector
    get() {
        if (_attachSharp != null) {
            return _attachSharp!!
        }
        _attachSharp = Builder(name = "AttachSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.08f, 192.0f)
                verticalLineTo(335.55f)
                arcToRelative(40.08f, 40.08f, 0.0f, false, false, 80.15f, 0.0f)
                lineTo(296.36f, 147.0f)
                arcToRelative(67.94f, 67.94f, 0.0f, true, false, -135.87f, 0.0f)
                verticalLineTo(336.82f)
                arcToRelative(95.51f, 95.51f, 0.0f, false, false, 191.0f, 0.0f)
                verticalLineTo(159.44f)
            }
        }
        .build()
        return _attachSharp!!
    }

private var _attachSharp: ImageVector? = null
