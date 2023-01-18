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

public val IonIcons.PaperPlaneOutline: ImageVector
    get() {
        if (_paperPlaneOutline != null) {
            return _paperPlaneOutline!!
        }
        _paperPlaneOutline = Builder(name = "PaperPlaneOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(53.12f, 199.94f)
                lineToRelative(400.0f, -151.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.33f, 10.33f)
                lineToRelative(-151.39f, 400.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, -0.34f)
                lineTo(229.66f, 292.45f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.11f, -10.11f)
                lineTo(53.46f, 215.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.12f, 199.94f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(460.0f, 52.0f)
                lineTo(227.0f, 285.0f)
            }
        }
        .build()
        return _paperPlaneOutline!!
    }

private var _paperPlaneOutline: ImageVector? = null
