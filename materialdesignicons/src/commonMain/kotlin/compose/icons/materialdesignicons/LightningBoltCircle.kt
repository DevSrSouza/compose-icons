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

public val MaterialDesignIcons.LightningBoltCircle: ImageVector
    get() {
        if (_lightningBoltCircle != null) {
            return _lightningBoltCircle!!
        }
        _lightningBoltCircle = Builder(name = "LightningBoltCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 20.0f)
                lineTo(16.36f, 10.27f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                lineTo(8.0f, 13.73f)
                horizontalLineTo(11.5f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 2.0f)
                curveTo(14.75f, 2.0f, 17.1f, 3.0f, 19.05f, 4.95f)
                curveTo(21.0f, 6.9f, 22.0f, 9.25f, 22.0f, 12.0f)
                curveTo(22.0f, 14.75f, 21.0f, 17.1f, 19.05f, 19.05f)
                curveTo(17.1f, 21.0f, 14.75f, 22.0f, 12.0f, 22.0f)
                curveTo(9.25f, 22.0f, 6.9f, 21.0f, 4.95f, 19.05f)
                curveTo(3.0f, 17.1f, 2.0f, 14.75f, 2.0f, 12.0f)
                curveTo(2.0f, 9.25f, 3.0f, 6.9f, 4.95f, 4.95f)
                curveTo(6.9f, 3.0f, 9.25f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _lightningBoltCircle!!
    }

private var _lightningBoltCircle: ImageVector? = null
