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

public val MaterialDesignIcons.MoleculeCo: ImageVector
    get() {
        if (_moleculeCo != null) {
            return _moleculeCo!!
        }
        _moleculeCo = Builder(name = "MoleculeCo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                curveTo(6.9f, 7.0f, 6.0f, 7.9f, 6.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 16.11f, 6.9f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                moveTo(14.0f, 7.0f)
                curveTo(12.9f, 7.0f, 12.0f, 7.9f, 12.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(12.0f, 16.11f, 12.9f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 17.0f, 18.0f, 16.11f, 18.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 7.9f, 17.11f, 7.0f, 16.0f, 7.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
            }
        }
        .build()
        return _moleculeCo!!
    }

private var _moleculeCo: ImageVector? = null
