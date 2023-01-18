package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ArrowCircleUpRight: ImageVector
    get() {
        if (_arrowCircleUpRight != null) {
            return _arrowCircleUpRight!!
        }
        _arrowCircleUpRight = Builder(name = "ArrowCircleUpRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 54.5f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 0.0f, 147.0f)
                arcTo(103.9f, 103.9f, 0.0f, false, false, 201.5f, 54.5f)
                close()
                moveTo(164.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(119.3f)
                lineToRelative(-42.3f, 42.4f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 100.0f, 164.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, -2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(136.7f, 108.0f)
                horizontalLineTo(108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 3.0f, 0.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 4.4f, 4.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 0.6f, 3.1f)
                close()
            }
        }
        .build()
        return _arrowCircleUpRight!!
    }

private var _arrowCircleUpRight: ImageVector? = null
