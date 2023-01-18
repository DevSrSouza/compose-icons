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

public val IonIcons.BarChartOutline: ImageVector
    get() {
        if (_barChartOutline != null) {
            return _barChartOutline!!
        }
        _barChartOutline = Builder(name = "BarChartOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                verticalLineTo(464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(480.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(116.0f, 224.0f)
                lineTo(156.0f, 224.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 244.0f)
                lineTo(176.0f, 396.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 156.0f, 416.0f)
                lineTo(116.0f, 416.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 96.0f, 396.0f)
                lineTo(96.0f, 244.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 116.0f, 224.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(260.0f, 176.0f)
                lineTo(300.0f, 176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 320.0f, 196.0f)
                lineTo(320.0f, 396.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 300.0f, 416.0f)
                lineTo(260.0f, 416.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 240.0f, 396.0f)
                lineTo(240.0f, 196.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 260.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(403.64f, 112.0f)
                lineTo(443.64f, 112.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 463.64f, 132.0f)
                lineTo(463.64f, 396.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 443.64f, 416.0f)
                lineTo(403.64f, 416.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 383.64f, 396.0f)
                lineTo(383.64f, 132.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 403.64f, 112.0f)
                close()
            }
        }
        .build()
        return _barChartOutline!!
    }

private var _barChartOutline: ImageVector? = null
