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

public val MaterialDesignIcons.HomeLightningBoltOutline: ImageVector
    get() {
        if (_homeLightningBoltOutline != null) {
            return _homeLightningBoltOutline!!
        }
        _homeLightningBoltOutline = Builder(name = "HomeLightningBoltOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 3.0f)
                lineTo(22.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                moveTo(12.0f, 5.69f)
                lineTo(7.0f, 10.19f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.19f)
                lineTo(12.0f, 5.69f)
                moveTo(11.5f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                lineTo(12.5f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                lineTo(11.5f, 18.0f)
                close()
            }
        }
        .build()
        return _homeLightningBoltOutline!!
    }

private var _homeLightningBoltOutline: ImageVector? = null
