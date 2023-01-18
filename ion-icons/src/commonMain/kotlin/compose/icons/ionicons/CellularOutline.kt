package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CellularOutline: ImageVector
    get() {
        if (_cellularOutline != null) {
            return _cellularOutline!!
        }
        _cellularOutline = Builder(name = "CellularOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(424.0f, 96.0f)
                lineTo(472.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 480.0f, 104.0f)
                lineTo(480.0f, 408.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 472.0f, 416.0f)
                lineTo(424.0f, 416.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 416.0f, 408.0f)
                lineTo(416.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 424.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(296.0f, 176.0f)
                lineTo(344.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 352.0f, 184.0f)
                lineTo(352.0f, 408.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 344.0f, 416.0f)
                lineTo(296.0f, 416.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 288.0f, 408.0f)
                lineTo(288.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 296.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 240.0f)
                lineTo(216.0f, 240.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 248.0f)
                lineTo(224.0f, 408.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 416.0f)
                lineTo(168.0f, 416.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 408.0f)
                lineTo(160.0f, 248.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 240.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 304.0f)
                lineTo(88.0f, 304.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 312.0f)
                lineTo(96.0f, 408.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 416.0f)
                lineTo(40.0f, 416.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 408.0f)
                lineTo(32.0f, 312.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 304.0f)
                close()
            }
        }
        .build()
        return _cellularOutline!!
    }

private var _cellularOutline: ImageVector? = null
