package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TrashBinSharp: ImageVector
    get() {
        if (_trashBinSharp != null) {
            return _trashBinSharp!!
        }
        _trashBinSharp = Builder(name = "TrashBinSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 160.0f)
                lineTo(93.74f, 442.51f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 117.61f, 464.0f)
                horizontalLineTo(394.39f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 23.87f, -21.49f)
                lineTo(448.0f, 160.0f)
                close()
                moveTo(312.0f, 377.46f)
                lineToRelative(-56.0f, -56.0f)
                lineToRelative(-56.0f, 56.0f)
                lineTo(174.54f, 352.0f)
                lineToRelative(56.0f, -56.0f)
                lineToRelative(-56.0f, -56.0f)
                lineTo(200.0f, 214.54f)
                lineToRelative(56.0f, 56.0f)
                lineToRelative(56.0f, -56.0f)
                lineTo(337.46f, 240.0f)
                lineToRelative(-56.0f, 56.0f)
                lineToRelative(56.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 48.0f)
                lineTo(468.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 480.0f, 60.0f)
                lineTo(480.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 468.0f, 128.0f)
                lineTo(44.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 116.0f)
                lineTo(32.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 44.0f, 48.0f)
                close()
            }
        }
        .build()
        return _trashBinSharp!!
    }

private var _trashBinSharp: ImageVector? = null
