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

public val SharpGroup.Details: ImageVector
    get() {
        if (_details != null) {
            return _details!!
        }
        _details = Builder(name = "Details", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(2.0f, 21.0f)
                horizontalLineToRelative(20.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(13.0f, 8.92f)
                lineTo(18.6f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.92f)
                close()
                moveTo(11.0f, 8.92f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.4f)
                lineTo(11.0f, 8.92f)
                close()
            }
        }
        .build()
        return _details!!
    }

private var _details: ImageVector? = null
