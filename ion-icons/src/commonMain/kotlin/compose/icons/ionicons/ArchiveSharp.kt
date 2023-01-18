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

public val IonIcons.ArchiveSharp: ImageVector
    get() {
        if (_archiveSharp != null) {
            return _archiveSharp!!
        }
        _archiveSharp = Builder(name = "ArchiveSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 160.0f)
                verticalLineTo(440.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(424.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(160.0f)
                close()
                moveTo(256.0f, 390.63f)
                lineTo(169.32f, 304.0f)
                lineTo(192.0f, 281.32f)
                lineTo(240.0f, 329.37f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(329.37f)
                lineToRelative(48.07f, -48.07f)
                lineToRelative(22.61f, 22.64f)
                close()
            }
        }
        .build()
        return _archiveSharp!!
    }

private var _archiveSharp: ImageVector? = null
