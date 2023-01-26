package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.DriveFileRenameOutline: ImageVector
    get() {
        if (_driveFileRenameOutline != null) {
            return _driveFileRenameOutline!!
        }
        _driveFileRenameOutline = Builder(name = "DriveFileRenameOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.41f, 5.8f)
                lineTo(17.2f, 4.59f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineToRelative(-2.68f, 2.68f)
                lineTo(3.0f, 15.96f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(4.04f)
                lineToRelative(8.74f, -8.74f)
                lineToRelative(2.63f, -2.63f)
                curveToRelative(0.79f, -0.78f, 0.79f, -2.05f, 0.0f, -2.83f)
                close()
                moveTo(6.21f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.21f)
                lineToRelative(8.66f, -8.66f)
                lineToRelative(1.21f, 1.21f)
                lineTo(6.21f, 18.0f)
                close()
                moveTo(11.0f, 20.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _driveFileRenameOutline!!
    }

private var _driveFileRenameOutline: ImageVector? = null
