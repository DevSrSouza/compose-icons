package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LinkSharp: ImageVector
    get() {
        if (_linkSharp != null) {
            return _linkSharp!!
        }
        _linkSharp = Builder(name = "LinkSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 48.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.66f, 352.0f)
                horizontalLineTo(144.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 0.0f, -192.0f)
                horizontalLineToRelative(55.41f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 48.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(312.59f, 160.0f)
                horizontalLineTo(368.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 0.0f, 192.0f)
                horizontalLineTo(311.34f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 48.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(169.07f, 256.0f)
                lineTo(344.93f, 256.0f)
            }
        }
        .build()
        return _linkSharp!!
    }

private var _linkSharp: ImageVector? = null
