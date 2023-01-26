package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.FolderSpecial: ImageVector
    get() {
        if (_folderSpecial != null) {
            return _folderSpecial!!
        }
        _folderSpecial = Builder(name = "FolderSpecial", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.17f, 8.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-8.83f)
                close()
                moveTo(15.0f, 9.0f)
                lineToRelative(1.19f, 2.79f)
                lineToRelative(3.03f, 0.26f)
                lineToRelative(-2.3f, 1.99f)
                lineToRelative(0.69f, 2.96f)
                lineTo(15.0f, 15.47f)
                lineTo(12.39f, 17.0f)
                lineToRelative(0.69f, -2.96f)
                lineToRelative(-2.3f, -1.99f)
                lineToRelative(3.03f, -0.26f)
                lineTo(15.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(5.17f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 8.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(13.08f, 14.04f)
                lineTo(12.39f, 17.0f)
                lineTo(15.0f, 15.47f)
                lineTo(17.61f, 17.0f)
                lineToRelative(-0.69f, -2.96f)
                lineToRelative(2.3f, -1.99f)
                lineToRelative(-3.03f, -0.26f)
                lineTo(15.0f, 9.0f)
                lineToRelative(-1.19f, 2.79f)
                lineToRelative(-3.03f, 0.26f)
                close()
            }
        }
        .build()
        return _folderSpecial!!
    }

private var _folderSpecial: ImageVector? = null
