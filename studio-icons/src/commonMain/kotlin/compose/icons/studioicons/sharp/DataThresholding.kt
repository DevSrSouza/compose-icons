package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DataThresholding: ImageVector
    get() {
        if (_dataThresholding != null) {
            return _dataThresholding!!
        }
        _dataThresholding = Builder(name = "DataThresholding", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.67f, 8.17f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(3.67f, -3.67f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.67f, 13.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(10.67f, 8.17f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(1.72f)
                lineTo(5.0f, 17.72f)
                verticalLineTo(16.0f)
                close()
                moveTo(5.84f, 19.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(1.83f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineTo(5.84f)
                close()
                moveTo(9.8f, 19.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(1.62f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineTo(9.8f)
                close()
                moveTo(13.53f, 19.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(1.62f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineTo(13.53f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-1.73f)
                lineTo(19.0f, 17.27f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _dataThresholding!!
    }

private var _dataThresholding: ImageVector? = null
