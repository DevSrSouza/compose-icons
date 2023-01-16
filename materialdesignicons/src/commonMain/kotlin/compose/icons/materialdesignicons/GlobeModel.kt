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

public val MaterialDesignIcons.GlobeModel: ImageVector
    get() {
        if (_globeModel != null) {
            return _globeModel!!
        }
        _globeModel = Builder(name = "GlobeModel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.36f, 2.64f)
                lineTo(15.95f, 4.06f)
                curveTo(17.26f, 5.37f, 18.0f, 7.14f, 18.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 11.0f, 16.0f)
                curveTo(9.15f, 16.0f, 7.37f, 15.26f, 6.06f, 13.95f)
                lineTo(4.64f, 15.36f)
                curveTo(6.08f, 16.8f, 7.97f, 17.71f, 10.0f, 17.93f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.94f)
                curveTo(16.55f, 17.43f, 20.0f, 13.58f, 20.0f, 9.0f)
                curveTo(20.0f, 6.62f, 19.05f, 4.33f, 17.36f, 2.64f)
                moveTo(11.0f, 3.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.5f, 9.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 11.0f, 14.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 16.5f, 9.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 11.0f, 3.5f)
                moveTo(11.0f, 5.5f)
                curveTo(12.94f, 5.5f, 14.5f, 7.07f, 14.5f, 9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 11.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.5f, 9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 11.0f, 5.5f)
                close()
            }
        }
        .build()
        return _globeModel!!
    }

private var _globeModel: ImageVector? = null
