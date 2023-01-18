package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.BriefcaseMedical: ImageVector
    get() {
        if (_briefcaseMedical != null) {
            return _briefcaseMedical!!
        }
        _briefcaseMedical = Builder(name = "BriefcaseMedical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 12.5f)
                verticalLineTo(10.75f)
                curveTo(11.5f, 10.3358f, 11.8358f, 10.0f, 12.25f, 10.0f)
                curveTo(12.6642f, 10.0f, 13.0f, 10.3358f, 13.0f, 10.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 12.5f, 15.5f, 12.8358f, 15.5f, 13.25f)
                curveTo(15.5f, 13.6642f, 15.1642f, 14.0f, 14.75f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.75f)
                curveTo(13.0f, 16.1642f, 12.6642f, 16.5f, 12.25f, 16.5f)
                curveTo(11.8358f, 16.5f, 11.5f, 16.1642f, 11.5f, 15.75f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 14.0f, 9.0f, 13.6642f, 9.0f, 13.25f)
                curveTo(9.0f, 12.8358f, 9.3358f, 12.5f, 9.75f, 12.5f)
                horizontalLineTo(11.5f)
                close()
                moveTo(8.75f, 3.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6297f, 3.0f, 15.9435f, 3.2822f, 15.9932f, 3.6482f)
                lineTo(16.0f, 3.75f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 7.0f, 21.0f, 8.4551f, 21.0f, 10.25f)
                verticalLineTo(16.75f)
                curveTo(21.0f, 18.5449f, 19.5449f, 20.0f, 17.75f, 20.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 20.0f, 3.0f, 18.5449f, 3.0f, 16.75f)
                verticalLineTo(10.25f)
                curveTo(3.0f, 8.4551f, 4.4551f, 7.0f, 6.25f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.75f)
                curveTo(8.0f, 3.3703f, 8.2822f, 3.0565f, 8.6482f, 3.0069f)
                lineTo(8.75f, 3.0f)
                close()
                moveTo(17.75f, 8.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 8.5f, 4.5f, 9.2835f, 4.5f, 10.25f)
                verticalLineTo(16.75f)
                curveTo(4.5f, 17.7165f, 5.2835f, 18.5f, 6.25f, 18.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 18.5f, 19.5f, 17.7165f, 19.5f, 16.75f)
                verticalLineTo(10.25f)
                curveTo(19.5f, 9.2835f, 18.7165f, 8.5f, 17.75f, 8.5f)
                close()
                moveTo(14.5f, 4.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _briefcaseMedical!!
    }

private var _briefcaseMedical: ImageVector? = null
