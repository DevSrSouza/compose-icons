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

public val MaterialDesignIcons.AlphabeticalOff: ImageVector
    get() {
        if (_alphabeticalOff != null) {
            return _alphabeticalOff!!
        }
        _alphabeticalOff = Builder(name = "AlphabeticalOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(16.0f, 15.31f)
                lineTo(14.0f, 13.31f)
                lineTo(13.65f, 13.0f)
                lineTo(10.0f, 9.34f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(10.0f, 11.89f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 17.0f)
                horizontalLineTo(14.0f)
                arcTo(1.92f, 1.92f, 0.0f, false, false, 14.89f, 16.78f)
                lineTo(20.84f, 22.73f)
                moveTo(12.0f, 15.0f)
                verticalLineTo(13.89f)
                lineTo(13.11f, 15.0f)
                moveTo(16.0f, 12.78f)
                lineTo(14.22f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 12.78f)
                moveTo(20.2f, 17.0f)
                lineTo(18.0f, 14.8f)
                verticalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                moveTo(6.0f, 11.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 13.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 11.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                moveTo(12.0f, 8.8f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _alphabeticalOff!!
    }

private var _alphabeticalOff: ImageVector? = null
