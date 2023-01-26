package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NetworkCell: ImageVector
    get() {
        if (_networkCell != null) {
            return _networkCell!!
        }
        _networkCell = Builder(name = "NetworkCell", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(2.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(9.83f)
                lineToRelative(3.0f, -3.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _networkCell!!
    }

private var _networkCell: ImageVector? = null
