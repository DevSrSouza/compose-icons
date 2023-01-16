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

public val MaterialDesignIcons.TargetAccount: ImageVector
    get() {
        if (_targetAccount != null) {
            return _targetAccount!!
        }
        _targetAccount = Builder(name = "TargetAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.95f, 11.0f)
                horizontalLineTo(22.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.95f)
                curveTo(20.5f, 17.17f, 17.17f, 20.5f, 13.0f, 20.95f)
                verticalLineTo(22.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.95f)
                curveTo(6.83f, 20.5f, 3.5f, 17.17f, 3.05f, 13.0f)
                horizontalLineTo(1.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.05f)
                curveTo(3.5f, 6.83f, 6.83f, 3.5f, 11.0f, 3.05f)
                verticalLineTo(1.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.05f)
                curveTo(17.17f, 3.5f, 20.5f, 6.83f, 20.95f, 11.0f)
                moveTo(5.07f, 11.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.07f)
                curveTo(5.5f, 16.07f, 7.93f, 18.5f, 11.0f, 18.93f)
                verticalLineTo(17.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.93f)
                curveTo(16.07f, 18.5f, 18.5f, 16.07f, 18.93f, 13.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.93f)
                curveTo(18.5f, 7.93f, 16.07f, 5.5f, 13.0f, 5.07f)
                verticalLineTo(6.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.07f)
                curveTo(7.93f, 5.5f, 5.5f, 7.93f, 5.07f, 11.0f)
                moveTo(16.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                curveTo(8.0f, 13.67f, 10.67f, 13.0f, 12.0f, 13.0f)
                curveTo(13.33f, 13.0f, 16.0f, 13.67f, 16.0f, 15.0f)
                verticalLineTo(16.0f)
                moveTo(12.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _targetAccount!!
    }

private var _targetAccount: ImageVector? = null
