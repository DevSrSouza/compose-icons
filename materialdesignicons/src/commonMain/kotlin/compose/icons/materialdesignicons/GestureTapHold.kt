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

public val MaterialDesignIcons.GestureTapHold: ImageVector
    get() {
        if (_gestureTapHold != null) {
            return _gestureTapHold!!
        }
        _gestureTapHold = Builder(name = "GestureTapHold", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 9.0f)
                verticalLineTo(13.47f)
                lineTo(13.21f, 13.6f)
                lineTo(18.15f, 15.79f)
                curveTo(18.68f, 16.03f, 19.0f, 16.56f, 19.0f, 17.14f)
                verticalLineTo(21.5f)
                curveTo(18.97f, 22.32f, 18.32f, 22.97f, 17.5f, 23.0f)
                horizontalLineTo(11.0f)
                curveTo(10.62f, 23.0f, 10.26f, 22.85f, 10.0f, 22.57f)
                lineTo(5.1f, 18.37f)
                lineTo(5.84f, 17.6f)
                curveTo(6.03f, 17.39f, 6.3f, 17.28f, 6.58f, 17.28f)
                horizontalLineTo(6.8f)
                lineTo(10.0f, 19.0f)
                verticalLineTo(9.0f)
                moveTo(9.0f, 12.44f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 9.0f)
                verticalLineTo(12.44f)
                curveTo(14.19f, 11.75f, 15.0f, 10.47f, 15.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 9.0f)
                curveTo(7.0f, 10.47f, 7.81f, 11.75f, 9.0f, 12.44f)
                close()
            }
        }
        .build()
        return _gestureTapHold!!
    }

private var _gestureTapHold: ImageVector? = null
