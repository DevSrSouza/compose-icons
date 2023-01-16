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

public val MaterialDesignIcons.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                moveTo(7.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 15.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 20.0f)
                verticalLineTo(15.0f)
                moveTo(9.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 12.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 8.0f)
                horizontalLineTo(9.0f)
                moveTo(17.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                moveTo(16.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 5.0f)
                verticalLineTo(10.0f)
                moveTo(14.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 17.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
