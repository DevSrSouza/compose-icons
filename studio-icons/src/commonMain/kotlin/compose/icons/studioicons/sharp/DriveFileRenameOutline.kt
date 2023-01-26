package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DriveFileRenameOutline: ImageVector
    get() {
        if (_driveFileRenameOutline != null) {
            return _driveFileRenameOutline!!
        }
        _driveFileRenameOutline = Builder(name = "DriveFileRenameOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(10.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.06f, 7.19f)
                lineToRelative(-9.06f, 9.06f)
                lineToRelative(0.0f, 3.75f)
                lineToRelative(3.75f, 0.0f)
                lineToRelative(9.06f, -9.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.132f, 6.1227f)
                lineToRelative(2.5385f, -2.5385f)
                lineToRelative(3.7476f, 3.7476f)
                lineToRelative(-2.5385f, 2.5385f)
                close()
            }
        }
        .build()
        return _driveFileRenameOutline!!
    }

private var _driveFileRenameOutline: ImageVector? = null
