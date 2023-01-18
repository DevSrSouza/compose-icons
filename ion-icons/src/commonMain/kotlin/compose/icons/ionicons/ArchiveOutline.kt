package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ArchiveOutline: ImageVector
    get() {
        if (_archiveOutline != null) {
            return _archiveOutline!!
        }
        _archiveOutline = Builder(name = "ArchiveOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 152.0f)
                verticalLineTo(408.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineTo(392.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineTo(152.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(76.0f, 64.0f)
                lineTo(436.0f, 64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 464.0f, 92.0f)
                lineTo(464.0f, 116.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 436.0f, 144.0f)
                lineTo(76.0f, 144.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 48.0f, 116.0f)
                lineTo(48.0f, 92.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 76.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 304.0f)
                lineToRelative(-64.0f, 64.0f)
                lineToRelative(-64.0f, -64.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 345.89f)
                lineTo(256.0f, 224.0f)
            }
        }
        .build()
        return _archiveOutline!!
    }

private var _archiveOutline: ImageVector? = null
