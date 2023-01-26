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

public val SharpGroup.ThumbUpOffAlt: ImageVector
    get() {
        if (_thumbUpOffAlt != null) {
            return _thumbUpOffAlt!!
        }
        _thumbUpOffAlt = Builder(name = "ThumbUpOffAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.17f, 1.0f)
                lineTo(7.0f, 8.18f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(12.31f)
                lineTo(23.0f, 12.4f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-8.31f)
                lineToRelative(1.12f, -5.38f)
                lineTo(14.17f, 1.0f)
                close()
                moveTo(1.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _thumbUpOffAlt!!
    }

private var _thumbUpOffAlt: ImageVector? = null
