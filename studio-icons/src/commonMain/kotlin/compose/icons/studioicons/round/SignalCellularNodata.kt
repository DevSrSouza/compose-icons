package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SignalCellularNodata: ImageVector
    get() {
        if (_signalCellularNodata != null) {
            return _signalCellularNodata!!
        }
        _signalCellularNodata = Builder(name = "SignalCellularNodata", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(4.41f)
                curveToRelative(-0.89f, 0.0f, -1.34f, -1.08f, -0.71f, -1.71f)
                lineTo(20.29f, 3.71f)
                curveTo(20.92f, 3.08f, 22.0f, 3.52f, 22.0f, 4.41f)
                verticalLineTo(13.0f)
                close()
                moveTo(20.3f, 14.71f)
                lineTo(20.3f, 14.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-1.39f, 1.39f)
                lineToRelative(-1.39f, -1.39f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.39f, 1.39f)
                lineToRelative(-1.39f, 1.39f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(1.39f, -1.38f)
                lineToRelative(1.39f, 1.38f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-1.38f, -1.39f)
                lineToRelative(1.38f, -1.39f)
                curveTo(20.69f, 15.73f, 20.69f, 15.1f, 20.3f, 14.71f)
                close()
            }
        }
        .build()
        return _signalCellularNodata!!
    }

private var _signalCellularNodata: ImageVector? = null
