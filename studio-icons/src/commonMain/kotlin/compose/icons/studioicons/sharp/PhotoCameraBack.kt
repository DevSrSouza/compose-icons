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

public val SharpGroup.PhotoCameraBack: ImageVector
    get() {
        if (_photoCameraBack != null) {
            return _photoCameraBack!!
        }
        _photoCameraBack = Builder(name = "PhotoCameraBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.83f, 5.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.83f)
                close()
                moveTo(6.0f, 17.0f)
                lineToRelative(3.0f, -4.0f)
                lineToRelative(2.25f, 3.0f)
                lineToRelative(3.0f, -4.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _photoCameraBack!!
    }

private var _photoCameraBack: ImageVector? = null
