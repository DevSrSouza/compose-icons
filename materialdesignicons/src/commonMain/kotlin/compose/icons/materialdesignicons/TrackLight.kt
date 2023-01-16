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

public val MaterialDesignIcons.TrackLight: ImageVector
    get() {
        if (_trackLight != null) {
            return _trackLight!!
        }
        _trackLight = Builder(name = "TrackLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.4f)
                lineTo(4.11f, 4.38f)
                lineTo(1.43f, 10.84f)
                lineTo(6.97f, 13.14f)
                lineTo(11.94f, 16.82f)
                lineTo(13.79f, 17.59f)
                lineTo(17.62f, 8.35f)
                lineTo(15.77f, 7.58f)
                lineTo(11.0f, 6.87f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                moveTo(21.81f, 6.29f)
                lineTo(19.5f, 7.25f)
                lineTo(20.26f, 9.1f)
                lineTo(22.57f, 8.14f)
                lineTo(21.81f, 6.29f)
                moveTo(19.78f, 13.57f)
                lineTo(19.0f, 15.42f)
                lineTo(21.79f, 16.57f)
                lineTo(22.55f, 14.72f)
                lineTo(19.78f, 13.57f)
                moveTo(16.19f, 18.93f)
                lineTo(14.34f, 19.69f)
                lineTo(15.3f, 22.0f)
                lineTo(17.15f, 21.23f)
                lineTo(16.19f, 18.93f)
                close()
            }
        }
        .build()
        return _trackLight!!
    }

private var _trackLight: ImageVector? = null
