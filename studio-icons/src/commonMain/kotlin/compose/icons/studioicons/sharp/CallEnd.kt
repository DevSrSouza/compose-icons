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

public val SharpGroup.CallEnd: ImageVector
    get() {
        if (_callEnd != null) {
            return _callEnd!!
        }
        _callEnd = Builder(name = "CallEnd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.68f, 16.07f)
                lineToRelative(3.92f, -3.11f)
                verticalLineTo(9.59f)
                curveToRelative(2.85f, -0.93f, 5.94f, -0.93f, 8.8f, 0.0f)
                verticalLineToRelative(3.38f)
                lineToRelative(3.91f, 3.1f)
                lineTo(24.0f, 12.39f)
                curveToRelative(-6.41f, -7.19f, -17.59f, -7.19f, -24.0f, 0.0f)
                lineToRelative(3.68f, 3.68f)
                close()
            }
        }
        .build()
        return _callEnd!!
    }

private var _callEnd: ImageVector? = null
