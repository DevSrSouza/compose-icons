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

public val MaterialDesignIcons.NaturePeople: ImageVector
    get() {
        if (_naturePeople != null) {
            return _naturePeople!!
        }
        _naturePeople = Builder(name = "NaturePeople", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 11.0f)
                moveTo(22.17f, 9.17f)
                curveTo(22.17f, 5.3f, 19.04f, 2.17f, 15.17f, 2.17f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 8.17f, 9.17f)
                curveTo(8.17f, 12.64f, 10.69f, 15.5f, 14.0f, 16.06f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 12.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.12f)
                curveTo(19.47f, 15.71f, 22.17f, 12.76f, 22.17f, 9.17f)
                close()
            }
        }
        .build()
        return _naturePeople!!
    }

private var _naturePeople: ImageVector? = null
