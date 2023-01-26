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

public val SharpGroup.PhotoSizeSelectActual: ImageVector
    get() {
        if (_photoSizeSelectActual != null) {
            return _photoSizeSelectActual!!
        }
        _photoSizeSelectActual = Builder(name = "PhotoSizeSelectActual", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(22.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(5.0f, 17.0f)
                lineToRelative(3.5f, -4.5f)
                lineToRelative(2.5f, 3.01f)
                lineTo(14.5f, 11.0f)
                lineToRelative(4.5f, 6.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _photoSizeSelectActual!!
    }

private var _photoSizeSelectActual: ImageVector? = null
