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

public val FilledGroup.Guardian: ImageVector
    get() {
        if (_guardian != null) {
            return _guardian!!
        }
        _guardian = Builder(name = "Guardian", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 5.0f)
                curveTo(10.5f, 6.6568f, 9.1568f, 8.0f, 7.5f, 8.0f)
                curveTo(5.8432f, 8.0f, 4.5f, 6.6568f, 4.5f, 5.0f)
                curveTo(4.5f, 3.3431f, 5.8432f, 2.0f, 7.5f, 2.0f)
                curveTo(9.1568f, 2.0f, 10.5f, 3.3431f, 10.5f, 5.0f)
                close()
                moveTo(16.5f, 10.0f)
                curveTo(17.8807f, 10.0f, 19.0f, 8.8807f, 19.0f, 7.5f)
                curveTo(19.0f, 6.1193f, 17.8807f, 5.0f, 16.5f, 5.0f)
                curveTo(15.1193f, 5.0f, 14.0f, 6.1193f, 14.0f, 7.5f)
                curveTo(14.0f, 8.8807f, 15.1193f, 10.0f, 16.5f, 10.0f)
                close()
                moveTo(13.3965f, 10.75f)
                curveTo(13.4639f, 10.9884f, 13.5f, 11.24f, 13.5f, 11.5f)
                verticalLineTo(14.5f)
                curveTo(13.5f, 14.6726f, 13.4781f, 14.8402f, 13.437f, 15.0f)
                curveTo(13.215f, 15.8626f, 12.4319f, 16.5f, 11.5f, 16.5f)
                curveTo(11.3274f, 16.5f, 11.1598f, 16.4781f, 11.0f, 16.437f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 21.1046f, 10.1046f, 22.0f, 9.0f, 22.0f)
                curveTo(8.527f, 22.0f, 8.0924f, 21.8358f, 7.75f, 21.5613f)
                curveTo(7.4076f, 21.8358f, 6.973f, 22.0f, 6.5f, 22.0f)
                curveTo(5.3954f, 22.0f, 4.5f, 21.1046f, 4.5f, 20.0f)
                verticalLineTo(16.437f)
                curveTo(4.3402f, 16.4781f, 4.1726f, 16.5f, 4.0f, 16.5f)
                curveTo(2.8954f, 16.5f, 2.0f, 15.6046f, 2.0f, 14.5f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 9.9812f, 3.2312f, 8.75f, 4.75f, 8.75f)
                horizontalLineTo(10.75f)
                curveTo(12.0088f, 8.75f, 13.07f, 9.5957f, 13.3965f, 10.75f)
                close()
                moveTo(14.425f, 10.75f)
                horizontalLineTo(19.75f)
                curveTo(21.2688f, 10.75f, 22.5f, 11.9812f, 22.5f, 13.5f)
                verticalLineTo(15.25f)
                curveTo(22.5f, 16.3546f, 21.6046f, 17.25f, 20.5f, 17.25f)
                curveTo(20.3274f, 17.25f, 20.1598f, 17.2281f, 20.0f, 17.187f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f)
                curveTo(17.527f, 22.0f, 17.0924f, 21.8358f, 16.75f, 21.5613f)
                curveTo(16.4076f, 21.8358f, 15.973f, 22.0f, 15.5f, 22.0f)
                curveTo(14.3954f, 22.0f, 13.5f, 21.1046f, 13.5f, 20.0f)
                verticalLineTo(16.7361f)
                curveTo(14.1137f, 16.1868f, 14.5f, 15.3885f, 14.5f, 14.5f)
                verticalLineTo(11.5f)
                curveTo(14.5f, 11.2432f, 14.4742f, 10.9923f, 14.425f, 10.75f)
                close()
            }
        }
        .build()
        return _guardian!!
    }

private var _guardian: ImageVector? = null
