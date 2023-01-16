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

public val MaterialDesignIcons.AlphabetGreek: ImageVector
    get() {
        if (_alphabetGreek != null) {
            return _alphabetGreek!!
        }
        _alphabetGreek = Builder(name = "AlphabetGreek", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(14.36f, 6.0f, 13.0f, 7.36f, 13.0f, 9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                curveTo(15.0f, 8.43f, 15.43f, 8.0f, 16.0f, 8.0f)
                horizontalLineTo(17.0f)
                curveTo(17.57f, 8.0f, 18.0f, 8.43f, 18.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 10.57f, 17.57f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                curveTo(17.57f, 13.0f, 18.0f, 13.43f, 18.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(18.0f, 15.57f, 17.57f, 16.0f, 17.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                curveTo(18.65f, 18.0f, 20.0f, 16.65f, 20.0f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 13.18f, 19.59f, 12.46f, 19.0f, 12.0f)
                curveTo(19.59f, 11.54f, 20.0f, 10.82f, 20.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(20.0f, 7.36f, 18.65f, 6.0f, 17.0f, 6.0f)
                moveTo(7.0f, 9.0f)
                curveTo(5.36f, 9.0f, 4.0f, 10.36f, 4.0f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 16.65f, 5.36f, 18.0f, 7.0f, 18.0f)
                horizontalLineTo(7.7f)
                curveTo(8.2f, 18.0f, 8.65f, 17.81f, 9.0f, 17.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.5f)
                curveTo(8.65f, 9.19f, 8.2f, 9.0f, 7.7f, 9.0f)
                moveTo(7.0f, 11.0f)
                horizontalLineTo(8.0f)
                curveTo(8.57f, 11.0f, 9.0f, 11.43f, 9.0f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 15.57f, 8.57f, 16.0f, 8.0f, 16.0f)
                horizontalLineTo(7.0f)
                curveTo(6.43f, 16.0f, 6.0f, 15.57f, 6.0f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(6.0f, 11.43f, 6.43f, 11.0f, 7.0f, 11.0f)
                close()
            }
        }
        .build()
        return _alphabetGreek!!
    }

private var _alphabetGreek: ImageVector? = null
