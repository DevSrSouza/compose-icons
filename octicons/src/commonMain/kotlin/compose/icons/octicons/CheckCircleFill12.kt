package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.CheckCircleFill12: ImageVector
    get() {
        if (_checkCircleFill12 != null) {
            return _checkCircleFill12!!
        }
        _checkCircleFill12 = Builder(name = "CheckCircleFill12", defaultWidth = 12.0.dp,
                defaultHeight = 12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
                moveTo(5.295f, 8.737f)
                lineTo(9.63f, 4.403f)
                lineTo(8.392f, 3.166f)
                lineTo(5.295f, 6.263f)
                lineToRelative(-1.7f, -1.702f)
                lineTo(2.356f, 5.8f)
                lineToRelative(2.938f, 2.938f)
                close()
            }
        }
        .build()
        return _checkCircleFill12!!
    }

private var _checkCircleFill12: ImageVector? = null
