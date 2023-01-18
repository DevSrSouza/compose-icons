package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) {
            return _arrowBendDownRight!!
        }
        _arrowBendDownRight = Builder(name = "ArrowBendDownRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.2f, 156.2f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(209.5f, 158.0f)
                horizontalLineTo(128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, true, 26.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, false, 90.0f, 90.0f)
                horizontalLineToRelative(81.5f)
                lineToRelative(-37.7f, -37.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineToRelative(48.0f, 48.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 228.2f, 156.2f)
                close()
            }
        }
        .build()
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
