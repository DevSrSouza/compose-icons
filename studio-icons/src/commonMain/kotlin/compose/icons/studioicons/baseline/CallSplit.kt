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

public val BaselineGroup.CallSplit: ImageVector
    get() {
        if (_callSplit != null) {
            return _callSplit!!
        }
        _callSplit = Builder(name = "CallSplit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(-2.88f, 2.88f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(2.88f, -2.88f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 4.0f)
                close()
                moveTo(10.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(4.71f, 4.7f)
                lineTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.41f)
                lineToRelative(-5.29f, -5.3f)
                close()
            }
        }
        .build()
        return _callSplit!!
    }

private var _callSplit: ImageVector? = null
