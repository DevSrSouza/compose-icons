package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.StatsChartOutline: ImageVector
    get() {
        if (_statsChartOutline != null) {
            return _statsChartOutline!!
        }
        _statsChartOutline = Builder(name = "StatsChartOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(72.0f, 320.0f)
                lineTo(104.0f, 320.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 328.0f)
                lineTo(112.0f, 472.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 480.0f)
                lineTo(72.0f, 480.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 472.0f)
                lineTo(64.0f, 328.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 320.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(296.0f, 224.0f)
                lineTo(328.0f, 224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 336.0f, 232.0f)
                lineTo(336.0f, 472.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 328.0f, 480.0f)
                lineTo(296.0f, 480.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 288.0f, 472.0f)
                lineTo(288.0f, 232.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 296.0f, 224.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(408.0f, 112.0f)
                lineTo(440.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 448.0f, 120.0f)
                lineTo(448.0f, 472.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 440.0f, 480.0f)
                lineTo(408.0f, 480.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 400.0f, 472.0f)
                lineTo(400.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 408.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 32.0f)
                lineTo(216.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 40.0f)
                lineTo(224.0f, 472.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 480.0f)
                lineTo(184.0f, 480.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 472.0f)
                lineTo(176.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 32.0f)
                close()
            }
        }
        .build()
        return _statsChartOutline!!
    }

private var _statsChartOutline: ImageVector? = null
