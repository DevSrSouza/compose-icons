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

public val BaselineGroup.HomeRepairService: ImageVector
    get() {
        if (_homeRepairService != null) {
            return _homeRepairService!!
        }
        _homeRepairService = Builder(name = "HomeRepairService", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(20.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-4.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 4.0f, 7.0f, 4.9f, 7.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                curveTo(22.0f, 8.9f, 21.1f, 8.0f, 20.0f, 8.0f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _homeRepairService!!
    }

private var _homeRepairService: ImageVector? = null
