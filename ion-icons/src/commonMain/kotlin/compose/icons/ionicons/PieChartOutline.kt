package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PieChartOutline: ImageVector
    get() {
        if (_pieChartOutline != null) {
            return _pieChartOutline!!
        }
        _pieChartOutline = Builder(name = "PieChartOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.05f, 80.65f)
                quadTo(263.94f, 80.0f, 272.0f, 80.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, 86.0f, 192.0f, 192.0f)
                reflectiveCurveTo(378.0f, 464.0f, 272.0f, 464.0f)
                arcTo(192.09f, 192.09f, 0.0f, false, true, 89.12f, 330.65f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.12f, 48.0f, 48.0f, 141.12f, 48.0f, 256.0f)
                arcToRelative(207.29f, 207.29f, 0.0f, false, false, 18.09f, 85.0f)
                lineTo(256.0f, 256.0f)
                close()
            }
        }
        .build()
        return _pieChartOutline!!
    }

private var _pieChartOutline: ImageVector? = null
