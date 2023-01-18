package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) {
            return _arrowCircleDownRight!!
        }
        _arrowCircleDownRight = Builder(name = "ArrowCircleDownRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 51.6f)
                arcToRelative(107.9f, 107.9f, 0.0f, true, false, 0.0f, 152.8f)
                arcTo(108.2f, 108.2f, 0.0f, false, false, 204.4f, 51.6f)
                close()
                moveTo(187.4f, 187.4f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 0.0f, -118.8f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 187.4f, 187.4f)
                close()
                moveTo(168.0f, 108.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(108.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(19.0f)
                lineTo(91.5f, 108.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(144.0f, 127.0f)
                lineTo(144.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
