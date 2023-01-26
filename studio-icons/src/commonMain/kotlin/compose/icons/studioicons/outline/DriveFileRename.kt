package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.DriveFileRename: ImageVector
    get() {
        if (_driveFileRename != null) {
            return _driveFileRename!!
        }
        _driveFileRename = Builder(name = "DriveFileRename", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                lineTo(3.0f, 16.25f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(3.75f)
                lineToRelative(9.06f, -9.06f)
                lineTo(12.06f, 7.19f)
                close()
                moveTo(5.92f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-0.92f)
                lineToRelative(7.06f, -7.06f)
                lineToRelative(0.92f, 0.92f)
                lineTo(5.92f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.71f, 8.04f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-2.34f, -2.34f)
                curveTo(16.17f, 4.09f, 15.92f, 4.0f, 15.66f, 4.0f)
                curveToRelative(-0.25f, 0.0f, -0.51f, 0.1f, -0.7f, 0.29f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(3.75f, 3.75f)
                lineTo(18.71f, 8.04f)
                close()
            }
        }
        .build()
        return _driveFileRename!!
    }

private var _driveFileRename: ImageVector? = null
