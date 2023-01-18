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

public val FillGroup.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) {
            return _arrowArcRight!!
        }
        _arrowArcRight = Builder(name = "ArrowArcRight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.9f, 84.1f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -7.4f, -4.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.7f, -8.7f)
                lineToRelative(26.1f, -26.1f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 40.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, true, 128.0f, 80.0f)
                arcToRelative(103.3f, 103.3f, 0.0f, false, true, 67.7f, 25.0f)
                lineToRelative(26.5f, -26.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.7f, 5.6f)
                close()
            }
        }
        .build()
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
