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

public val IonIcons.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(name = "PieChart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.1f, 357.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -14.61f, -9.46f)
                arcTo(224.0f, 224.0f, 0.0f, false, true, 256.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineTo(256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.47f, 14.61f)
                lineTo(72.63f, 355.56f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 66.1f, 357.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.59f, 68.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 304.0f, 76.0f)
                verticalLineTo(256.0f)
                arcToRelative(48.07f, 48.07f, 0.0f, false, true, -28.4f, 43.82f)
                lineTo(103.13f, 377.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.35f, 11.81f)
                arcToRelative(208.42f, 208.42f, 0.0f, false, false, 48.46f, 50.41f)
                arcTo(206.32f, 206.32f, 0.0f, false, false, 272.0f, 480.0f)
                curveToRelative(114.69f, 0.0f, 208.0f, -93.31f, 208.0f, -208.0f)
                curveTo(480.0f, 171.55f, 408.42f, 87.5f, 313.59f, 68.18f)
                close()
            }
        }
        .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
