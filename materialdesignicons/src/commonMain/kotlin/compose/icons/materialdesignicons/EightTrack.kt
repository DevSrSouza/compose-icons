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

public val MaterialDesignIcons.EightTrack: ImageVector
    get() {
        if (_eightTrack != null) {
            return _eightTrack!!
        }
        _eightTrack = Builder(name = "EightTrack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                lineTo(5.0f, 5.0f)
                verticalLineTo(16.0f)
                lineTo(6.0f, 20.0f)
                curveTo(6.27f, 21.07f, 6.9f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 20.0f)
                lineTo(19.0f, 16.0f)
                verticalLineTo(5.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _eightTrack!!
    }

private var _eightTrack: ImageVector? = null
