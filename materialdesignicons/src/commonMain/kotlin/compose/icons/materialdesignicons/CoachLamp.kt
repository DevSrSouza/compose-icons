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

public val MaterialDesignIcons.CoachLamp: ImageVector
    get() {
        if (_coachLamp != null) {
            return _coachLamp!!
        }
        _coachLamp = Builder(name = "CoachLamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineTo(13.0f)
                lineTo(12.0f, 5.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineTo(8.0f)
                lineTo(8.6f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                lineTo(10.0f, 18.0f)
                lineTo(12.0f, 20.0f)
                lineTo(13.0f, 22.0f)
                horizontalLineTo(15.0f)
                lineTo(16.0f, 20.0f)
                lineTo(18.0f, 18.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineTo(22.0f)
                moveTo(16.16f, 17.0f)
                horizontalLineTo(11.84f)
                lineTo(10.0f, 8.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _coachLamp!!
    }

private var _coachLamp: ImageVector? = null