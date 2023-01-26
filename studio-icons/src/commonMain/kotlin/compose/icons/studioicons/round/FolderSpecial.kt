package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.FolderSpecial: ImageVector
    get() {
        if (_folderSpecial != null) {
            return _folderSpecial!!
        }
        _folderSpecial = Builder(name = "FolderSpecial", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-1.41f, -1.41f)
                curveTo(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.94f, 16.41f)
                lineTo(15.0f, 15.28f)
                lineToRelative(-1.94f, 1.13f)
                curveToRelative(-0.38f, 0.22f, -0.84f, -0.12f, -0.74f, -0.55f)
                lineToRelative(0.51f, -2.2f)
                lineToRelative(-1.69f, -1.46f)
                curveToRelative(-0.33f, -0.29f, -0.16f, -0.84f, 0.28f, -0.88f)
                lineToRelative(2.23f, -0.19f)
                lineToRelative(0.88f, -2.06f)
                curveToRelative(0.17f, -0.4f, 0.75f, -0.4f, 0.92f, 0.0f)
                lineToRelative(0.88f, 2.06f)
                lineToRelative(2.23f, 0.19f)
                curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f)
                lineToRelative(-1.69f, 1.46f)
                lineToRelative(0.51f, 2.2f)
                curveToRelative(0.11f, 0.43f, -0.35f, 0.77f, -0.72f, 0.55f)
                close()
            }
        }
        .build()
        return _folderSpecial!!
    }

private var _folderSpecial: ImageVector? = null
