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

public val BaselineGroup.CellTower: ImageVector
    get() {
        if (_cellTower != null) {
            return _cellTower!!
        }
        _cellTower = Builder(name = "CellTower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3f, 14.7f)
                lineToRelative(1.2f, -1.2f)
                curveToRelative(-1.0f, -1.0f, -1.5f, -2.3f, -1.5f, -3.5f)
                curveToRelative(0.0f, -1.3f, 0.5f, -2.6f, 1.5f, -3.5f)
                lineTo(7.3f, 5.3f)
                curveToRelative(-1.3f, 1.3f, -2.0f, 3.0f, -2.0f, 4.7f)
                reflectiveCurveTo(6.0f, 13.4f, 7.3f, 14.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1f, 2.9f)
                lineToRelative(-1.2f, 1.2f)
                curveToRelative(1.6f, 1.6f, 2.4f, 3.8f, 2.4f, 5.9f)
                curveToRelative(0.0f, 2.1f, -0.8f, 4.3f, -2.4f, 5.9f)
                lineToRelative(1.2f, 1.2f)
                curveToRelative(2.0f, -2.0f, 2.9f, -4.5f, 2.9f, -7.1f)
                curveTo(22.0f, 7.4f, 21.0f, 4.9f, 19.1f, 2.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1f, 4.1f)
                lineTo(4.9f, 2.9f)
                curveTo(3.0f, 4.9f, 2.0f, 7.4f, 2.0f, 10.0f)
                curveToRelative(0.0f, 2.6f, 1.0f, 5.1f, 2.9f, 7.1f)
                lineToRelative(1.2f, -1.2f)
                curveToRelative(-1.6f, -1.6f, -2.4f, -3.8f, -2.4f, -5.9f)
                curveTo(3.7f, 7.9f, 4.5f, 5.7f, 6.1f, 4.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7f, 14.7f)
                curveToRelative(1.3f, -1.3f, 2.0f, -3.0f, 2.0f, -4.7f)
                curveToRelative(-0.1f, -1.7f, -0.7f, -3.4f, -2.0f, -4.7f)
                lineToRelative(-1.2f, 1.2f)
                curveToRelative(1.0f, 1.0f, 1.5f, 2.3f, 1.5f, 3.5f)
                curveToRelative(0.0f, 1.3f, -0.5f, 2.6f, -1.5f, 3.5f)
                lineTo(16.7f, 14.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 10.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(9.5f, 8.62f, 9.5f, 10.0f)
                curveToRelative(0.0f, 0.76f, 0.34f, 1.42f, 0.87f, 1.88f)
                lineTo(7.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.67f, -2.0f)
                horizontalLineToRelative(4.67f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-3.37f, -10.12f)
                curveTo(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10.0f)
                close()
                moveTo(10.33f, 18.0f)
                lineTo(12.0f, 13.0f)
                lineToRelative(1.67f, 5.0f)
                horizontalLineTo(10.33f)
                close()
            }
        }
        .build()
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
