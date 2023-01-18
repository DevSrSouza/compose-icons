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

public val IonIcons.FolderOutline: ImageVector
    get() {
        if (_folderOutline != null) {
            return _folderOutline!!
        }
        _folderOutline = Builder(name = "FolderOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(440.0f, 432.0f)
                horizontalLineTo(72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                verticalLineTo(120.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 72.0f, 80.0f)
                horizontalLineToRelative(75.89f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 22.19f, 6.72f)
                lineToRelative(27.84f, 18.56f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 220.11f, 112.0f)
                horizontalLineTo(440.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                verticalLineTo(392.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 440.0f, 432.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 192.0f)
                lineTo(480.0f, 192.0f)
            }
        }
        .build()
        return _folderOutline!!
    }

private var _folderOutline: ImageVector? = null
