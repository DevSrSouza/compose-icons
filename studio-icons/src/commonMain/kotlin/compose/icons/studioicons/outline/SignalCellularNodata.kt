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

public val OutlineGroup.SignalCellularNodata: ImageVector
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
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(2.0f)
                lineTo(22.0f, 2.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(21.0f, 15.41f)
                lineTo(19.59f, 14.0f)
                lineToRelative(-2.09f, 2.09f)
                lineTo(15.41f, 14.0f)
                lineTo(14.0f, 15.41f)
                lineToRelative(2.09f, 2.09f)
                lineTo(14.0f, 19.59f)
                lineTo(15.41f, 21.0f)
                lineToRelative(2.09f, -2.08f)
                lineTo(19.59f, 21.0f)
                lineTo(21.0f, 19.59f)
                lineToRelative(-2.08f, -2.09f)
                lineTo(21.0f, 15.41f)
                close()
            }
        }
        .build()
        return _signalCellularNodata!!
    }

private var _signalCellularNodata: ImageVector? = null
