package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.HumanMaleBoardPoll: ImageVector
    get() {
        if (_humanMaleBoardPoll != null) {
            return _humanMaleBoardPoll!!
        }
        _humanMaleBoardPoll = Builder(name = "HumanMaleBoardPoll", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                curveTo(21.1f, 17.0f, 22.0f, 16.1f, 22.0f, 15.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(9.8f, 2.6f, 10.0f, 3.3f, 10.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(1.5f)
                verticalLineTo(9.0f)
                curveTo(1.5f, 7.9f, 2.4f, 7.0f, 3.5f, 7.0f)
                horizontalLineTo(15.0f)
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 5.1f, 7.1f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveTo(4.0f, 5.1f, 4.0f, 4.0f)
                reflectiveCurveTo(4.9f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveTo(8.0f, 2.9f, 8.0f, 4.0f)
                moveTo(17.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                moveTo(14.0f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                moveTo(11.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _humanMaleBoardPoll!!
    }

private var _humanMaleBoardPoll: ImageVector? = null
