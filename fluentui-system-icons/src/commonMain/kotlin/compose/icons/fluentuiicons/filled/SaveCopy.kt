package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.SaveCopy: ImageVector
    get() {
        if (_saveCopy != null) {
            return _saveCopy!!
        }
        _saveCopy = Builder(name = "SaveCopy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4962f, 5.6267f)
                curveTo(21.3721f, 5.9345f, 22.0f, 6.7689f, 22.0f, 7.75f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 20.0972f, 20.0972f, 22.0f, 17.75f, 22.0f)
                horizontalLineTo(7.75f)
                curveTo(6.7689f, 22.0f, 5.9345f, 21.3721f, 5.6267f, 20.4962f)
                lineTo(7.724f, 20.4996f)
                lineTo(17.75f, 20.5f)
                curveTo(19.2688f, 20.5f, 20.5f, 19.2688f, 20.5f, 17.75f)
                verticalLineTo(7.75f)
                lineTo(20.496f, 7.699f)
                lineTo(20.4962f, 5.6267f)
                close()
                moveTo(17.2468f, 2.0f)
                curveTo(18.4895f, 2.0f, 19.4968f, 3.0074f, 19.4968f, 4.25f)
                verticalLineTo(17.2468f)
                curveTo(19.4968f, 18.4895f, 18.4895f, 19.4968f, 17.2468f, 19.4968f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 19.4968f, 2.0f, 18.4895f, 2.0f, 17.2468f)
                verticalLineTo(4.25f)
                curveTo(2.0f, 3.0074f, 3.0074f, 2.0f, 4.25f, 2.0f)
                horizontalLineTo(17.2468f)
                close()
                moveTo(10.75f, 6.75f)
                curveTo(10.3703f, 6.75f, 10.0565f, 7.0321f, 10.0068f, 7.3982f)
                lineTo(10.0f, 7.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 10.0f, 6.75f, 10.3358f, 6.75f, 10.75f)
                curveTo(6.75f, 11.1297f, 7.0321f, 11.4435f, 7.3982f, 11.4932f)
                lineTo(7.5f, 11.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                curveTo(10.0f, 14.4142f, 10.3358f, 14.75f, 10.75f, 14.75f)
                curveTo(11.1297f, 14.75f, 11.4435f, 14.4678f, 11.4932f, 14.1018f)
                lineTo(11.5f, 14.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 11.5f, 14.75f, 11.1642f, 14.75f, 10.75f)
                curveTo(14.75f, 10.3703f, 14.4678f, 10.0565f, 14.1018f, 10.0068f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(7.5f)
                curveTo(11.5f, 7.0858f, 11.1642f, 6.75f, 10.75f, 6.75f)
                close()
            }
        }
        .build()
        return _saveCopy!!
    }

private var _saveCopy: ImageVector? = null
