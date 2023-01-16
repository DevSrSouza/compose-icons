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

public val MaterialDesignIcons.BriefcaseClockOutline: ImageVector
    get() {
        if (_briefcaseClockOutline != null) {
            return _briefcaseClockOutline!!
        }
        _briefcaseClockOutline = Builder(name = "BriefcaseClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.11f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.42f, 5.59f)
                arcTo(1.87f, 1.87f, 0.0f, false, false, 19.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 14.42f, 1.58f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 13.0f, 1.0f)
                horizontalLineTo(9.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 7.58f, 1.58f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 7.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                arcTo(1.87f, 1.87f, 0.0f, false, false, 1.58f, 5.59f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 7.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.58f, 19.41f)
                arcTo(1.87f, 1.87f, 0.0f, false, false, 3.0f, 20.0f)
                horizontalLineTo(10.26f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 21.0f, 11.11f)
                moveTo(9.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                moveTo(3.0f, 18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.68f)
                arcTo(6.84f, 6.84f, 0.0f, false, false, 16.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 9.0f, 16.0f)
                arcTo(6.91f, 6.91f, 0.0f, false, false, 9.29f, 18.0f)
                moveTo(19.0f, 20.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 20.0f)
                arcTo(4.94f, 4.94f, 0.0f, false, true, 11.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 11.0f)
                arcTo(4.94f, 4.94f, 0.0f, false, true, 19.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 19.0f, 20.0f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15.0f, 16.69f)
                verticalLineTo(13.0f)
            }
        }
        .build()
        return _briefcaseClockOutline!!
    }

private var _briefcaseClockOutline: ImageVector? = null
