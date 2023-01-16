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

public val MaterialDesignIcons.HumanMaleHeightVariant: ImageVector
    get() {
        if (_humanMaleHeightVariant != null) {
            return _humanMaleHeightVariant!!
        }
        _humanMaleHeightVariant = Builder(name = "HumanMaleHeightVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                curveTo(8.78f, 2.0f, 9.67f, 4.16f, 8.42f, 5.42f)
                curveTo(7.16f, 6.67f, 5.0f, 5.78f, 5.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 2.0f)
                moveTo(5.5f, 7.0f)
                horizontalLineTo(8.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.5f, 9.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.5f, 7.0f)
                moveTo(19.0f, 8.0f)
                horizontalLineTo(21.0f)
                lineTo(18.0f, 4.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                lineTo(18.0f, 20.0f)
                lineTo(21.0f, 16.0f)
                horizontalLineTo(19.0f)
                moveTo(22.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                moveTo(22.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return _humanMaleHeightVariant!!
    }

private var _humanMaleHeightVariant: ImageVector? = null
