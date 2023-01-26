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

public val SharpGroup.SubdirectoryArrowLeft: ImageVector
    get() {
        if (_subdirectoryArrowLeft != null) {
            return _subdirectoryArrowLeft!!
        }
        _subdirectoryArrowLeft = Builder(name = "SubdirectoryArrowLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                lineToRelative(1.42f, 1.42f)
                lineTo(8.83f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(8.83f)
                lineToRelative(3.59f, 3.58f)
                lineTo(11.0f, 21.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _subdirectoryArrowLeft!!
    }

private var _subdirectoryArrowLeft: ImageVector? = null
