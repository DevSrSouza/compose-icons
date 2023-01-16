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

public val MaterialDesignIcons.ProjectorScreenVariant: ImageVector
    get() {
        if (_projectorScreenVariant != null) {
            return _projectorScreenVariant!!
        }
        _projectorScreenVariant = Builder(name = "ProjectorScreenVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 9.0f, 21.0f, 8.55f, 21.0f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 6.45f, 20.55f, 6.0f, 20.0f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 8.55f, 3.45f, 9.0f, 4.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _projectorScreenVariant!!
    }

private var _projectorScreenVariant: ImageVector? = null
