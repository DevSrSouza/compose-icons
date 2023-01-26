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

public val BaselineGroup.WorkOff: ImageVector
    get() {
        if (_workOff != null) {
            return _workOff!!
        }
        _workOff = Builder(name = "WorkOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 21.74f)
                lineToRelative(-1.46f, -1.46f)
                lineTo(7.21f, 5.95f)
                lineTo(3.25f, 1.99f)
                lineTo(1.99f, 3.25f)
                lineToRelative(2.7f, 2.7f)
                horizontalLineToRelative(-0.64f)
                curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f)
                lineToRelative(-0.01f, 11.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(15.64f)
                lineTo(21.74f, 23.0f)
                lineTo(23.0f, 21.74f)
                close()
                moveTo(22.0f, 7.95f)
                curveToRelative(0.05f, -1.11f, -0.84f, -2.0f, -1.95f, -1.95f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(3.95f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -1.95f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.11f, -0.05f, -2.0f, 0.84f, -2.0f, 1.95f)
                verticalLineToRelative(0.32f)
                lineToRelative(13.95f, 14.0f)
                verticalLineTo(7.95f)
                close()
                moveTo(14.05f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.95f)
                horizontalLineToRelative(4.05f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _workOff!!
    }

private var _workOff: ImageVector? = null
