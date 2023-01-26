package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PivotTableChart: ImageVector
    get() {
        if (_pivotTableChart != null) {
            return _pivotTableChart!!
        }
        _pivotTableChart = Builder(name = "PivotTableChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(11.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(3.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(13.0f, 22.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(14.0f, 13.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.58f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.58f)
                curveToRelative(1.33f, 0.0f, 2.42f, -1.08f, 2.42f, -2.42f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.58f)
                curveToRelative(0.0f, 2.44f, -1.98f, 4.42f, -4.42f, 4.42f)
                close()
            }
        }
        .build()
        return _pivotTableChart!!
    }

private var _pivotTableChart: ImageVector? = null
