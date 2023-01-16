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

public val MaterialDesignIcons.ExpansionCard: ImageVector
    get() {
        if (_expansionCard != null) {
            return _expansionCard!!
        }
        _expansionCard = Builder(name = "ExpansionCard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(7.0f)
                curveTo(3.7f, 7.0f, 2.8f, 7.0f, 2.0f, 7.0f)
                moveTo(6.0f, 7.0f)
                verticalLineTo(7.0f)
                lineTo(6.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                moveTo(17.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 9.0f)
                close()
            }
        }
        .build()
        return _expansionCard!!
    }

private var _expansionCard: ImageVector? = null
