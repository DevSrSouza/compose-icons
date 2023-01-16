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

public val MaterialDesignIcons.AlphabeticalVariantOff: ImageVector
    get() {
        if (_alphabeticalVariantOff != null) {
            return _alphabeticalVariantOff!!
        }
        _alphabeticalVariantOff = Builder(name = "AlphabeticalVariantOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2f, 9.0f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 9.0f)
                verticalLineTo(10.5f)
                arcTo(1.47f, 1.47f, 0.0f, false, true, 14.64f, 11.44f)
                lineTo(13.0f, 9.8f)
                verticalLineTo(9.0f)
                moveTo(23.0f, 10.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 7.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 9.0f)
                verticalLineTo(13.8f)
                lineTo(20.2f, 17.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                moveTo(15.0f, 14.35f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(14.46f, 16.35f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.89f)
                lineTo(7.0f, 8.89f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 7.0f)
                horizontalLineTo(5.12f)
                lineTo(1.12f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(9.0f, 8.34f)
                lineTo(11.0f, 10.34f)
                lineTo(11.66f, 11.0f)
                lineTo(15.0f, 14.34f)
                moveTo(5.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                moveTo(13.0f, 14.89f)
                lineTo(11.11f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _alphabeticalVariantOff!!
    }

private var _alphabeticalVariantOff: ImageVector? = null
