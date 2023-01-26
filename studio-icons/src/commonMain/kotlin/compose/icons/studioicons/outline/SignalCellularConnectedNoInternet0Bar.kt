package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SignalCellularConnectedNoInternet0Bar: ImageVector
    get() {
        if (_signalCellularConnectedNoInternet0Bar != null) {
            return _signalCellularConnectedNoInternet0Bar!!
        }
        _signalCellularConnectedNoInternet0Bar = Builder(name =
                "SignalCellularConnectedNoInternet0Bar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(18.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                lineTo(22.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.83f)
                lineTo(6.83f, 20.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _signalCellularConnectedNoInternet0Bar!!
    }

private var _signalCellularConnectedNoInternet0Bar: ImageVector? = null
