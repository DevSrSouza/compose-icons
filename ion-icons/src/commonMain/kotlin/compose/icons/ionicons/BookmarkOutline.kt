package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BookmarkOutline: ImageVector
    get() {
        if (_bookmarkOutline != null) {
            return _bookmarkOutline!!
        }
        _bookmarkOutline = Builder(name = "BookmarkOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 48.0f)
                horizontalLineTo(160.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, 48.0f)
                verticalLineTo(464.0f)
                lineTo(256.0f, 336.0f)
                lineTo(400.0f, 464.0f)
                verticalLineTo(96.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 352.0f, 48.0f)
                close()
            }
        }
        .build()
        return _bookmarkOutline!!
    }

private var _bookmarkOutline: ImageVector? = null
