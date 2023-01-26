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

public val RoundGroup.SignalCellularConnectedNoInternet4Bar: ImageVector
    get() {
        if (_signalCellularConnectedNoInternet4Bar != null) {
            return _signalCellularConnectedNoInternet4Bar!!
        }
        _signalCellularConnectedNoInternet4Bar = Builder(name =
                "SignalCellularConnectedNoInternet4Bar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                lineTo(21.0f, 18.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveTo(20.0f, 17.55f, 20.45f, 18.0f, 21.0f, 18.0f)
                close()
                moveTo(21.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(20.0f, 21.55f, 20.45f, 22.0f, 21.0f, 22.0f)
                close()
                moveTo(4.41f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(4.41f)
                curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(3.71f, 20.29f)
                curveTo(3.08f, 20.92f, 3.52f, 22.0f, 4.41f, 22.0f)
                close()
            }
        }
        .build()
        return _signalCellularConnectedNoInternet4Bar!!
    }

private var _signalCellularConnectedNoInternet4Bar: ImageVector? = null
