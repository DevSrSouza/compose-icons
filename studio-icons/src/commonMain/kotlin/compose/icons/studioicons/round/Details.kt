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

public val RoundGroup.Details: ImageVector
    get() {
        if (_details != null) {
            return _details!!
        }
        _details = Builder(name = "Details", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.13f, 4.57f)
                lineToRelative(-8.3f, 14.94f)
                curveTo(2.46f, 20.18f, 2.94f, 21.0f, 3.7f, 21.0f)
                horizontalLineToRelative(16.6f)
                curveToRelative(0.76f, 0.0f, 1.24f, -0.82f, 0.87f, -1.49f)
                lineToRelative(-8.3f, -14.94f)
                curveTo(12.49f, 3.89f, 11.51f, 3.89f, 11.13f, 4.57f)
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
