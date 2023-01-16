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

public val MaterialDesignIcons.DeathStarVariant: ImageVector
    get() {
        if (_deathStarVariant != null) {
            return _deathStarVariant!!
        }
        _deathStarVariant = Builder(name = "DeathStarVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.05f, 13.0f)
                horizontalLineTo(21.94f)
                curveTo(21.88f, 13.69f, 21.74f, 14.36f, 21.54f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(22.0f)
                curveTo(12.33f, 22.0f, 12.17f, 22.0f, 12.0f, 22.0f)
                curveTo(6.82f, 22.0f, 2.55f, 18.05f, 2.05f, 13.0f)
                moveTo(21.94f, 11.0f)
                horizontalLineTo(2.05f)
                curveTo(2.55f, 5.95f, 6.82f, 2.0f, 12.0f, 2.0f)
                curveTo(13.62f, 2.0f, 15.15f, 2.39f, 16.5f, 3.08f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.54f)
                curveTo(21.74f, 9.64f, 21.88f, 10.31f, 21.94f, 11.0f)
                moveTo(12.0f, 6.75f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 4.25f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.0f, 6.75f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 9.25f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _deathStarVariant!!
    }

private var _deathStarVariant: ImageVector? = null
