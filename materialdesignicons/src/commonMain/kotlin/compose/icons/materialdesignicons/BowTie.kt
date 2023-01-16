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

public val MaterialDesignIcons.BowTie: ImageVector
    get() {
        if (_bowTie != null) {
            return _bowTie!!
        }
        _bowTie = Builder(name = "BowTie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                lineTo(21.0f, 17.0f)
                verticalLineTo(7.0f)
                lineTo(15.0f, 10.0f)
                verticalLineTo(14.0f)
                moveTo(9.0f, 14.0f)
                lineTo(3.0f, 17.0f)
                verticalLineTo(7.0f)
                lineTo(9.0f, 10.0f)
                verticalLineTo(14.0f)
                moveTo(10.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _bowTie!!
    }

private var _bowTie: ImageVector? = null
