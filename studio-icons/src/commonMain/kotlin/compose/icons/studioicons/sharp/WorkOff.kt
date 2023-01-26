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

public val SharpGroup.WorkOff: ImageVector
    get() {
        if (_workOff != null) {
            return _workOff!!
        }
        _workOff = Builder(name = "WorkOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.6f)
                lineTo(22.0f, 17.6f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.98f, 0.0f, -1.79f, 0.71f, -1.96f, 1.64f)
                lineTo(10.0f, 5.6f)
                verticalLineTo(4.0f)
                close()
                moveTo(3.4f, 1.84f)
                lineTo(1.99f, 3.25f)
                lineTo(4.74f, 6.0f)
                horizontalLineTo(2.01f)
                lineTo(2.0f, 21.0f)
                horizontalLineToRelative(17.74f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _workOff!!
    }

private var _workOff: ImageVector? = null