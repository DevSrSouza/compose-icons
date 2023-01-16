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

public val MaterialDesignIcons.MixedReality: ImageVector
    get() {
        if (_mixedReality != null) {
            return _mixedReality!!
        }
        _mixedReality = Builder(name = "MixedReality", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                moveTo(8.25f, 15.0f)
                horizontalLineTo(9.75f)
                lineTo(10.75f, 11.57f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                lineTo(9.0f, 12.43f)
                lineTo(8.0f, 9.0f)
                horizontalLineTo(5.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.25f)
                verticalLineTo(11.57f)
                lineTo(8.25f, 15.0f)
                moveTo(13.5f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.15f)
                lineTo(17.0f, 15.0f)
                horizontalLineTo(18.5f)
                lineTo(17.6f, 12.9f)
                curveTo(18.1f, 12.65f, 18.5f, 12.1f, 18.5f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(18.5f, 9.65f, 17.85f, 9.0f, 17.0f, 9.0f)
                horizontalLineTo(13.5f)
                moveTo(15.0f, 10.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _mixedReality!!
    }

private var _mixedReality: ImageVector? = null
