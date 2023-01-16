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

public val MaterialDesignIcons.DeathStar: ImageVector
    get() {
        if (_deathStar != null) {
            return _deathStar!!
        }
        _deathStar = Builder(name = "DeathStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.05f, 13.0f)
                horizontalLineTo(21.95f)
                curveTo(21.45f, 18.05f, 17.19f, 22.0f, 12.0f, 22.0f)
                curveTo(6.82f, 22.0f, 2.55f, 18.05f, 2.05f, 13.0f)
                moveTo(21.95f, 11.0f)
                horizontalLineTo(2.05f)
                curveTo(2.55f, 5.95f, 6.82f, 2.0f, 12.0f, 2.0f)
                curveTo(17.18f, 2.0f, 21.45f, 5.95f, 21.95f, 11.0f)
                moveTo(12.0f, 6.75f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 4.25f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.0f, 6.75f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 9.25f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _deathStar!!
    }

private var _deathStar: ImageVector? = null
