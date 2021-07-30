package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ChargingStationSolid: ImageVector
    get() {
        if (_chargingStationSolid != null) {
            return _chargingStationSolid!!
        }
        _chargingStationSolid = Builder(name = "ChargingStationSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                curveTo(7.355f, 5.0f, 6.0f, 6.355f, 6.0f, 8.0f)
                lineTo(6.0f, 27.0f)
                lineTo(20.0f, 27.0f)
                lineTo(20.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                lineTo(22.0f, 24.0f)
                curveTo(22.0f, 25.645f, 23.355f, 27.0f, 25.0f, 27.0f)
                curveTo(26.645f, 27.0f, 28.0f, 25.645f, 28.0f, 24.0f)
                lineTo(28.0f, 13.8125f)
                curveTo(28.0f, 13.0155f, 27.687f, 12.2808f, 27.125f, 11.7188f)
                lineTo(22.4063f, 7.0f)
                lineTo(21.0f, 8.4063f)
                lineTo(23.8438f, 11.25f)
                curveTo(22.7698f, 11.707f, 22.0f, 12.766f, 22.0f, 14.0f)
                curveTo(22.0f, 15.645f, 23.355f, 17.0f, 25.0f, 17.0f)
                curveTo(25.352f, 17.0f, 25.684f, 16.9265f, 26.0f, 16.8125f)
                lineTo(26.0f, 24.0f)
                curveTo(26.0f, 24.566f, 25.566f, 25.0f, 25.0f, 25.0f)
                curveTo(24.434f, 25.0f, 24.0f, 24.566f, 24.0f, 24.0f)
                lineTo(24.0f, 20.0f)
                curveTo(24.0f, 18.906f, 23.094f, 18.0f, 22.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 8.0f)
                curveTo(20.0f, 6.355f, 18.645f, 5.0f, 17.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                curveTo(17.566f, 7.0f, 18.0f, 7.434f, 18.0f, 8.0f)
                lineTo(18.0f, 11.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 14.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                lineTo(8.0f, 18.0f)
                lineTo(8.0f, 14.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 8.0f)
                curveTo(8.0f, 7.434f, 8.434f, 7.0f, 9.0f, 7.0f)
                close()
                moveTo(13.0898f, 10.5605f)
                lineTo(10.6602f, 15.4395f)
                lineTo(11.5605f, 15.9102f)
                lineTo(12.6602f, 16.4395f)
                lineTo(11.0898f, 19.5605f)
                lineTo(12.9102f, 20.4395f)
                lineTo(15.3398f, 15.5605f)
                lineTo(14.4395f, 15.0898f)
                lineTo(13.3398f, 14.5605f)
                lineTo(14.9102f, 11.4395f)
                lineTo(13.0898f, 10.5605f)
                close()
                moveTo(25.0f, 13.0f)
                curveTo(25.562f, 13.0f, 26.0f, 13.438f, 26.0f, 14.0f)
                curveTo(26.0f, 14.562f, 25.562f, 15.0f, 25.0f, 15.0f)
                curveTo(24.437f, 15.0f, 24.0f, 14.562f, 24.0f, 14.0f)
                curveTo(24.0f, 13.438f, 24.437f, 13.0f, 25.0f, 13.0f)
                close()
            }
        }
        .build()
        return _chargingStationSolid!!
    }

private var _chargingStationSolid: ImageVector? = null
