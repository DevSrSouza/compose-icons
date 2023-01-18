package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PieChartSharp: ImageVector
    get() {
        if (_pieChartSharp != null) {
            return _pieChartSharp!!
        }
        _pieChartSharp = Builder(name = "PieChartSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.0f, 362.09f)
                lineTo(51.49f, 347.5f)
                arcTo(224.0f, 224.0f, 0.0f, false, true, 256.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(266.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 66.46f)
                verticalLineTo(287.11f)
                lineTo(94.62f, 380.78f)
                arcTo(208.31f, 208.31f, 0.0f, false, false, 272.0f, 480.0f)
                curveToRelative(114.69f, 0.0f, 208.0f, -93.31f, 208.0f, -208.0f)
                curveTo(480.0f, 168.19f, 403.55f, 81.9f, 304.0f, 66.46f)
                close()
            }
        }
        .build()
        return _pieChartSharp!!
    }

private var _pieChartSharp: ImageVector? = null
