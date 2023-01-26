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

public val BaselineGroup.CallMissedOutgoing: ImageVector
    get() {
        if (_callMissedOutgoing != null) {
            return _callMissedOutgoing!!
        }
        _callMissedOutgoing = Builder(name = "CallMissedOutgoing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.41f)
                lineToRelative(9.0f, 9.0f)
                lineToRelative(7.0f, -7.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.59f)
                lineTo(12.0f, 14.59f)
                lineTo(4.41f, 7.0f)
                lineTo(3.0f, 8.41f)
                close()
            }
        }
        .build()
        return _callMissedOutgoing!!
    }

private var _callMissedOutgoing: ImageVector? = null
