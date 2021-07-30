package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.PieChart2: ImageVector
    get() {
        if (_pieChart2 != null) {
            return _pieChart2!!
        }
        _pieChart2 = Builder(name = "PieChart2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 10.33f)
                horizontalLineToRelative(6.67f)
                arcTo(0.83f, 0.83f, 0.0f, false, false, 22.0f, 9.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 14.5f, 2.0f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, -0.83f, 0.83f)
                lineTo(13.67f, 9.5f)
                arcTo(0.83f, 0.83f, 0.0f, false, false, 14.5f, 10.33f)
                close()
                moveTo(15.33f, 3.73f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, true, 4.94f, 4.94f)
                lineTo(15.33f, 8.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.08f, 12.0f)
                horizontalLineTo(12.93f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.91f, -0.91f)
                verticalLineTo(2.92f)
                arcTo(0.92f, 0.92f, 0.0f, false, false, 11.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 13.0f)
                arcTo(0.92f, 0.92f, 0.0f, false, false, 21.08f, 12.0f)
                close()
            }
        }
        .build()
        return _pieChart2!!
    }

private var _pieChart2: ImageVector? = null
