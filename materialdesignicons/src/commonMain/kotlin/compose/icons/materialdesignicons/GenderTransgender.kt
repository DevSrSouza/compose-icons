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

public val MaterialDesignIcons.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) {
            return _genderTransgender!!
        }
        _genderTransgender = Builder(name = "GenderTransgender", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.58f, 3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.41f)
                lineTo(16.17f, 9.24f)
                curveTo(16.69f, 10.03f, 17.0f, 11.0f, 17.0f, 12.0f)
                curveTo(17.0f, 14.42f, 15.28f, 16.44f, 13.0f, 16.9f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.9f)
                curveTo(8.72f, 16.44f, 7.0f, 14.42f, 7.0f, 12.0f)
                curveTo(7.0f, 11.0f, 7.3f, 10.04f, 7.82f, 9.26f)
                lineTo(6.64f, 8.07f)
                lineTo(5.24f, 9.46f)
                lineTo(3.83f, 8.04f)
                lineTo(5.23f, 6.65f)
                lineTo(3.0f, 4.42f)
                verticalLineTo(8.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.41f)
                lineTo(6.64f, 5.24f)
                lineTo(8.08f, 3.81f)
                lineTo(9.5f, 5.23f)
                lineTo(8.06f, 6.66f)
                lineTo(9.23f, 7.84f)
                curveTo(10.0f, 7.31f, 11.0f, 7.0f, 12.0f, 7.0f)
                curveTo(13.0f, 7.0f, 13.96f, 7.3f, 14.75f, 7.83f)
                lineTo(19.58f, 3.0f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
