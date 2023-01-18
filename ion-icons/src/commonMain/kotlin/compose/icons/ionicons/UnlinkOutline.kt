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

public val IonIcons.UnlinkOutline: ImageVector
    get() {
        if (_unlinkOutline != null) {
            return _unlinkOutline!!
        }
        _unlinkOutline = Builder(name = "UnlinkOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 36.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 352.0f)
                horizontalLineTo(144.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 0.0f, -192.0f)
                horizontalLineToRelative(64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 36.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(304.0f, 160.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 0.0f, 192.0f)
                horizontalLineTo(304.0f)
            }
        }
        .build()
        return _unlinkOutline!!
    }

private var _unlinkOutline: ImageVector? = null
