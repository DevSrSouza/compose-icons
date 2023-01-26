package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PivotTableChart: ImageVector
    get() {
        if (_pivotTableChart != null) {
            return _pivotTableChart!!
        }
        _pivotTableChart = Builder(name = "PivotTableChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(3.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(3.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                close()
                moveTo(18.0f, 8.99f)
                lineTo(14.0f, 13.0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.59f, -1.6f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.17f)
                lineToRelative(1.59f, -1.59f)
                lineTo(13.0f, 14.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.83f, 19.0f)
                horizontalLineTo(15.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-2.18f)
                lineToRelative(1.59f, 1.6f)
                lineTo(22.0f, 13.0f)
                lineTo(18.0f, 8.99f)
                close()
            }
        }
        .build()
        return _pivotTableChart!!
    }

private var _pivotTableChart: ImageVector? = null
