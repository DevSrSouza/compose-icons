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

public val MaterialDesignIcons.TransitionMasked: ImageVector
    get() {
        if (_transitionMasked != null) {
            return _transitionMasked!!
        }
        _transitionMasked = Builder(name = "TransitionMasked", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                curveTo(16.94f, 2.0f, 18.59f, 2.7f, 19.95f, 4.05f)
                curveTo(21.3f, 5.41f, 22.0f, 7.06f, 22.0f, 9.0f)
                curveTo(22.0f, 10.56f, 21.5f, 11.96f, 20.58f, 13.2f)
                curveTo(19.64f, 14.43f, 18.44f, 15.27f, 16.97f, 15.7f)
                lineTo(17.0f, 15.38f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 12.81f, 16.23f, 10.93f, 14.65f, 9.35f)
                curveTo(13.07f, 7.77f, 11.19f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(8.63f)
                lineTo(8.3f, 7.03f)
                curveTo(8.73f, 5.56f, 9.57f, 4.36f, 10.8f, 3.42f)
                curveTo(12.04f, 2.5f, 13.44f, 2.0f, 15.0f, 2.0f)
                moveTo(9.0f, 8.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 9.0f, 22.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 9.0f, 8.0f)
                moveTo(9.0f, 10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 4.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.0f, 20.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 14.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.0f, 10.0f)
                close()
            }
        }
        .build()
        return _transitionMasked!!
    }

private var _transitionMasked: ImageVector? = null
