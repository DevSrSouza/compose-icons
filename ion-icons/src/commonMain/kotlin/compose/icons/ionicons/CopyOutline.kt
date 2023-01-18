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

public val IonIcons.CopyOutline: ImageVector
    get() {
        if (_copyOutline != null) {
            return _copyOutline!!
        }
        _copyOutline = Builder(name = "CopyOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(185.0f, 128.0f)
                lineTo(407.0f, 128.0f)
                arcTo(57.0f, 57.0f, 0.0f, false, true, 464.0f, 185.0f)
                lineTo(464.0f, 407.0f)
                arcTo(57.0f, 57.0f, 0.0f, false, true, 407.0f, 464.0f)
                lineTo(185.0f, 464.0f)
                arcTo(57.0f, 57.0f, 0.0f, false, true, 128.0f, 407.0f)
                lineTo(128.0f, 185.0f)
                arcTo(57.0f, 57.0f, 0.0f, false, true, 185.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(383.5f, 128.0f)
                lineToRelative(0.5f, -24.0f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, false, -56.0f, -56.0f)
                horizontalLineTo(112.0f)
                arcToRelative(64.19f, 64.19f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineTo(328.0f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineToRelative(24.0f)
            }
        }
        .build()
        return _copyOutline!!
    }

private var _copyOutline: ImageVector? = null
