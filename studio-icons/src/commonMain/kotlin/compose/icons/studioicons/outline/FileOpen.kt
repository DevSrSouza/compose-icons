package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FileOpen: ImageVector
    get() {
        if (_fileOpen != null) {
            return _fileOpen!!
        }
        _fileOpen = Builder(name = "FileOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(6.0f, 6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(19.0f, 21.66f)
                lineToRelative(0.0f, -2.24f)
                lineToRelative(2.95f, 2.95f)
                lineToRelative(1.41f, -1.41f)
                lineTo(20.41f, 18.0f)
                horizontalLineToRelative(2.24f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(5.66f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _fileOpen!!
    }

private var _fileOpen: ImageVector? = null
