package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BaseStationFill: ImageVector
    get() {
        if (_baseStationFill != null) {
            return _baseStationFill!!
        }
        _baseStationFill = Builder(name = "BaseStationFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                lineToRelative(6.0f, 9.0f)
                lineTo(6.0f, 22.0f)
                lineToRelative(6.0f, -9.0f)
                close()
                moveTo(10.94f, 10.56f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.12f, -2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, 2.12f)
                close()
                moveTo(5.281f, 2.783f)
                lineToRelative(1.415f, 1.415f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.0f, 10.606f)
                lineToRelative(-1.415f, 1.415f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 0.0f, -13.436f)
                close()
                moveTo(18.717f, 2.783f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 0.0f, 13.436f)
                lineToRelative(-1.415f, -1.415f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.0f, -10.606f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(8.11f, 5.611f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 4.95f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -7.778f)
                close()
                moveTo(15.888f, 5.611f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, 7.778f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -4.95f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _baseStationFill!!
    }

private var _baseStationFill: ImageVector? = null
